package materiaksesmodifier;

public class ChildCar extends Cars{
    
    //karena ini adalah class child dari class Cars yg memiliki constructor protected, maka ini bisa diakses oleh child classnya
    protected ChildCar(String merk, int harga) {
        super(merk, harga);
    }
    
}
