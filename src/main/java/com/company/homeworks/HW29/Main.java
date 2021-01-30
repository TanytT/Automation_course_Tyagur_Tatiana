package com.company.homeworks.HW29;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mike", 30));
        personList.add(new Person("Sam", 28));
        personList.add(new Person("Sam", 39));
        personList.add(new Person("Shelly", 28));
        personList.add(new Person("Tom", 52));

        Comparator<Person> compareByName = (p1, p2) -> p1.getName().compareTo(p2.getName());
        personList.stream()
                .sorted(compareByName)
                .forEach(System.out::println);
        System.out.println("===========================================================");

        Comparator<Person> compareByAge = Comparator.comparing(Person::getAge);
        personList.stream()
                .sorted(compareByAge)
                .forEach(System.out::println);

        Book b1 = new Book("Harry Potter1", 300);
        Book b2 = new Book("Green mile", 400);
        Book b3 = new Book("Harry Potter2", 250);
        Book b4 = new Book("Dead Souls", 180);
        Book b5 = new Book("Harry Potter3", 180);

        Author a1 = new Author("Joanne Rowling",55);
        Author a2 = new Author("Anny Rowling",25);
        Author a3 = new Author("Stephen King",45);
        Author a4 = new Author("Nikolai Gogol",33);

        b1.addAuthor(a2);
        b2.addAuthor(a3);
        b4.addAuthor(a4);
        b3.addAuthor(a1);
        b5.addAuthor(a1);
        b1.addAuthor(a2);
        b5.addAuthor(a2);

        System.out.println("===========================================================");
        System.out.println("Books with more than 200 pages:");
        List<Author> authorsList = new ArrayList<>(Arrays.asList(a1,a2,a3,a4));
        List<Book> booksList = new ArrayList<>(Arrays.asList(b1,b2,b3,b4,b5));
        booksList.stream()
                .filter(book -> book.getNumberOfPages()>200)
                .forEach(System.out::println);

        System.out.println("===========================================================");
        System.out.println("Books with max number of pages:");
        System.out.println(booksList.stream()
                .max((book1,book2) -> book1.getNumberOfPages()>book2.getNumberOfPages()? 1:-1).get());

        System.out.println("===========================================================");
        System.out.println("Books with min number of pages:");
        System.out.println(booksList.stream()
                .min((book1,book2) -> book1.getNumberOfPages()>book2.getNumberOfPages()? 1:-1).get());

        System.out.println("===========================================================");
        System.out.println("Books with one author:");
        booksList.stream()
                .filter(book -> book.getAuthors().size()==1)
                .forEach(System.out::println);

        System.out.println("===========================================================");
        System.out.println("Sort the books by number of pages/title:");
        booksList.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .sorted(Comparator.comparing(Book::getNumberOfPages))
                .forEach(System.out::println);

        System.out.println("========================== use peek method =================================");
        System.out.println("Output books sorted by title at first and then by number of pages/titles :");
        booksList.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .peek(book -> System.out.println(book+", "))
                .sorted(Comparator.comparing(Book::getNumberOfPages))
                .forEach(book -> System.out.println(book));

        System.out.println("===========================================================");
        System.out.println("Get list of all titles:");
        List<String> titlesList = booksList.stream()
                .map(book -> book.getTitle())
                .collect(Collectors.toList());
        titlesList.forEach(System.out::println);

        System.out.println("=================== use parallel stream =======================================");
        System.out.println("Get list of all titles:");
        List<String> titlesList1 = booksList.parallelStream()
                .map(book -> book.getTitle())
                .collect(Collectors.toList());
        titlesList1.forEach(System.out::println);

        System.out.println("===========================================================");
        System.out.println("Get distinct list of all authors:");
        booksList.stream()
                .map(book -> book.getAuthors())
                .flatMap(List::stream)
                .map(author -> author.getName())
                .distinct()
                .forEach(System.out::println);

        System.out.println("====================== use peek method =====================================");
        System.out.println("Get distinct list of all authors:");
        booksList.stream()
                .map(book -> book.getAuthors())
                .flatMap(List::stream)
                .map(author -> author.getName())
                .peek(author -> System.out.print(author+", "))
                .distinct()
                .forEach(author -> System.out.println("\n Distinct value: "+author));

        System.out.println();
        System.out.println("===================== Use parallel stream ======================================");
        System.out.println("Get distinct list of all authors:");
        booksList.parallelStream()
                .map(book -> book.getAuthors())
                .flatMap(List::stream)
                .map(author -> author.getName())
                .distinct()
                .forEach(System.out::println);

    }
}
