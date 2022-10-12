package MVP.Model;

import java.util.ArrayList;
import java.util.List;

import MVP.Model.Classes.Contact;

public class Model {
    
    private List<Contact> contacts = new ArrayList<>();

    public Boolean addContact(Contact contact){
        if (contacts.contains(contact)){
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public Boolean removeContact(Contact contact){
        contacts.remove(contact);
        return true;
        // TODO .....
    }


    public List<Contact> getContacts() {
        return contacts;
    }

}
