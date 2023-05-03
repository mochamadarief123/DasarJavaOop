package materiaksesmodifier.app;

import materiaksesmodifier.Produks;

public class ProduksApp {
    public static void main(String[] args) {
        //kita akan akses class Produks diluar pakage
        Produks objProduks = new Produks("indomie", 10_000);
        System.out.println(objProduks.name);
        System.out.println(objProduks.harga);
        //hasilnya bisa diakses
        
     
    /*
        //kita akan coba akses class Cars diluar pakage
        //hasilnya bisa karena class Cars akses modifier nya public
        Cars objCar = new Cars("toyota", 50_000_000);
        //tapi kita tidak bisa akses field dari class Cars tsb, karena field tsb protected
        System.out.println(objCar.merk);
        System.out.println(objCar.harga);
        
        //kita akan akses class Cars ini di pakage materiaksesmodifier didalam class app
    */
    }
}
