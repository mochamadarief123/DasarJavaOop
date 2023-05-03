package materiexception.tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resoure
resource adalah sesuatu yg wajib di close didalam blok try
kita wajib menggunakan ibterface autoCloseable
*/
public class ReadApp {
    public static void main(String[] args) {
        
        
        
        //resource otomatis di close dengan fitur tryWithResorce
        try (BufferedReader read = new BufferedReader(new FileReader("READ.md"))) {
            
            
            //perulangan untuk membaca baris dari file
            while (true) {
                String line = read.readLine();
                 if(line == null){
                    break;
                }
                System.out.println(line);
            }
            
        } catch (Throwable throwable) {
            System.out.println("gagal membaca file :" + throwable.getMessage());
        }
        
/*       
        //class java IO
        BufferedReader read = null;
        
        //menutup resource secara manual
        try {
            //mencari file dengan nama READ.md
            read = new BufferedReader(new FileReader("READ.md"));
            
            //perulangan untuk membaca baris dari file
            while (true) {
                String line = read.readLine();
                 if(line == null){
                    break;
                }
                System.out.println(line);
            }
            
        } catch (Throwable throwable) {
            System.out.println("gagal membaca file :" + throwable.getMessage());
        }finally{
            if(read != null){
                try {
                    read.close();
                    System.out.println("Sukses menutup resoruce");
                } catch (IOException exception) {
                    System.out.println("Gagal menutup resource :" + exception.getMessage());
                }
            }
        }
*/
    }
}
