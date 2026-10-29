package l5;

/* compiled from: MyApplication */
public @interface d {

    /* compiled from: MyApplication */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
