package com.twu.biblioteca;

import java.lang.reflect.Array;

public class Menu {

    public Menu(){

    }



    public String toString(){
        return "0 list of books";
    }

    public String menuSelection(int selection){
        String result = new String();

        switch(selection) {
            case 0:
                Books shelf = new Books();
                result = shelf.toString();
        }

        return result;
    }

    /*
    * Function menuSelection(int)
    * {
    *   0: Books.ListBooks
    *
    * }
    * */
}
