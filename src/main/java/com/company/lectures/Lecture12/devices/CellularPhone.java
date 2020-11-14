package com.company.lectures.Lecture12.devices;

import com.company.lectures.Lecture12.tech.Cellular;

public class CellularPhone implements Cellular {
    @Override
    public void connect() {
        System.out.println("Cellular connected");
    }

    @Override
    public void transfer() {
        System.out.println("Cellular send data");
    }

    @Override
    public void triangular() {
        System.out.println("Cellular phone triangle ");
    }
}
