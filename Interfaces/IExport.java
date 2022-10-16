package Interfaces;

import java.io.IOException;
import java.util.List;

import MVP.Model.Classes.Contact;

public interface IExport {
    
    public Boolean saveInFile(List<Contact> contacts);
    public Boolean connect();

    public void close() throws IOException;
}
