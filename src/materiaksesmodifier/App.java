package materiaksesmodifier;

public class App {
    public static void main(String[] args) {
        //akses class Cars di pakage yg sama
        Cars objCars = new Cars("toyota", 90_000_000);
        System.out.println(objCars.merk);
        System.out.println(objCars.harga);
        //hasilnya bisa, karena class Cars dan main class App ini berada satu pakage
    
    /*
        //kita akan akses class private animals di dalam satu pakage
        Animals objAnimals = new Animals("kakatua", "Burung");
        //kita coba akses nama dan jenis class Animals yg tipe nya private
        System.out.println(objAnimals.name);
        System.out.println(objAnimals.jenis);
        //hasilnya tidak bisa diakses, karena modifier private hanya dapat diakses didalam class itu sendiri
    
    */
 
    }
}
