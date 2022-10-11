package MVP.Presenter;

import MVP.Model.Model;
import MVP.View.View;

public class Presenter {
    
    private Model model;
    private View view;


    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    

    public void start(){
        
    }

}
