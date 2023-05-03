package materiinheritance;

//kita akan coba membuat objek parent class dan child class di sini
public class Main {
    public static void main(String[] args) {
        //instansiasi parent class spt biasanya
        Manager objManager1 = new Manager();
        objManager1.name = "Arief";
        objManager1.sayHello("Dodo");
        
        //instansiasi child class walaupun child class tidak memiliki atribut atau method apapun
        objManager1 = new VicePresident();
        objManager1.name = "Tiara";
        objManager1.sayHello("Arief");
        
        
        
    }
}
