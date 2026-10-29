package e6;

import e6.m;

/* compiled from: MyApplication */
public abstract class n {
    public static final Object a(Throwable th) {
        q6.i.e(th, "exception");
        return new m.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof m.b) {
            throw ((m.b) obj).f23248q;
        }
    }
}
