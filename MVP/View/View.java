package MVP.View;

import java.util.List;

import MVP.Model.Classes.Contact;


public class View {

    
    public void showContacts(List<Contact> contacts) {
        if(contacts.isEmpty()){
            System.out.println("Контактов нет");
        }
        StringBuilder sb = new StringBuilder();
        for (Contact contact : contacts) {
            sb.append(contact).append("\n");
        }
        System.out.println(sb.toString());
    }

    public void showError(String errorMessage) {
        System.out.println(errorMessage);
    }
}
