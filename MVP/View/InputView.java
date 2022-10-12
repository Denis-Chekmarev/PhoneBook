package MVP.View;

import java.util.Scanner;

import MVP.Model.Config;
import MVP.Model.Classes.ContactTypes.Phone;
import MVP.Model.Classes.Exceptions.InvalidParameter;


public class InputView extends View{
    Scanner in = new Scanner(System.in);

    @Override
    public String getInput(String msg){
        System.out.printf(msg);
        String input = in.nextLine();
        return input;
    }

    @Override
    public Phone getPhone() throws InvalidParameter {
        return new Phone(getInput(Config.ConsoleStrings.PHONE.getTitle()));
    }

    @Override
    public String getEmail() {
        return getInput(Config.ConsoleStrings.EMAIL.getTitle());
    }

    @Override
    public String getFirstName() {
        return getInput(Config.ConsoleStrings.NAME.getTitle());
    }

    @Override
    public String getSecondName() {
        return getInput(Config.ConsoleStrings.SURNAME.getTitle());
    }

    @Override
    public String getAdress() {
        return getInput(Config.ConsoleStrings.ADDRESS.getTitle());
    }

    public void closeScanner(){
        in.close();
    }
}
