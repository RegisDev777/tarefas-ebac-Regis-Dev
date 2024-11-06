package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})


public @interface ExemploAnotacao {
   
	   String value();
	  
	   String[] bairros();
	   
	   long numeroCasa();
	   
	   double valores() default 10d;
}
