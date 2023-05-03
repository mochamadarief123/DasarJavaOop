package materiexception;

import materiexception.runtimeexception.ValidateRuntime;
import materiexception.runtimeexception.ValidateUtilRuntime;

public class ValidationApp {
    public static void main(String[] args) {
        
        LoginRequest loginrequest = new LoginRequest("dede", "rahasia");
        
        try {
            ValidationUtil.validate(loginrequest);
            System.out.println("Data valid");
        } catch (ValidationException e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Data null : " + e.getMessage());
        }
        
        
        System.out.println("--------------------------------");
        
        
        LoginRequest loginrequest2 = new LoginRequest("andi", null);
        
        //bedanya disini kita bisa memanggil method ValidateRuntime tanpa harus try catch
        //tapi apabila terkena exception maka code dibawahnya tidak akan dieksekusi
        try {
            ValidateUtilRuntime.ValidateRuntime(loginrequest2);
        } catch (ValidateRuntime | NullPointerException ex){
            System.out.println( ex.getMessage());
        }
        
        System.out.println("sukses");
        
        
    }
}
