
import MVP.Model.Model;
import MVP.Model.Classes.Contact;
import MVP.Model.Classes.ContactTypes.Phone;
import MVP.Model.Classes.ContactTypes.PhoneList;
import MVP.Model.Classes.Exceptions.InvalidParameter;
import MVP.View.InputView;

/**
 * Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
под форматами понимаем структуру файлов, например:
- в файле на одной строке хранится одна часть записи, пустая строка - разделитель
 */
public class Program {
    

    public static void main(String[] args) throws InvalidParameter {
        String name = "Denis";
        String surname = "Chekamrev";
        Phone myPhone = new Phone("+7-962-840-6513");
        Phone mySecondPhone = new Phone("+7-963-842-55-44");
        // Email email = new Email("chekmarevdenchik5@gmail.com");

        PhoneList phoneList = new PhoneList(myPhone);
        phoneList.addAdditionPhone(mySecondPhone);

        Contact contact = new Contact(name, surname, phoneList);
        // contact.setEmail(email);


        // Contact contact2 = new Contact("Вася", "Зайчиков", phoneList);
        // contact2.setEmail(email);


        Model model = new Model();
        InputView view = new InputView();

        model.addContact(contact);
        view.showContacts(model.getContacts());


        String name1 = view.getFirstName();
        String surname1 = view.getSecondName();
        Phone phone = view.getPhone();
        

        Contact newContact = new Contact(name1, surname1, new PhoneList(phone));

        model.addContact(newContact);


        // contact.setPhones(new PhoneList(view.getPhone()));
        // model.removeContact(contact2);
        view.showContacts(model.getContacts());
    }
}
