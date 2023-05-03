package latihan;

public class UserPhone {
    
    Phone phone;
    boolean hpPower;

    //constructor
    public UserPhone(Phone phone) {
        this.phone = phone;
    }
    
    public void nyalakanHp(){
        hpPower = true;
        phone.turnOn();
    }
    
    public void matikanHp(){
        //hpPower = false;
        if(!hpPower){
            System.out.println("Belum juga dinyalain pea");
            
        }else{
            phone.turnOff();
        }        
    }
    
    void naikanVolume(){
        
        if(hpPower){
            phone.volumeUp();
        }else{
            System.out.println("Nyalakan dulu dongs");
        }
    }
    
    void turunkanVolume(){
        
        if(hpPower){
            phone.volumDown();
        }else{
            System.out.println("Hp belum dinyalakan");
        }
    }
    
}
