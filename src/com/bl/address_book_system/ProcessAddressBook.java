package com.bl.address_book_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessAddressBook {

    static final int ADD_DETAILS = 1;
    static final int PRINT_DETAILS = 2;
    static final int EDIT_DETAILS = 3;
    static final int DELETE_DETAILS = 4;
    static final int EXIT_PROGRAM = 5;

    Scanner scanner = new Scanner(System.in);
    Map<String, ArrayList<AddressBookContacts>> multipleAddressBookMap = new HashMap<>();
    ArrayList<AddressBookContacts> contactArray;
    AddressBookContacts addressBookContacts;

    public void addNewContact() {

        System.out.println("\n You have chosen to Add a new contact details.\n");
        System.out.print("Enter contact's first name : ");
        String firstName = scanner.next();

        System.out.print("Enter contact's last name : ");
        String lastName = scanner.next();

        System.out.print("Enter contact's address : ");
        scanner.nextLine();
        String address = scanner.nextLine();

        System.out.print("Enter contact's city : ");
        String city = scanner.next();

        System.out.print("Enter contact's state : ");
        String state = scanner.next();

        System.out.print("Enter contact's zip code : ");
        int zipCode = scanner.nextInt();

        System.out.print("Enter contact's phone number : ");
        long phoneNumber = scanner.nextLong();

        System.out.print("Enter contact's email : ");
        scanner.nextLine();
        String email = scanner.nextLine();

        addressBookContacts = new AddressBookContacts(firstName, lastName, address, city, state, zipCode, phoneNumber, email);

        System.out.println("\n Enter the book name ");
        String bookName = scanner.next();

        if (multipleAddressBookMap.containsKey(bookName)) {
            String isFirstName = addressBookContacts.getFirstName();
            ArrayList<AddressBookContacts> tempMapValue = multipleAddressBookMap.get(bookName);

            for (int indexOfArrayList = 0; indexOfArrayList < tempMapValue.size(); indexOfArrayList++) {
                String name = tempMapValue.get(indexOfArrayList).getFirstName();
                if (!(name.equals(isFirstName)))
                    continue;
                System.out.println("\n Match found, duplicate Entry \n ");
                return;
            }
            System.out.println("Contact not found in the existing address book, No duplicate Entry will be there. \n");
            multipleAddressBookMap.get(bookName).add(addressBookContacts);
            System.out.println("Contact added successfully exiting arrayList and existing book : \"" + bookName + " \"");
        } else {
            contactArray = new ArrayList<>();
            contactArray.add(addressBookContacts);
            multipleAddressBookMap.put(bookName, contactArray);
            System.out.println("Successfully created book " + bookName);
            System.out.println("New contact added in the new arraylist in new address book " + bookName);
        }
        displayAddedDetails(addressBookContacts);
    }

    void editDetails() {
        System.out.println("\n You have chosen to update the existing contact details.\n");
        System.out.println("To edit the details");
        AddressBookContacts varEdit = isDetailsMatched();
        if (varEdit == null)
            return;

        System.out.print("Enter contact's first name : ");
        String firstName = scanner.next();
        varEdit.setFirstName(firstName);

        System.out.print("Enter contact's last name : ");
        String lastName = scanner.next();
        varEdit.setLastName(lastName);

        System.out.print("Enter contact's address : ");
        scanner.nextLine();
        String address = scanner.nextLine();
        varEdit.setAddress(address);

        System.out.print("Enter contact's city : ");
        String city = scanner.next();
        varEdit.setCity(city);

        System.out.print("Enter contact's state : ");
        String state = scanner.next();
        varEdit.setState(state);

        System.out.print("Enter contact's zip code : ");
        int zipCode = scanner.nextInt();
        varEdit.setZipCode(zipCode);

        System.out.print("Enter contact's phone number : ");
        long phoneNumber = scanner.nextLong();
        varEdit.setPhoneNumber(phoneNumber);

        System.out.print("Enter contact's email : ");
        scanner.nextLine();
        String email = scanner.nextLine();
        varEdit.setEmail(email);

        System.out.println("\n Your details are successfully edited in Address book");
    }

    void deleteDetails() {
        System.out.println("\n You have chosen to remove the existing contact details.\n");
        System.out.println("To delete the details");
        AddressBookContacts varDelete = isDetailsMatched();
        if (varDelete == null)
            return;

        contactArray.remove(varDelete);
        System.out.println("Record was Deleted");
    }

    void displayAddedDetails(AddressBookContacts toDisplayDetails) {
        System.out.println(toDisplayDetails);
    }

    void displayPersonDetails() {
        System.out.println("\n To print the details");
        AddressBookContacts varPrint = isDetailsMatched();
        if (varPrint == null)
            return;

        displayAddedDetails(varPrint);
    }

    AddressBookContacts isDetailsMatched() {
        System.out.println("Enter the address book name first. \n ");
        displayAllAddressBooksName();
        System.out.println("Your choice: ");
        String bookName = scanner.next();
        System.out.print(" \n Enter the first name of the person : ");
        String enteredName = scanner.next();
        AddressBookContacts tempRefVar;
        ArrayList<AddressBookContacts> tempMapValue = multipleAddressBookMap.get(bookName);

        for (int indexOfArrayList = 0; indexOfArrayList < tempMapValue.size(); indexOfArrayList++) {
            String name = tempMapValue.get(indexOfArrayList).getFirstName();
            if (!(name.equals(enteredName)))
                continue;
            tempRefVar = tempMapValue.get(indexOfArrayList);
            System.out.println("\n Match found \n ");
            return tempRefVar;
        }
        System.out.println("Contact not found in the address book");
        return null;
    }

    void displayAllAddressBooksName() {
        multipleAddressBookMap.forEach((key, value) -> System.out.println(key));
    }
}