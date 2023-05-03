/*
    Throwable memiliki method getStackTrace() yg menghasilkan array dari StackTracceElements
    StackTraceElements berisikan tentang class, file, dan baris lokasi terjadinya error
*/
package materiexception.stackTraceElements;

public class StackTraceApp {
    public static void main(String[] args) {
        
        try {
            sampleError();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        
        
        try {
            String [] name = {"ana", "dedi", "gani"};
            
            System.out.println(name[100]);
        } catch (Throwable throwable) {
            StackTraceElement [] stackTraceElement = throwable.getStackTrace();
            
            throwable.printStackTrace();
        }
    }
    
    public static void sampleError(){
        try {
            String [] name = {"ana", "dedi", "gani"};
            
            System.out.println(name[100]);
        } catch (Throwable throwable) {
          
            throw new RuntimeException(throwable); 
            
        }
    }
    
}
