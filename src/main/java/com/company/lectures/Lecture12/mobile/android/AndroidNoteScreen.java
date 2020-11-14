package com.company.lectures.Lecture12.mobile.android;

import com.company.lectures.Lecture12.mobile.interfaces.NoteScreen;

public class AndroidNoteScreen implements NoteScreen {
    @Override
    public void enterText(String text) {
        System.out.println("-->Android enter text"+ text);
    }

    @Override
    public String getText() {
        System.out.println("-->Android get text");
        return "";
    }

    @Override
    public void clickCameraButton() {
        System.out.println("-->Android click camera button");
    }
}
