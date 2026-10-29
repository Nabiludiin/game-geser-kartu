package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.List;

/* compiled from: MyApplication */
public final class d7 implements m2 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f6938r = 0;

    /* renamed from: e, reason: collision with root package name */
    private final a4 f6943e;

    /* renamed from: f, reason: collision with root package name */
    private p2 f6944f;

    /* renamed from: g, reason: collision with root package name */
    private a4 f6945g;

    /* renamed from: h, reason: collision with root package name */
    private a4 f6946h;

    /* renamed from: i, reason: collision with root package name */
    private int f6947i;

    /* renamed from: j, reason: collision with root package name */
    private le f6948j;

    /* renamed from: l, reason: collision with root package name */
    private long f6950l;

    /* renamed from: m, reason: collision with root package name */
    private long f6951m;

    /* renamed from: n, reason: collision with root package name */
    private long f6952n;

    /* renamed from: o, reason: collision with root package name */
    private int f6953o;

    /* renamed from: p, reason: collision with root package name */
    private f7 f6954p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6955q;

    /* renamed from: a, reason: collision with root package name */
    private final y82 f6939a = new y82(10);

    /* renamed from: b, reason: collision with root package name */
    private final i3 f6940b = new i3();

    /* renamed from: c, reason: collision with root package name */
    private final e3 f6941c = new e3();

    /* renamed from: k, reason: collision with root package name */
    private long f6949k = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private final g3 f6942d = new g3();

    public d7(int i7) {
        h2 h2Var = new h2();
        this.f6943e = h2Var;
        this.f6946h = h2Var;
        this.f6952n = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int c(com.google.android.gms.internal.ads.n2 r37) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d7.c(com.google.android.gms.internal.ads.n2):int");
    }

    private final long d(long j7) {
        return this.f6949k + ((j7 * 1000000) / this.f6940b.f9818d);
    }

    private final boolean f(n2 n2Var, boolean z7) {
        int i7;
        int i8;
        int a8;
        n2Var.k();
        long o7 = n2Var.o();
        int i9 = true != z7 ? 131072 : 32768;
        if (o7 == 0) {
            le a9 = this.f6942d.a(n2Var, null, i9);
            this.f6948j = a9;
            if (a9 != null) {
                this.f6941c.a(a9);
            }
            i7 = (int) n2Var.n();
            if (!z7) {
                n2Var.B(i7);
            }
            i8 = 0;
        } else {
            i7 = 0;
            i8 = 0;
        }
        int i10 = i8;
        int i11 = i10;
        while (true) {
            if (!g(n2Var)) {
                y82 y82Var = this.f6939a;
                y82Var.G(0);
                int b8 = y82Var.b();
                if ((i8 == 0 || m(b8, i8)) && (a8 = j3.a(b8)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.f6940b.a(b8);
                        i8 = b8;
                    }
                    n2Var.P(a8 - 4);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == i9) {
                        if (z7) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z7) {
                        n2Var.k();
                        n2Var.P(i7 + i12);
                    } else {
                        n2Var.B(1);
                    }
                    i10 = 0;
                    i11 = i12;
                    i8 = 0;
                }
            } else if (i10 <= 0) {
                h();
                throw new EOFException();
            }
        }
        if (z7) {
            n2Var.B(i7 + i11);
        } else {
            n2Var.k();
        }
        this.f6947i = i8;
        return true;
    }

    private final boolean g(n2 n2Var) {
        f7 f7Var = this.f6954p;
        if (f7Var != null) {
            long e8 = f7Var.e();
            if (e8 != -1 && n2Var.n() > e8 - 4) {
                return true;
            }
        }
        try {
            return !n2Var.x(this.f6939a.H(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void h() {
        f7 f7Var = this.f6954p;
        if ((f7Var instanceof a7) && f7Var.b()) {
            long j7 = this.f6952n;
            if (j7 == -1 || j7 == this.f6954p.e()) {
                return;
            }
            this.f6954p = ((a7) this.f6954p).i(this.f6952n);
            p2 p2Var = this.f6944f;
            p2Var.getClass();
            p2Var.B(this.f6954p);
            this.f6945g.getClass();
            this.f6954p.a();
        }
    }

    private static boolean m(int i7, long j7) {
        return ((long) (i7 & (-128000))) == (j7 & (-128000));
    }

    public final void a() {
        this.f6955q = true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        this.f6947i = 0;
        this.f6949k = -9223372036854775807L;
        this.f6950l = 0L;
        this.f6953o = 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        return f(n2Var, true);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f6944f = p2Var;
        a4 A = p2Var.A(0, 1);
        this.f6945g = A;
        this.f6946h = A;
        this.f6944f.z();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        this.f6945g.getClass();
        String str = hi2.f9535a;
        return c(n2Var);
    }
}
