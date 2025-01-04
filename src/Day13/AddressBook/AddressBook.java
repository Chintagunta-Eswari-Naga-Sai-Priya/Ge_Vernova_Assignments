// AddressBookMain.java
package Day13.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    private static HashMap<String, ArrayList<Contact>> addressBooks = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Create Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. View All Address Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> createAddressBook();
                case 2 -> selectAddressBook();
                case 3 -> viewAllAddressBooks();
                case 4 -> exit = true;
                default -> System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }

    private static void createAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String name = scanner.nextLine();
        if (addressBooks.containsKey(name)) {
            System.out.println("Address Book already exists!");
        } else {
            addressBooks.put(name, new ArrayList<>());
            System.out.println("Address Book '" + name + "' created successfully.");
        }
    }

    private static void selectAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String name = scanner.nextLine();
        if (!addressBooks.containsKey(name)) {
            System.out.println("Address Book not found!");
        } else {
            manageAddressBook(addressBooks.get(name));
        }
    }

    private static void viewAllAddressBooks() {
        System.out.println("Existing Address Books:");
        for (String name : addressBooks.keySet()) {
            System.out.println(name);
        }
    }

    private static void manageAddressBook(ArrayList<Contact> contacts) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addContactToBook(contacts);
                case 2 -> displayContacts(contacts);
                case 3 -> exit = true;
                default -> System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private static void addContactToBook(ArrayList<Contact> contacts) {
        System.out.println("Enter Contact Details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        // Check for duplicates
        boolean duplicate = contacts.stream().anyMatch(contact ->
                contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)
        );
        if (duplicate) {
            System.out.println("Duplicate contact found. Contact not added.");
            return;
        }

        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("Zip: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        contacts.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
        System.out.println("Contact added successfully.");
    }

    private static void displayContacts(ArrayList<Contact> contacts) {
        System.out.println("Contacts in the Address Book:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
