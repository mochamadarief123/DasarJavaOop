package materiexception;


//class exception harus extends ke trowable
public class ValidationException extends Throwable{

    
    //buat constructor yg nanti nya akan mengirim message ke constructor parrent (trowable)
    public ValidationException(String message) {
        //mengirim message ValidationException ke constructor parrent class
        super(message);
    }   
    
}
