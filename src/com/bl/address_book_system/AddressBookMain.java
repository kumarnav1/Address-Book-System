package com.bl.address_book_system;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintingMessagesOnConsole print = new PrintingMessagesOnConsole();
        ProcessAddressBook processAddressBook = new ProcessAddressBook();

        print.printChoices();
        System.out.print(" \n Enter 1 for Adding a contact details, 2 for Printing details, 3 and other to terminate : ");
        print.choiceOfUsers = scanner.nextInt();

        while (print.choiceOfUsers > 0 && print.choiceOfUsers < 4) {

            switch (print.choiceOfUsers) {

                case PrintingMessagesOnConsole.ADD_DETAILS:
                    processAddressBook.addDetails();
                    processAddressBook.printDetails();
                    print.takingInputOverCases();
                    break;

                case PrintingMessagesOnConsole.PRINT_DETAILS:
                    processAddressBook.printingDetails();
                    print.takingInputOverCases();
                    break;

                case PrintingMessagesOnConsole.EXIT_PROGRAM:
                    print.printTermination();
                    return;
            }
        }
    }
}