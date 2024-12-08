// AddressBookMain.java
package Day5;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookgit {
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        addContact();
    }

    private static void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Contact Details:");

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
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

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contacts.add(contact);
        System.out.println("Contact Added: " + contact);
    }
}
