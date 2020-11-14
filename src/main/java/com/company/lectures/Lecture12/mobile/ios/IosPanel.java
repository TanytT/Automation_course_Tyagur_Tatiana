package com.company.lectures.Lecture12.mobile.ios;

import com.company.lectures.Lecture12.mobile.interfaces.Panel;

public class IosPanel implements Panel {
    @Override
    public void clickBack() {
        System.out.println("iOs click Back");
    }
}
