package materipolymorphism;

public class AdminProduksi extends Karyawan{

    
    
    //constructor child class
    public AdminProduksi(String name) {
        super(name);
    }
    
    //method
    @Override
    void sayHello(String name){
        System.out.println("Hello " + name + ", saya admin produksi dengan nama " + this.name);
    }
    
}
