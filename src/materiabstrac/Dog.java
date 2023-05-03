package materiabstrac;

public class Dog extends Animals{
    
    Dog(String name, String type){
        super(name, type);
    }

    @Override
    public void sound() {
        System.out.println("guukguuk");
    }
    
}
