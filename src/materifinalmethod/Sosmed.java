package materifinalmethod;

/*
final juga bisa diterapkan di method yg artinya method tersebut tidak dapat di override/ dirubah oleh child class
inti dari katakunci final
-jika diterapkan di variable/ properti, maka variable/ properti iitu tidak bisa dirubah (mirip spt konstanta)
-jika diterapkan di class, maka class tsb tidak dapat di inheritance/ diwariskan
-jika diterpkan di method, maka method itu tidak dapat di ovverride di child classnya.

begitulah kira kira
*/

public class Sosmed {
    private String userName;
    private String pass;
    private boolean statusLogin;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isStatusLogin() {
        return statusLogin;
    }

    public void setStatusLogin(boolean statusLogin) {
        this.statusLogin = statusLogin;
    }
  
    
    //methode
    public void sayHello(){
    }
    
    //final method
    final void login(){
        if(!(this.userName == null) && !(this.pass == null)){
            statusLogin = true;
            System.out.println("Login success!");
        }else{
            statusLogin = false;
            System.out.println("Gagal login");
        }
    }
}
