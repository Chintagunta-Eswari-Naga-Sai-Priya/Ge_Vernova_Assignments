package Day11;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void testFirstName_Valid() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateFirstName("John"));
    }

    @Test
    public void testFirstName_Invalid() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateFirstName("john"));
    }
    @Test
    public void testLastName_Valid() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateLastName("Doe"));
    }

    @Test
    public void testLastName_Invalid() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateLastName("doe"));
    }
    @Test
    public void testEmail_Valid() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void testEmail_Invalid() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateEmail("abc@.co.in"));
    }
    @Test
    public void testPasswordRule1_Valid() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validatePasswordRule1("password123"));
    }

    @Test
    public void testPasswordRule1_Invalid() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validatePasswordRule1("pass1"));
    }



}
