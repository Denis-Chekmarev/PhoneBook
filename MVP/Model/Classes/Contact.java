package MVP.Model.Classes;

import MVP.Model.Classes.ContactTypes.Email;
import MVP.Model.Classes.ContactTypes.Phone;
import MVP.Model.Classes.ContactTypes.PhoneList;

public class Contact {
    
    private String firstName;
    private String lastName;
    private PhoneList phones;
    private String address;
    private Email email;


    public Contact(String firstName, String lastName, PhoneList phones, String address, Email email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phones = phones;
        this.address = address;
        this.email = email;
    }


    public Contact(String firstName, String lastName, Phone phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phones.setMainPhone(phone);
    }


    public Contact(String firstName, String lastName, PhoneList phones) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phones = phones;
    }


    public Contact(String firstName, Phone phone) {
        this.firstName = firstName;
        this.phones.setMainPhone(phone);
    }

    public Contact(String firstName, PhoneList phones) {
        this.firstName = firstName;
        this.phones = phones;
    }


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("").append(firstName).append(" ");
        builder.append( (this.lastName == null) ? "" : lastName);
        builder.append(", ").append(phones);
        builder.append( (this.address == null) ? "" : ", Адрес: " + address);
        builder.append( (this.email == null) ? "" : ", email: " + email);

        return builder.toString();
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public PhoneList getPhones() {
        return phones;
    }


    public String getAddress() {
        return address;
    }


    public Email getEmail() {
        return email;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setPhones(PhoneList phones) {
        this.phones = phones;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public void setEmail(Email email) {
        this.email = email;
    }
    
}
