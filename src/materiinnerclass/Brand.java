package materiinnerclass;

/*
dijava sebuah class boleh memiliki class didalamnya, ini disebut innerclass
innerclass ditempatkan didalam scope outerclass
keuntungannya, yg menjadi inner class dapat mengakses langsung properti atau method yg dimiliki outerclass walaupun akses modifiernya private
*/

//outerclass
public class Brand {
    //properti outerclass
    private String brandName;
    
    

    //setter dan getter
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    
    //innerclass
    public class Produk {
        //properti innerclass
        private String name;
        private int price;
        
        //method innerclass
        public String getBrand() {
            //cara akses properti yg ada di outer class
            return Brand.this.brandName;
        }
        
        //setter dan getter innerclass
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
        
    }
    
}
