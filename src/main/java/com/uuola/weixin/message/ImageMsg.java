/*
 * @(#)ImageMessage.java 2015年8月30日
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
public class ImageMsg extends BaseMsg {

    private static final long serialVersionUID = 7766461786459676655L;

    @XmlElement(name ="PicUrl")
    private String picUrl;
    
    @XmlElement(name ="MediaId")
    private String mediaId;
    
    @XmlElement(name ="MsgId")
    private Long msgId;

    
    public String getPicUrl() {
        return picUrl;
    }

    
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    
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
}
