package materiinterfaceinheritance;
/*
di inheritance class, turunan class hanya bisa memiliki satu parrent class
di interface, turunan class bisa memiliki lebih dari satu interface
*/

//class Toyota ini akan mewarisi interface Cars dan interface Drive
//karena implements dgn 2 interface, maka wajib meng-override semua method masing-masing interface tsb
public class Toyota implements Cars, Drive{

    @Override
    public void name() {
        System.out.println("Yaris");
    }

    @Override
    public void color() {
        System.out.println("Red");
    }

    @Override
    public void isBrand() {
        System.out.println("Toyota");
    }

    //walaupun class Toyota ini adalah implements dari interface Drive
    //dan didalam interface Drive itu memiliki default method, maka disini tidak wajib mengoverride nya
    //jika method itu dibutuhkan, maka boleh kita override
    @Override
    public void isReady() {
        System.out.println("Ready for ride. Lets go!");
    }
    
    
}
