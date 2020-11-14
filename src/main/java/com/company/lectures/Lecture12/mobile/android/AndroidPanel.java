package com.company.lectures.Lecture12.mobile.android;

import com.company.lectures.Lecture12.mobile.interfaces.Panel;

public class AndroidPanel implements Panel {
    @Override
    public void clickBack() {
        System.out.println("-->Android clack back");
    }
}
