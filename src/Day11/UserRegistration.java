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

    public boolean validatePasswordRule1(String password) {
        String regex = "^.{8,}$"; // At least 8 characters
        return Pattern.matches(regex, password);
    }


    public boolean validateMobileNumber(String mobileNumber) {
        String regex = "^[0-9]{2} [0-9]{10}$";
        return Pattern.matches(regex, mobileNumber);
    }
    public boolean validatePasswordRule2(String password) {
        String regex = "^(?=.*[A-Z]).{8,}$"; // At least 1 uppercase and 8 characters
        return Pattern.matches(regex, password);
    }
    public boolean validatePasswordRule3(String password) {
        String regex = "^(?=.*[0-9]).{8,}$"; // At least 1 numeric and 8 characters
        return Pattern.matches(regex, password);
    }
    public boolean validatePasswordRule4(String password) {
        String regex = "^(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$"; // At least 1 special character and 8 characters
        return Pattern.matches(regex, password);
    }







}
