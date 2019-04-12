package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {

    ArrayList<Book> books = new ArrayList<Book>();

    public Books(ArrayList<Book> books){
        this.books.addAll(books);
    }

    public String getWelcomeMsg(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public String getStringOfBooks(){
        String strOfBooks = "";
        for (Book book : books){
            strOfBooks = strOfBooks + book.toString() + "\n";
        }
        return strOfBooks.trim();
    }
}
