package com.company.lectures.Lecture12.mobile.ios;

import com.company.lectures.Lecture12.mobile.interfaces.NoteScreen;

public class IosNoteScreen implements NoteScreen {
    @Override
    public void enterText(String text) {
        System.out.println("Ios enter note text"+ text);
    }

    @Override
    public String getText() {
        System.out.println("iOs get note text");
        return null;
    }

    @Override
    public void clickCameraButton() {
        System.out.println("iOs click camera button");
    }
}
