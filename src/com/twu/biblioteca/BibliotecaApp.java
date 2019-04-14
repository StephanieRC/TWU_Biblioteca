package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("hey jonah");
        /*print welcome message
        * print mentu
        * wait for response
        * run respnse through menu function*/
    }

    public boolean quitSelected(String input){
        if (input == "q"){
            return true;
        }
        return false;
    }
}
