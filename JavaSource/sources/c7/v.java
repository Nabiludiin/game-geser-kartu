package c7;

import java.util.List;
import x6.x1;

/* compiled from: MyApplication */
public abstract class v {
    private static final w a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new e6.d();
    }

    static /* synthetic */ w b(Throwable th, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(x1 x1Var) {
        return x1Var.M() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final x1 e(t tVar, List list) {
        try {
            return tVar.b(list);
        } catch (Throwable th) {
            return a(th, tVar.a());
        }
    }
}
