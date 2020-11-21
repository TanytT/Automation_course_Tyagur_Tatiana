package com.company.infrostructure.wdm.interfaces;

public interface WebDriverManager {
    String getBrowser();
    void destroyBrowser(String browser);
}
