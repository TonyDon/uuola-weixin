package com.uuola.weixin;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.uuola.commons.DateUtil;
import com.uuola.commons.JsonUtil;
import com.uuola.commons.file.FileUtil;
import com.uuola.commons.http.HttpClientUtil;
import com.uuola.weixin.message.TextMsg;


/**
 * Unit test for simple App.
 */
public class AppTest {
    
    CloseableHttpClient httpClient = null;
    
    @Before
    public void init(){
        httpClient = HttpClientUtil.getDefaultHttpClient();
    }

    //@Test
    public void test_BaiduApi_1() throws ClientProtocolException, IOException{
        HttpGet get = new HttpGet("http://www.baidu.com");
        CloseableHttpResponse response = httpClient.execute(get);
        System.out.println(response.getStatusLine());
        System.out.println(EntityUtils.toString(response.getEntity()));
        response.close();
    }
    
    @Test
    public void test_xml_1(){
        TextMsg msg = new TextMsg();
        msg.setFromUserName("tangxiaodong");
        msg.setToUserName("helloworld");
        msg.setContent("asdfasdf&<>sdf");
        msg.setMsgId(System.currentTimeMillis());
        msg.setMsgType("text");
        msg.setCreateTime(DateUtil.getCurrTime()/1000);
        String xml = XmlUtil.toXml(msg, "utf-8");
        System.out.println(xml);
    }
    
    @Test
    public void test_xml_2(){
        URL url = this.getClass().getClassLoader().getResource("text.xml");
        String xml = FileUtil.readStringByFile(url.getFile(), "utf-8");
        TextMsg msg = XmlUtil.toBean(xml, TextMsg.class);
        System.out.println(JsonUtil.toJSONString(msg));
    }
    
    @After
    public void finish(){
        try {
            httpClient.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
