package com.company.lectures.Lecture12.mobile.android;

import com.company.lectures.Lecture12.mobile.interfaces.MainScreen;

public class AndroidMainScreen implements MainScreen {
    @Override
    public void clickNewNoteButton() {
        System.out.println("-->Android click new note button");
    }

    @Override
    public void getNoteWithTitle() {
        System.out.println("-->Android get note with title");
    }

    @Override
    public void deleteNote(String title) {
        System.out.println("-->Android delete note");
    }
}
