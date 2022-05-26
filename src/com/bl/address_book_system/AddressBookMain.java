package com.bl.address_book_system;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        PrintingMessagesOnConsole print = new PrintingMessagesOnConsole();
        print.printChoices();
        ProcessAddressBook processAddressBook = new ProcessAddressBook();

        while (true) {
            System.out.print(" \n To add a new contact details Enter a positive number or any other number to terminate the process : ");
            Scanner scanner = new Scanner(System.in);
            int check = scanner.nextInt();
            if (!(check > 0)) {
                print.printTermination();
                return;
            }
            processAddressBook.addDetails();
            processAddressBook.printDetails();
        }
    }
}