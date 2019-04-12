package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {

    ArrayList<Book> books = new ArrayList<Book>();

    public Books(){
        this.books.addAll(books);
    }

    public String getWelcomeMsg(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public String toString(){
        String strOfBooks = "";
        for (Book book : books){
            strOfBooks = strOfBooks + book.toString() + "\n";
        }
        return strOfBooks.trim();
    }
}
