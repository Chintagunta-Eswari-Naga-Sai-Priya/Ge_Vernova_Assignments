package Day6;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookSystem {
    private HashMap<String, AddressBook> addressBooks = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        AddressBookSystem system = new AddressBookSystem();
        system.manageAddressBooks();
    }

    private void manageAddressBooks() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nAddress Book System Menu:");
            System.out.println("1. Create New Address Book");
            System.out.println("2. View All Address Books");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAddressBook(scanner);
                    break;
                case 2:
                    viewAddressBooks();
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Exiting Address Book System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private void createAddressBook(Scanner scanner) {
        System.out.print("Enter a unique name for the new Address Book: ");
        String name = scanner.nextLine();

        if (addressBooks.containsKey(name)) {
            System.out.println("An Address Book with this name already exists.");
        } else {
            AddressBook addressBook = new AddressBook();
            addressBooks.put(name, addressBook);
            System.out.println("Address Book '" + name + "' created successfully.");
        }
    }

    private void viewAddressBooks() {
        if (addressBooks.isEmpty()) {
            System.out.println("No Address Books in the system.");
        } else {
            System.out.println("Address Books:");
            for (String name : addressBooks.keySet()) {
                System.out.println("- " + name);
            }
        }
    }
}
