package materifinalmethod;

public class Titok extends Sosmed{

    
    //method
    @Override
    public void sayHello() {
        if(isStatusLogin()){
            System.out.println("Welcome to tiktok " + getUserName());
        }else{
            System.out.println("Login lu gagal pea, gabisa sayHello");
        }
    }
}
