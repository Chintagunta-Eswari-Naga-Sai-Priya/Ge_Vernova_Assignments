package Day12.test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    // More tests for last name, email, mobile, and password...
}
