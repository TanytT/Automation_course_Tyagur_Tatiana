package com.company.lectures.lecture08;

import com.company.infrostructure.utils.StringUtils;

public class StringsApp {
    public static void main(String[] args) {
        System.out.println(StringUtils.randomString(StringUtils.Mode.ALPHA,10));
        System.out.println(StringUtils.randomString(StringUtils.Mode.NUMERIC,15));
        System.out.println(StringUtils.randomString(StringUtils.Mode.ALPHANUMERIC,25));
        System.out.println(StringUtils.randomString(StringUtils.Mode.HEX,10));
    }
}
