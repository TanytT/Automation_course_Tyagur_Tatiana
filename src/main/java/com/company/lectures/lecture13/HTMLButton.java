package com.company.lectures.lecture13;

public class HTMLButton implements Button{

    @Override
    public void render() {
        System.out.println("Render button HTML");
    }

    @Override
    public void onClick() {
        System.out.println("Click on button HTML");
    }
}
