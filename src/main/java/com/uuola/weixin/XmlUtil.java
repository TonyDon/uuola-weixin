/*
 * @(#)XmlUtil.java 2015年8月30日
 * 
 * Copy Right@ uuola
 */

package com.uuola.weixin;

import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 * Xml处理工具
 * @author tangxiaodong
 * 创建日期: 2015年8月30日
 * </pre>
 */
public abstract class XmlUtil {
    
    private static Logger log = LoggerFactory.getLogger(XmlUtil.class);

    /**
     * 将Bean序列化为xml文本
     * 
     * @param xmlBean
     * @param encoding
     *            编码 utf-8 gbk ...
     * @return
     */
    public static String toXml(Serializable xmlBean, String encoding) {
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(xmlBean.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
            StringWriter writer = new StringWriter();
            XMLSerializer serializer = getXMLSerializer(writer);
            marshaller.marshal(xmlBean, serializer.asContentHandler());
            result = writer.toString();
        } catch (Exception e) {
            log.error("toXml()", e);
        }
        return result;
    }
    
    /**
     * 转换xml为BEAN对象
     * @param xml
     * @param clazz
     * @return
     */
    @SuppressWarnings("unchecked")  
    public static <T> T toBean(String xml, Class<T> clazz) {  
        T t = null;  
        try {  
            JAXBContext context = JAXBContext.newInstance(clazz);  
            Unmarshaller unmarshaller = context.createUnmarshaller();  
            t = (T) unmarshaller.unmarshal(new StringReader(xml));  
        } catch (Exception e) {  
            log.error("toBean()", e);
        }  
        return t;  
    }  
    
    /**
     * 转换inputStream 为BEAN对象
     * @param input
     * @param clazz
     * @return
     */
    @SuppressWarnings("unchecked")  
    public static <T> T toBean(InputStream input, Class<T> clazz) {  
        T t = null;  
        try {  
            JAXBContext context = JAXBContext.newInstance(clazz);  
            Unmarshaller unmarshaller = context.createUnmarshaller();  
            t = (T) unmarshaller.unmarshal(input);  
        } catch (Exception e) {  
            log.error("toBean()", e);
        }  
        return t;  
    } 
    
    private static XMLSerializer getXMLSerializer(Writer writer) {
        // configure an OutputFormat to handle CDATA
        OutputFormat of = new OutputFormat();

        // specify which of your elements you want to be handled as CDATA.
        // The use of the '^' between the namespaceURI and the localname
        // seems to be an implementation detail of the xerces code.
        // When processing xml that doesn't use namespaces, simply omit the
        // namespace prefix as shown in the third CDataElement below.
        of.setCDataElements(new String[] {
                "^ToUserName",
                "^FromUserName",
                "^MsgType",
                "^Content",
                "^PicUrl",
                "^MediaId",
                "^Format",
                "^ThumbMediaId",
                "^Label",
                "^Title",
                "^Description",
                "^Url"
                });

        // set any other options you'd like
        of.setPreserveSpace(true);
        of.setIndenting(true);

        // create the serializer
        XMLSerializer serializer = new XMLSerializer(of);
        serializer.setOutputCharStream(writer);

        return serializer;
    }
}
