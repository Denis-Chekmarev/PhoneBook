package MVP.Presenter;

import MVP.Model.Model;

// import MVP.Model.Model;
// import MVP.View.View;

public class Presenter {

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

    

    // private Model model;
    // private View view;


    // public Presenter(Model model, View view) {
    //     this.model = model;
    //     this.view = view;
    // }
    

    // public void start(){
        
    // }






        // Boolean isValid = true;

        // do{
        //     try{
        //         String em = view.getEmail();
        //         if (! (em == "")){
        //             Email email = new Email( em );
        //             contact.setEmail(email);
        //             isValid = true;
        //         }
        //     }
        //     catch (IncorrectEmail e){
        //         System.out.println("no");
        //         isValid = false;
        //         view.showError(e.toString());
        //     }
        // }
        // while (! isValid);
}
