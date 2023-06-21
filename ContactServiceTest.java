import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    public void setup() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        Assertions.assertEquals(contact, contactService.getContact("12345"));
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.deleteContact("12345");

        Assertions.assertNull(contactService.getContact("12345"));
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.updateContact("12345", "Jane", "Smith", "9876543210", "456 Elm St");

        Contact updatedContact = contactService.getContact("12345");
        Assertions.assertEquals("Jane", updatedContact.getFirstName());
        Assertions.assertEquals("Smith", updatedContact.getLastName());
        Assertions.assertEquals("9876543210", updatedContact.getPhone());
        Assertions.assertEquals("456 Elm St", updatedContact.getAddress());
    }
}
