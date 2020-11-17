package com.company.lectures.lecture13;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        WebClient client = new WebClient();
        System.out.println(Arrays.toString(client.getUserRoles()));
        System.out.println(client.hasRoles("manager"));
        System.out.println(client.hasRoles("admin"));
    }
}
