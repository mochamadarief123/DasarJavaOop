package materiabstrac;

public class AnimalsApp {
    public static void main(String[] args) {
            
        //kita akan coba instansiasi class Animals yg di set sbg class abstract
        //Animals objAnimals = new Animals(); ->tidak bisa. karena class animals adalah class abstract
        
        //hanya bisa instansiasi class turunan dari class abstract tsb
        //ini memakai kemampuan polymorphism
        Animals objAnimals = new Cat("Tom", "Persia");
        
        System.out.println(objAnimals.name);
        System.out.println(objAnimals.type);
        objAnimals.sound();
        
        Animals objAnimals2 = new Dog("Spark", "Buldog");
      
        System.out.println(objAnimals2.name);
        System.out.println(objAnimals2.type);
        objAnimals2.sound();
        
        Animals objAnimals3 = new Bird("john", "kakatua");
        
        System.out.println(objAnimals3.name);
        System.out.println(objAnimals3.type);
        objAnimals3.sound();
    }
}
