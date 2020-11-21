package com.company.lectures.lecture13;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
