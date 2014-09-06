package Modulo1.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //para utilizar reflexão com annotations sempre se lembre de definir esta annotation
@Target(ElementType.METHOD)
public @interface Init {
	
	boolean runOnInstantiation() default true;

}
