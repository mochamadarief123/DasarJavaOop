package materipolymorphism;

public class KaryawanApp {
    public static void main(String[] args) {
        
        //polymorphism adalah kemampuan sebuah objek berubah bentuk menjadi bentuk yg lain
        //instansi class Karyawan spt biasanya
        Karyawan objKaryawan = new Karyawan("Deni");
        objKaryawan.sayHello("Danar");
        
        //jika kita perhatikan disini kita instansiasi objKaryawan dengan tipe Karyawan, tapi kita set objeknya dengan new AdminProduksi
        //ini yg dikatakan polymrphism
        //sayHello disini tetap akan memanggil sayHello kepunyaannya objek yg kita instansiasi
        objKaryawan = new AdminProduksi("Farah");
        objKaryawan.sayHello("Galih");
        
        //ini juga polymorphism
        objKaryawan = new AdminGudang("Benny");
        objKaryawan.sayHello("Hani");
        
        //contoh menerapan polymorphism yg di set didalam method
        //walaupun di method kita deklarasikan sebagai tipe data Karyawan,tapi kita bisa memasukan turunan parant classnya
        sayHello(new Karyawan("Deni"));
        sayHello(new AdminProduksi("Farah"));
        sayHello(new AdminGudang("Benny"));
    }
    
    //polymorphism juga bisa kita set didalam method
    //cukup deklarasikan dengan tipe data class parrent nya
    static void sayHello(Karyawan objKaryawan){
        System.out.println("Hallo " + objKaryawan.name);
    }
}
