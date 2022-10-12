package MVP.Presenter;

import Interfaces.IExport;
import MVP.Model.Config;
import MVP.Model.Model;
import MVP.Model.Classes.Contact;
import MVP.Model.Classes.ContactTypes.Email;
import MVP.Model.Classes.ContactTypes.PhoneList;
import MVP.Model.Classes.Exceptions.InvalidParameter;
import MVP.Model.Classes.Export.ExportTypes.CSVexport;
import MVP.Model.Classes.Export.ExportTypes.StringSeparatorExport;
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
        IExport export;
        
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
                    // TODO ... 
                    break;

                // delete 
                case 4:
                    // TODO ...
                    break;

                // export 1
                case 5:
                    export = new StringSeparatorExport(Config.getPathString());
                    if (export.connect() && export.saveInFile()){
                        view.showError(Config.ConsoleStrings.SUCCESS_EXPORT.getTitle());
                    }
                    else{
                        view.showError(Config.Incorrect.ERROR_CONNECT.getTitle());
                    }
                    view.getInput(Config.ConsoleStrings.CONTUNUE.getTitle());
                    break;

                // export 2
                case 6:
                    export = new CSVexport(Config.getPathString());
                    if (export.connect() && export.saveInFile()){
                        view.showError(Config.ConsoleStrings.SUCCESS_EXPORT.getTitle());
                    }
                    else{
                        view.showError(Config.Incorrect.ERROR_CONNECT.getTitle());
                    } 
                    view.getInput(Config.ConsoleStrings.CONTUNUE.getTitle());
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
