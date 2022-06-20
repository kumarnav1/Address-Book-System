package com.bl.address_book_system;

public class AddressBookMain {

    public static void main(String[] args) {

        ProcessAddressBook processAddressBook = new ProcessAddressBook();
        DisplayInConsole displayInConsole = new DisplayInConsole();

        while (true) {

            displayInConsole.takingInputOverWhileLoop();

            switch (displayInConsole.choiceOfUsers) {

                case ProcessAddressBook.ADD_DETAILS:
                    processAddressBook.addNewContact();
                    break;
                case ProcessAddressBook.PRINT_DETAILS:
                    processAddressBook.displayPersonDetails();
                    break;
                case ProcessAddressBook.EDIT_DETAILS:
                    processAddressBook.editDetails();
                    break;
                case ProcessAddressBook.DELETE_DETAILS:
                    processAddressBook.deleteDetails();
                    break;
                case ProcessAddressBook.EXIT_PROGRAM:
                    displayInConsole.displayTermination();
                    return;
                default:
                    System.out.println("Please Enter correct input !");
                    break;
            }
        }
    }
}