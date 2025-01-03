// AddressBookMain.java
package Day6.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addContact();
                case 2 -> displayContacts();
                case 3 -> exit = true;
                default -> System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }

    private static void displayContacts() {
        System.out.println("Address Book Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

}
