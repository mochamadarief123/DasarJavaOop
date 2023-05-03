package materifinalmethod;

public class SosmedApp {
    public static void main(String[] args) {
        
        //instansiasi
        Sosmed fb = new Facebook();
        fb.setUserName("Borip");
        fb.setPass("password");
        fb.login();
        fb.sayHello();
        
        
        Sosmed tiktok = new Titok();
        tiktok.setUserName("Joni");
        tiktok.setPass("inipassword");
        tiktok.login();
        tiktok.sayHello();
        
       
        
    }
 
}
