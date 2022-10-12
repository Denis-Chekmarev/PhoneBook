package MVP.Presenter;

import MVP.Model.Config;
import MVP.Model.Model;
import MVP.Model.Classes.Contact;
import MVP.Model.Classes.ContactTypes.Email;
import MVP.Model.Classes.ContactTypes.PhoneList;
import MVP.Model.Classes.Exceptions.InvalidParameter;
import MVP.View.View;

public class Presenter {

    private Model model;
    private View view;


    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    

    public void mainLoop() throws InvalidParameter{
        Boolean run = true;
        String userInput;
        
        while (run){
            view.showMenu();
            userInput = view.getInput(Config.ConsoleStrings.COMMAND.getTitle());

            switch (Integer.parseInt(userInput)){
                // add contact
                case 1:
                    model.addContact(new Contact(view.getFirstName(), view.getSecondName(), new PhoneList(view.getPhone()), view.getAdress(), new Email(view.getEmail())));
                    break;

                // show 
                case 2: 
                    view.showContacts(model.getContacts());
                    view.getInput(Config.ConsoleStrings.CONTUNUE.getTitle());
                    break;

                // change  
                case 3: 
                    break;

                // delete 
                case 4:
                    break;

                // export 1
                case 5:
                    break;

                // export 2
                case 6:
                    break;
                
                // exit 
                case 7:
                    run = false;
                    break;
            }
            System.out.println(Config.Task.EXIT.getTitle());
        }
    }
}
