package MVP.Model.Classes.Export.ExportTypes;

import MVP.Model.Classes.Export.Export;

public class CSVexport extends Export {

    public CSVexport(String filename) {
        super(filename);
    }

    @Override
    public Boolean saveInFile() {
        return false;
    }
    
}
