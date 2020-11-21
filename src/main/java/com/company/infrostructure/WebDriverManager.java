package com.company.infrostructure;

import com.company.infrostructure.config.ConfigurationManager;

public class WebDriverManager {

    public String createBrowser(){

        switch(ConfigurationManager.getInstance().getTestBrowser()){
            case "Chrome":
                return "Chrome";
            case "Firefox":
                return "Firefox";
            case"Edge":
                return "Edge";
        }
        return "Other Browser";
    }
    public void closeBrowser(String browser){
        if(browser!=null){
            System.out.println("Closing browser: "+ browser);
        }
    }
}
