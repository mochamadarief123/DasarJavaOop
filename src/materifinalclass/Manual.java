package materifinalclass;

/*
sebelumnya kita sudah mengetahui penggunaan katakunci final di variable
final variable artinya value daripada variable tsb tidak dapat dirubah (mirip spt konstanta)
katakunci final juga bisa diterapkan pada sebuah class
final class artinya class tersebut tidak bisa di inheritance/ diturunkan lagi karena sudah final
*/

//contoh class final
final class Manual extends Motor{
    //properti
    private String type;

    //constructor
    public Manual(String brand) {
        //akses properti parent class
        super(brand);
    }
    
    //setter dan getter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}