package materiinterface;


//cara menurunkan interface ke class
public class Cat implements Animals{

    //karena interface mimiliki abstract method, maka semua keturunan interface tersebut wajib meng-override method tsb
    @Override
    public void cekSound() {
        System.out.println("meoow");
    }

    @Override
    public int jumlahKaki() {
        return 4;
    }
   
}
