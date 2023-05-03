package materiinterfaceinheritance;


public class Mitsubitshi implements Cars, Drive{

    @Override
    public void name() {
        System.out.println("X-pander");
    }

    @Override
    public void color() {
        System.out.println("Black");
    }

    @Override
    public void isBrand() {
        System.out.println("Mitsubitshi");
    }
    
    //disini kita tidak mengoverride method yg ada di interface Drive
    
}
