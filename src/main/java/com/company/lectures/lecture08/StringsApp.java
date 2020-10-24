package com.company.lectures.lecture08;

import com.company.infrostructure.StringUtils;

public class StringsApp {
    public static void main(String[] args) {
        System.out.println(StringUtils.randomString("alpha",10));
        System.out.println(StringUtils.randomString("numeric",15));
        System.out.println(StringUtils.randomString("alphanumeric",25));
        System.out.println(StringUtils.randomString("hex",10));
    }
}