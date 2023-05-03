package materiinterface;

/*
sebelumnya kita sudah mencoba membuat kontrak untuk child class dengan abstract class dan abstract method
nah, idealnya untuk membuat sebuah kontrak adalah dgn menggunakan interface
interface hampir sama dengan abstract class. bedanya,kita tidak perlu lagi mendeskripsikan method dengan katakunci abstract karena default dari interface adalah abstract
untuk menurunkan interface ke class, gunakan katakunci implements
di interface kita tidak bisa membuat field/ properti, yg ada hanya bisa membuat konstan
*/

public interface Animals {
    
    
    //cara penulisan abstract method di interface
    void cekSound();
    
    int jumlahKaki(); 
}
