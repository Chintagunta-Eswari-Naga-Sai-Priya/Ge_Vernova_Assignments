package Day12.test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class UserTest {

    // Happy Test Cases
    @Test
    public void testValidUserCreation() {
        User user = new User("John", "Doe", "john.doe@bl.co.in", "91 9919819801", "Password1!");
        assertNotNull(user);
    }

    // Sad Test Cases
    @Test
    public void testInvalidFirstName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("Jo", "Doe", "john.doe@bl.co.in", "91 9919819801", "Password1!");
        });
        assertEquals("Invalid First Name", exception.getMessage());
    }

// Add parameterized tests for valid and invalid email cases...

    @ParameterizedTest
    @ValueSource(strings = {"valid.email@example.com", "another.valid_email@domain.co"})
    public void testValidEmails(String email) {
        User user = new User("John", "Doe", email, "91 9919819801", "Password1!");
        assertNotNull(user);
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid.email.com", "invalid@.com", "@domain.com"})
    public void testInvalidEmails(String email) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("John", "Doe", email, "91 9919819801", "Password1!");
        });
        assertEquals("Invalid Email", exception.getMessage());
    }


    // More tests for last name, email, mobile, and password...
}
