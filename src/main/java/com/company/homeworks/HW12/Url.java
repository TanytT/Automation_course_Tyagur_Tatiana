package com.company.homeworks.HW12;

import com.company.infrostructure.TestURL;

public class Url {
    public static void main(String[] args) {
        String testUrl = new TestURL.Builder()
                .withProtocol("http")
                .withDomain("google.com")
                .withPort("80")
                .withPath("user")
                .withParam("2896")
                .withParam("param2","567")
                .withParam("111")
                .withParam("21543")
                .withParam("param1","0")
                .build();
        System.out.println(testUrl);

    }
}
