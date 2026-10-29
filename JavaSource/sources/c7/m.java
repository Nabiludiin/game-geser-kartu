package c7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x6.p0;

/* compiled from: MyApplication */
public final class m extends x6.d0 implements p0 {

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3798x = AtomicIntegerFieldUpdater.newUpdater(m.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: s, reason: collision with root package name */
    private final x6.d0 f3799s;

    /* renamed from: t, reason: collision with root package name */
    private final int f3800t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ p0 f3801u;

    /* renamed from: v, reason: collision with root package name */
    private final r f3802v;

    /* renamed from: w, reason: collision with root package name */
    private final Object f3803w;

    /* compiled from: MyApplication */
    private final class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private Runnable f3804q;

        public a(Runnable runnable) {
            this.f3804q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7 = 0;
            while (true) {
                try {
                    this.f3804q.run();
                } catch (Throwable th) {
                    x6.f0.a(g6.j.f24049q, th);
                }
                Runnable R = m.this.R();
                if (R == null) {
                    return;
                }
                this.f3804q = R;
                i7++;
                if (i7 >= 16 && m.this.f3799s.I(m.this)) {
                    m.this.f3799s.h(m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(x6.d0 d0Var, int i7) {
        this.f3799s = d0Var;
        this.f3800t = i7;
        p0 p0Var = d0Var instanceof p0 ? (p0) d0Var : null;
        this.f3801u = p0Var == null ? x6.m0.a() : p0Var;
        this.f3802v = new r(false);
        this.f3803w = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable R() {
        while (true) {
            Runnable runnable = (Runnable) this.f3802v.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3803w) {
                f3798x.decrementAndGet(this);
                if (this.f3802v.c() == 0) {
                    return null;
                }
                f3798x.incrementAndGet(this);
            }
        }
    }

    private final boolean S() {
        synchronized (this.f3803w) {
            if (f3798x.get(this) >= this.f3800t) {
                return false;
            }
            f3798x.incrementAndGet(this);
            return true;
        }
    }

    @Override // x6.d0
    public void h(g6.i iVar, Runnable runnable) {
        Runnable R;
        this.f3802v.a(runnable);
        if (f3798x.get(this) >= this.f3800t || !S() || (R = R()) == null) {
            return;
        }
        this.f3799s.h(this, new a(R));
    }
}
