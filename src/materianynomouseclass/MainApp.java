package materianynomouseclass;

public class MainApp {
    public static void main(String[] args) {
        /*
        anynomouse class adalah kemampuan mendeklarasikan class tanpa harus membuat implements dari interface/abstract 
        biasanya digunakan dalam kasus kasus yg sifatnya sederhana
        kekurangannya, anynomouse class tidak reusibility/ semua kode yg ada di anynomouse class tidak dapat digunakkan kembali
        */
        
        
        
        //ini adalah anynomouse class
        Main english = new Main(){
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHelo(String name) {
                System.out.println("Hello " + name);
            }          
        };
        
        english.sayHello();
        english.sayHelo("hany");
        
        Main indonesia = new Main(){
            @Override
            public void sayHello() {
                System.out.println("Hallo");
            }

            @Override
            public void sayHelo(String name) {
                System.out.println("Hallo " + name);
            }
            
        };
        
        indonesia.sayHello();
        indonesia.sayHelo("dodo");
        
    }
}
