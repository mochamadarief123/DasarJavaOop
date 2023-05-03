package materiinnerclass;

public class BrandApp {
    public static void main(String[] args) {
        
        //format instansiasinya, pertama kita harus intansiasi outerclass telebih dahulu
        Brand brand = new Brand();
        brand.setBrandName("Iphone");
        
        //selanjutnya kita instansiasi innerclass nya
        Brand.Produk produk = brand.new Produk();
        produk.setName("Iphone-XR Pro");
        produk.setPrice(12_000_000_00);
        
        System.out.println("Brand : " + produk.getBrand());
        System.out.println("Name Product : " + produk.getName());
        System.out.println("Price : " + produk.getPrice());
        
        Brand brand2 = new Brand();
        brand2.setBrandName("Samsung");
        
        Brand.Produk produk2 = brand2.new Produk();
        produk2.setName("Samsung S8 plus");
        produk2.setPrice(9_000_000_00);
        
        System.out.println("Brand : " + produk2.getBrand());
        System.out.println("Name Product : " + produk2.getName());
        System.out.println("Price : " + produk2.getPrice());
        
    }
}
