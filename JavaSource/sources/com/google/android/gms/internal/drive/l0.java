package com.google.android.gms.internal.drive;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class l0 extends com.google.android.gms.internal.drive.c {
    private static Map<Object, l0> zzrs = new ConcurrentHashMap();
    protected m2 zzrq = m2.h();
    private int zzrr = -1;

    public static abstract class a extends d {

        /* renamed from: q, reason: collision with root package name */
        private final l0 f20637q;

        /* renamed from: r, reason: collision with root package name */
        protected l0 f20638r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f20639s = false;

        protected a(l0 l0Var) {
            this.f20637q = l0Var;
            this.f20638r = (l0) l0Var.i(c.f20644d, null, null);
        }

        private static void l(l0 l0Var, l0 l0Var2) {
            s1.a().c(l0Var).c(l0Var, l0Var2);
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) this.f20637q.i(c.f20645e, null, null);
            aVar.i((l0) t());
            return aVar;
        }

        @Override // com.google.android.gms.internal.drive.k1
        public final /* synthetic */ i1 d() {
            return this.f20637q;
        }

        @Override // com.google.android.gms.internal.drive.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public final a i(l0 l0Var) {
            m();
            l(this.f20638r, l0Var);
            return this;
        }

        protected final void m() {
            if (this.f20639s) {
                l0 l0Var = (l0) this.f20638r.i(c.f20644d, null, null);
                l(l0Var, this.f20638r);
                this.f20638r = l0Var;
                this.f20639s = false;
            }
        }

        @Override // com.google.android.gms.internal.drive.j1
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public l0 t() {
            if (this.f20639s) {
                return this.f20638r;
            }
            this.f20638r.n();
            this.f20639s = true;
            return this.f20638r;
        }

        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final l0 p() {
            l0 l0Var = (l0) t();
            if (l0Var.h()) {
                return l0Var;
            }
            throw new k2(l0Var);
        }
    }

    public static class b extends e {

        /* renamed from: b, reason: collision with root package name */
        private final l0 f20640b;

        public b(l0 l0Var) {
            this.f20640b = l0Var;
        }
    }

    public enum c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f20641a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20642b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20643c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f20644d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20645e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f20646f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f20647g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f20648h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i, reason: collision with root package name */
        public static final int f20649i = 1;

        /* renamed from: j, reason: collision with root package name */
        public static final int f20650j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ int[] f20651k = {1, 2};

        /* renamed from: l, reason: collision with root package name */
        public static final int f20652l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static final int f20653m = 2;

        /* renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ int[] f20654n = {1, 2};

        public static int[] a() {
            return (int[]) f20648h.clone();
        }
    }

    protected static Object j(i1 i1Var, String str, Object[] objArr) {
        return new t1(i1Var, str, objArr);
    }

    static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static void l(Class cls, l0 l0Var) {
        zzrs.put(cls, l0Var);
    }

    protected static final boolean m(l0 l0Var, boolean z7) {
        byte byteValue = ((Byte) l0Var.i(c.f20641a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e8 = s1.a().c(l0Var).e(l0Var);
        if (z7) {
            l0Var.i(c.f20642b, e8 ? l0Var : null, null);
        }
        return e8;
    }

    static l0 p(Class cls) {
        l0 l0Var = zzrs.get(cls);
        if (l0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l0Var = zzrs.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = (l0) ((l0) r2.x(cls)).i(c.f20646f, null, null);
        if (l0Var2 == null) {
            throw new IllegalStateException();
        }
        zzrs.put(cls, l0Var2);
        return l0Var2;
    }

    @Override // com.google.android.gms.internal.drive.i1
    public final void a(w wVar) {
        s1.a().b(getClass()).b(this, y.d(wVar));
    }

    @Override // com.google.android.gms.internal.drive.i1
    public final int b() {
        if (this.zzrr == -1) {
            this.zzrr = s1.a().c(this).a(this);
        }
        return this.zzrr;
    }

    @Override // com.google.android.gms.internal.drive.k1
    public final /* synthetic */ i1 d() {
        return (l0) i(c.f20646f, null, null);
    }

    @Override // com.google.android.gms.internal.drive.c
    final int e() {
        return this.zzrr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((l0) i(c.f20646f, null, null)).getClass().isInstance(obj)) {
            return s1.a().c(this).f(this, (l0) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.drive.c
    final void f(int i7) {
        this.zzrr = i7;
    }

    @Override // com.google.android.gms.internal.drive.i1
    public final /* synthetic */ j1 g() {
        a aVar = (a) i(c.f20645e, null, null);
        aVar.i(this);
        return aVar;
    }

    public final boolean h() {
        return m(this, true);
    }

    public int hashCode() {
        int i7 = this.zzne;
        if (i7 != 0) {
            return i7;
        }
        int g8 = s1.a().c(this).g(this);
        this.zzne = g8;
        return g8;
    }

    protected abstract Object i(int i7, Object obj, Object obj2);

    protected final void n() {
        s1.a().c(this).d(this);
    }

    protected final a o() {
        return (a) i(c.f20645e, null, null);
    }

    public String toString() {
        return l1.a(this, super.toString());
    }
}
