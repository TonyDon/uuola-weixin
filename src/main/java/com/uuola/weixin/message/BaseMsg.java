/*
 * @(#)BaseMessage.java 2015年8月28日
 * 
 * Copy Right@ uuola
 */ 

package com.uuola.weixin.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * <pre>
 * 微信消息基本类
 * @author tangxiaodong
 * 创建日期: 2015年8月28日
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class BaseMsg implements Serializable {

    private static final long serialVersionUID = -2700030970137365313L;

    @XmlElement(name="ToUserName")
    private String toUserName;
    
    @XmlElement(name="FromUserName")
    private String fromUserName;
    
    @XmlElement(name="CreateTime")
    private Long createTime;
    
    @XmlElement(name ="MsgType")
    private String msgType;
    
    @XmlElement(name ="MsgId")
    private Long msgId;

    
    public String getToUserName() {
        return toUserName;
    }

    
    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    
    public String getFromUserName() {
        return fromUserName;
    }

    
    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    
    public Long getCreateTime() {
        return createTime;
    }

    
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }


    
    public String getMsgType() {
        return msgType;
    }


    
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }


    
    public Long getMsgId() {
        return msgId;
    }


    
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }
    
}
