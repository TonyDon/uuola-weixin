/*
 * @(#)WechatUtil.java 2015年8月28日
 * 
 * Copy Right@ uuola
 */ 

package com.uuola.weixin;

import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * <pre>
 * 微信工具类
 * @author tangxiaodong
 * 创建日期: 2015年8月28日
 * </pre>
 */
public abstract class WechatUtil {
    
    private static Logger log = LoggerFactory.getLogger(WechatUtil.class);

    /**
     * 校验微信签名是否合法
     * @param signature
     * @param token
     * @param timestamp
     * @param nonce
     * @return
     */
    public static boolean checkSignature(String signature, String token, String timestamp,String nonce){
        if(null == signature || null == token || null == timestamp || null == nonce){
            log.debug("checkSignature() parameters exist null!");
            return false;
        }
        return makeHash(token,timestamp,nonce).equals(signature);
    }
    
    /**
     * 对参数进行HASH
     * @param token
     * @param timestamp
     * @param nonce
     * @return
     */
    public static String makeHash(String token, String timestamp, String nonce) {
        String[] arr = { token, timestamp, nonce };
        Arrays.sort(arr);
        StringBuilder text = new StringBuilder();
        for (String s : arr) {
            text.append(s);
        }
        return DigestUtils.sha1Hex(text.toString());
    }
    
}
