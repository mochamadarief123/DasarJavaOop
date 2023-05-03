package latihan;


import java.util.Scanner;

public class OrderApp {
    public static void main(String[] args) {
        
        Makanan makanan = new Makanan();
          
        int pilihanMakan;
        int jumPilihanMakan;
        int totalBayar;
        
            Scanner scanner = new Scanner(System.in);
        
        System.out.println("----------Menu Makan----------");
        System.out.println("[1] Nasi Goreng.....Rp. 10.000");
        System.out.println("[2] Mie Ayam........Rp.  9.000");
        System.out.println("[3] Pecel Lele......Rp. 11.000");
        System.out.println("[4] Bakso Super.....Rp. 12.000");
        System.out.println("Pesen apa?");
        
        pilihanMakan = scanner.nextInt();
        
        switch(pilihanMakan){
            case 1:
                makanan.setName("Nasi Goreng");
                makanan.setPrice(10_000);
                break;
            case 2:
                makanan.setName("Mie Ayam");
                makanan.setPrice(9_000);
                break;
            case 3:
                makanan.setName("Pecel Lele");
                makanan.setPrice(11_000);
                break;
            case 4:
                makanan.setName("Bakso Super");
                makanan.setPrice(12_000);
                break;
            default:
                System.out.println("Pilihan tidak terdaftar");
                System.exit(0);
        }
        
        System.out.println("Berapa banyak?");
        
        jumPilihanMakan = scanner.nextInt();
        
        totalBayar = jumPilihanMakan * makanan.getPrice();


        System.out.println("Pesenan anda");
        System.out.println("Menu makan  : " + makanan.getName());
        System.out.println("Harga       : " + makanan.getPrice());
        System.out.println("Jumlah      : " + jumPilihanMakan);
        System.out.println("Total bayar : " + totalBayar);
      
    }
}
