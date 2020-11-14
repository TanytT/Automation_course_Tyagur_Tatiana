package com.company.infrostructure.webDriver;

import com.company.infrostructure.ConfigurationManager;
import com.company.infrostructure.webDriver.interfaces.WebDriverManager;

public class DefaultWebDriverManager implements WebDriverManager {
    @Override
    public String getBrowser() {
        return ConfigurationManager.getInstance().getWebDriver();
    }

    @Override
    public void destroyBrowser(String browser) {
        System.out.println("Destroyed browser:" + browser);
    }
}
