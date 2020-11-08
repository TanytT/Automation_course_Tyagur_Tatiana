package com.company.homeworks.HW08;

public class BooksOperations {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Fedor","Dostoevsky");
        Book b = new Book("Harry Potter",dostoevsky,"2000","","123456789");
        Book b1 = new Book("Idiot",dostoevsky,"2010","","123456789");
        b.setYear("");
        System.out.println(b);
    }
}
