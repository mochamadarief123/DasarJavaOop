package materihashcodemethod;

public class ProdukApp {
    public static void main(String[] args) {
        
        //instansiasi class produk
        Produk produk1 = new Produk("indomie", 5_000);
        
        
        //instansiasi produk2 
        Produk produk2 = new Produk("sarimie", 5_000);
        
        
        //bandingkan objek dengan ==
        System.out.println(produk1 == produk2);//output -> false. karena == sebenernya membandingkan posisi objek didalam memori bukan membandingkan isi dari konten objek tsb
        
        //bandingkan objek dengan equals method
        System.out.println(produk1.equals(produk2));//output true. dengan catatn harus mengoverride equals method terlebbih dahulu
        
        int x = produk1.hashCode();
        int y = produk2.hashCode();
        System.out.println(x);
        System.out.println(y);
        
    }
}
