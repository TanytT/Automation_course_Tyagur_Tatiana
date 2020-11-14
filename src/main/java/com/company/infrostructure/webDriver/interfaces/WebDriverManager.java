package com.company.infrostructure.webDriver.interfaces;

public interface WebDriverManager {
    String getBrowser();
    void destroyBrowser(String browser);
}
