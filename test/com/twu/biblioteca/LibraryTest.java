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

    @Test
    public void checkInBook_checkInBookIsAddedToLibrary(){
        Library library = new Library();
        library.checkInBook("name2");
        String endResult = "name0 || author0 || year0\nname1 || author1 || year1\nname2 || author2 || year2";
        assertThat(endResult, is(equalTo(library.toString())));
    }

    @Test
    public void checkInBook_successfulCheckIn(){
        Library library = new Library();
        assertThat("name2 successfully checked in!", is(equalTo(library.checkInBook("name2"))));
    }

    @Test
    public void checkInBook_failCheckIn(){
        Library library = new Library();
        assertThat("Does not belong to this library", is(equalTo(library.checkInBook("name"))));
    }
}