package materifinalmethod;

public class Facebook extends Sosmed{
    
    
    

    //method
    @Override
    public void sayHello() {
        if(isStatusLogin()){
            System.out.println("Welcome to facebook " + getUserName());
        }else{
            System.out.println("Login lu gagal pea, gabisa sayHello");
        }
        
    }
}
