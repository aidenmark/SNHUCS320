public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

public Contact(String contactId, String firstName, String lastName, String phone, String address) {
    verifyNonNull(contactId, firstName, lastName, phone, address);
    this.contactId = contactId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.address = address;
}

public String getContactId() {
    return contactId;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    verifyNonNull(firstName);
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    verifyNonNull(lastName);
    this.lastName = lastName;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    verifyNonNull(phone);
    this.phone = phone;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    verifyNonNull(address);
    this.address = address;
}

private void verifyNonNull(Object... objects) {
    for (Object obj : objects) {
        if (obj == null || obj.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("Attribute cannot be null or empty");
        }
    }
}


