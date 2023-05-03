package reflection;

import java.lang.reflect.Field;


public class ValidationLoginRequest{

    
    
    //methode
    public static void validate(Object object){
        //mendapatkan objek
        Class aClass = object.getClass();
        //mendapatkan field
        Field [] fields = aClass.getDeclaredFields();
        
        //cek field yg ada notblank
        for(Field field : fields){
            //paksa akses field
            field.setAccessible(true);
            
            //baca field yg ada annotation nya
            if(field.getAnnotation(NotBlank.class) != null ){
                try {
                    String value = (String) field.get(object);
                    
                    if (value == null || value.isEmpty()){
                      throw new BlankException("field " + field.getName() + " is blank");
                    }
                    
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field : " + exception);
                }
                
            }
            
        }
        
    }
    
    
}
