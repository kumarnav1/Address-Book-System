package com.bl.address_book_system;

import java.util.Scanner;

public class PrintingMessagesOnConsole {

    static final int ADD_DETAILS = 1;
    static final int PRINT_DETAILS = 2;
    static final int EXIT_PROGRAM = 3;

    public int choiceOfUsers;

    Scanner choice = new Scanner(System.in);

    void printChoices() {
        System.out.println("Welcome to Address Book Program.");
        System.out.println("These are the actions you can perform in the Address book");
        System.out.println("1. Adding a new contact details.");
        System.out.println("2. Printing a existing contact details.");
    }

    void printTermination() {
        System.out.println("Your program is Terminated.");
    }

    public void takingInputOverCases() {

        System.out.print(" \n Enter 1 for Adding a contact details, 2 for Printing details, 3 and other to terminate : ");
        choiceOfUsers = choice.nextInt();
        if (choiceOfUsers < 0 || choiceOfUsers > 3)
            System.out.println("Program Terminated");
    }
}