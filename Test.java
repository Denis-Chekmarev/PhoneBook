public class Test {
    
    private enum Task{
        ADD ("Добавить"),
        DELETE ("Удалить"),
        SHOW ("Показать"),
        EXPORT ("Екпортировать");

        private String title;

        Task(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }
    }
    
    Task task = Task.ADD;

    
    public static void main(String[] args) {
        Task task = Task.ADD;

        System.out.println(task);
    }
}
