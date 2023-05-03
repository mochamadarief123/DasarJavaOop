package materistatickeyword;

public class StaticApp {
    public static void main(String[] args) {
        
        /*
        intinya, variable, method, class, atau blok yg sifatnya static itu bisa langsung diakses tanpa harus membuat objek class nya 
        */
        
        //cara akses variable static 
        System.out.println(StaticVariable.COURSE);
        System.out.println(StaticVariable.EPISODE);
        
        //cara akses method static
        System.out.println(StaticMethod.sum(5,5,5,5));
        
        //cara akses static inner class
        StaticClass.innerClass innerclass = new StaticClass.innerClass();
        innerclass.setNameInnerClass("ini inner class");
        
        System.out.println(innerclass.getNameInnerClass());
        
        //cara akses static blok
        System.out.println(StaticBlock.PROCESOR);
    }
}
