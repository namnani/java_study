package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Maker {

    int num() default 1;
    String name();
    String date() default "2016-03-10";
}
