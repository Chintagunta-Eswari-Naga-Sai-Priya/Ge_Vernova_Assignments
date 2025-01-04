package Day11;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);
    }
}
