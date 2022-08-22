package com.app.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    public static String encode(String password) {
        byte[] secretByte;
        try {
            secretByte = MessageDigest.getInstance("md5")
                    .digest(password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("找不到md5算法");
        }

        StringBuilder md5Code = new StringBuilder(new BigInteger(1, secretByte).toString(16));

        for (int i = 0; i < 32 - md5Code.length(); i++) {
            md5Code.insert(0, "0");
        }

        return md5Code.toString();

    }

}