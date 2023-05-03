package materisuperkeyword;


/*
keyword super digunakan untuk mengakses method parrent class yg sudah dioverride di child class
tidak hanya method, keyword super juga bisa dignakan untuk mengakses properti parrent class
sederhana nya keyword super digunakan unruk mengakses class parrent
*/
class Kendaraan {
    //contoh properti milik parrent class yg akan kita akses di class child
    int noKendaraan = 9990;
    
    //misal disini kita memiliki parrent class yg memiliki method getJumlahMesin
    int getJumlahMesin(){
        return 0;
    }
}


//disini kita punya child class Motor, misalkan
class Motor extends Kendaraan{

    //contoh child class yg mengakses properti yg dimiliki parent class
    int nomer = super.noKendaraan;
    
    //jika sudah di override maka method getMesin yg ada pada class kendaraan tidak dapat diakses lagi oleh class Motor
    @Override
    int getJumlahMesin(){
        return 1;
    }
    
    //kita akan membuat method yg akan mengakses getJumlahMesin yg ada pada class Kendaraan di class Motor
    int getJumlahMesinKelasKendaraan(){
        
        //nahh disini kita gunakan keyword super agar class Motor dapat mengakses class Kendaraan
        return super.getJumlahMesin();
    }
}