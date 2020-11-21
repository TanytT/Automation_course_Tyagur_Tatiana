package com.company.infrostructure;

import com.company.infrostructure.config.ConfigurationManager;

public class TestServer {

    public static String getURL(){
        switch (ConfigurationManager.getInstance().getTestEnv()){
            case "dev":
                return "http://localhost:3000";
            case "staging":
                return "http://staging.mysite.com";
            case "test":
                return "http//test.mysite.com";
            case "production":
            default:
                return "http://mysite.com";
        }
    }
}
