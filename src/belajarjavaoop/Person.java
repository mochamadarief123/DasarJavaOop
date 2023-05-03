package belajarjavaoop;

class Person {
    // atribute/properti/field class sama seperti variable, yaitu untuk menampung data
    String firstName;
    String lastName;
    final String adress = "Indonesia";
    
    //method pada class sama seperti method/ function pada umumnya
    void sayHello(){
        System.out.println("Hello " + firstName + " " + lastName);
    }
    
    //method pada class juga mendukung method overloading spt di materi java dasar
    void sayHello(String parameterName){
        System.out.println("Hello " + firstName + ", nama saya " + parameterName);
    }
    
    //method pada class mendukung method return value juga
    String sayHello(String parameterName, String message){
        String hi = "hallo " + firstName + " " + lastName + " ingat pesan " + parameterName + " : " + message;
        
        return hi;
    }
    
    //method didalam class juga mendukung method variable argumen
    int hitung(int ... nilai){
        int totalNilai = 0;
             
        //foreach
        for(int perNilai : nilai){
           totalNilai += perNilai; 
        }
        return totalNilai;
    }
    
    //constructor adalah sebuah method yg otomatis akan dijalankan ketika pertamakali class di instansi
    //nama constructor harus sama dengan nama class nya
    //constructor hampir sama dengan method biasa, bedanya di constructor kita tidak perlu kata kunci void atau return value
    Person(String parameterFirstName, String parameterLastName){
        firstName = parameterFirstName;
        lastName = parameterLastName;
    }
    
    //sama seperti method, constructor juga mendukung overloading 
    Person(String firstName){
        //contoh shadowing variable
        //firstName = firstName;
        
        //resolve sahdowing menggunakan this
        this.firstName = firstName;
    }

    Person(){
    }
   
    /*
    hati-hati saat mendeklarasikan variable/ properti pada class dengan parameter pada method, jika sama maka akan terjadi variable shadowing
    conthnya, di class person kita sudah mendeklarasikan properti class dgn nama String firstName dan String lastName diatas
    misal disini kita akan membuat method sayHello dengan parameter yg sama dengan properti
        
        void sayHello(String firstName){

            System.out.println("Hello " + firstName + ", My name is " + firstName);
            //variable firstName yg sebelah kiri akan tetap mengacu pada variable firstName yg ada di parameter method sayHello, begitupun variable lastName

            //jika kita coba instansi class Person danpanggil method sayHello, maka hasilnya spt ini
            Person objPerson = new Person("Deris", "Sani");

            //lalu kita panggil methodnnya
            System.out.println(objPerson.sayHello("Narji");

            //maka outputnya akan jadi seperti ini
            Hello Narji, My name is Narji
    
    untuk mengatasi variable shadowing diatas, kita bisa menggunakan keyword this
    keyword this berfungsi untuk mengakses variable/properti milik objek saat ini
    this juga bisa digunakan untuk mengakses method

            //contoh resolve
            System.out.println("Hello " + firstName + ", My name is " + this.firstName);
            //firstName yg pertama akan mengacu pada properti person, sedangkan this.firstName akan mengacu pada parameter yg dimiliki method sayHello
            
            //maka outputnya
            Hello Deris, My name is Narji
    }
*/    
    
/*
    bahasan file ini mencakup
    -cara membuat class
    -cara membuat objek/ instansi class
    -cara membuat variable/ properti/ field pada class
    -cara manipulasi data pada class
    -cara mengakses data pada class
    -membuat method
    -cara mengakses method
    -membuat method dengan parameter
    -membuat method return value
    -membuat method variable argument
    -membuat method overloading
    -membuat constructor
    -membuat constructor overloading
    -variable shadowing
    -keyword this.
    -cara resolve variable shadowing dengan kata kunci this.
    
*/   

}
