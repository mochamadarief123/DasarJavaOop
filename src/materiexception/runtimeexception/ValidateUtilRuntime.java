package materiexception.runtimeexception;

import materiexception.LoginRequest;

public class ValidateUtilRuntime {
    
    //Runtime exception tidak wajib menyebutkan jenis exceptionnya di method
    public static void ValidateRuntime(LoginRequest loginrequest2){
        if(loginrequest2.getUsername() == null){
            throw new NullPointerException("username is null");
        }else if(loginrequest2.getUsername().isEmpty()){
            throw new ValidateRuntime("username is empty");
        }else if(loginrequest2.getPassword() == null){
            throw new NullPointerException("password is null");
        }else if(loginrequest2.getPassword().isEmpty()){
            throw new ValidateRuntime("password is empty");
        }
        
    }
}
