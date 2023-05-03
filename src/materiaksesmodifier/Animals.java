package materiaksesmodifier;

public class Animals {
    //set properti private
    private String name;
    private final String jenis;
    
    //constructor nya kita set private
    private Animals(String name, String jenis){
        this.name = name;
        this.jenis = jenis;
    }
    
    public static void main(String[] args) {
        //kita akan akses class Animals didalam class nya sendiri
        Animals objAnimals = new Animals("kakatua", "burung");
        objAnimals.name = "elang";
        //akses nama dan jenis class Animals
        System.out.println(objAnimals.name);
        System.out.println(objAnimals.jenis);
        //hasilnya bisa 
    }
}
