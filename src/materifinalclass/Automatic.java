package materifinalclass;

final class Automatic extends Motor{
    //properti
    private String type;

    //constructor
    public Automatic(String brand) {
        //akses properti parrent class
        super(brand);
    }
    
    //setter dan getter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    } 
    
}
