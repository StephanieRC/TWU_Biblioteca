package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void returnStringWelcomeMsgFunction(){
        String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        Library library = new Library();
        assertEquals(welcomeMsg, library.getWelcomeMsg());
    }

    @Test
    public void returnStringOfAllBooksInformation(){
        Library library = new Library();
        String allInfo = "name0 || author0 || year0\nname1 || author1 || year1";
        assertThat(library.toString(), is(equalTo(allInfo)));
    }

    @Test
    public void checkOutBook_firstEntryListed(){
        Library library = new Library();
        String input = "name0";
        library.checkOutBook(input);
        String endResult = "name1 || author1 || year1";
        assertThat(endResult, is(equalTo(library.toString())));
    }

}