/*
 * @(#)AdapterCDATA.java 2015年8月30日
 * 
 * Copy Right@ uuola
 */ 

package com.uuola.weixin;

import javax.xml.bind.annotation.adapters.XmlAdapter;


/**
 * <pre>
 * CDATA节点内容适配<br/>
 * usage : @XmlJavaTypeAdapter(AdapterCDATA.class)
 * @author tangxiaodong
 * 创建日期: 2015年8月30日
 * </pre>
 */
public class AdapterCDATA extends XmlAdapter<String, String> {

    /* (non-Javadoc)
     * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public String unmarshal(String v) throws Exception {
        return v;
    }

    /* (non-Javadoc)
     * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
     */
    @Override
    public String marshal(String v) throws Exception {
        return "<![CDATA[" + v + "]]>";
    }

}
