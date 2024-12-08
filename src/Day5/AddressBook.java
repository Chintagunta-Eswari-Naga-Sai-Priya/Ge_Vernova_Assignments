package Day5;

import java.util.Scanner;
import class contact;


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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Contact Details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        // Similarly, capture other details and create a Contact object
        Contact contact = new Contact(firstName, lastName, "address", "city", "state", "zip", "phone", "email");
        System.out.println("Contact Added: " + contact);
    }
}
