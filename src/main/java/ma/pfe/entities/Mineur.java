package ma.pfe.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("mn")
public class Mineur  extends StudentEntity{


    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    private  boolean isAuthorized;
}
