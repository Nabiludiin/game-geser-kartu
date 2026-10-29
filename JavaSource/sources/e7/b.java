package e7;

import c7.g0;
import c7.i0;
import java.util.concurrent.Executor;
import x6.d0;
import x6.d1;

/* compiled from: MyApplication */
public final class b extends d1 implements Executor {

    /* renamed from: t, reason: collision with root package name */
    public static final b f23281t = new b();

    /* renamed from: u, reason: collision with root package name */
    private static final d0 f23282u;

    static {
        int e8;
        m mVar = m.f23302s;
        e8 = i0.e("kotlinx.coroutines.io.parallelism", t6.d.a(64, g0.a()), 0, 0, 12, null);
        f23282u = mVar.L(e8);
    }

    private b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        h(g6.j.f24049q, runnable);
    }

    @Override // x6.d0
    public void h(g6.i iVar, Runnable runnable) {
        f23282u.h(iVar, runnable);
    }

    @Override // x6.d0
    public String toString() {
        return "Dispatchers.IO";
    }
}
