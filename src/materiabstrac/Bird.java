package materiabstrac;

public class Bird extends Animals {

    
    
    public Bird(String name, String type) {
        super(name, type);
    }
    
    @Override
    public void sound() {
        System.out.println("cuitcuitcer");
    }
    
}
