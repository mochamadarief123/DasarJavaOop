package materivariablehidding;

class ParrentClassApp {
    public static void main(String[] args) {
        //instansi
        ChildClass objChildClass = new ChildClass();
        
        System.out.println(objChildClass.name);
        objChildClass.sayHello();
        
        //konversi tipe data objek dari child ke parrent
        ParrentClass objParrentClass = (ChildClass)objChildClass; 
        objParrentClass.name =  "Desi";
        //walaupun objek datanya sudah dikonversi,tapi sayHello yg dipanggil tetap sayHello kepunyaan objek yg diinstansiasi
        System.out.println(objChildClass.name);
        objChildClass.sayHello();
        
        
    }
}
