package materiexception.errorexception;

import latihan.koneksidatabase.ConnectionDB;

public class DatabaseApp {
    
    public static void main(String[] args) {
        connectionDB("name", "");
        
        ConnectionDB.getConnectionDB("root", "");
        
        System.out.println("cobain");
    }
    
    public static void connectionDB (String name, String pass){
        if (name == null || pass == null){
            throw new DatabaseError("gagal koneksi ke database");
        }
    }
   
}
