package latihan;

public class Xiomi implements Phone{

    int defaultVolume = 50;
    int volumeStatus;
    
    
    
    @Override
    public void turnOn() {
        System.out.println("WELCOME");
        System.out.println("-xiomi-");
        System.out.println("Status volume: " + getDefaultVolume());
    }

    @Override
    public void turnOff() {
        System.out.println("GOOD BY");
    }

    @Override
    public void volumeUp() {
        if(defaultVolume == VOLUME_MAX ){
            System.out.println("Volume MAX!");
        }else{
            volumeStatus = defaultVolume += 10;
            System.out.println("Status volume: " + volumeStatus);        
        }    
    }

    @Override
    public void volumDown() {
        
        if(defaultVolume == VOLUME_MIN ){
                System.out.println("Volume SILENT!");
            }else{
                volumeStatus = defaultVolume -= 10;
                System.out.println("Status volume: " + volumeStatus);        
        }
    }
    
    int getDefaultVolume(){
        return defaultVolume;
    }
    
}
