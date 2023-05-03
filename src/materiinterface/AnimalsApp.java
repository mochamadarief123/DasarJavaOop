package materiinterface;

public class AnimalsApp {
    public static void main(String[] args) {
        
        //cara instansiasi class dari keturunan interface 
        Animals objAnimals = new Cat();
        
        objAnimals.cekSound();
        System.out.println(objAnimals.jumlahKaki());
        
        Monkey objAnimals2 = new Monkey();
        
        objAnimals2.cekSound();
        System.out.println(objAnimals2.jumlahKaki());
       
        //interface sama spt abstract class. dia gak bisa diinstansiasi
        //Animals animals = new Animals(); -> ERROR
       
    }
}
