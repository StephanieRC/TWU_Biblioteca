package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {


    private ArrayList<Book> checkedInBookArrayList = new ArrayList<Book>();
    private ArrayList<Book> checkedOutBookArrayList = new ArrayList<Book>();
    private Book[] arrOfBooks = {new Book("name0", "author0", "year0"),
            new Book("name1", "author1", "year1")};

    public Library(){
        for (Book book: arrOfBooks) {
            checkedInBookArrayList.add(book);
        }
        checkedOutBookArrayList.add(new Book("name2", "author2", "year2"));
    }

    public String getWelcomeMsg(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public String toString(){
        String strOfBooks = "";
        for (Book book : checkedInBookArrayList){
            strOfBooks = strOfBooks + book.toString() + "\n";
        }
        return strOfBooks.trim();
    }

    public String checkOutBook(String input){
        for (Book book: checkedInBookArrayList){
            if(book.getName().equals(input)){
                checkedInBookArrayList.remove(book);
                checkedOutBookArrayList.add(book);
                return input + " successfully checked out!";
            }
        }
        return "Please enter valid book title";
    }

    public String checkInBook(String input) {
        for (Book book : checkedOutBookArrayList) {
            if (book.getName().equals(input)) {
                checkedOutBookArrayList.remove(book);
                checkedInBookArrayList.add(book);
                return input + " successfully checked in!";
            }
        }
        return "Does not belong to this library";
    }
}
