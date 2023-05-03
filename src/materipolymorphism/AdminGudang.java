package materipolymorphism;

public class AdminGudang extends Karyawan {

    
    
    //constructor child class
    public AdminGudang(String name) {
        super(name);
    }
    
    //method
    @Override
    void sayHello(String name){
        System.out.println("Hello " + name + ", saya admin gudang dengan nama " + this.name);
    }
        
    
}
