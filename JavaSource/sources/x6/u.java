package x6;

/* compiled from: MyApplication */
public abstract class u {
    public static final s a(m1 m1Var) {
        return new t(m1Var);
    }

    public static /* synthetic */ s b(m1 m1Var, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            m1Var = null;
        }
        return a(m1Var);
    }

    public static final boolean c(s sVar, Object obj) {
        Throwable b8 = e6.m.b(obj);
        return b8 == null ? sVar.u(obj) : sVar.t(b8);
    }
}
