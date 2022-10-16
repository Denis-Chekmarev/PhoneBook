package MVP.Model.Classes.Export.ExportTypes;

import java.util.List;

import MVP.Model.Classes.Contact;
import MVP.Model.Classes.Export.Export;

public class StringSeparatorExport extends Export {

    

    public StringSeparatorExport(String filename) {
        super(filename);
    }

    @Override
    public Boolean saveInFile(List<Contact> contacts) {
        if (contacts.isEmpty()){
            return true;
        }
        else{
            StringBuilder sb = new StringBuilder();
            for (Contact contact : contacts) {
                sb.append(contact).append("\n\n");
            }
            try{
                formatter.write(sb.toString());
                formatter.flush();
            }
            catch(Exception ex){
                return false;
            }
        }
        return true;
    }
    
}
