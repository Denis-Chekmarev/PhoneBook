package MVP.Model.Classes.Export.ExportTypes;

import MVP.Model.Classes.Export.Export;

public class StringSeparatorExport extends Export {

    

    public StringSeparatorExport(String filename) {
        super(filename);
    }

    @Override
    public Boolean saveInFile() {
        return false;
    }
    
}
