package com.company.infrostructure.utils;

import java.util.Random;

public class StringUtils {

    public enum Mode{
        ALPHA, NUMERIC, ALPHANUMERIC, HEX
    }

    public static String randomString(Mode mode, int length){
        String result="";
        String abc="";
        switch(mode){
            case ALPHA:
                abc="abcdefghijklmnopqrstuvwxyz";
                break;
            case NUMERIC:
                abc="1234567890";
                break;
            case ALPHANUMERIC:
                abc="abcdefghijklmnopqrstuvwxyz1234567890";
                break;
            case HEX:
                abc="0123456789ABCDEF";
                break;

        }
        for (int i = 0; i < length; i++) {

            int index = new Random().nextInt(abc.length());
            result+=abc.charAt(index);
        }
        return result;

    }
}
