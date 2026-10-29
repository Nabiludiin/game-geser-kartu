package x5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: MyApplication */
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
    String[] alternate() default {};

    String value();
}
