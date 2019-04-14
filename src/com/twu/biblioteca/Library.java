package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private Book[] arrOfBooks = {new Book("name0", "author0", "year0"),
            new Book("name1", "author1", "year1")};

    public Library(){
    }

    public String getWelcomeMsg(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public String toString(){
        String strOfBooks = "";
        for (Book book : arrOfBooks){
            strOfBooks = strOfBooks + book.toString() + "\n";
        }
        return strOfBooks.trim();
    }
}
