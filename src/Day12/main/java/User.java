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


    // Constructor and validations to be added later
}
