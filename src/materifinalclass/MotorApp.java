package materifinalclass;

public class MotorApp {
    public static void main(String[] args) {
        //instansi class Manual menggunakan polimorphism
        Manual motor = new Manual("Yamaha");
        motor.setType("Mio");
        
        System.out.println(motor.getBrand());
        System.out.println(motor.getType());
        
        Automatic motor2 = new Automatic("Honda");
        motor2.setType("Supra");
        
        System.out.println(motor2.getBrand());
        System.out.println(motor2.getType());
        
    }
}
