package c7;

/* compiled from: MyApplication */
public abstract class n {
    public static final void a(int i7) {
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i7).toString());
    }
}
