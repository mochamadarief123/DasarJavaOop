package matericheckdancasts;

public class KaryawanApp {
    public static void main(String[] args) {
        
        //panggil method sekaligus instansi
        sayHello(new Karyawan("Jono"));
        sayHello(new AdminProduksi("Rere"));
        sayHello(new AdminGudang("Ghani"));
        sayHello(new AdminProduksi("Julia"));
        
        //mengakses sayHello sesuai objek yg diinstansi
        Karyawan objKaryawan = new Karyawan("Dhani");
        objKaryawan.sayHello("Caca");
        
        //bagaimana jika kita ingin sayHello sesuai dengan objek masig" class?
        //caranya dengan cara cek dan konversi
        //untuk konversi dari satu objek ke objek lain gunakan kata kunci instanceof
        //instanceof akan selalu benrnilai boolean
    }
    
    //set polymorphism didalam method
    static void sayHello(Karyawan objKaryawan){
        //pengecekan
        if(objKaryawan instanceof AdminProduksi){
            //konversi tipedata objek
            AdminProduksi objAdminProduksi = (AdminProduksi) objKaryawan;
            System.out.println("Hello admin produksi " + objAdminProduksi.name);
        }else if(objKaryawan instanceof AdminGudang){
            //konversi tipedata objek
            AdminGudang objAdminGudang = (AdminGudang) objKaryawan;
            System.out.println("Hello admin gudang " + objAdminGudang.name);            
        }else{
            System.out.println("Hello karyawan " + objKaryawan.name);
        }
    } 
}
