package reflection;


public class ValidationException extends Throwable{

    //constructor dengan parameter message
    public ValidationException(String message) {
        //mengirimkan parameter message ke parrent class Throwable
        super(message);
    }   
}
