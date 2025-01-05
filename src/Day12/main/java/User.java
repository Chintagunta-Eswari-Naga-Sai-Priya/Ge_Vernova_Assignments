package Day12.main.java;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String password;

    public User(String firstName, String lastName, String email, String mobile, String password) {
        if (!isValidFirstName(firstName)) {
            throw new IllegalArgumentException("Invalid First Name");
        }
        // Other validations to be added later
    }

    private boolean isValidFirstName(String firstName) {
        return firstName != null && firstName.length() >= 3 && Character.isUpperCase(firstName.charAt(0));
    }
    if (!isValidLastName(lastName)) {
        throw new IllegalArgumentException("Invalid Last Name");
    }

    private boolean isValidLastName(String lastName) {
        return lastName != null && lastName.length() >= 3 && Character.isUpperCase(lastName.charAt(0));
    }
    if (!isValidEmail(email)) {
        throw new IllegalArgumentException("Invalid Email");
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})?$";
        return email != null && email.matches(emailRegex);
    }




    // Constructor and validations to be added later
}
