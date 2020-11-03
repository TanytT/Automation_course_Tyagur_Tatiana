package com.company.infrostructure;
// Получение значений переменных из окружения

public class ConfigurationManager {
    private String testBrowser="";
    private String testEnv="";
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
       return testBrowser;
    }

    public String getTestEnv(){
        return testEnv;
    }

    private String getEnvironmentVariableOrDefault(String envVar, String defaultValue) {
       return System.getenv(envVar) !=null&& !System.getenv(envVar).isBlank() ?
               System.getenv(envVar): defaultValue;
    }
}
