package com.bl.address_book_system;

public class AddressBookMain {

    public static void main(String[] args) {

        ProcessAddressBook processAddressBook = new ProcessAddressBook();
        DisplayInConsole displayInConsole = new DisplayInConsole();

        while (true) {

            displayInConsole.takingInputOverWhileLoop();

            switch (displayInConsole.choiceOfUsers) {

                case DisplayInConsole.ADD_DETAILS:
                    processAddressBook.addNewContact();
                    break;
                case DisplayInConsole.PRINT_DETAILS:
                    processAddressBook.displayPersonDetails();
                    break;
                case DisplayInConsole.EDIT_DETAILS:
                    processAddressBook.editDetails();
                    break;
                case DisplayInConsole.DELETE_DETAILS:
                    processAddressBook.deleteDetails();
                    break;
                case DisplayInConsole.DISPLAY_BY_CITY_OR_STATE:
                    processAddressBook.displayPersonUsingCityOrState();
                    break;
                case DisplayInConsole.COUNT_BY_CITY_OR_STATE:
                    processAddressBook.countPersonByCityOrState();
                    break;
                case DisplayInConsole.SORT_BY_NAME:
                    processAddressBook.sortByName();
                    break;
                case DisplayInConsole.EXIT_PROGRAM:
                    displayInConsole.displayTermination();
                    return;
                default:
                    System.out.println("Please Enter correct input !");
                    break;
            }
        }
    }
}