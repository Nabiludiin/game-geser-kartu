package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
public final class nt1 extends r41 {

    /* renamed from: l, reason: collision with root package name */
    private final Context f12894l;

    /* renamed from: m, reason: collision with root package name */
    private final WeakReference f12895m;

    /* renamed from: n, reason: collision with root package name */
    private final il1 f12896n;

    /* renamed from: o, reason: collision with root package name */
    private final sh1 f12897o;

    /* renamed from: p, reason: collision with root package name */
    private final ka1 f12898p;

    /* renamed from: q, reason: collision with root package name */
    private final wb1 f12899q;

    /* renamed from: r, reason: collision with root package name */
    private final n51 f12900r;

    /* renamed from: s, reason: collision with root package name */
    private final hi0 f12901s;

    /* renamed from: t, reason: collision with root package name */
    private final wc3 f12902t;

    /* renamed from: u, reason: collision with root package name */
    private final q03 f12903u;

    /* renamed from: v, reason: collision with root package name */
    private final rx1 f12904v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f12905w;

    nt1(q41 q41Var, Context context, mr0 mr0Var, il1 il1Var, sh1 sh1Var, ka1 ka1Var, wb1 wb1Var, n51 n51Var, c03 c03Var, wc3 wc3Var, q03 q03Var, rx1 rx1Var) {
        super(q41Var);
        this.f12905w = false;
        this.f12894l = context;
        this.f12896n = il1Var;
        this.f12895m = new WeakReference(mr0Var);
        this.f12897o = sh1Var;
        this.f12898p = ka1Var;
        this.f12899q = wb1Var;
        this.f12900r = n51Var;
        this.f12902t = wc3Var;
        di0 di0Var = c03Var.f6172l;
        this.f12901s = new hj0(di0Var != null ? di0Var.f7114q : "", di0Var != null ? di0Var.f7115r : 1);
        this.f12903u = q03Var;
        this.f12904v = rx1Var;
    }

    public final void finalize() {
        try {
            final mr0 mr0Var = (mr0) this.f12895m.get();
            if (((Boolean) s2.b0.c().d(uy.k7)).booleanValue()) {
                if (!this.f12905w && mr0Var != null) {
                    cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mt1
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
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    public final boolean k(boolean z7, Activity activity) {
        r2.t.g();
        il1 il1Var = this.f12896n;
        if (!v2.f2.s(il1Var.b())) {
            if (((Boolean) s2.b0.c().d(uy.ye)).booleanValue()) {
                r2.t.g();
                v2.f2.r(this.f12894l, this.f14726b, this.f12904v);
            }
            if (((Boolean) s2.b0.c().d(uy.T0)).booleanValue()) {
                r2.t.g();
                if (v2.f2.k(this.f12894l)) {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.f12898p.c();
                    if (((Boolean) s2.b0.c().d(uy.U0)).booleanValue()) {
                        this.f12902t.a(this.f14725a.f13137b.f12530b.f7926b);
                    }
                    return false;
                }
            }
        }
        if (this.f12905w) {
            int i8 = v2.n1.f26802b;
            w2.p.f("The rewarded ad have been showed.");
            this.f12898p.b1(z13.d(10, null, null));
            return false;
        }
        this.f12905w = true;
        sh1 sh1Var = this.f12897o;
        sh1Var.a();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f12894l;
        }
        try {
            il1Var.a(z7, activity2, this.f12898p);
            sh1Var.U0();
            return true;
        } catch (hl1 e8) {
            this.f12898p.c1(e8);
            return false;
        }
    }

    public final boolean l() {
        return this.f12905w;
    }

    public final hi0 m() {
        return this.f12901s;
    }

    public final boolean o() {
        return this.f12900r.a();
    }

    public final boolean p() {
        mr0 mr0Var = (mr0) this.f12895m.get();
        return (mr0Var == null || mr0Var.i1()) ? false : true;
    }

    public final Bundle q() {
        return this.f12899q.U0();
    }

    public final q03 r() {
        return this.f12903u;
    }
}
