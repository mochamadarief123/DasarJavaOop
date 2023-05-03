package materisuperkeyword;

class SuperConstructor {
    /*
    kata kunci this tidak hanya dapat mengakses properti dan method yg ada di parrent class saja
    this juga bisa mengakses constructor yg ada di parrent class
    untuk mengakses constructor parrent class, kita harus mengakses nya di constructor child class
    jika parrent class tidak memiliki constructor default/ constructor yg tidak ada parameternya, maka child class harus mengaksesnya 
    */
    
    //properti
    String name;
    String alamat;
    
    //constructor parrent class
    SuperConstructor(String name){
        this.name = name;
    }

    SuperConstructor(String name, String alamat) {
        this.name = name;
        this.alamat = alamat;
    }
    
    
    //method
    void sayHello(String name){
        System.out.println("Hello " + name + " " + ", my name is " + this.name+ ". This is from parrent class");
    }
    
}

class ChildSuperConstructor extends SuperConstructor{
    
    //karna parrent class memiliki constructor dengan parameter,maka class child nya wajib mengakses constructor yg ada di parrent class
    //jika parrent class memiliki lebih dari satu constructor dengan parameter, maka di chld class bebas mau memanggil constructor parrent yg mana. yg penting child class memanggil constructor parrent class minimal satu
    //constructor child class
     public ChildSuperConstructor() {
        //disini bebas mau mengakses data pada constructor parrent atau tidak, yg penting constructor child class harus memanggil constructor parrent class
        super(null);
    }
     
    //method overriding
     @Override
    void sayHello(String name){
        System.out.println("Hello " + name + " " + ", my name is " + this.name + ". This is from child class");
    }
    
}
