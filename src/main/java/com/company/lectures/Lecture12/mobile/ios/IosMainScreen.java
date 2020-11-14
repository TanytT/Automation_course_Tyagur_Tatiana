package com.company.lectures.Lecture12.mobile.ios;

import com.company.lectures.Lecture12.mobile.interfaces.MainScreen;

public class IosMainScreen implements MainScreen {
    @Override
    public void clickNewNoteButton() {
        System.out.println("iOs click new note button");
    }

    @Override
    public void getNoteWithTitle() {
        System.out.println("iOS get note with title");

    }

    @Override
    public void deleteNote(String title) {
        System.out.println("iOS delete note with title");

    }
}
