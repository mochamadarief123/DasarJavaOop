package materiabstrac;

public class Cat extends Animals{

    public Cat(String name, String type) {
        super(name, type);
    }

    
    //override method abstarct sound()
    @Override
    public void sound() {
        System.out.println("meeeow");
    }    
    
}
