package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BooksTest {

    private Book[] arrOfBooks = {new Book("name0", "author0", "year0"),
            new Book("name1", "author1", "year1")};
    private ArrayList<Book> bookList= new ArrayList<Book>(Arrays.asList(arrOfBooks));

    @Test
    public void returnStringWelcomeMsgFunction(){
        String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        Books books = new Books(bookList);
        assertEquals(welcomeMsg, books.getWelcomeMsg());
    }


    @Test
    public void returnStringOfAllBooksInformation(){
        Books books = new Books(bookList);
        String allInfo = "name0 || author0 || year0\nname1 || author1 || year1";
        assertThat(books.getStringOfBooks(), is(equalTo(allInfo)));
    }

}