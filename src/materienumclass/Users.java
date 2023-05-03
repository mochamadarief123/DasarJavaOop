package materienumclass;

public class Users {
    private String nameUser;
    private AccessLevel acceslevel;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public AccessLevel getAcceslevel() {
        return acceslevel;
    }

    public void setAcceslevel(AccessLevel acceslevel) {
        this.acceslevel = acceslevel;
    }
    
    public void sayHello(){
        if(AccessLevel.ADMIN == getAcceslevel()){
            System.out.println("Welcome admin " + nameUser);
        }else if(AccessLevel.CUSTOMER == getAcceslevel()){
            System.out.println("Welcome customer " + nameUser);
        }else{
            System.out.println("Welcome owner " + nameUser);
        }
    }
    
}
