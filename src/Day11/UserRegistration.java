package Day11;

import java.util.regex.Pattern;
String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);
    }
    public boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, lastName);
    }
    public boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}([.][a-zA-Z]{2,})?$";
        return Pattern.matches(regex, email);
    }



}
