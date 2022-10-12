package MVP.View;

import java.util.List;

import Interfaces.IView;
import MVP.Model.Config;
import MVP.Model.Classes.Contact;


public abstract class View implements IView{

    
    
    public void showMenu(){
        System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\n5. %s\n6. %s\n7. %s\n", Config.Task.ADD.getTitle(), Config.Task.SHOW.getTitle(), Config.Task.CHANGE.getTitle(), Config.Task.DELETE.getTitle(), Config.Task.EXPORT_STRING.getTitle(), Config.Task.EXPORT_CSV.getTitle(), Config.Task.EXIT.getTitle());
        
    }

    
    public void showContacts(List<Contact> contacts) {
        if(contacts.isEmpty()){
            System.out.println(Config.ConsoleStrings.CONTACTEMPTY.getTitle());
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
