package m;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public class a extends d {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f24665c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f24666d = new ExecutorC0111a();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f24667e = new b();

    /* renamed from: a, reason: collision with root package name */
    private d f24668a;

    /* renamed from: b, reason: collision with root package name */
    private d f24669b;

    /* compiled from: MyApplication */
    /* renamed from: m.a$a, reason: collision with other inner class name */
    static class ExecutorC0111a implements Executor {
        ExecutorC0111a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().c(runnable);
        }
    }

    /* compiled from: MyApplication */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().a(runnable);
        }
    }

    private a() {
        c cVar = new c();
        this.f24669b = cVar;
        this.f24668a = cVar;
    }

    public static Executor d() {
        return f24667e;
    }

    public static a e() {
        if (f24665c != null) {
            return f24665c;
        }
        synchronized (a.class) {
            try {
                if (f24665c == null) {
                    f24665c = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24665c;
    }

    @Override // m.d
    public void a(Runnable runnable) {
        this.f24668a.a(runnable);
    }

    @Override // m.d
    public boolean b() {
        return this.f24668a.b();
    }

    @Override // m.d
    public void c(Runnable runnable) {
        this.f24668a.c(runnable);
    }
}
