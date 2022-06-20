package com.bl.address_book_system;

import java.util.Scanner;

public class DisplayInConsole {

    static final int ADD_DETAILS = 1;
    static final int PRINT_DETAILS = 2;
    static final int EDIT_DETAILS = 3;
    static final int DELETE_DETAILS = 4;
    static final int DISPLAY_BY_CITY_OR_STATE = 5;
    static final int EXIT_PROGRAM = 6;
    public int choiceOfUsers;
    Scanner choice = new Scanner(System.in);

    void displayChoices() {
        System.out.println("\n \n Welcome to Address Book Program.");
        System.out.println("These are the actions you can perform in the Address book");
        System.out.println("1. Adding a new contact details.");
        System.out.println("2. Printing a existing contact details.");
        System.out.println("3. Editing a existing contact.");
        System.out.println("4. Deleting a existing contact.");
        System.out.println("5. Display details by city or state.");
    }

    void displayTermination() {
        System.out.println("Your program is Terminated.");
    }

    public void takingInputOverWhileLoop() {
        displayChoices();
        System.out.println(" \n Enter a number between 1 to 5 to run any one of the functionality and 6 to terminate : \n");
        System.out.print("your choice : ");
        choiceOfUsers = choice.nextInt();
    }
}