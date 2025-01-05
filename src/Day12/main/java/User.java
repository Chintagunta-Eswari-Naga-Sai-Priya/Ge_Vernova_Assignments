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
    if (!isValidMobile(mobile)) {
        throw new IllegalArgumentException("Invalid Mobile Number");
    }

    private boolean isValidMobile(String mobile) {
        String mobileRegex = "^\\d{2} \\d{10}$";
        return mobile != null && mobile.matches(mobileRegex);
    }
    if (!isValidPassword(password)) {
        throw new IllegalArgumentException("Invalid Password");
    }

    private boolean isValidPassword(String password) {
        return password != null && password.length() >= 8 &&
                password.chars().anyMatch(Character::isUpperCase) &&
                password.chars().anyMatch(Character::isDigit) &&
                password.chars().filter(ch -> "!@#$%^&*()-+_[]{}|;:'\",.<>?/`~".indexOf(ch) >= 0).count() == 1;
    }
    public class InvalidFirstNameException extends RuntimeException {
        public InvalidFirstNameException(String message) {
            super(message);
        }
    }

    public class InvalidLastNameException extends RuntimeException {
        public InvalidLastNameException(String message) {
            super(message);
        }
    }

    public class InvalidEmailException extends RuntimeException {
        public InvalidEmailException(String message) {
            super(message);
        }
    }

    public class InvalidMobileException extends RuntimeException {
        public InvalidMobileException(String message) {
            super(message);
        }
    }

    public class InvalidPasswordException extends RuntimeException {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }
    public static void validateFirstName(String firstName) throws InvalidFirstNameException {
        if (!isValidFirstName(firstName)) {
            throw new InvalidFirstNameException("Invalid First Name: Must start with an uppercase letter and be at least 3 characters long.");
        }
    }

    // Validation for Last Name
    public static void validateLastName(String lastName) throws InvalidLastNameException {
        if (!isValidLastName(lastName)) {
            throw new InvalidLastNameException("Invalid Last Name: Must start with an uppercase letter and be at least 3 characters long.");
        }
    }

    // Validation for Email
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!isValidEmail(email)) {
            throw new InvalidEmailException("Invalid Email: Must follow the format 'abc.xyz@bl.co.in' with the appropriate parts.");
        }
    }

    // Validation for Mobile
    public static void validateMobile(String mobile) throws InvalidMobileException {
        if (!isValidMobile(mobile)) {
            throw new InvalidMobileException("Invalid Mobile Number: Must be in the format '91 9919819801'.");
        }
    }

    // Validation for Password
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (!isValidPassword(password)) {
            throw new InvalidPasswordException("Invalid Password: Must be at least 8 characters long, contain at least one uppercase letter, one numeric digit, and exactly one special character.");
        }
    }

    // Helper Methods for Validations
    private static boolean isValidFirstName(String firstName) {
        return firstName != null && firstName.length() >= 3 && Character.isUpperCase(firstName.charAt(0));
    }

    private static boolean isValidLastName(String lastName) {
        return lastName != null && lastName.length() >= 3 && Character.isUpperCase(lastName.charAt(0));
    }

    private static boolean isValidEmail(String email) {
        // Simple regex for demonstration (improve for production)
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    private static boolean isValidMobile(String mobile) {
        return mobile != null && mobile.matches("\\d{2} \\d{10}");
    }

    private static boolean isValidPassword(String password) {
        return password != null &&
                password.length() >= 8 &&
                password.chars().anyMatch(Character::isUpperCase) &&
                password.chars().anyMatch(Character::isDigit) &&
                password.chars().filter(ch -> "!@#$%^&*()-+=<>?".indexOf(ch) >= 0).count() == 1;
    }







    // Constructor and validations to be added later
}
