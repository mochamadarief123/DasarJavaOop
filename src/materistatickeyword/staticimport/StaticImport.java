package materistatickeyword.staticimport;


//ini yg dinamakan static import
import static materistatickeyword.StaticVariable.*;
import static materistatickeyword.StaticMethod.*;
//atau bisa satu per satu spt ini
import static materistatickeyword.StaticBlock.PROCESOR;
import static materistatickeyword.StaticClass.innerClass;




public class StaticImport {
    public static void main(String[] args) {
        
        //mengakses static variable menggunakan static import
        System.out.println(COURSE);
        System.out.println(EPISODE);
        
        //mengakses static method
        System.out.println(sum(1,1,1,1,1));
        
        //mengakses static inner class menggunakan static import
        innerClass innerclass = new innerClass();
        innerclass.setNameInnerClass("inner class");
        
        System.out.println(innerclass.getNameInnerClass());
        
        //mengakses static blok dengan static import
        System.out.println(PROCESOR);
    }
}
