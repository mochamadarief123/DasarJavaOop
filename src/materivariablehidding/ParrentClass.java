package materivariablehidding;

class ParrentClass {
    //atribut
    String name;

    //constructor
    ParrentClass(String name) {
        this.name = name;
    }  
    
    //method
    void sayHello(){
        System.out.println("this say hello from Parrent Class");
    }
}

class ChildClass extends ParrentClass {
    //atribute
    //String name; //variable hidding. dijava tidak ada yg namanya field/ atribut override.
    //tidak disarankan memakai atribut yg sama dengan atribut kepunyaan parrent class
    //jika ingin mengakses atribut yg dimiliki parrent class kita bisa mengakses nya menggunakan katakunci super
    //panggil constructor parrent di constructor child
    ChildClass(){
        super(null);
    }
    
    //method
    @Override
     void sayHello(){
        System.out.println("this say hello from Child Class " + super.name);
    }
}