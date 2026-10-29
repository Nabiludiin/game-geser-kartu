package c7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3817e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3818f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f3819g = AtomicLongFieldUpdater.newUpdater(s.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final f0 f3820h = new f0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f3821a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3822b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3823c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f3824d;

    /* compiled from: MyApplication */
    public static final class a {
        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        public final int a(long j7) {
            return (j7 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j7, int i7) {
            return d(j7, 1073741823L) | i7;
        }

        public final long c(long j7, int i7) {
            return d(j7, 1152921503533105152L) | (i7 << 30);
        }

        public final long d(long j7, long j8) {
            return j7 & (~j8);
        }

        private a() {
        }
    }

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3825a;

        public b(int i7) {
            this.f3825a = i7;
        }
    }

    public s(int i7, boolean z7) {
        this.f3821a = i7;
        this.f3822b = z7;
        int i8 = i7 - 1;
        this.f3823c = i8;
        this.f3824d = new AtomicReferenceArray(i7);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final s b(long j7) {
        s sVar = new s(this.f3821a * 2, this.f3822b);
        int i7 = (int) (1073741823 & j7);
        int i8 = (int) ((1152921503533105152L & j7) >> 30);
        while (true) {
            int i9 = this.f3823c;
            if ((i7 & i9) == (i9 & i8)) {
                f3819g.set(sVar, f3817e.d(j7, 1152921504606846976L));
                return sVar;
            }
            Object obj = f().get(this.f3823c & i7);
            if (obj == null) {
                obj = new b(i7);
            }
            sVar.f().set(sVar.f3823c & i7, obj);
            i7++;
        }
    }

    private final s c(long j7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3818f;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar != null) {
                return sVar;
            }
            androidx.concurrent.futures.b.a(f3818f, this, null, b(j7));
        }
    }

    private final s e(int i7, Object obj) {
        Object obj2 = f().get(this.f3823c & i7);
        if (!(obj2 instanceof b) || ((b) obj2).f3825a != i7) {
            return null;
        }
        f().set(i7 & this.f3823c, obj);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f3824d;
    }

    private final long k() {
        long j7;
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3819g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                return j7;
            }
            j8 = 1152921504606846976L | j7;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j8));
        return j8;
    }

    private final s n(int i7, int i8) {
        long j7;
        int i9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3819g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            i9 = (int) (1073741823 & j7);
            if ((1152921504606846976L & j7) != 0) {
                return l();
            }
        } while (!f3819g.compareAndSet(this, j7, f3817e.b(j7, i8)));
        f().set(this.f3823c & i9, null);
        return null;
    }

    public final int a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3819g;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j7) != 0) {
                return f3817e.a(j7);
            }
            int i7 = (int) (1073741823 & j7);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            int i9 = this.f3823c;
            if (((i8 + 2) & i9) == (i7 & i9)) {
                return 1;
            }
            if (!this.f3822b && f().get(i8 & i9) != null) {
                int i10 = this.f3821a;
                if (i10 < 1024 || ((i8 - i7) & 1073741823) > (i10 >> 1)) {
                    break;
                }
            } else if (f3819g.compareAndSet(this, j7, f3817e.c(j7, (i8 + 1) & 1073741823))) {
                f().set(i8 & i9, obj);
                s sVar = this;
                while ((f3819g.get(sVar) & 1152921504606846976L) != 0 && (sVar = sVar.l().e(i8, obj)) != null) {
                }
                return 0;
            }
        }
        return 1;
    }

    public final boolean d() {
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3819g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, 2305843009213693952L | j7));
        return true;
    }

    public final int g() {
        long j7 = f3819g.get(this);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    public final boolean j() {
        long j7 = f3819g.get(this);
        return ((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30));
    }

    public final s l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3819g;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j7) != 0) {
                return f3820h;
            }
            int i7 = (int) (1073741823 & j7);
            int i8 = this.f3823c;
            if ((((int) ((1152921503533105152L & j7) >> 30)) & i8) == (i8 & i7)) {
                return null;
            }
            Object obj = f().get(this.f3823c & i7);
            if (obj == null) {
                if (this.f3822b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i9 = (i7 + 1) & 1073741823;
                if (f3819g.compareAndSet(this, j7, f3817e.b(j7, i9))) {
                    f().set(this.f3823c & i7, null);
                    return obj;
                }
                if (this.f3822b) {
                    s sVar = this;
                    do {
                        sVar = sVar.n(i7, i9);
                    } while (sVar != null);
                    return obj;
                }
            }
        }
    }
}
