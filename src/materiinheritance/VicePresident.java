package materiinheritance;

//agar class child dapat mewarisi atribut dan method dari parent class cukup tambahkan katakunci extends pada child class
public class VicePresident extends Manager{
    //walaupun disini class VP tidak memiliki atribut dan method apapun tetapi dapat mengakses atribut dari class Manager
    
    
    //method overriding adalah kemampuan untuk menuliskan method yg sama pada parent class dengan catatan harus sama persis dgn method di parent class 
    //hanya baris yg di dalam scope method overriding yg bisa kita ganti
    //problemnya, jika kita menggunakan method overriding maka method yg ada di parent class tidak dapat kita akses lagi
    @Override
    void sayHello(String name){
        
        System.out.println("Hello " + name + ", My name is " + this.name + ". Im a VP in the company");
    }
}
