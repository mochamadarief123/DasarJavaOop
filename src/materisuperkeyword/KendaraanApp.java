package materisuperkeyword;

public class KendaraanApp {
    public static void main(String[] args) {
        
        //instansi class Kendaraan spt biasa
        Kendaraan objKendaraan = new Kendaraan();
        System.out.println(objKendaraan.getJumlahMesin());
        
        //instansi class Motor spt biasa
        Motor objMotor = new Motor();
        System.out.println(objMotor.getJumlahMesin());
        
        //ini hasil dari method getJumlahMesinKendaraan yg mengembalikan nilai pada method jumlahMesin yg ada pada parrent class/ class Kendaraan
        System.out.println(objMotor.getJumlahMesinKelasKendaraan());
    }
}
