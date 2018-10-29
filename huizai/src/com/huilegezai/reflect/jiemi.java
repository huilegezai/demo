package com.huilegezai.reflect;


import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * AES加密，与Nodejs 保持一致
 * @author lmiky
 * @date 2014-2-25
 */
public class jiemi {
    public static final String DEFAULT_CODING = "utf-8";

    /**
     * 解密
     * @author lmiky
     * @date 2014-2-25
     * @param encrypted
     * @param seed
     * @return
     * @throws Exception
     */
    private static String decrypt(String encrypted, String seed) throws Exception {
        byte[] keyb = seed.getBytes(DEFAULT_CODING);
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] thedigest = md.digest(keyb);
        SecretKeySpec skey = new SecretKeySpec(thedigest, "AES");
        Cipher dcipher = Cipher.getInstance("AES");
        dcipher.init(Cipher.DECRYPT_MODE, skey);

        byte[] clearbyte = dcipher.doFinal(toByte(encrypted));
        return new String(clearbyte);
    }
    /**
     * 字符串转字节数组
     * @author lmiky
     * @date 2014-2-25
     * @param hexString
     * @return
     */
    private static byte[] toByte(String hexString) {
        int len = hexString.length() / 2;
        byte[] result = new byte[len];
        for (int i = 0; i < len; i++) {
            result[i] = Integer.valueOf(hexString.substring(2 * i, 2 * i + 2), 16).byteValue();
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println( jiemi.decrypt("39fd3222a419977c15571383ceadf28c", "qwe"));
    }
}
