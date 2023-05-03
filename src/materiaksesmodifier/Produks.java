package materiaksesmodifier;
/*
akses modifier di java ada 4

level       class         in pakage      child       out pakage
-public       Y               Y            Y             Y        -> dpt diakses dimana saja
-prpotected   Y               Y            Y             N        -> tidak bisa diakses diluar pakage
-no modifier  Y               Y            N             N        -> hanya bisa diakses di dalam pakage dan classnya saja
-private      Y               N            N             N        -> hanya bisa dia akses di class nya saja

akses modifier bisa digunakan untuk menentukan akses properti/ field, constructor ataupun method

catatan:
satu class hanya dapat membuat satu public class
saran:
buatlah satu file untuk satu class
*/

//artinya class produks ini dapat diakses dimana saja karena public
public class Produks {
    //public field/properti
    public String name;
    public int harga;
    
    //constructor
    public Produks(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }
    
}
