package MVP.Model;


public class Config {
    
    private static String pathCSV = "db.csv";
    private static String pathString = "db.txt";

    private static String add = "Добавить";
    private static String change = "Изменить";
    private static String show = "Показать";
    private static String delete = "Удалить";
    private static String exportString = "Експортировать в формате разделитель - строка";
    private static String exportCVS = "Експортировать в формате разделитель - ;";
    private static String exit = "Выход";

    private static String contactEmpty = "Контактов нет";
    private static String phoneNumber = "Номер телефона: ";
    private static String email = "Email: ";
    private static String name = "Имя: ";
    private static String surname = "Фамилия: ";
    private static String adress = "Адрес: ";
    private static String command = "Команда: ";

    private static String incorrectEmail = "Неверный Email";
    private static String incorrectPhone = "Неверный Телефон";
    private static String notEmail = "нет почты";
    private static String additionPhones = "Дополнительные номера:";
    private static String contunue = "Для продолжения нажмите Enter";

    private static String errorConnect = "Не удалось подключиться к базе данных";
    private static String successExport = "Сохранение успешно";


    public static enum Incorrect{
        EMAIL(incorrectEmail),
        Phone(incorrectPhone),
        NONEMAIL(notEmail),
        ERROR_CONNECT(errorConnect);

        private String title;

        Incorrect(String title){
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }


    public static enum Task{
        ADD (add),
        CHANGE (change),
        DELETE (delete),
        SHOW (show),
        EXPORT_STRING (exportString),
        EXPORT_CSV (exportCVS),
        EXIT (exit);

        private String title;

        Task(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }
    }


    public static enum ConsoleStrings{
        CONTACTEMPTY(contactEmpty),
        PHONE(phoneNumber),
        EMAIL(email),
        NAME(name),
        SURNAME(surname),
        ADDRESS(adress),
        COMMAND(command),
        ADDITIONPHONES(additionPhones),
        CONTUNUE(contunue),
        SUCCESS_EXPORT(successExport);


        private String title;

        ConsoleStrings(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }
    }


    public static String getPathCSV() {
        return pathCSV;
    }


    public static String getPathString() {
        return pathString;
    }
}
