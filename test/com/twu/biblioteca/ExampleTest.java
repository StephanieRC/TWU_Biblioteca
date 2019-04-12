package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ExampleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setup(){
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void teardown(){
        System.setOut(originalOut);
    }

    /*
    @Test
    public void welcomeMsgFirstInConsole() {
        String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n";
        String[] strings = null;
        BibliotecaApp.main(strings);
        assertEquals(welcomeMsg, outContent.toString());
    }
    */

}
