package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public final class yr1 extends h80 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, u10 {

    /* renamed from: q, reason: collision with root package name */
    private View f19742q;

    /* renamed from: r, reason: collision with root package name */
    private s2.b3 f19743r;

    /* renamed from: s, reason: collision with root package name */
    private kn1 f19744s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19745t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f19746u = false;

    public yr1(kn1 kn1Var, pn1 pn1Var) {
        this.f19742q = pn1Var.j();
        this.f19743r = pn1Var.l0();
        this.f19744s = kn1Var;
        if (pn1Var.t() != null) {
            pn1Var.t().d1(this);
        }
    }

    private final void f() {
        View view = this.f19742q;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f19742q);
        }
    }

    private final void g() {
        View view;
        kn1 kn1Var = this.f19744s;
        if (kn1Var == null || (view = this.f19742q) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        kn1Var.e0(view, map, map, kn1.t(view));
    }

    private static final void j8(l80 l80Var, int i7) {
        try {
            l80Var.B(i7);
        } catch (RemoteException e8) {
            int i8 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.i80
    public final void Y(w3.a aVar) {
        p3.o.f("#008 Must be called on the main UI thread.");
        l5(aVar, new wr1(this));
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void a() {
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xr1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    yr1.this.d();
                } catch (RemoteException e8) {
                    int i7 = v2.n1.f26802b;
                    w2.p.i("#007 Could not call remote method.", e8);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i80
    public final s2.b3 b() {
        p3.o.f("#008 Must be called on the main UI thread.");
        if (!this.f19745t) {
            return this.f19743r;
        }
        int i7 = v2.n1.f26802b;
        w2.p.c("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.i80
    public final void d() {
        p3.o.f("#008 Must be called on the main UI thread.");
        f();
        kn1 kn1Var = this.f19744s;
        if (kn1Var != null) {
            kn1Var.a();
        }
        this.f19744s = null;
        this.f19742q = null;
        this.f19743r = null;
        this.f19745t = true;
    }

    @Override // com.google.android.gms.internal.ads.i80
    public final i20 e() {
        p3.o.f("#008 Must be called on the main UI thread.");
        if (this.f19745t) {
            int i7 = v2.n1.f26802b;
            w2.p.c("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        kn1 kn1Var = this.f19744s;
        if (kn1Var == null || kn1Var.A() == null) {
            return null;
        }
        return kn1Var.A().a();
    }

    @Override // com.google.android.gms.internal.ads.i80
    public final void l5(w3.a aVar, l80 l80Var) {
        p3.o.f("#008 Must be called on the main UI thread.");
        if (this.f19745t) {
            int i7 = v2.n1.f26802b;
            w2.p.c("Instream ad can not be shown after destroy().");
            j8(l80Var, 2);
            return;
        }
        View view = this.f19742q;
        if (view == null || this.f19743r == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i8 = v2.n1.f26802b;
            w2.p.c("Instream internal error: ".concat(str));
            j8(l80Var, 0);
            return;
        }
        if (this.f19746u) {
            int i9 = v2.n1.f26802b;
            w2.p.c("Instream ad should not be used again.");
            j8(l80Var, 1);
            return;
        }
        this.f19746u = true;
        f();
        ((ViewGroup) w3.b.r0(aVar)).addView(this.f19742q, new ViewGroup.LayoutParams(-1, -1));
        r2.t.c();
        qm0.a(this.f19742q, this);
        r2.t.c();
        qm0.b(this.f19742q, this);
        g();
        try {
            l80Var.c();
        } catch (RemoteException e8) {
            int i10 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        g();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        g();
    }
}
