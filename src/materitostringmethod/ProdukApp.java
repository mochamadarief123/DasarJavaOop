package materitostringmethod;

public class ProdukApp {
    public static void main(String[] args) {
        
        Produk produk = new Produk("indomie", 5_000);
        Produk produk2 = new Produk("sarimie", 3_000);
        
        System.out.println(produk);
        System.out.println(produk2);
        
    }
}
