package Day5;

import java.util.Scanner;

import java.util.ArrayList;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    // Constructors, Getters, Setters, and toString() methods
}


public class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void editContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                // Edit details as required
                System.out.println("Enter new Address:");
                Scanner scanner = new Scanner(System.in);
                contact.setAddress(scanner.nextLine());
                System.out.println("Contact Updated: " + contact);
                return;
            }
        }
        System.out.println("Contact not found!");
    }
    public void deleteContact(String name) {
        contacts.removeIf(contact -> contact.getFirstName().equalsIgnoreCase(name));
        System.out.println("Contact Deleted!");
    }
}
