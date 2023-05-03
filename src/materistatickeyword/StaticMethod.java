package materistatickeyword;

public class StaticMethod {
    
    
    
    
    //static mthod
    public static int sum(int... values){
        int total = 0;
        
        //foreach
        for(int value : values){
            total += value;           
        }
        return total;
    }
}
