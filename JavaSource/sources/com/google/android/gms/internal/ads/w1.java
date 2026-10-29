package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    protected final p1 f17979a;

    /* renamed from: b, reason: collision with root package name */
    protected final v1 f17980b;

    /* renamed from: c, reason: collision with root package name */
    protected r1 f17981c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17982d;

    protected w1(s1 s1Var, v1 v1Var, long j7, long j8, long j9, long j10, long j11, long j12, int i7) {
        this.f17980b = v1Var;
        this.f17982d = i7;
        this.f17979a = new p1(s1Var, j7, 0L, j9, j10, j11, j12);
    }

    protected static final int f(n2 n2Var, long j7, n3 n3Var) {
        if (j7 == n2Var.o()) {
            return 0;
        }
        n3Var.f12555a = j7;
        return 1;
    }

    protected static final boolean g(n2 n2Var, long j7) {
        long o7 = j7 - n2Var.o();
        if (o7 < 0 || o7 > 262144) {
            return false;
        }
        n2Var.B((int) o7);
        return true;
    }

    public final q3 a() {
        return this.f17979a;
    }

    public final void b(long j7) {
        r1 r1Var = this.f17981c;
        if (r1Var == null || r1Var.e() != j7) {
            p1 p1Var = this.f17979a;
            this.f17981c = new r1(j7, p1Var.d(j7), 0L, p1Var.h(), p1Var.e(), p1Var.i(), p1Var.j());
        }
    }

    public final boolean c() {
        return this.f17981c != null;
    }

    public final int d(n2 n2Var, n3 n3Var) {
        while (true) {
            r1 r1Var = this.f17981c;
            r1Var.getClass();
            long b8 = r1Var.b();
            long c8 = r1Var.c();
            long h8 = r1Var.h();
            if (c8 - b8 <= this.f17982d) {
                e(false, b8);
                return f(n2Var, b8, n3Var);
            }
            if (!g(n2Var, h8)) {
                return f(n2Var, h8, n3Var);
            }
            n2Var.k();
            t1 a8 = this.f17980b.a(n2Var, r1Var.d());
            int d8 = a8.d();
            if (d8 == -3) {
                e(false, h8);
                return f(n2Var, h8, n3Var);
            }
            if (d8 == -2) {
                r1Var.f(a8.e(), a8.f());
            } else {
                if (d8 != -1) {
                    g(n2Var, a8.f());
                    e(true, a8.f());
                    return f(n2Var, a8.f(), n3Var);
                }
                r1Var.g(a8.e(), a8.f());
            }
        }
    }

    protected final void e(boolean z7, long j7) {
        this.f17981c = null;
        this.f17980b.b();
    }
}
