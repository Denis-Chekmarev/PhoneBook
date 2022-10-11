package MVP.View;

import java.util.List;

import MVP.Model.Classes.Contact;


public class View {

    enum menuRanks{
        FIRST,
        SECOND,
    }

    public void menu(){
        System.out.println("1. Добавить контакт\n2. Показать контакты\n3. Удалить контакт\n4. Экспорт в формате разделитель - строка\n5. Экспорт в формате - разделитель ;\n6. Выход\nКоманда: ");
        
    }

    
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

    public void showError(String errorMessage) {
        System.out.println(errorMessage);
    }
}
