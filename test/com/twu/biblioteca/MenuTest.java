package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void toString_firstOptionIsListOfBooks(){
        String bookOption = "0 list of books";
        Menu menu = new Menu();
        assertThat(menu.toString(), is(equalTo(bookOption)));
    }

    @Test
    public void menuSelection_firstOptionIsSelected(){
        Menu menu = new Menu();
        String allInfo = "name0 || author0 || year0\nname1 || author1 || year1";
        assertThat(menu.menuSelection("0"), is(equalTo(allInfo)));
    }

    @Test
    public void menuSelection_invalidInputNumberNotOnList(){
        Menu menu = new Menu();
        String invalid = "2";
        assertThat(menu.menuSelection(invalid), is(equalTo("Please enter valid input")));
    }

}