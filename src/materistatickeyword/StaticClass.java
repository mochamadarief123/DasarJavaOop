package materistatickeyword;


//static class hanya bisa diterapkan di inner class

//outer class
public class StaticClass {
    private String nameOuterClass;

    //setter dan getter
    public String getNameOuterClass() {
        return nameOuterClass;
    }

    public void setNameOuterClass(String nameOuterClass) {
        this.nameOuterClass = nameOuterClass;
    }
    
    //inner class
    //jika inner class di set static, maka si innerclass tdak dapat mengakses field outernya lagi
    public static class innerClass {
        private String nameInnerClass;

            //setter dan getter
            public String getNameInnerClass() {
                return nameInnerClass;
            }

            public void setNameInnerClass(String nameInnerClass) {
                this.nameInnerClass = nameInnerClass;
            }
    
    
    }
    
}
