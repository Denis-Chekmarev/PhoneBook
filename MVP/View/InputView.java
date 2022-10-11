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
        return getInput("Имя: ");
    }

    @Override
    public String getSecondName() {
        return getInput("Фамилия: ");
    }

    @Override
    public String getAdress() {
        return getInput("Адрес: ");
    }

    public void closeScanner(){
        in.close();
    }
}
