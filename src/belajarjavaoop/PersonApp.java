package belajarjavaoop;

public class PersonApp {
    public static void main(String[] args) {
        
        //instansi class person setelah menggunakan constructor
        Person objPerson1 = new Person("Mochamad","Arief");
        
        //cara menampilkan dan mengambil data dari class person
        System.out.println(objPerson1.firstName);
        System.out.println(objPerson1.lastName);
        System.out.println(objPerson1.adress);
        
        //memanggil method sayHello yg ada di class person
        objPerson1.sayHello();
        
        //memanggil method sayHello yg ada di class person yg parameternya
        objPerson1.sayHello("Deni");
        
        //class dapat di instansi berulang kali tanpa ada batasan
        //disini kita coba untuk instansi class person lagi
        Person objPerson2 = new Person("Tiara", "Yulinda");
        
        //memanggil method overloading dengan parameter name
        objPerson2.sayHello("Borip");
        
        //kita coba instansi class person dan panggil methode overloading lagi
        Person objPerson3 = new Person("Boy", "William");
        objPerson3.sayHello("Ben");
        
        
        //instansi class person dan memanggil method return value
        Person objPerson4 = new Person("wawan","winarto");
        System.out.println(objPerson4.sayHello("dede", "belajar woy"));
        
        //instansi class person dan panggil method variable argumen
        Person objPerson5 = new Person("Adi", "Santoso");
        System.out.println(objPerson5.firstName);
        System.out.println(objPerson5.lastName);
        System.out.println(objPerson5.adress);
        System.out.println(objPerson5.hitung(10, 10,10, 10, 10));
        
        objPerson5.sayHello("Hani");
        objPerson5.sayHello();
        System.out.println(objPerson5.sayHello("Ani", "Semangat"));
        
        //instansi class person dgn constructor tanpa parameter
        Person objPerson6 = new Person();
        
        //manipulasi data class person dgn constructor tanpa parameter
        objPerson6.firstName = "Dodo";
        objPerson6.lastName = "Widiarto";
        
        //ambil data objPerson6 yg telah dimanipulasi
        System.out.println(objPerson6.firstName);
        System.out.println(objPerson6.lastName);
        System.out.println(objPerson6.adress);
        
        //instansi class Person dengan constructor satu parameter
        Person objPerson7 = new Person("Dede");
      
        
        //ambil data person7
        System.out.println(objPerson7.firstName);
        System.out.println(objPerson7.lastName); //hasilnya nul,karna atribut lastName belum di manipulasi
        System.out.println(objPerson7.adress);
        
        //instansi class person dengan constructor dua parameter contohnya spt objPerson1 sampai objPerson5 yg kita instansi sebelumnya
    }
}
