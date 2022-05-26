package com.bl.address_book_system;

import java.util.Scanner;

public class ProcessAddressBook {

    AddressBookContacts addressBookContacts = new AddressBookContacts();

    void addDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter contact's first name : ");
        String firstName = scanner.next();
        addressBookContacts.setFirstName(firstName);

        System.out.print("Enter contact's last name : ");
        String lastName = scanner.next();
        addressBookContacts.setLastName(lastName);

        System.out.print("Enter contact's address : ");
        String address = scanner.next();
        addressBookContacts.setAddress(address);

        System.out.print("Enter contact's city : ");
        String city = scanner.next();
        addressBookContacts.setCity(city);

        System.out.print("Enter contact's state : ");
        String state = scanner.next();
        addressBookContacts.setState(state);

        System.out.print("Enter contact's zip code : ");
        int zipCode = scanner.nextInt();
        addressBookContacts.setZipCode(zipCode);

        System.out.print("Enter contact's phone number : ");
        long phoneNumber = scanner.nextLong();
        addressBookContacts.setPhoneNumber(phoneNumber);

        System.out.print("Enter contact's email : ");
        String email = scanner.next();
        addressBookContacts.setEmail(email);

        System.out.println("\n Your details are successfully added in Address book");
    }

    void printDetails() {
        System.out.println(" These are the Contact Details \n");
        System.out.println("Name \t      : " + addressBookContacts.getFirstName() + " " + addressBookContacts.getLastName() + "\n"
                + "Address       : " + addressBookContacts.getAddress() + "\n" + "City          : " + addressBookContacts.getCity() + "\n"
                + "State         : " + addressBookContacts.getState() + "\n" + "Zip           : " + addressBookContacts.getZipCode() + "\n"
                + "Mobile Number : " + addressBookContacts.getPhoneNumber() + "\n" + "EmailId       : " + addressBookContacts.getEmail()
                + "\n");
    }
}
