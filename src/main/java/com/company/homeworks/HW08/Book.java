package com.company.homeworks.HW08;

import java.util.Objects;
import java.util.UUID;

public class Book {
    private final String id;
    private String title="";
    private Author author;
    private String year="";
    private String description="";
    private String isbn="";

    public Book() {
        this.id= UUID.randomUUID().toString();
    }

    public Book(String title, Author author, String year, String description, String isbn) {
        this();
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(notNull(title)){
            this.title = title;
        }
    }

    public Author getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        if(notNull(year)||validYear(year)) {
            this.year = year;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(notNull(description)){
            this.description = description;
        }

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(notNull(isbn)){
            this.isbn = isbn;
        }

    }
    private boolean notNull(String str){
        return  str!=null;
    }
    private boolean validYear(String year){

        return Integer.parseInt(year)<=2020;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) &&
                author.equals(book.author) &&
                year.equals(book.year) &&
                isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
