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
}
