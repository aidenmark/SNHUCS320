import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testContactFields() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");

        Assertions.assertEquals("12345", contact.getContactId());
        Assertions.assertEquals("John", contact.getFirstName());
        Assertions.assertEquals("Doe", contact.getLastName());
        Assertions.assertEquals("1234567890", contact.getPhone());
        Assertions.assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testContactFieldUpdates() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contact.setFirstName("Jane");
        contact.setLastName("Smith");
        contact.setPhone("9876543210");
        contact.setAddress("456 Elm St");

        Assertions.assertEquals("Jane", contact.getFirstName());
        Assertions.assertEquals("Smith", contact.getLastName());
        Assertions.assertEquals("9876543210", contact.getPhone());
        Assertions.assertEquals("456 Elm St", contact.getAddress());
    }
}
