package materipolymorphism;

public class Karyawan {
    //properti
    String name;
    
    
    //constructor
    Karyawan(String name){
        this.name = name;      
    }
    
    void sayHello(String name){
        System.out.println("Hello " + name + ", saya karyawan dengan nama " + this.name);
    }
    
}
