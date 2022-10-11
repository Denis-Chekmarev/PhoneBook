package MVP.Model.Classes.ContactTypes;
import MVP.Model.Classes.Exceptions.InvalidParameter;

public class Email {
    
    private String email;

    public Email(String email) throws InvalidParameter {
        if (!email.contains("@")){
            throw new InvalidParameter("invalid email");
        }
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (! (obj instanceof Email)){
            return false;
        }
        Email o = (Email)obj;
        return o.getEmail().equals(this.email);
    }

    @Override
    public String toString() {
        return this.getEmail();
    }

    public String getEmail() {
        return email;
    }
}
