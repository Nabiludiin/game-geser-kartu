package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public abstract class iv2 implements ri2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10219a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10220b;

    /* renamed from: c, reason: collision with root package name */
    protected final gu0 f10221c;

    /* renamed from: d, reason: collision with root package name */
    private final yv2 f10222d;

    /* renamed from: e, reason: collision with root package name */
    private final sx2 f10223e;

    /* renamed from: f, reason: collision with root package name */
    private final w2.a f10224f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f10225g;

    /* renamed from: h, reason: collision with root package name */
    private final e63 f10226h;

    /* renamed from: i, reason: collision with root package name */
    private final v03 f10227i;

    /* renamed from: j, reason: collision with root package name */
    private a5.d f10228j;

    protected iv2(Context context, Executor executor, gu0 gu0Var, sx2 sx2Var, yv2 yv2Var, v03 v03Var, w2.a aVar) {
        this.f10219a = context;
        this.f10220b = executor;
        this.f10221c = gu0Var;
        this.f10223e = sx2Var;
        this.f10222d = yv2Var;
        this.f10227i = v03Var;
        this.f10224f = aVar;
        this.f10225g = new FrameLayout(context);
        this.f10226h = gu0Var.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized b91 g(qx2 qx2Var) {
        fv2 fv2Var = (fv2) qx2Var;
        if (((Boolean) s2.b0.c().d(uy.b9)).booleanValue()) {
            e21 e21Var = new e21(this.f10225g);
            d91 d91Var = new d91();
            d91Var.a(this.f10219a);
            d91Var.b(fv2Var.f8507a);
            e91 e8 = d91Var.e();
            fg1 fg1Var = new fg1();
            yv2 yv2Var = this.f10222d;
            Executor executor = this.f10220b;
            fg1Var.g(yv2Var, executor);
            fg1Var.j(yv2Var, executor);
            return c(e21Var, e8, fg1Var.q());
        }
        yv2 a8 = yv2.a(this.f10222d);
        fg1 fg1Var2 = new fg1();
        Executor executor2 = this.f10220b;
        fg1Var2.f(a8, executor2);
        fg1Var2.l(a8, executor2);
        fg1Var2.m(a8, executor2);
        fg1Var2.n(a8, executor2);
        fg1Var2.g(a8, executor2);
        fg1Var2.j(a8, executor2);
        fg1Var2.o(a8);
        e21 e21Var2 = new e21(this.f10225g);
        d91 d91Var2 = new d91();
        d91Var2.a(this.f10219a);
        d91Var2.b(fv2Var.f8507a);
        return c(e21Var2, d91Var2.e(), fg1Var2.q());
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final synchronized boolean a(s2.b5 b5Var, String str, pi2 pi2Var, qi2 qi2Var) {
        Throwable th;
        boolean z7;
        b63 b63Var;
        q11 q11Var;
        try {
            try {
                if (!b5Var.b()) {
                    if (((Boolean) u00.f16527d.e()).booleanValue()) {
                        try {
                            if (((Boolean) s2.b0.c().d(uy.jc)).booleanValue()) {
                                z7 = true;
                                if (this.f10224f.f27053s >= ((Integer) s2.b0.c().d(uy.kc)).intValue() || !z7) {
                                    p3.o.f("loadAd must be called on the main UI thread.");
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z7 = false;
                    if (this.f10224f.f27053s >= ((Integer) s2.b0.c().d(uy.kc)).intValue()) {
                    }
                    p3.o.f("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    int i7 = v2.n1.f26802b;
                    w2.p.c("Ad unit ID should not be null for app open ad.");
                    this.f10220b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hv2
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            iv2.this.e();
                        }
                    });
                    return false;
                }
                if (this.f10228j != null) {
                    return false;
                }
                if (!((Boolean) p00.f13596c.e()).booleanValue() || (q11Var = (q11) this.f10223e.h()) == null) {
                    b63Var = null;
                } else {
                    b63 h8 = q11Var.h();
                    h8.i(7);
                    h8.c(b5Var.F);
                    h8.d(b5Var.C);
                    b63Var = h8;
                }
                Context context = this.f10219a;
                boolean z8 = b5Var.f26061v;
                u13.b(context, z8);
                if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue() && z8) {
                    this.f10221c.F().d(true);
                }
                Bundle a8 = ax1.a(new Pair(yw1.PUBLIC_API_CALL.c(), Long.valueOf(b5Var.P)), new Pair(yw1.DYNAMITE_ENTER.c(), Long.valueOf(r2.t.o().a())));
                v03 v03Var = this.f10227i;
                v03Var.F(str);
                v03Var.B(s2.g5.P0());
                v03Var.z(b5Var);
                v03Var.U(a8);
                w03 Y = v03Var.Y();
                r53 b8 = q53.b(context, a63.g(Y), 7, b5Var);
                fv2 fv2Var = new fv2(null);
                fv2Var.f8507a = Y;
                a5.d a9 = this.f10223e.a(new tx2(fv2Var, null), new rx2() { // from class: com.google.android.gms.internal.ads.gv2
                    @Override // com.google.android.gms.internal.ads.rx2
                    public final /* synthetic */ b91 a(qx2 qx2Var) {
                        return iv2.this.f(qx2Var);
                    }
                }, null);
                this.f10228j = a9;
                p64.r(a9, new ev2(this, qi2Var, b63Var, b8, fv2Var), this.f10220b);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final boolean b() {
        a5.d dVar = this.f10228j;
        return (dVar == null || dVar.isDone()) ? false : true;
    }

    protected abstract b91 c(e21 e21Var, e91 e91Var, gg1 gg1Var);

    public final void d(s2.m5 m5Var) {
        this.f10227i.O(m5Var);
    }

    final /* synthetic */ void e() {
        this.f10222d.o(z13.d(6, null, null));
    }

    final /* synthetic */ Executor h() {
        return this.f10220b;
    }

    final /* synthetic */ yv2 i() {
        return this.f10222d;
    }

    final /* synthetic */ sx2 j() {
        return this.f10223e;
    }

    final /* synthetic */ e63 k() {
        return this.f10226h;
    }

    final /* synthetic */ void l(a5.d dVar) {
        this.f10228j = null;
    }
}
