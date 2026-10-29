package n1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public class k implements Executor {

    /* renamed from: r, reason: collision with root package name */
    private final Executor f24944r;

    /* renamed from: t, reason: collision with root package name */
    private volatile Runnable f24946t;

    /* renamed from: q, reason: collision with root package name */
    private final ArrayDeque f24943q = new ArrayDeque();

    /* renamed from: s, reason: collision with root package name */
    private final Object f24945s = new Object();

    /* compiled from: MyApplication */
    static class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final k f24947q;

        /* renamed from: r, reason: collision with root package name */
        final Runnable f24948r;

        a(k kVar, Runnable runnable) {
            this.f24947q = kVar;
            this.f24948r = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f24948r.run();
            } finally {
                this.f24947q.c();
            }
        }
    }

    public k(Executor executor) {
        this.f24944r = executor;
    }

    public boolean b() {
        boolean z7;
        synchronized (this.f24945s) {
            z7 = !this.f24943q.isEmpty();
        }
        return z7;
    }

    void c() {
        synchronized (this.f24945s) {
            try {
                Runnable runnable = (Runnable) this.f24943q.poll();
                this.f24946t = runnable;
                if (runnable != null) {
                    this.f24944r.execute(this.f24946t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f24945s) {
            try {
                this.f24943q.add(new a(this, runnable));
                if (this.f24946t == null) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
