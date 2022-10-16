package MVP.Model.Classes.Export;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Interfaces.IExport;

public abstract class Export implements IExport {
    
    protected String filename;
    protected FileWriter formatter;
    protected File file;


    public Export(String filename) {
        this.filename = filename;
    }


    @Override
    public Boolean connect() {
        try{
            file = new File(filename);
            formatter = new FileWriter(file, true);
            return true;
        }
        catch(IOException ex){
            return false;
        }
    }

    public void close() throws IOException{
        formatter.close();
    }
}
