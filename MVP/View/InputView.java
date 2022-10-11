package MVP.View;

import java.util.Scanner;

import Interfaces.IView;
import MVP.Model.Classes.ContactTypes.Phone;
import MVP.Model.Classes.Exceptions.InvalidParameter;


public class InputView extends View implements IView{
    Scanner in = new Scanner(System.in);

    public String getInput(String msg){
        System.out.printf(msg);
        String input = in.nextLine();
        return input;
    }

    @Override
    public Phone getPhone() throws InvalidParameter {
        return new Phone(getInput("Номер телефона: "));
    }

    @Override
    public String getEmail() {
        return getInput("Email: ");
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

    public void closeScanner(){
        in.close();
    }
}
