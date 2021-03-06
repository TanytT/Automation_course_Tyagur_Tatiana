package com.company.infrostructure.config;
// Получение значений переменных из окружения

public class ConfigurationManager {
    private String testBrowser="Firefox";
    private String testEnv="dev";
    private static ConfigurationManager INSTANCE;

    private ConfigurationManager(){

    }

    public static ConfigurationManager getInstance(){
        if(INSTANCE==null){
            INSTANCE= new ConfigurationManager();
        }
        return INSTANCE;
    }
    public String getTestBrowser(){

        return getEnvironmentVariableOrDefault("testBrowser", "Chrome");
    }

    public String getTestEnv(){

        return getEnvironmentVariableOrDefault("testEnv", "production");
    }

    public String getTestLogger(){

        return getEnvironmentVariableOrDefault("testLogger","std");
    }
    public String getMobilePlatform(){
        return getEnvironmentVariableOrDefault("mobilePlatform","android" );
    }

    public String getRunOn(){
        return getEnvironmentVariableOrDefault("runOn", "local");
    }

    private String getEnvironmentVariableOrDefault(String envVar, String defaultValue) {
       return System.getenv(envVar) !=null&& !System.getenv(envVar).isBlank() ?
               System.getenv(envVar): defaultValue;
    }
}
