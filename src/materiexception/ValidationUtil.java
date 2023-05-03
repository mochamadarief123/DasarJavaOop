package materiexception;

public class ValidationUtil {
    
    
    //method yg kemungkinan terjadi exception harus ditandai dengan class exceptionnya
    public static void validate(LoginRequest loginrequest) throws ValidationException, NullPointerException{
        if(loginrequest.getUsername() == null){
            throw new NullPointerException("username is null");
        }else if(loginrequest.getUsername().isEmpty()){
            throw new ValidationException("username is empty");
        }else if(loginrequest.getPassword() == null){
            throw new NullPointerException("password is null");
        }else if(loginrequest.getPassword().isEmpty()){
            throw new ValidationException("password is empty");
        }
        
    }
}    
