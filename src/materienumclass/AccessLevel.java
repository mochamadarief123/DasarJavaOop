package materienumclass;

/*
enum class digunakan untuk men set jenis jenis data yg nilainya terbatas
misal, class enum gender hanya ada 2 pilihan data yaitu male or female. kasus spt ini kita bisa gunakan enum class untuk menentukan gender apasaja yg diperbolehkan
-di class enum kita bisa menambahkan field, constructor atau method sekalipun
-khusu consturctor di enum class kita tidak bisa set dgn public constructor
*/

public enum AccessLevel {
    CUSTOMER("customer level"),
    ADMIN("admin level"),
    OWNER("owner level");

    //contoh field di enum class
    private String description;
    
    //contoh constructor di enum class
    AccessLevel(String description) {
        this.description = description;
    }
    
    //contoh method di enum class

    public String getDescription() {
        return description;
    }
    
    
}
