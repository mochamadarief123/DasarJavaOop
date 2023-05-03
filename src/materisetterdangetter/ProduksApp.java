package materisetterdangetter;

public class ProduksApp {
    public static void main(String[] args) {
        //instansi class produks
        Produks objProduks = new Produks();
        
        //objProduks.name = null ; jadi kita tidak bisa lagi ngset sembarangan spt ini
        //System.out.println(objProduks.name); untuk mengakses juga tidak bisa langsung mengakses field / properti nya secara langsung
        
        //spt ini cara kita men-set field yg ada di class tsb. kita panggil method set untuk men-set
        objProduks.setId(111);
        objProduks.setName("indomie");
        objProduks.setHarga(9_000_000);
        objProduks.isStok(false);
        
        //karena ada validasi di setter id, maka set id 0 ini akan dihiraukan
        objProduks.setId(0);
        
        //jika bukan 0 maka method setId ini baru mau men-set properti id
        objProduks.setId(10);
        
        //untuk mendapatkannya kita cukup memanggil method get
        System.out.println(objProduks.getId());
        System.out.println(objProduks.getName());
        System.out.println(objProduks.getHarga());
        System.out.println(objProduks.getStok());
        
        
        
    }
}
