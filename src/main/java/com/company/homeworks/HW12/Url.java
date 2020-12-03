package com.company.homeworks.HW12;

import com.company.infrostructure.TestURL;

import java.util.HashMap;


public class Url {
    public static void main(String[] args) {
        HashMap<String, String> par = new HashMap<>();
        par.put("111","value");
        par.put("222","value");
        HashMap<String, String> par1 = new HashMap<>();
        par1.put("333","value");
        par1.put("444","value");

        String testUrl = new TestURL.Builder()
                .withProtocol("http")
                .withDomain("google.com")
                .withPort("80")
                .withPath("user")
                .withParam(par)
                .withParam(par1)
                .build();
        System.out.println(testUrl);

    }
}
