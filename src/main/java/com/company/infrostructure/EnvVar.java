package com.company.infrostructure;
// Получение значений переменных из окружения
public class EnvVar {
    public static void main(String[] args) {
        System.out.println("Получение значений переменных окружения");
        System.out.println(System.getenv(args[0]));
    }
}
