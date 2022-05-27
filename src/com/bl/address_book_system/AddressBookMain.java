package com.bl.address_book_system;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintingMessagesOnConsole print = new PrintingMessagesOnConsole();
        ProcessAddressBook processAddressBook = new ProcessAddressBook();

        print.printChoices();
        print.printFirstChoice();
        print.choiceOfUsers = scanner.nextInt();

        while (print.choiceOfUsers > 0 && print.choiceOfUsers < 6) {

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
                case PrintingMessagesOnConsole.EDIT_DETAILS:
                    processAddressBook.editDetails();
                    print.takingInputOverCases();
                    break;
                case PrintingMessagesOnConsole.DELETE_DETAILS:
                    processAddressBook.deleteDetails();
                    print.takingInputOverCases();
                    break;
                case PrintingMessagesOnConsole.EXIT_PROGRAM:
                    print.printTermination();
                    return;
            }
        }
    }
}