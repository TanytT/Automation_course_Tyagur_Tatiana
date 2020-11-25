package com.company.lectures.Lecture15;

import com.company.homeworks.HW12.Url;
import com.company.infrostructure.TestURL;

import java.net.MalformedURLException;
import java.net.URL;

public class ProjectTestUrl {
    public static URL myAccountPage(){

        try {
            return new URL(new TestURL.Builder()
            .withProtocol("http://")
            .withDomain("localhost")
            .withPath("/my-account")
            .build());
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

    public static URL premiumPage(){
        try {
            return new URL(new TestURL.Builder()
                    .withProtocol("https://")
                    .withDomain("localhost")
                    .withPath("/premium/prices")
                    .build());
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
