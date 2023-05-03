package materistatickeyword;

/*
static blok akan dieksekusi sekali sebelum class di load
blok static cuma bisa mengakses static variable/ static method
*/
public class StaticBlock {
    //static variable
    public static int PROCESOR;
    
    //static blok
    static{
        PROCESOR = Runtime.getRuntime().availableProcessors();
    }
}
