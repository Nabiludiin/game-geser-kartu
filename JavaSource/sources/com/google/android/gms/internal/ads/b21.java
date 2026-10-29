package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* compiled from: MyApplication */
public final class b21 extends r41 {

    /* renamed from: l, reason: collision with root package name */
    private final mr0 f5504l;

    /* renamed from: m, reason: collision with root package name */
    private final int f5505m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f5506n;

    /* renamed from: o, reason: collision with root package name */
    private final o11 f5507o;

    /* renamed from: p, reason: collision with root package name */
    private final il1 f5508p;

    /* renamed from: q, reason: collision with root package name */
    private final sh1 f5509q;

    /* renamed from: r, reason: collision with root package name */
    private final ka1 f5510r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f5511s;

    /* renamed from: t, reason: collision with root package name */
    private final tl0 f5512t;

    /* renamed from: u, reason: collision with root package name */
    private final rx1 f5513u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5514v;

    b21(q41 q41Var, Context context, mr0 mr0Var, int i7, o11 o11Var, il1 il1Var, sh1 sh1Var, ka1 ka1Var, tl0 tl0Var, rx1 rx1Var) {
        super(q41Var);
        this.f5514v = false;
        this.f5504l = mr0Var;
        this.f5506n = context;
        this.f5505m = i7;
        this.f5507o = o11Var;
        this.f5508p = il1Var;
        this.f5509q = sh1Var;
        this.f5510r = ka1Var;
        this.f5511s = ((Boolean) s2.b0.c().d(uy.f17052a6)).booleanValue();
        this.f5512t = tl0Var;
        this.f5513u = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.r41
    public final void a() {
        super.a();
        mr0 mr0Var = this.f5504l;
        if (mr0Var != null) {
            mr0Var.destroy();
        }
    }

    public final void k(vs vsVar) {
        mr0 mr0Var = this.f5504l;
        if (mr0Var != null) {
            mr0Var.Q0(vsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.content.Context] */
    public final void l(Activity activity, ht htVar, boolean z7) {
        mr0 mr0Var;
        c03 T;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f5506n;
        }
        boolean z8 = this.f5511s;
        if (z8) {
            this.f5509q.a();
        }
        r2.t.g();
        il1 il1Var = this.f5508p;
        if (!v2.f2.s(il1Var.b())) {
            if (((Boolean) s2.b0.c().d(uy.ye)).booleanValue()) {
                r2.t.g();
                v2.f2.r(activity2, this.f14726b, this.f5513u);
            }
            if (((Boolean) s2.b0.c().d(uy.T0)).booleanValue()) {
                r2.t.g();
                if (v2.f2.k(activity2)) {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.f5510r.c();
                    if (((Boolean) s2.b0.c().d(uy.U0)).booleanValue()) {
                        new wc3(activity2.getApplicationContext(), r2.t.w().a()).a(this.f14725a.f13137b.f12530b.f7926b);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) s2.b0.c().d(uy.Uc)).booleanValue() && (mr0Var = this.f5504l) != null && (T = mr0Var.T()) != null && T.f6185r0 && T.f6187s0 != this.f5512t.i()) {
            int i8 = v2.n1.f26802b;
            w2.p.f("The app open consent form has been shown.");
            this.f5510r.b1(z13.d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.f5514v) {
            int i9 = v2.n1.f26802b;
            w2.p.f("App open interstitial ad is already visible.");
            this.f5510r.b1(z13.d(10, null, null));
        }
        if (this.f5514v) {
            return;
        }
        try {
            il1Var.a(z7, activity2, this.f5510r);
            if (z8) {
                this.f5509q.U0();
            }
            this.f5514v = true;
        } catch (hl1 e8) {
            this.f5510r.c1(e8);
        }
    }

    public final int m() {
        return this.f5505m;
    }

    public final void o(long j7, int i7) {
        this.f5507o.a(j7, i7);
    }
}
