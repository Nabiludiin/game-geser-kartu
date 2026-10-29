package x6;

/* compiled from: MyApplication */
public abstract class f0 {
    public static final void a(g6.i iVar, Throwable th) {
        try {
            e0 e0Var = (e0) iVar.e(e0.f27380o);
            if (e0Var != null) {
                e0Var.w(iVar, th);
            } else {
                c7.h.a(iVar, th);
            }
        } catch (Throwable th2) {
            c7.h.a(iVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        e6.a.a(runtimeException, th);
        return runtimeException;
    }
}
