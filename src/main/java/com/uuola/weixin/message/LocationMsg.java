/*
 * @(#)LocationMsg.java 2015年8月30日
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
public class LocationMsg extends BaseMsg {

    private static final long serialVersionUID = -740628322175688840L;

    @XmlElement(name ="Location_X")
    private Double locationX;
    
    @XmlElement(name ="Location_Y")
    private Double locationY;
    
    @XmlElement(name ="Scale")
    private Double scale;
    
    @XmlElement(name ="Label")
    private String label;


    
    public Double getLocationX() {
        return locationX;
    }

    
    public void setLocationX(Double locationX) {
        this.locationX = locationX;
    }

    
    public Double getLocationY() {
        return locationY;
    }

    
    public void setLocationY(Double locationY) {
        this.locationY = locationY;
    }

    
    public Double getScale() {
        return scale;
    }

    
    public void setScale(Double scale) {
        this.scale = scale;
    }

    
    public String getLabel() {
        return label;
    }

    
    public void setLabel(String label) {
        this.label = label;
    }

    
}
