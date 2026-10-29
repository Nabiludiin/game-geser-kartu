package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
public final class rj1 extends r41 {

    /* renamed from: l, reason: collision with root package name */
    private final Context f14940l;

    /* renamed from: m, reason: collision with root package name */
    private final WeakReference f14941m;

    /* renamed from: n, reason: collision with root package name */
    private final sh1 f14942n;

    /* renamed from: o, reason: collision with root package name */
    private final il1 f14943o;

    /* renamed from: p, reason: collision with root package name */
    private final n51 f14944p;

    /* renamed from: q, reason: collision with root package name */
    private final wc3 f14945q;

    /* renamed from: r, reason: collision with root package name */
    private final ka1 f14946r;

    /* renamed from: s, reason: collision with root package name */
    private final tl0 f14947s;

    /* renamed from: t, reason: collision with root package name */
    private final rx1 f14948t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f14949u;

    rj1(q41 q41Var, Context context, mr0 mr0Var, sh1 sh1Var, il1 il1Var, n51 n51Var, wc3 wc3Var, ka1 ka1Var, tl0 tl0Var, rx1 rx1Var) {
        super(q41Var);
        this.f14949u = false;
        this.f14940l = context;
        this.f14941m = new WeakReference(mr0Var);
        this.f14942n = sh1Var;
        this.f14943o = il1Var;
        this.f14944p = n51Var;
        this.f14945q = wc3Var;
        this.f14946r = ka1Var;
        this.f14947s = tl0Var;
        this.f14948t = rx1Var;
    }

    public final void finalize() {
        try {
            final mr0 mr0Var = (mr0) this.f14941m.get();
            if (((Boolean) s2.b0.c().d(uy.k7)).booleanValue()) {
                if (!this.f14949u && mr0Var != null) {
                    cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qj1
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            mr0.this.destroy();
                        }
                    });
                }
            } else if (mr0Var != null) {
                mr0Var.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    public final boolean k(boolean z7, Activity activity) {
        c03 T;
        sh1 sh1Var = this.f14942n;
        sh1Var.a();
        r2.t.g();
        il1 il1Var = this.f14943o;
        if (!v2.f2.s(il1Var.b())) {
            if (((Boolean) s2.b0.c().d(uy.ye)).booleanValue()) {
                r2.t.g();
                v2.f2.r(this.f14940l, this.f14726b, this.f14948t);
            }
            if (((Boolean) s2.b0.c().d(uy.T0)).booleanValue()) {
                r2.t.g();
                if (v2.f2.k(this.f14940l)) {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.f14946r.c();
                    if (((Boolean) s2.b0.c().d(uy.U0)).booleanValue()) {
                        this.f14945q.a(this.f14725a.f13137b.f12530b.f7926b);
                    }
                    return false;
                }
            }
        }
        mr0 mr0Var = (mr0) this.f14941m.get();
        if (!((Boolean) s2.b0.c().d(uy.Uc)).booleanValue() || mr0Var == null || (T = mr0Var.T()) == null || !T.f6185r0 || T.f6187s0 == this.f14947s.i()) {
            if (this.f14949u) {
                int i8 = v2.n1.f26802b;
                w2.p.f("The interstitial ad has been shown.");
                this.f14946r.b1(z13.d(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.f14949u) {
                if (activity == null) {
                    activity2 = this.f14940l;
                }
                try {
                    il1Var.a(z7, activity2, this.f14946r);
                    sh1Var.U0();
                    this.f14949u = true;
                    return true;
                } catch (hl1 e8) {
                    this.f14946r.c1(e8);
                }
            }
        } else {
            int i9 = v2.n1.f26802b;
            w2.p.f("The interstitial consent form has been shown.");
            this.f14946r.b1(z13.d(12, "The consent form has already been shown.", null));
        }
        return false;
    }

    public final boolean l() {
        return this.f14944p.a();
    }
}
