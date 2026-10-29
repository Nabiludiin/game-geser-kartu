package y6;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import e6.m;
import e6.n;
import q6.i;

/* compiled from: MyApplication */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f27811a;
    private static volatile Choreographer choreographer;

    static {
        Object a8;
        try {
            m.a aVar = m.f23247q;
            a8 = m.a(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            m.a aVar2 = m.f23247q;
            a8 = m.a(n.a(th));
        }
        f27811a = (d) (m.c(a8) ? null : a8);
    }

    public static final Handler a(Looper looper, boolean z7) {
        if (!z7) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        i.c(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
