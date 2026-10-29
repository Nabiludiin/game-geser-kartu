package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class b0 implements zc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5416a;

    /* renamed from: b, reason: collision with root package name */
    private final ac0 f5417b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f5418c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5419d;

    /* renamed from: e, reason: collision with root package name */
    private final f1 f5420e;

    /* renamed from: f, reason: collision with root package name */
    private final pd1 f5421f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet f5422g;

    /* renamed from: h, reason: collision with root package name */
    private final long f5423h;

    /* renamed from: i, reason: collision with root package name */
    private final h0 f5424i;

    /* renamed from: j, reason: collision with root package name */
    private de2 f5425j = new de2(10);

    /* renamed from: k, reason: collision with root package name */
    private eq5 f5426k;

    /* renamed from: l, reason: collision with root package name */
    private zn1 f5427l;

    /* renamed from: m, reason: collision with root package name */
    private Pair f5428m;

    /* renamed from: n, reason: collision with root package name */
    private int f5429n;

    /* renamed from: o, reason: collision with root package name */
    private int f5430o;

    /* renamed from: p, reason: collision with root package name */
    private long f5431p;

    /* renamed from: q, reason: collision with root package name */
    private long f5432q;

    /* renamed from: r, reason: collision with root package name */
    private int f5433r;

    /* synthetic */ b0(t tVar, byte[] bArr) {
        this.f5416a = tVar.e();
        ac0 g8 = tVar.g();
        g8.getClass();
        this.f5417b = g8;
        this.f5418c = new SparseArray();
        w04.m();
        this.f5419d = tVar.h();
        pd1 i7 = tVar.i();
        this.f5421f = i7;
        this.f5423h = tVar.j() != -9223372036854775807L ? -tVar.j() : -9223372036854775807L;
        h0 k7 = tVar.k();
        this.f5424i = k7;
        this.f5420e = new d(tVar.f(), k7, i7);
        new s(this);
        this.f5422g = new CopyOnWriteArraySet();
        this.f5426k = new xn5().m();
        this.f5431p = -9223372036854775807L;
        this.f5432q = -9223372036854775807L;
        this.f5433r = -1;
        this.f5430o = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w25 c(w25 w25Var) {
        return (w25Var == null || !w25Var.f()) ? w25.f18003h : w25Var;
    }

    final /* synthetic */ void A(de2 de2Var) {
        this.f5425j = de2Var;
    }

    final /* synthetic */ long B() {
        return this.f5431p;
    }

    final /* synthetic */ long C() {
        return this.f5432q;
    }

    final /* synthetic */ void a(long j7) {
        this.f5432q = j7;
    }

    public final void d(int i7) {
        this.f5433r = 1;
    }

    public final f1 e(int i7) {
        SparseArray sparseArray = this.f5418c;
        if (hi2.x(sparseArray, 0)) {
            return (f1) sparseArray.get(0);
        }
        v vVar = new v(this, this.f5416a, 0);
        this.f5422g.add(vVar);
        sparseArray.put(0, vVar);
        return vVar;
    }

    public final void f(Surface surface, z92 z92Var) {
        Pair pair = this.f5428m;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((z92) this.f5428m.second).equals(z92Var)) {
            return;
        }
        this.f5428m = Pair.create(surface, z92Var);
        z92Var.a();
        z92Var.b();
    }

    public final void g() {
        z92 z92Var = z92.f20075c;
        z92Var.a();
        z92Var.b();
        this.f5428m = null;
    }

    public final void h() {
        this.f5420e.a();
    }

    public final void i() {
        this.f5420e.b();
    }

    public final void j() {
        if (this.f5430o == 2) {
            return;
        }
        zn1 zn1Var = this.f5427l;
        if (zn1Var != null) {
            zn1Var.i(null);
        }
        this.f5428m = null;
        this.f5430o = 2;
    }

    final /* synthetic */ void k() {
        this.f5429n--;
    }

    final /* synthetic */ boolean l(eq5 eq5Var, int i7) {
        rx3.h(this.f5430o == 0);
        w25 c8 = c(eq5Var.E);
        try {
            int i8 = c8.f18006c;
            if (i8 == 7) {
                if (Build.VERSION.SDK_INT < 34 && xl1.d()) {
                    lc4 d8 = c8.d();
                    d8.c(6);
                    c8 = d8.g();
                    w25 w25Var = c8;
                    pd1 pd1Var = this.f5421f;
                    Looper myLooper = Looper.myLooper();
                    myLooper.getClass();
                    final zn1 c9 = pd1Var.c(myLooper, null);
                    this.f5427l = c9;
                    ac0 ac0Var = this.f5417b;
                    Context context = this.f5416a;
                    ac5 ac5Var = ac5.f4874a;
                    Objects.requireNonNull(c9);
                    ac0Var.a(context, w25Var, ac5Var, this, new Executor() { // from class: com.google.android.gms.internal.ads.u
                        @Override // java.util.concurrent.Executor
                        public final /* synthetic */ void execute(Runnable runnable) {
                            zn1.this.j(runnable);
                        }
                    }, 0L, false);
                    throw null;
                }
                i8 = 7;
            }
            if (!xl1.c(i8) && Build.VERSION.SDK_INT >= 29) {
                Object[] objArr = {Integer.valueOf(i8)};
                String str = hi2.f9535a;
                gv1.c("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                c8 = w25.f18003h;
                w25 w25Var2 = c8;
                pd1 pd1Var2 = this.f5421f;
                Looper myLooper2 = Looper.myLooper();
                myLooper2.getClass();
                final zn1 c92 = pd1Var2.c(myLooper2, null);
                this.f5427l = c92;
                ac0 ac0Var2 = this.f5417b;
                Context context2 = this.f5416a;
                ac5 ac5Var2 = ac5.f4874a;
                Objects.requireNonNull(c92);
                ac0Var2.a(context2, w25Var2, ac5Var2, this, new Executor() { // from class: com.google.android.gms.internal.ads.u
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zn1.this.j(runnable);
                    }
                }, 0L, false);
                throw null;
            }
            if (i8 == 2 || i8 == 10) {
                c8 = w25.f18003h;
            }
            w25 w25Var22 = c8;
            pd1 pd1Var22 = this.f5421f;
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            final zn1 c922 = pd1Var22.c(myLooper22, null);
            this.f5427l = c922;
            ac0 ac0Var22 = this.f5417b;
            Context context22 = this.f5416a;
            ac5 ac5Var22 = ac5.f4874a;
            Objects.requireNonNull(c922);
            ac0Var22.a(context22, w25Var22, ac5Var22, this, new Executor() { // from class: com.google.android.gms.internal.ads.u
                @Override // java.util.concurrent.Executor
                public final /* synthetic */ void execute(Runnable runnable) {
                    zn1.this.j(runnable);
                }
            }, 0L, false);
            throw null;
        } catch (wk1 e8) {
            throw new e1(e8, eq5Var);
        }
    }

    final /* synthetic */ boolean m(boolean z7) {
        return this.f5420e.o0(false);
    }

    final /* synthetic */ void n() {
        this.f5420e.j();
    }

    final /* synthetic */ void o(long j7, long j8) {
        this.f5420e.C0(j7, j8);
    }

    final /* synthetic */ void p(boolean z7) {
        if (this.f5430o == 1) {
            this.f5429n++;
            f1 f1Var = this.f5420e;
            f1Var.v0(z7);
            while (this.f5425j.c() > 1) {
                this.f5425j.d();
            }
            if (this.f5425j.c() == 1) {
                a0 a0Var = (a0) this.f5425j.d();
                a0Var.getClass();
                f1Var.F0(1, this.f5426k, a0Var.f4624a, a0Var.f4625b, w04.m());
            }
            this.f5431p = -9223372036854775807L;
            this.f5432q = -9223372036854775807L;
            zn1 zn1Var = this.f5427l;
            zn1Var.getClass();
            zn1Var.j(new Runnable() { // from class: com.google.android.gms.internal.ads.w
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    b0.this.k();
                }
            });
        }
    }

    final /* synthetic */ void q(boolean z7) {
        this.f5420e.x0(z7);
    }

    final /* synthetic */ void r() {
        this.f5420e.r();
    }

    final /* synthetic */ void s(c0 c0Var) {
        this.f5420e.D0(c0Var);
    }

    final /* synthetic */ void t(float f8) {
        this.f5424i.c(f8);
        this.f5420e.z0(f8);
    }

    final /* synthetic */ void u(int i7) {
        this.f5420e.w0(i7);
    }

    final /* synthetic */ boolean v() {
        int i7 = this.f5433r;
        return i7 != -1 && i7 == 0;
    }

    final /* synthetic */ boolean w() {
        return this.f5419d;
    }

    final /* synthetic */ long x() {
        return this.f5423h;
    }

    final /* synthetic */ h0 y() {
        return this.f5424i;
    }

    final /* synthetic */ de2 z() {
        return this.f5425j;
    }
}
