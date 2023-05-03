package materihashcodemethod;

import java.util.Objects;

/*
hashcode merupkan method yg merepresentasikan integer objek kita
bermanfaat untuk membuat struktur data unik 
intinya hashcode method adalah method untuk mendapatkan identitas unik dari objek yg kita miliki
jika class yg dibandingkan menggunakan equals bernilai true,maka hascode yg di kembalikan juga harus sama
tapi jika objek dibandingkan menggunakan equals bernilai true, maka hashcode yg dikembalikan tidak wajib sama
override method equasl bagusnya dibarengi dengan override hasCode juga(intinya satu paket)
*/

public class Produk {
    //atribut class
    private String name;
    private int price;
    
    //constructor
    public Produk(String name, int price) {
        this.name = name;
        this.price = price;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produk other = (Produk) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    //setter & getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
