package latihan;

import java.util.Scanner;

public class MahasiswaApp {
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("NPM :");
        int npm = inputUser.nextInt();
        System.out.println("Nama :");
        String nama = inputUser.next();
        System.out.println("Prodi :");
        String prodi = inputUser.next();
        
        
        
        Mahasiswa objMahasiswa = new Mahasiswa();
        
        objMahasiswa.setNpm(npm);
        objMahasiswa.setName(nama);
        objMahasiswa.setProdi(prodi);
        
        objMahasiswa.regist(npm, nama, prodi);
    }
}