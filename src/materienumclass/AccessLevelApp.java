package materienumclass;

public class AccessLevelApp {
    public static void main(String[] args) {
        
        Users admin = new Users();
        admin.setNameUser("dodo");
        admin.setAcceslevel(AccessLevel.ADMIN);
        
        System.out.println(admin.getNameUser());
        System.out.println(admin.getAcceslevel().getDescription());
        admin.sayHello();
        
        
        Users owner = new Users();
        owner.setNameUser("soleh");
        owner.setAcceslevel(AccessLevel.OWNER);
        
        System.out.println(owner.getNameUser());
        System.out.println(owner.getAcceslevel().getDescription());
        owner.sayHello();
        
        Users customer = new Users();
        customer.setNameUser("eri");
        customer.setAcceslevel(AccessLevel.CUSTOMER);
        
        System.out.println(customer.getNameUser());
        System.out.println(customer.getAcceslevel().getDescription());
        customer.sayHello();
        
        System.out.println("----------------------");
        
        //cara mengambil nama enumnya
        String levelName = AccessLevel.ADMIN.name();
        System.out.println(levelName);
        
        //konversi string ke enum
        AccessLevel accesslevel = AccessLevel.valueOf("CUSTOMER");
        System.out.println(accesslevel);
        
        //get semua enum
        for(AccessLevel level : AccessLevel.values()){
            System.out.println(level);
        }
        
    }
}
