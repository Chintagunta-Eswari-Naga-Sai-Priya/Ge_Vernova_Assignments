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
            System.out.println("4. Search by City or State");
            System.out.println("5. Count Persons by City or State");
// Modify switch cases accordingly.
            System.out.println("6. Sort Entries Alphabetically");
            System.out.println("7. Sort Entries by City, State, or ZIP");
            System.out.println("8 Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> createAddressBook();
                case 2 -> selectAddressBook();
                case 3 -> viewAllAddressBooks();
                case 4 -> searchByLocation();
                case 5 -> countPersonsByCityOrState();
                case 6 -> sortEntriesAlphabetically();
                case 7 -> sortEntriesByLocation();
                case 8-> exit = true;
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
    private static void searchByLocation() {
        System.out.print("Enter City or State to search: ");
        String location = scanner.nextLine();
        System.out.println("Search Results:");

        addressBooks.forEach((bookName, contacts) -> {
            contacts.stream()
                    .filter(contact -> contact.getCity().equalsIgnoreCase(location) || contact.getState().equalsIgnoreCase(location))
                    .forEach(contact -> System.out.println(contact));
        });
    }
    private static void viewByLocation() {
        HashMap<String, ArrayList<Contact>> cityMap = new HashMap<>();
        HashMap<String, ArrayList<Contact>> stateMap = new HashMap<>();

        addressBooks.values().forEach(contacts -> {
            contacts.forEach(contact -> {
                cityMap.computeIfAbsent(contact.getCity(), k -> new ArrayList<>()).add(contact);
                stateMap.computeIfAbsent(contact.getState(), k -> new ArrayList<>()).add(contact);
            });
        });

        System.out.println("Persons by City:");
        cityMap.forEach((city, persons) -> {
            System.out.println(city + ": " + persons);
        });

        System.out.println("\nPersons by State:");
        stateMap.forEach((state, persons) -> {
            System.out.println(state + ": " + persons);
        });
    }
    private static void countPersonsByCityOrState() {
        System.out.println("Count by: 1. City 2. State");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            addressBooks.values().stream()
                    .flatMap(ArrayList::stream)
                    .collect(Collectors.groupingBy(Contact::getCity, Collectors.counting()))
                    .forEach((city, count) -> System.out.println("City: " + city + ", Count: " + count));
        } else if (choice == 2) {
            addressBooks.values().stream()
                    .flatMap(ArrayList::stream)
                    .collect(Collectors.groupingBy(Contact::getState, Collectors.counting()))
                    .forEach((state, count) -> System.out.println("State: " + state + ", Count: " + count));
        } else {
            System.out.println("Invalid choice.");
        }
    }
    private static void sortEntriesAlphabetically() {
        addressBooks.forEach((bookName, contacts) -> {
            System.out.println("\nAddress Book: " + bookName);
            contacts.stream()
                    .sorted(Comparator.comparing(Contact::getFirstName)
                            .thenComparing(Contact::getLastName))
                    .forEach(System.out::println);
        });
    }
    private static void sortEntriesByLocation() {
        System.out.println("Sort by: 1. City 2. State 3. ZIP");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        addressBooks.forEach((bookName, contacts) -> {
            System.out.println("\nAddress Book: " + bookName);
            Stream<Contact> sortedStream;

            if (choice == 1) {
                sortedStream = contacts.stream().sorted(Comparator.comparing(Contact::getCity));
            } else if (choice == 2) {
                sortedStream = contacts.stream().sorted(Comparator.comparing(Contact::getState));
            } else if (choice == 3) {
                sortedStream = contacts.stream().sorted(Comparator.comparing(Contact::getZip));
            } else {
                System.out.println("Invalid choice.");
                return;
            }

            sortedStream.forEach(System.out::println);
        });
    }





    private static void displayContacts(ArrayList<Contact> contacts) {
        System.out.println("Contacts in the Address Book:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
