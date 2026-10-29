package e7;

import c7.a0;
import c7.f0;
import e6.s;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import q6.p;
import x6.k0;

/* compiled from: MyApplication */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: q, reason: collision with root package name */
    public final int f23257q;

    /* renamed from: r, reason: collision with root package name */
    public final int f23258r;

    /* renamed from: s, reason: collision with root package name */
    public final long f23259s;

    /* renamed from: t, reason: collision with root package name */
    public final String f23260t;

    /* renamed from: u, reason: collision with root package name */
    public final e7.d f23261u;

    /* renamed from: v, reason: collision with root package name */
    public final e7.d f23262v;

    /* renamed from: w, reason: collision with root package name */
    public final a0 f23263w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0086a f23254x = new C0086a(null);

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f23255y = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f23256z = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");
    public static final f0 B = new f0("NOT_IN_STACK");

    /* compiled from: MyApplication */
    /* renamed from: e7.a$a, reason: collision with other inner class name */
    public static final class C0086a {
        public /* synthetic */ C0086a(q6.e eVar) {
            this();
        }

        private C0086a() {
        }
    }

    /* compiled from: MyApplication */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23264a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f23276s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f23275r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f23274q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f23277t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f23278u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f23264a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MyApplication */
    public static final class d {

        /* renamed from: q, reason: collision with root package name */
        public static final d f23274q = new d("CPU_ACQUIRED", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final d f23275r = new d("BLOCKING", 1);

        /* renamed from: s, reason: collision with root package name */
        public static final d f23276s = new d("PARKING", 2);

        /* renamed from: t, reason: collision with root package name */
        public static final d f23277t = new d("DORMANT", 3);

        /* renamed from: u, reason: collision with root package name */
        public static final d f23278u = new d("TERMINATED", 4);

        /* renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ d[] f23279v;

        /* renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ j6.a f23280w;

        static {
            d[] c8 = c();
            f23279v = c8;
            f23280w = j6.b.a(c8);
        }

        private d(String str, int i7) {
        }

        private static final /* synthetic */ d[] c() {
            return new d[]{f23274q, f23275r, f23276s, f23277t, f23278u};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f23279v.clone();
        }
    }

    public a(int i7, int i8, long j7, String str) {
        this.f23257q = i7;
        this.f23258r = i8;
        this.f23259s = j7;
        this.f23260t = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i7 + " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should be greater than or equals to core pool size " + i7).toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
        }
        this.f23261u = new e7.d();
        this.f23262v = new e7.d();
        this.f23263w = new a0((i7 + 1) * 2);
        this.controlState$volatile = i7 << 42;
        this._isTerminated$volatile = 0;
    }

    private final h B(c cVar, h hVar, boolean z7) {
        if (cVar == null || cVar.f23268s == d.f23278u) {
            return hVar;
        }
        if (hVar.f23291r.b() == 0 && cVar.f23268s == d.f23275r) {
            return hVar;
        }
        cVar.f23272w = true;
        return cVar.f23266q.a(hVar, z7);
    }

    private final boolean F(long j7) {
        if (t6.d.a(((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21)), 0) < this.f23257q) {
            int g8 = g();
            if (g8 == 1 && this.f23257q > 1) {
                g();
            }
            if (g8 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean G(a aVar, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = f23256z.get(aVar);
        }
        return aVar.F(j7);
    }

    private final boolean H() {
        c q7;
        do {
            q7 = q();
            if (q7 == null) {
                return false;
            }
        } while (!c.f23265y.compareAndSet(q7, -1, 0));
        LockSupport.unpark(q7);
        return true;
    }

    private final boolean e(h hVar) {
        return hVar.f23291r.b() == 1 ? this.f23262v.a(hVar) : this.f23261u.a(hVar);
    }

    private final int g() {
        synchronized (this.f23263w) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j7 = f23256z.get(this);
                int i7 = (int) (j7 & 2097151);
                int a8 = t6.d.a(i7 - ((int) ((j7 & 4398044413952L) >> 21)), 0);
                if (a8 >= this.f23257q) {
                    return 0;
                }
                if (i7 >= this.f23258r) {
                    return 0;
                }
                int i8 = ((int) (m().get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f23263w.b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i8);
                this.f23263w.c(i8, cVar);
                if (i8 != ((int) (2097151 & f23256z.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i9 = a8 + 1;
                cVar.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c j() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !q6.i.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void l(a aVar, Runnable runnable, i iVar, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            iVar = l.f23300g;
        }
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        aVar.k(runnable, iVar, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater m() {
        return f23256z;
    }

    private final int p(c cVar) {
        Object i7 = cVar.i();
        while (i7 != B) {
            if (i7 == null) {
                return 0;
            }
            c cVar2 = (c) i7;
            int h8 = cVar2.h();
            if (h8 != 0) {
                return h8;
            }
            i7 = cVar2.i();
        }
        return -1;
    }

    private final c q() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23255y;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f23263w.b((int) (2097151 & j7));
            if (cVar == null) {
                return null;
            }
            long j8 = (2097152 + j7) & (-2097152);
            int p7 = p(cVar);
            if (p7 >= 0 && f23255y.compareAndSet(this, j7, p7 | j8)) {
                cVar.r(B);
                return cVar;
            }
        }
    }

    private final void w(long j7, boolean z7) {
        if (z7 || H() || F(j7)) {
            return;
        }
        H();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        u(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        l(this, runnable, null, false, 6, null);
    }

    public final h h(Runnable runnable, i iVar) {
        long a8 = l.f23299f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a8, iVar);
        }
        h hVar = (h) runnable;
        hVar.f23290q = a8;
        hVar.f23291r = iVar;
        return hVar;
    }

    public final boolean isTerminated() {
        return A.get(this) != 0;
    }

    public final void k(Runnable runnable, i iVar, boolean z7) {
        x6.c.a();
        h h8 = h(runnable, iVar);
        boolean z8 = false;
        boolean z9 = h8.f23291r.b() == 1;
        long addAndGet = z9 ? f23256z.addAndGet(this, 2097152L) : 0L;
        c j7 = j();
        h B2 = B(j7, h8, z7);
        if (B2 != null && !e(B2)) {
            throw new RejectedExecutionException(this.f23260t + " was terminated");
        }
        if (z7 && j7 != null) {
            z8 = true;
        }
        if (z9) {
            w(addAndGet, z8);
        } else {
            if (z8) {
                return;
            }
            z();
        }
    }

    public final boolean r(c cVar) {
        long j7;
        int h8;
        if (cVar.i() != B) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23255y;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            h8 = cVar.h();
            cVar.r(this.f23263w.b((int) (2097151 & j7)));
        } while (!f23255y.compareAndSet(this, j7, ((2097152 + j7) & (-2097152)) | h8));
        return true;
    }

    public final void s(c cVar, int i7, int i8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23255y;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            int i9 = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (i9 == i7) {
                i9 = i8 == 0 ? p(cVar) : i8;
            }
            if (i9 >= 0) {
                if (f23255y.compareAndSet(this, j7, j8 | i9)) {
                    return;
                }
            }
        }
    }

    public final void t(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            } finally {
                x6.c.a();
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a8 = this.f23263w.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < a8; i12++) {
            c cVar = (c) this.f23263w.b(i12);
            if (cVar != null) {
                int i13 = cVar.f23266q.i();
                int i14 = b.f23264a[cVar.f23268s.ordinal()];
                if (i14 == 1) {
                    i9++;
                } else if (i14 == 2) {
                    i8++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i13);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i14 == 3) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i14 == 4) {
                    i10++;
                    if (i13 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i13);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i14 == 5) {
                    i11++;
                }
            }
        }
        long j7 = f23256z.get(this);
        return this.f23260t + '@' + k0.b(this) + "[Pool Size {core = " + this.f23257q + ", max = " + this.f23258r + "}, Worker States {CPU = " + i7 + ", blocking = " + i8 + ", parked = " + i9 + ", dormant = " + i10 + ", terminated = " + i11 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f23261u.c() + ", global blocking queue size = " + this.f23262v.c() + ", Control State {created workers= " + ((int) (2097151 & j7)) + ", blocking tasks = " + ((int) ((4398044413952L & j7) >> 21)) + ", CPUs acquired = " + (this.f23257q - ((int) ((9223367638808264704L & j7) >> 42))) + "}]";
    }

    public final void u(long j7) {
        int i7;
        h hVar;
        if (A.compareAndSet(this, 0, 1)) {
            c j8 = j();
            synchronized (this.f23263w) {
                i7 = (int) (m().get(this) & 2097151);
            }
            if (1 <= i7) {
                int i8 = 1;
                while (true) {
                    Object b8 = this.f23263w.b(i8);
                    q6.i.b(b8);
                    c cVar = (c) b8;
                    if (cVar != j8) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j7);
                        }
                        cVar.f23266q.j(this.f23262v);
                    }
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f23262v.b();
            this.f23261u.b();
            while (true) {
                if (j8 != null) {
                    hVar = j8.g(true);
                    if (hVar != null) {
                        continue;
                        t(hVar);
                    }
                }
                hVar = (h) this.f23261u.e();
                if (hVar == null && (hVar = (h) this.f23262v.e()) == null) {
                    break;
                }
                t(hVar);
            }
            if (j8 != null) {
                j8.u(d.f23278u);
            }
            f23255y.set(this, 0L);
            f23256z.set(this, 0L);
        }
    }

    public final void z() {
        if (H() || G(this, 0L, 1, null)) {
            return;
        }
        H();
    }

    /* compiled from: MyApplication */
    public final class c extends Thread {

        /* renamed from: y, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f23265y = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: q, reason: collision with root package name */
        public final n f23266q;

        /* renamed from: r, reason: collision with root package name */
        private final p f23267r;

        /* renamed from: s, reason: collision with root package name */
        public d f23268s;

        /* renamed from: t, reason: collision with root package name */
        private long f23269t;

        /* renamed from: u, reason: collision with root package name */
        private long f23270u;

        /* renamed from: v, reason: collision with root package name */
        private int f23271v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f23272w;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f23266q = new n();
            this.f23267r = new p();
            this.f23268s = d.f23277t;
            this.nextParkedWorker = a.B;
            this.f23271v = r6.c.f25901q.b();
        }

        private final void b(int i7) {
            if (i7 == 0) {
                return;
            }
            a.m().addAndGet(a.this, -2097152L);
            if (this.f23268s != d.f23278u) {
                this.f23268s = d.f23277t;
            }
        }

        private final void c(int i7) {
            if (i7 != 0 && u(d.f23275r)) {
                a.this.z();
            }
        }

        private final void d(h hVar) {
            int b8 = hVar.f23291r.b();
            k(b8);
            c(b8);
            a.this.t(hVar);
            b(b8);
        }

        private final h e(boolean z7) {
            h o7;
            h o8;
            if (z7) {
                boolean z8 = m(a.this.f23257q * 2) == 0;
                if (z8 && (o8 = o()) != null) {
                    return o8;
                }
                h k7 = this.f23266q.k();
                if (k7 != null) {
                    return k7;
                }
                if (!z8 && (o7 = o()) != null) {
                    return o7;
                }
            } else {
                h o9 = o();
                if (o9 != null) {
                    return o9;
                }
            }
            return v(3);
        }

        private final h f() {
            h l7 = this.f23266q.l();
            if (l7 != null) {
                return l7;
            }
            h hVar = (h) a.this.f23262v.e();
            return hVar == null ? v(1) : hVar;
        }

        private final void k(int i7) {
            this.f23269t = 0L;
            if (this.f23268s == d.f23276s) {
                this.f23268s = d.f23275r;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.B;
        }

        private final void n() {
            if (this.f23269t == 0) {
                this.f23269t = System.nanoTime() + a.this.f23259s;
            }
            LockSupport.parkNanos(a.this.f23259s);
            if (System.nanoTime() - this.f23269t >= 0) {
                this.f23269t = 0L;
                w();
            }
        }

        private final h o() {
            if (m(2) == 0) {
                h hVar = (h) a.this.f23261u.e();
                return hVar != null ? hVar : (h) a.this.f23262v.e();
            }
            h hVar2 = (h) a.this.f23262v.e();
            return hVar2 != null ? hVar2 : (h) a.this.f23261u.e();
        }

        private final void p() {
            loop0: while (true) {
                boolean z7 = false;
                while (!a.this.isTerminated() && this.f23268s != d.f23278u) {
                    h g8 = g(this.f23272w);
                    if (g8 != null) {
                        this.f23270u = 0L;
                        d(g8);
                    } else {
                        this.f23272w = false;
                        if (this.f23270u == 0) {
                            t();
                        } else if (z7) {
                            u(d.f23276s);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f23270u);
                            this.f23270u = 0L;
                        } else {
                            z7 = true;
                        }
                    }
                }
            }
            u(d.f23278u);
        }

        private final boolean s() {
            long j7;
            if (this.f23268s == d.f23274q) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater m7 = a.m();
            do {
                j7 = m7.get(aVar);
                if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                    return false;
                }
            } while (!a.m().compareAndSet(aVar, j7, j7 - 4398046511104L));
            this.f23268s = d.f23274q;
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.r(this);
                return;
            }
            f23265y.set(this, -1);
            while (l() && f23265y.get(this) == -1 && !a.this.isTerminated() && this.f23268s != d.f23278u) {
                u(d.f23276s);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i7) {
            int i8 = (int) (a.m().get(a.this) & 2097151);
            if (i8 < 2) {
                return null;
            }
            int m7 = m(i8);
            a aVar = a.this;
            long j7 = Long.MAX_VALUE;
            for (int i9 = 0; i9 < i8; i9++) {
                m7++;
                if (m7 > i8) {
                    m7 = 1;
                }
                c cVar = (c) aVar.f23263w.b(m7);
                if (cVar != null && cVar != this) {
                    long r7 = cVar.f23266q.r(i7, this.f23267r);
                    if (r7 == -1) {
                        p pVar = this.f23267r;
                        h hVar = (h) pVar.f25710q;
                        pVar.f25710q = null;
                        return hVar;
                    }
                    if (r7 > 0) {
                        j7 = Math.min(j7, r7);
                    }
                }
            }
            if (j7 == Long.MAX_VALUE) {
                j7 = 0;
            }
            this.f23270u = j7;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f23263w) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.m().get(aVar) & 2097151)) <= aVar.f23257q) {
                        return;
                    }
                    if (f23265y.compareAndSet(this, -1, 1)) {
                        int i7 = this.indexInArray;
                        q(0);
                        aVar.s(this, i7, 0);
                        int andDecrement = (int) (2097151 & a.m().getAndDecrement(aVar));
                        if (andDecrement != i7) {
                            Object b8 = aVar.f23263w.b(andDecrement);
                            q6.i.b(b8);
                            c cVar = (c) b8;
                            aVar.f23263w.c(i7, cVar);
                            cVar.q(i7);
                            aVar.s(cVar, andDecrement, i7);
                        }
                        aVar.f23263w.c(andDecrement, null);
                        s sVar = s.f23253a;
                        this.f23268s = d.f23278u;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h g(boolean z7) {
            return s() ? e(z7) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i7) {
            int i8 = this.f23271v;
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >> 17);
            int i11 = i10 ^ (i10 << 5);
            this.f23271v = i11;
            int i12 = i7 - 1;
            return (i12 & i7) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i7;
        }

        public final void q(int i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f23260t);
            sb.append("-worker-");
            sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
            setName(sb.toString());
            this.indexInArray = i7;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f23268s;
            boolean z7 = dVar2 == d.f23274q;
            if (z7) {
                a.m().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f23268s = dVar;
            }
            return z7;
        }

        public c(a aVar, int i7) {
            this();
            q(i7);
        }
    }
}
