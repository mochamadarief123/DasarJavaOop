package materiequalsmethod;

public class MainApp {
    public static void main(String[] args) {
        /*
        dijava, untuk membandingkan isi dari tipe datanya primitif bisa menggunakan ==
        sedangkan untuk membandingkan isi dari objek/ tipedata bukan promitif harus menggunakan method .equals()
        */
        
        String name = "Mochamad arief";
        String name2 = "Mochamad";
        String gabung = name2 + " " + "arief";
        
        System.out.println(name == gabung); //hasilnya false
        System.out.println(name.equals(gabung));//hasilnya true
        
        //contoh lain
        Motor objMotor = new Motor("supra", 20_000_000);
        Motor objMotor2 = new Motor("supra", 20_000_000);
        
        System.out.println(objMotor.equals(objMotor2));// hasil sebelum mengoverride method equals di class Motor -> hasilnya false || coba aja hapus dulu method equals yg ada di class Motor
        System.out.println(objMotor.equals(objMotor2));//hasilnya true. dgn catatan kita harus mengoverride method equals dulu
        
    }
}
