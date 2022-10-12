package MVP.Presenter;

import MVP.Model.Config;
import MVP.Model.Model;
import MVP.Model.Classes.Contact;
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
                case 1:
                    model.addContact(new Contact(view.getFirstName(), view.getPhone()));
                    view.showContacts(model.getContacts());
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    run = false;
                    break;
            }
            System.out.println(Config.Task.EXIT.getTitle());
        }
    }
}
