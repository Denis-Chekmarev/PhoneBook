package MVP.Model.Classes.ContactTypes;
import MVP.Model.Classes.Exceptions.InvalidParameter;

public class Phone {
    // private String countryCode;
    // private String operatorCode;
    // private String abonentCode;

    private String phoneNumber;
    

    public Phone(String phoneNumber) throws InvalidParameter {
        if (phoneNumber.isEmpty()){
            throw new InvalidParameter ("invalid phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Phone)){
            return false;
        }
        Phone o = (Phone)obj;
        return o.getPhoneNumber().equals(this.phoneNumber);
    }

    @Override
    public String toString() {
        return this.getPhoneNumber();
    }

    // public Phone(String counryCode, String operatorCode, String abonentCode) throws InvalidParameter {
    //     if (counryCode.length() > 6){
    //         throw new InvalidParameter("invalid country code");
    //     }
    //     if (operatorCode.length() > 4){
    //         throw new InvalidParameter("invalid operator code");
    //     }
    //     this.countryCode = counryCode;
    //     this.operatorCode = operatorCode;
    //     this.abonentCode = abonentCode;
    // }


    // @Override
    // public String toString() {
    //     return String.format("%s-%s-%s", countryCode, operatorCode, abonentCode);
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == this){
    //         return true;
    //     }
    //     if (!(obj instanceof Phone)){
    //         return false;
    //     }
    //     Phone o = (Phone)obj;
    //     return o.getCounryCode().equals(this.countryCode) && o.getOperatorCode().equals(this.operatorCode) && o.getAbonentCode().equals(this.abonentCode);
    // }


    // public String getCounryCode() {
    //     return countryCode;
    // }
    // public String getOperatorCode() {
    //     return operatorCode;
    // }
    // public String getAbonentCode() {
    //     return abonentCode;
    // }
}
