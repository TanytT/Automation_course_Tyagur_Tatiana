package com.company.lectures.Lecture14;

import com.company.infrostructure.config.ConfigurationManager;
import com.company.infrostructure.wdm.BrowserType;

public class EnumApp {
    public static void main(String[] args) {
        Languages l= Languages.FR;
        System.out.println(l.getCode());

        System.out.println(Languages.EN.getName());
        System.out.println(Languages.EN.toString());
        System.out.println(BrowserType.CHROME.toString());
        System.out.println(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        if(BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase())==BrowserType.CHROME)
            System.out.println("!!");
    }
}
