package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
class l implements Executor {

    /* renamed from: q, reason: collision with root package name */
    private final Executor f2815q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayDeque f2816r = new ArrayDeque();

    /* renamed from: s, reason: collision with root package name */
    private Runnable f2817s;

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Runnable f2818q;

        a(Runnable runnable) {
            this.f2818q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2818q.run();
            } finally {
                l.this.b();
            }
        }
    }

    l(Executor executor) {
        this.f2815q = executor;
    }

    synchronized void b() {
        Runnable runnable = (Runnable) this.f2816r.poll();
        this.f2817s = runnable;
        if (runnable != null) {
            this.f2815q.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f2816r.offer(new a(runnable));
        if (this.f2817s == null) {
            b();
        }
    }
}
