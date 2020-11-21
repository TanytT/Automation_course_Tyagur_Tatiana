package com.company.lectures.Lecture14;

public enum Languages {
    EN("English","en"),
    RU("Russian", "ru"),
    GE("German", "ge"),
    FR("French", "fr"),
    SP("Spanish", "es"),
    IT("Italy", "it");

    private String name;
    private String code;

    Languages(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
