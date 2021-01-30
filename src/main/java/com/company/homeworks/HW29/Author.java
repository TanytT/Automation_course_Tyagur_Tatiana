package com.company.homeworks.HW29;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private short age;
    private List<Book> books;

    public Author(String name, int age) {
        this.name = name;
        this.age = (short) age;
        this.books = new ArrayList<>();

    }

    public void addBookOnly(Book book){
        this.books.add(book);
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {

        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books.stream().map(b->b.getTitle()).reduce("",(b1,b2) -> b1+ ", "+ b2) +
                '}';
    }
}
