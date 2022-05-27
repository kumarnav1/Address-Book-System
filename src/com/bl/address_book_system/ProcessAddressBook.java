package com.bl.address_book_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessAddressBook {

    Scanner scanner = new Scanner(System.in);
    List<AddressBookContacts> contactArray = new ArrayList<AddressBookContacts>();
    AddressBookContacts addressBookContacts;

    void addDetails() {
        addressBookContacts = new AddressBookContacts();
        System.out.print("Enter contact's first name : ");
        String firstName = scanner.next();
        addressBookContacts.setFirstName(firstName);

        System.out.print("Enter contact's last name : ");
        String lastName = scanner.next();
        addressBookContacts.setLastName(lastName);

        System.out.print("Enter contact's address : ");
        scanner.nextLine();
        String address = scanner.nextLine();
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
        scanner.nextLine();
        String email = scanner.nextLine();
        addressBookContacts.setEmail(email);

        contactArray.add(addressBookContacts);
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

    void printingDetails() {

        System.out.println("To print the details");
        AddressBookContacts varPrint = isDetailsMatched();
        if (varPrint == null)
            return;

        System.out.println(" These are the Contact Details \n");
        System.out.println("Name \t      : " + varPrint.getFirstName() + " " + varPrint.getLastName() + "\n"
                + "Address       : " + varPrint.getAddress() + "\n" + "City          : " + varPrint.getCity() + "\n"
                + "State         : " + varPrint.getState() + "\n" + "Zip           : " + varPrint.getZipCode() + "\n"
                + "Mobile Number : " + varPrint.getPhoneNumber() + "\n" + "EmailId       : " + varPrint.getEmail()
                + "\n");
    }

    AddressBookContacts isDetailsMatched() {

        System.out.print("Enter the first name of the person : ");
        String editName = scanner.next();
        AddressBookContacts tempRefVar = null;
        boolean flag = false;

        for (int index = 0; index < contactArray.size(); index++) {
            String name = contactArray.get(index).getFirstName();
            if ((name.equals(editName))) {
                tempRefVar = contactArray.get(index);
                System.out.println("\n Match found \n ");
                flag = true;
            }
        }

        if (!(flag)) {
            System.out.println("Invalid input, Please try again");
            return null;
        }
        return tempRefVar;
    }
}