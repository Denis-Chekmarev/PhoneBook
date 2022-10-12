package MVP.Model.Classes.Export;

import Interfaces.IExport;

public abstract class Export implements IExport {
    
    private String filename;


    public Export(String filename) {
        this.filename = filename;
    }


    @Override
    public Boolean connect() {
        return false;
    }
}
