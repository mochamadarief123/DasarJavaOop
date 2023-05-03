package materitostringmethod;



public class Produk {
    //properti
    String name;
    int price;
    
    //contructor
    public Produk (String name, int price){
        this.name = name;
        this.price = price;
    }
    
    //jika diperlukan, kita bisa override method toString agar informasi mengenai objek yg diinstansi lebih informatif
    @Override
    public String toString() {
        return "name : " + this.name + ", price : " + this.price;
    }
}
