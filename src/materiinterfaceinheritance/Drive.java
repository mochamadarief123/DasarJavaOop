package materiinterfaceinheritance;

public interface Drive {
    
    //default method di interface harus memiliki body spt method biasanya
    //nantinya default method ini boleh di override atau ngga sama sekali
    //jika tidak di override maka defaulnya yaa yg ada di dalam scope blok default method ini yg akan dijalankan
    default void isReady(){
        System.out.println("Not ready. Machine in maintenace");
    };
}
