package com.uuola.weixin;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.uuola.commons.http.HttpClientFactory;


/**
 * Unit test for simple App.
 */
public class AppTest {
    
    CloseableHttpClient httpClient = null;
    
    @Before
    public void init(){
        httpClient = HttpClientFactory.getHttpClient();
    }

    @Test
    public void test_BaiduApi_1() throws ClientProtocolException, IOException{
        HttpGet get = new HttpGet("http://www.baidu.com");
        CloseableHttpResponse response = httpClient.execute(get);
        System.out.println(response.getStatusLine());
        System.out.println(EntityUtils.toString(response.getEntity()));
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
