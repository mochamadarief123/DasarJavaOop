package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE}) //lokasi tempat dimana annotation boleh dipakai
@Retention(RetentionPolicy.RUNTIME)
public @interface ContohAnnotation {
    
    //attribute didalam annotation
    String name();
    
    String [] tags() default {};
    
}
