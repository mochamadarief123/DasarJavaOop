package materisuperkeyword;

public class SuperConstructorApp {
    public static void main(String[] args) {
        
        //instansi objek SuperConstructor
        SuperConstructor objSuperConstructor = new SuperConstructor("Aci");
        //panggil method sayHello
        objSuperConstructor.sayHello("Deris");
        
        //instansi objek ChildSuperConstructor
        ChildSuperConstructor objChildSuperConstructor = new ChildSuperConstructor();
        //manipulasi name secara manual karena constructor di ChildSuperConstructor tanpa parameter
        objChildSuperConstructor.name = "Ferdi";
        
        objChildSuperConstructor.sayHello("Dodit");
    }
}
