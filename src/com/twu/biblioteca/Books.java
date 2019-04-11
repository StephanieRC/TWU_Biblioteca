package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {

    ArrayList<String> books = new ArrayList<String>();

    public Books(ArrayList<String> books){
        this.books.addAll(books);
    }

    public String getWelcomeMsg(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public String getStringOfBooks(){
        String strOfBooks = "";
        for (String book : books){
            strOfBooks = strOfBooks + book + ", ";
        }
        strOfBooks = strOfBooks.substring(0, strOfBooks.length()-2);
        return strOfBooks;
    }
}
