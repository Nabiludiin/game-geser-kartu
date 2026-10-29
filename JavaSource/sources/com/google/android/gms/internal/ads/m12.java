package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: MyApplication */
public final class m12 implements u2.c0, mt0 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f12013q;

    /* renamed from: r, reason: collision with root package name */
    private final w2.a f12014r;

    /* renamed from: s, reason: collision with root package name */
    private b12 f12015s;

    /* renamed from: t, reason: collision with root package name */
    private mr0 f12016t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f12017u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12018v;

    /* renamed from: w, reason: collision with root package name */
    private long f12019w;

    /* renamed from: x, reason: collision with root package name */
    private s2.k2 f12020x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f12021y;

    m12(Context context, w2.a aVar) {
        this.f12013q = context;
        this.f12014r = aVar;
    }

    private final synchronized boolean h(s2.k2 k2Var) {
        if (!((Boolean) s2.b0.c().d(uy.U9)).booleanValue()) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Ad inspector had an internal error.");
            try {
                k2Var.T0(z13.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f12015s == null) {
            int i8 = v2.n1.f26802b;
            w2.p.f("Ad inspector had an internal error.");
            try {
                r2.t.l().i(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                k2Var.T0(z13.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f12017u && !this.f12018v) {
            if (r2.t.o().a() >= this.f12019w + ((Integer) s2.b0.c().d(uy.X9)).intValue()) {
                return true;
            }
        }
        int i9 = v2.n1.f26802b;
        w2.p.f("Ad inspector cannot be opened because it is already open.");
        try {
            k2Var.T0(z13.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // u2.c0
    public final synchronized void V5(int i7) {
        this.f12016t.destroy();
        if (!this.f12021y) {
            v2.n1.k("Inspector closed.");
            s2.k2 k2Var = this.f12020x;
            if (k2Var != null) {
                try {
                    k2Var.T0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f12018v = false;
        this.f12017u = false;
        this.f12019w = 0L;
        this.f12021y = false;
        this.f12020x = null;
    }

    @Override // com.google.android.gms.internal.ads.mt0
    public final synchronized void a(boolean z7, int i7, String str, String str2) {
        if (z7) {
            v2.n1.k("Ad inspector loaded.");
            this.f12017u = true;
            d();
            return;
        }
        int i8 = v2.n1.f26802b;
        w2.p.f("Ad inspector failed to load.");
        try {
            ql0 l7 = r2.t.l();
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i7);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            l7.i(new Exception(sb.toString()), "InspectorUi.onAdWebViewFinishedLoading 0");
            s2.k2 k2Var = this.f12020x;
            if (k2Var != null) {
                k2Var.T0(z13.d(17, null, null));
            }
        } catch (RemoteException e8) {
            r2.t.l().i(e8, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.f12021y = true;
        this.f12016t.destroy();
    }

    public final void b(b12 b12Var) {
        this.f12015s = b12Var;
    }

    public final synchronized void c(s2.k2 k2Var, u60 u60Var, n60 n60Var, z50 z50Var) {
        if (h(k2Var)) {
            try {
                r2.t.h();
                mr0 a8 = ds0.a(this.f12013q, bu0.b(), "", false, false, null, null, this.f12014r, null, null, null, iu.a(), null, null, null, null, null);
                this.f12016t = a8;
                ot0 s02 = a8.s0();
                if (s02 == null) {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("Failed to obtain a web view for the ad inspector");
                    try {
                        r2.t.l().i(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        k2Var.T0(z13.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e8) {
                        r2.t.l().i(e8, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.f12020x = k2Var;
                Context context = this.f12013q;
                s02.L(null, null, null, null, null, false, null, null, null, null, null, null, null, u60Var, null, new t60(context), n60Var, z50Var, null, null, null);
                s02.g1(this);
                this.f12016t.loadUrl((String) s2.b0.c().d(uy.V9));
                r2.t.f();
                u2.b0.a(context, new AdOverlayInfoParcel(this, this.f12016t, 1, this.f12014r), true, null);
                this.f12019w = r2.t.o().a();
            } catch (cs0 e9) {
                int i8 = v2.n1.f26802b;
                w2.p.g("Failed to obtain a web view for the ad inspector", e9);
                try {
                    r2.t.l().i(e9, "InspectorUi.openInspector 0");
                    k2Var.T0(z13.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e10) {
                    r2.t.l().i(e10, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void d() {
        if (this.f12017u && this.f12018v) {
            cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.l12
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    m12.this.f();
                }
            });
        }
    }

    public final Activity e() {
        mr0 mr0Var = this.f12016t;
        if (mr0Var == null || mr0Var.q0()) {
            return null;
        }
        return this.f12016t.i();
    }

    final /* synthetic */ void f() {
        this.f12016t.h("window.inspectorInfo", this.f12015s.s().toString());
    }

    @Override // u2.c0
    public final synchronized void g() {
        this.f12018v = true;
        d();
    }

    @Override // u2.c0
    public final void C7() {
    }

    @Override // u2.c0
    public final void H2() {
    }

    @Override // u2.c0
    public final void M5() {
    }

    @Override // u2.c0
    public final void P4() {
    }

    @Override // u2.c0
    public final void T5() {
    }

    @Override // u2.c0
    public final void Z4() {
    }

    @Override // u2.c0
    public final void a4() {
    }

    @Override // u2.c0
    public final void t7() {
    }

    @Override // u2.c0
    public final void v3() {
    }
}
