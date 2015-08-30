/*
 * @(#)LinkMsg.java 2015年8月30日
 * 
 * Copy Right@ uuola
 */ 

package com.uuola.weixin.message;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <pre>
 *
 * @author tangxiaodong
 * 创建日期: 2015年8月30日
 * </pre>
 */
@XmlRootElement(name = "xml")
public class LinkMsg extends BaseMsg {

    private static final long serialVersionUID = -2166839896420724950L;

    @XmlElement(name ="Title")
    private String title;
    
    @XmlElement(name ="Description")
    private String description;
    
    @XmlElement(name ="Url")
    private String url;
    
    
    @XmlElement(name ="MsgId")
    private Long msgId;


    
    public String getTitle() {
        return title;
    }


    
    public void setTitle(String title) {
        this.title = title;
    }


    
    public String getDescription() {
        return description;
    }


    
    public void setDescription(String description) {
        this.description = description;
    }


    
    public String getUrl() {
        return url;
    }


    
    public void setUrl(String url) {
        this.url = url;
    }


    
    public Long getMsgId() {
        return msgId;
    }


    
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }
}
