package com.twu.biblioteca;

public class Menu {

    public Menu(){
    }

    public String toString(){
        return "0 list of books";
    }

    public String menuSelection(String selection){

        String result = new String();
        try{
            int intSelection = Integer.parseInt(selection.trim());
            switch(intSelection) {
                case 0:
                    Library shelf = new Library();
                    result = shelf.toString();
                    break;
                default:
                    result = "Please enter valid input";
            }
        }catch (NumberFormatException nfe){
            result = "Please enter valid input";
        }
        return result;
    }
}
