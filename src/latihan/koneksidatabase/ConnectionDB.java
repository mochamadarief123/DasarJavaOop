package latihan.koneksidatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionDB {
    public static Connection con;
    public static Statement stm;
    public static ResultSet rs;
        
    public static void getConnectionDB (String username, String pass){
        
        try {
            if(username == "root" && pass == ""){
                String url = "jdbc:mysql://localhost/kampus";
            
            
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, username, pass);
                stm = con.createStatement();
                String query = "SELECT * FROM tbl_mhs";


                rs = stm.executeQuery(query);
                while(rs.next()){
                    System.out.println(rs.getString("nama"));
                }
            }else{
                throw new ConnectionError("gagal koneksi ke database");
            }
            
            
        } catch (Exception e) {
            e.getMessage();
        }
    }
}    

