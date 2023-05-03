package matericheckdancasts;

//parrent class
class Karyawan {
    String name;
    
    //constructor
    Karyawan(String name){
        this.name = name;
    }
    
    //method
    void sayHello(String name){
        System.out.println("Hello " + name + ", saya karyawan " + this.name);
    }
}


//child class
class AdminProduksi extends Karyawan{
    
    //memanggil constructor parrent
    AdminProduksi(String name){
        super(name);
    }
    
    //method overriding
    @Override
    void sayHello(String name){
        System.out.println("Hello " + name + ", saya admin produksi " + this.name);
    }
}

//child class
class AdminGudang extends Karyawan{
    
    //memanggil constructor parrent
    AdminGudang(String name){
        super(name);
    }
    
    //method overriding
    @Override
    void sayHello(String name){
        System.out.println("Hello " + name + ", saya admin gudang " + this.name);
    }
}