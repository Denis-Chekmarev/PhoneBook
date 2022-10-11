package MVP.View;

import java.util.List;
import java.util.Scanner;

import Interfaces.IView;
import MVP.Model.Classes.Contact;
import MVP.Model.Classes.ContactTypes.Email;
import MVP.Model.Classes.ContactTypes.Phone;
import MVP.Model.Classes.Exceptions.InvalidParameter;


public class View implements IView {

    @Override
    public Phone getPhone() throws InvalidParameter {
        Scanner in = new Scanner(System.in);
        System.out.printf("Номер телефона: ");
        String phoneNumber = in.nextLine();
        in.close();
        return new Phone(phoneNumber);
    }

    @Override
    public String getEmail() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Email: ");
        String email = in.nextLine();
        in.close();
        return email;
    }

    @Override
    public String getFirstName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getSecondName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getAdress() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
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

    @Override
    public void showError(String errorMessage) {
        System.out.println(errorMessage);
    }
    
    
}
