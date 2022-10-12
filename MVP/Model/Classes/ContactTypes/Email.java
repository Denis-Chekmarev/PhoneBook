package MVP.Model.Classes.ContactTypes;
import MVP.Model.Config;
import MVP.Model.Classes.Exceptions.IncorrectEmail;

public class Email {
    
    private String email;

    public Email(String email) throws IncorrectEmail {
        if ( (!email.contains("@")) || (!email.contains("."))){
            throw new IncorrectEmail(Config.Incorrect.EMAIL.getTitle());
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
