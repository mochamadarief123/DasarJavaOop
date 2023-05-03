package materiinterface;

public class Monkey implements Animals{

    @Override
    public void cekSound() {
        System.out.println("uuaaa-uuaa");
    }

    @Override
    public int jumlahKaki() {
        return 2;
    }

}
