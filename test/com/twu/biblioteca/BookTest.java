package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BookTest {


    @Test
    public void getName() {
        Book book = new Book("Name", "author", "year");
        assertThat(book.getName(), is(equalTo("Name")));
    }

    @Test
    public void getAuthor() {
        Book book = new Book("Name", "author", "year");
        assertThat(book.getAuthor(), is(equalTo("author")));
    }

    @Test
    public void getYearPublished() {
        Book book = new Book("Name", "author", "year");
        assertThat(book.getYearPublished(), is(equalTo("year")));
    }
}