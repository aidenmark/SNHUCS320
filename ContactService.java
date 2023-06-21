import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts;

public ContactService() {
    contacts = new HashMap<>();
}

public void addContact(Contact contact) {
    if (contact == null) {
        throw new IllegalArgumentException("Contact cannot be null");
    }
    contacts.put(contact.getContactId(), contact);
}

public void deleteContact(String contactId) {
    contacts.remove(contactId);
}

public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
    Contact contact = contacts.get(contactId);
    if (contact != null) {
        verifyNonNull(firstName, lastName, phone, address);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setAddress(address);
    }
}

public Contact getContact(String contactId) {
    return contacts.get(contactId);
}

private void verifyNonNull(Object... objects) {
    for (Object obj : objects) {
        if (obj == null || obj.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("Attribute cannot be null or empty");
        }
    }
}

