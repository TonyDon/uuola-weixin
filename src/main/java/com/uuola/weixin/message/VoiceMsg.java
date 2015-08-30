/*
 * @(#)VoiceMsg.java 2015年8月30日
 * 
 * Copy Right@ uuola
 */ 

package com.uuola.weixin.message;

import javax.xml.bind.annotation.XmlElement;


/**
 * <pre>
 *
 * @author tangxiaodong
 * 创建日期: 2015年8月30日
 * </pre>
 */
public class VoiceMsg extends BaseMsg {

    private static final long serialVersionUID = -415882927930620485L;

    @XmlElement(name ="MediaId")
    private String mediaId;
    
    @XmlElement(name ="MsgId")
    private Long msgId;
    
    @XmlElement(name ="Format")
    private String format;

    
    public String getMediaId() {
        return mediaId;
    }

    
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    
    public Long getMsgId() {
        return msgId;
    }

    
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    
    public String getFormat() {
        return format;
    }

    
    public void setFormat(String format) {
        this.format = format;
    }
}
