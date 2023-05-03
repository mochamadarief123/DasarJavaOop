package materiabstrac;

/*
jika ada class abstract, maka artinya class tersebut tidak bisa di instansiasi, hanya bisa diturunkan
abstract sebagai kontrak bagi child classnya 
penggunaan abstract cukup gunakan katakunci abstact 
selain abstract class, ada juga abtract method
kegunaan method abstract aalah untuk memaksa child class meng-override method tersebut
abstract method tidak boleh memiliki body. 
untuk membuat method abstract tidak boleh menggunakan akses mofifier private
*/

public abstract class Animals {
    //properti
    public String name;
    public String type;
    
    //consturctor
    Animals(String name, String type){
        this.name = name;
        this.type = type;
    }
    
    //methtod abstract.
    public abstract void sound();
}
