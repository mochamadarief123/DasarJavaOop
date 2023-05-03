package materiexception.errorexception;

public class DatabaseError extends Error {

    //panggil super constructor 
    public DatabaseError(String message) {
        super(message);
    }
    
}
