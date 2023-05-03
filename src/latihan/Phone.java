package latihan;

public interface Phone {
    //constant
    int VOLUME_MAX = 100;
    int VOLUME_MIN = 0;
    
    //abstarct method
    void turnOn();
    void turnOff();
    void volumeUp();
    void volumDown();
}
