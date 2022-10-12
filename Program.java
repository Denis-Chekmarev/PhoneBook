
import MVP.Model.Model;
import MVP.Model.Classes.Exceptions.InvalidParameter;
import MVP.Presenter.Presenter;
import MVP.View.InputView;
import MVP.View.View;

/**
 * Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
под форматами понимаем структуру файлов, например:
- в файле на одной строке хранится одна часть записи, пустая строка - разделитель
 */
public class Program {
    

    public static void main(String[] args) throws InvalidParameter {
        
        View view = new InputView();
        Model model = new Model();

        Presenter presenter = new Presenter(model, view);
        presenter.mainLoop();
    }
}
