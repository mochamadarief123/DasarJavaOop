package latihan;

public class Mahasiswa {
   
    //atribute
    
    private int npm;
    private String name;
    private String prodi;
    
    //setter dan getter
    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        if (npm != 0){
          this.npm = npm;  
        }    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    
    //method
    public void regist(int npm, String name, String prodi){
        
        
        System.out.println("=========SELMAT========");
        System.out.println("=======================");
        System.out.println("Npm   : " + getNpm());
        System.out.println("Nama  : " + getName());
        System.out.println("Prodi : " + getProdi());
        System.out.println("=======================");
        System.out.println("Anda berhasil mendaftar");
    }
    
}
