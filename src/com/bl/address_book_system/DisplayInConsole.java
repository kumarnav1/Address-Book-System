package com.bl.address_book_system;

import java.util.Scanner;

public class DisplayInConsole {

    public int choiceOfUsers;
    Scanner choice = new Scanner(System.in);

    void displayChoices() {
        System.out.println("\n \n Welcome to Address Book Program.");
        System.out.println("These are the actions you can perform in the Address book");
        System.out.println("1. Adding a new contact details.");
        System.out.println("2. Printing a existing contact details.");
        System.out.println("3. Editing a existing contact.");
        System.out.println("4. Deleting a existing contact.");
    }

    void displayTermination() {
        System.out.println("Your program is Terminated.");
    }

    public void takingInputOverWhileLoop() {
        displayChoices();
        System.out.println(" \n Enter a number between 1 to 4 to run any one of the functionality and 5 to terminate : \n");
        System.out.print("your choice : ");
        choiceOfUsers = choice.nextInt();
    }
}