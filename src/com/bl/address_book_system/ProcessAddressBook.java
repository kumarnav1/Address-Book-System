package com.bl.address_book_system;

import java.util.*;
import java.util.stream.Collectors;

public class ProcessAddressBook {

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
            AddressBookContacts isFound = multipleAddressBookMap
                    .get(bookName)
                    .stream()
                    .filter(arrayRef -> arrayRef.getFirstName().equals(isFirstName))
                    .findFirst()
                    .orElse(null);

            if (isFound != null) {
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
        if (varEdit == null) {
            System.out.println("Contact not found in the address book");
            return;
        }

        System.out.println("\n Match found.\n ");
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
        if (varDelete == null) {
            System.out.println("Contact not found in the address book");
            return;
        }

        System.out.println("\n Match found.\n ");
        contactArray.remove(varDelete);
        System.out.println("Record was Deleted");
    }

    void displayAddedDetails(AddressBookContacts toDisplayDetails) {
        System.out.println(toDisplayDetails);
    }

    void displayPersonDetails() {
        System.out.println("\n To print the details");
        AddressBookContacts varPrint = isDetailsMatched();
        if (varPrint == null) {
            System.out.println("Contact not found in the address book");
            return;
        }
        System.out.println("\n Match found.\n ");
        displayAddedDetails(varPrint);
    }

    AddressBookContacts isDetailsMatched() {
        System.out.println("Enter the address book name first. \n ");
        displayAllAddressBooksName();
        System.out.println("Your choice: ");
        String bookName = scanner.next();
        System.out.print(" \n Enter the first name of the person : ");
        String enteredName = scanner.next();
        return multipleAddressBookMap
                .get(bookName)
                .stream()
                .filter(arrayRef -> arrayRef.getFirstName().equals(enteredName))
                .findFirst()
                .orElse(null);
    }

    void displayPersonUsingCityOrState() {
        System.out.println("\n To display the details");
        findPersonUsingCityOrState();
    }

    void findPersonUsingCityOrState() {
        System.out.println("Enter city or state name to display the person. ");
        String userInputCityOrState = scanner.next();

        List<Map.Entry<String, ArrayList<AddressBookContacts>>> collect = multipleAddressBookMap
                .entrySet()
                .stream()
                .filter(stringArrayListEntry -> stringArrayListEntry
                        .getValue()
                        .get(0)
                        .getCity()
                        .equals(userInputCityOrState)
                        || stringArrayListEntry
                        .getValue()
                        .get(0)
                        .getState()
                        .equals(userInputCityOrState))
                .collect(Collectors.toList());
        System.out.println(collect.toString());
    }

    void displayAllAddressBooksName() {
        multipleAddressBookMap.forEach((key, value) -> System.out.println(key));
    }
}