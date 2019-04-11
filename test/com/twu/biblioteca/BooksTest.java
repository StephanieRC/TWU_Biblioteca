package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BooksTest {

    private String[] arrOfBooks = {"Catcher in the Rye", "Great Gatesby", "Where the wild things are"};
    private ArrayList<String> bookList= new ArrayList<String>(Arrays.asList(arrOfBooks));

    @Test
    public void returnStringWelcomeMsgFunction(){
        String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        Books books = new Books(bookList);
        assertEquals(welcomeMsg, books.getWelcomeMsg());
    }

    @Test
    public void returnStringOfAllBooks(){
        String strOfBooks = "Catcher in the Rye, Great Gatesby, Where the wild things are";
        Books books = new Books(bookList);
        assertEquals(strOfBooks, books.getStringOfBooks());
    }

}