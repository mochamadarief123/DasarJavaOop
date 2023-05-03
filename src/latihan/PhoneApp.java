package latihan;

import java.util.Scanner;


public class PhoneApp {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        Phone phone = new Xiomi();
        
        UserPhone andrian = new UserPhone(phone);
        
        while(true){
            do {
                System.out.println("===MAIN MENU===");
                System.out.println("===============");
                System.out.println("[1] Turn On");
                System.out.println("[2] Turn Off");
                System.out.println("[3] Volume Up");
                System.out.println("[4] Volume Down");
                System.out.println("[0] exit");
                System.out.println("Pilih Aksi:");
                int aksi = userInput.nextInt();

                    switch(aksi){
                        case 1:
                            andrian.nyalakanHp();
                        break;
                        case 2:
                            andrian.matikanHp();
                        break;
                        case 3:
                            andrian.naikanVolume();
                        break;
                        case 4:
                            andrian.turunkanVolume();
                        break;
                        case 0:
                            System.exit(0);
                        break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                    }

            }while (andrian.hpPower);
        }
        
        
        
        
    }
}
