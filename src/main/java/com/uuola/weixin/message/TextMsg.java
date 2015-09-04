/*
 * @(#)TextMessage.java 2015年8月30日
 * 
 * Copy Right@ uuola
 */ 

package com.uuola.weixin.message;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <pre>
 * 文本消息
 * @author tangxiaodong
 * 创建日期: 2015年8月30日
 * </pre>
 */
@XmlRootElement(name = "xml")
public class TextMsg extends BaseMsg {

    private static final long serialVersionUID = -1503509599873769666L;

    @XmlElement(name ="Content")
    private String content;

    
    public String getContent() {
        return content;
    }

    
    public void setContent(String content) {
        this.content = content;
    }

}
