package Interfaces;

import java.util.List;

import MVP.Model.Classes.Contact;
import MVP.Model.Classes.ContactTypes.Phone;
import MVP.Model.Classes.Exceptions.InvalidParameter;

public interface IView {

    public Phone getPhone() throws InvalidParameter;

    public String getEmail();

    public String getFirstName();

    public String getSecondName();

    public String getAdress();

    public void showContacts(List<Contact> contacts);

    public void showError(String errorMessage);
}
