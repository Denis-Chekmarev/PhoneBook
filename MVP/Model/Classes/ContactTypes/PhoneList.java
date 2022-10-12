package MVP.Model.Classes.ContactTypes;
import java.util.ArrayList;

import MVP.Model.Config;

public class PhoneList {
    
    private Phone mainPhone;
    private ArrayList<Phone> additionPhones;

    public PhoneList(Phone mainPhone) {
        this.mainPhone = mainPhone;
        additionPhones = new ArrayList<>();
    }

    public PhoneList(Phone mainPhone, ArrayList<Phone> additionPhones) {
        this.mainPhone = mainPhone;
        this.additionPhones = additionPhones;
    }

    public boolean addAdditionPhone(Phone phone){
        if(additionPhones.contains(phone)){
            return false;
        }
        additionPhones.add(phone);
        return true;
    }

    @Override
    public String toString() {
        if (this.additionPhones.isEmpty()){
            return mainPhone.toString();
        }
        String allPhones = String.format("%s, %s", mainPhone, Config.ConsoleStrings.ADDITIONPHONES);
        for (Phone phone : additionPhones) {
            allPhones = String.format("%s %s", allPhones, phone);
        }
        return allPhones;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (! (obj instanceof PhoneList)){
            return false;
        }
        PhoneList o = (PhoneList)obj;
        return o.getMainPhone().equals(this.mainPhone);
    }

    public void setMainPhone(Phone mainPhone) {
        this.mainPhone = mainPhone;
    }

    public Phone getMainPhone() {
        return mainPhone;
    }

    public ArrayList<Phone> getAdditionPhones() {
        return additionPhones;
    }
}
