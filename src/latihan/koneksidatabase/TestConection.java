package latihan.koneksidatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestConection {
    
    public static Connection con;
    public static Statement stm;
    public static ResultSet rs;
   
    
    public static void main(String[] args) {
        
        try {
            String url = "jdbc:mysql://localhost/kampus";
            String user = "root";
            String pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            String query = "SELECT * FROM tbl_mhs";
            
            
            rs = stm.executeQuery(query);
            
            
            while(rs.next()){
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("nim"));
                System.out.println(rs.getString("nama"));
                System.out.println(rs.getString("kelas"));
                System.out.println(rs.getString("jurusan"));
            }
            
            stm.close();
            con.close();
            
            System.out.println("conected");
        } catch (Exception e) {
            System.err.println("not conected" + e.getMessage());
        }
        
        
        
    }
        
}
