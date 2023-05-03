package materisetterdangetter;


    /*
    di oop ada istilahnya enkapsulasi agar data tidak bisa sembarangan diakses dan menjaga data agar tetap aman 
    best praktis nya enkapsulasi dijava yaitu dengan menggunakan setter dan getter
    hanya properti atau field yg akses modifiernya private saya yg bisa di setter dan getter
    jadi setter dan getter adalah sebuah method yg akan mengakses properti private diclass tsb.
    didalam setter dan getter tsb kita bisa tambahkan validasi agar lebih aman
    
    */

public class Produks {

    //poperti
    private Integer id;
    private String name;
    private Integer harga;
    private Boolean stok;

    
    //setter dan getter
    public void setId(Integer id) {
        //disini bisa ditambahkan validasi
        if(id != 0){
           this.id = id; 
        }       
    }
    
    public Integer getId() {
       return id;      
    }
    
    public void setName(String name) {
           this.name = name;  
    }
    
    public String getName() {
       return name;      
    }

     public void setHarga(Integer harga) {
        this.harga = harga;
    }
     
    public Integer getHarga() {
        return harga;
    }

    public void isStok(Boolean stok) {
        this.stok = stok;
    }
    
    public Boolean getStok() {
        return stok;
    }

}
