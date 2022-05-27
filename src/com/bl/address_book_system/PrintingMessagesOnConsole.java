package com.bl.address_book_system;

import java.util.Scanner;

public class PrintingMessagesOnConsole {

    static final int ADD_DETAILS = 1;
    static final int PRINT_DETAILS = 2;
    static final int EDIT_DETAILS = 3;
    static final int DELETE_DETAILS = 4;
    static final int EXIT_PROGRAM = 5;

    public int choiceOfUsers;

    Scanner choice = new Scanner(System.in);

    void printChoices() {

        System.out.println("Welcome to Address Book Program.");
        System.out.println("These are the actions you can perform in the Address book");
        System.out.println("1. Adding a new contact details.");
        System.out.println("2. Printing a existing contact details.");
        System.out.println("3. Editing a existing contact");
        System.out.println("4. Deleting a existing contact");
    }

    void printTermination() {

        System.out.println("Your program is Terminated.");
    }

    void printFirstChoice() {

        System.out.print(" \n Enter 1 for Adding a contact details, 2 for Printing details, 3 for editing, 4 for deleting and any other number to terminate : ");
    }

    public void takingInputOverCases() {

        System.out.print(" \n Enter 1 for Adding a contact details, 2 for Printing details, 3 for editing, 4 for deleting and other number to terminate : ");
        choiceOfUsers = choice.nextInt();
        if (choiceOfUsers < 0 || choiceOfUsers > 5)
            System.out.println("Program Terminated");
    }
}