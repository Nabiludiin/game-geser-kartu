package x6;

/* compiled from: MyApplication */
public abstract class x1 extends d0 {
    public abstract x1 M();

    protected final String O() {
        x1 x1Var;
        x1 c8 = t0.c();
        if (this == c8) {
            return "Dispatchers.Main";
        }
        try {
            x1Var = c8.M();
        } catch (UnsupportedOperationException unused) {
            x1Var = null;
        }
        if (this == x1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
