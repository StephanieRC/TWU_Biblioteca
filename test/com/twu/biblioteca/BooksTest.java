package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BooksTest {

    @Test
    public void returnStringWelcomeMsgFunction(){
        String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        Books books = new Books();
        assertEquals(welcomeMsg, books.getWelcomeMsg());
    }


    @Test
    public void returnStringOfAllBooksInformation(){
        Books books = new Books();
        String allInfo = "name0 || author0 || year0\nname1 || author1 || year1";
        assertThat(books.toString(), is(equalTo(allInfo)));
    }

}