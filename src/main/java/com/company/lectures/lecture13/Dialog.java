package com.company.lectures.lecture13;

public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.onClick();
    }

    public abstract Button createButton();
}
