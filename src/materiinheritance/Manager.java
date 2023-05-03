package materiinheritance;

class Manager {
    //inheritance adalah pewarisan seluruh properti dan method parrent class ke child class
    //disini misalkan kita punya parrent class yaitu class Manager yg memiliki properti sbg berikut
    String name;
    
    //dan memiliki method sayHello
    void sayHello(String name){
        
        System.out.println("Hello " + name + ", My name is " + this.name + ". Im a Manager in the company");
    }
    //selanjutnya kita akan membuat child class yg akan mewarisi properti dan method dari class Manager ini
    
}


