package com.company.infrostructure;

import java.util.Random;

public class StringUtils {
    public static String randomString(String mode, int length){
        String result = "" ;
        String abc="";
        switch(mode){
            case "alpha":
                abc="abcdefghijklmnopqrstuvwxyz";
                break;
            case "numeric":
                abc="1234567890";
                break;
            case "alphanumeric":
                abc="abcdefghijklmnopqrstuvwxyz1234567890";
                break;
            case "hex":
                abc="0123456789ABCDEF";
                break;
            default:

        }
        for (int i = 0; i < length; i++) {

            int index = new Random().nextInt(abc.length());
            result+=abc.charAt(index);
        }
        return result;

    }
}
