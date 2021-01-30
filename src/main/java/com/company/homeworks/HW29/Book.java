package com.company.homeworks.HW29;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private List<Author> authors;
    private int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author){
        this.authors.add(author);
        author.addBookOnly(this);

    }

    public List<Author> getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle(){
        return title;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors.stream().map(s->s.getName()).reduce("",(s1, s2) -> s1+", "+s2) +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
