package ma.pfe.entities;

public class Mineur  extends StudentEntity{


    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    private  boolean isAuthorized;
}
