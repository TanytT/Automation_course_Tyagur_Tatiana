package com.company.infrostructure;
// Получение значений переменных из окружения
public class ConfigurationManager {
    public static String getEnvironmentVariableOrDefault(String envVar, String defaultValue) {
       return System.getenv(envVar) !=null&& !System.getenv(envVar).isBlank() ?
               System.getenv(envVar): defaultValue;
    }
}
