package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {


    private ArrayList<Book> bookArrayList = new ArrayList<Book>();
    private Book[] arrOfBooks = {new Book("name0", "author0", "year0"),
            new Book("name1", "author1", "year1")};

    public Library(){
        for (Book book: arrOfBooks) {
            bookArrayList.add(book);
        }
    }

    public String getWelcomeMsg(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public String toString(){
        String strOfBooks = "";
        for (Book book : bookArrayList){
            strOfBooks = strOfBooks + book.toString() + "\n";
        }
        return strOfBooks.trim();
    }

    public String checkOutBook(String input){
        for (Book book:bookArrayList){
            if(book.getName().equals(input)){
                bookArrayList.remove(book);
                return input + "successfully checked out!";
            }
        }
        return "Please enter valid book title";
    }

    public void checkInBook(String name, String author, String year){
        bookArrayList.add(new Book(name,author,year));
    }
}
