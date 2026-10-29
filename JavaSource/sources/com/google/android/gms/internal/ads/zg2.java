package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* compiled from: MyApplication */
public final class zg2 extends s2.u0 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f20168q;

    /* renamed from: r, reason: collision with root package name */
    private final s2.i0 f20169r;

    /* renamed from: s, reason: collision with root package name */
    private final w03 f20170s;

    /* renamed from: t, reason: collision with root package name */
    private final h21 f20171t;

    /* renamed from: u, reason: collision with root package name */
    private final ViewGroup f20172u;

    /* renamed from: v, reason: collision with root package name */
    private final rx1 f20173v;

    public zg2(Context context, s2.i0 i0Var, w03 w03Var, h21 h21Var, rx1 rx1Var) {
        this.f20168q = context;
        this.f20169r = i0Var;
        this.f20170s = w03Var;
        this.f20171t = h21Var;
        this.f20173v = rx1Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View k7 = h21Var.k();
        r2.t.g();
        frameLayout.addView(k7, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(o().f26097s);
        frameLayout.setMinimumWidth(o().f26100v);
        this.f20172u = frameLayout;
    }

    @Override // s2.v0
    public final void A6(s2.u4 u4Var) {
        int i7 = v2.n1.f26802b;
        w2.p.e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.v0
    public final boolean C() {
        h21 h21Var = this.f20171t;
        return h21Var != null && h21Var.i();
    }

    @Override // s2.v0
    public final s2.b3 D() {
        return this.f20171t.m();
    }

    @Override // s2.v0
    public final s2.i0 G() {
        return this.f20169r;
    }

    @Override // s2.v0
    public final boolean J() {
        return false;
    }

    @Override // s2.v0
    public final void L4(s2.i0 i0Var) {
        int i7 = v2.n1.f26802b;
        w2.p.e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.v0
    public final void N2(qz qzVar) {
        int i7 = v2.n1.f26802b;
        w2.p.e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.v0
    public final void N3(s2.q2 q2Var) {
        if (!((Boolean) s2.b0.c().d(uy.Cc)).booleanValue()) {
            int i7 = v2.n1.f26802b;
            w2.p.e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        ai2 ai2Var = this.f20170s.f17957c;
        if (ai2Var != null) {
            try {
                if (!q2Var.e()) {
                    this.f20173v.b();
                }
            } catch (RemoteException e8) {
                int i8 = v2.n1.f26802b;
                w2.p.b("Error in making CSI ping for reporting paid event callback", e8);
            }
            ai2Var.t(q2Var);
        }
    }

    @Override // s2.v0
    public final boolean U0(s2.b5 b5Var) {
        int i7 = v2.n1.f26802b;
        w2.p.e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // s2.v0
    public final void X4(s2.g5 g5Var) {
        p3.o.f("setAdSize must be called on the main UI thread.");
        h21 h21Var = this.f20171t;
        if (h21Var != null) {
            h21Var.l(this.f20172u, g5Var);
        }
    }

    @Override // s2.v0
    public final void Z5(s2.p1 p1Var) {
        int i7 = v2.n1.f26802b;
        w2.p.e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.v0
    public final void a6(s2.a1 a1Var) {
        int i7 = v2.n1.f26802b;
        w2.p.e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.v0
    public final w3.a b() {
        return w3.b.C1(this.f20172u);
    }

    @Override // s2.v0
    public final void d() {
        p3.o.f("destroy must be called on the main UI thread.");
        this.f20171t.a();
    }

    @Override // s2.v0
    public final void e() {
        p3.o.f("destroy must be called on the main UI thread.");
        this.f20171t.c().U0(null);
    }

    @Override // s2.v0
    public final void f() {
        p3.o.f("destroy must be called on the main UI thread.");
        this.f20171t.c().W0(null);
    }

    @Override // s2.v0
    public final void g3(s2.f0 f0Var) {
        int i7 = v2.n1.f26802b;
        w2.p.e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.v0
    public final boolean h() {
        return false;
    }

    @Override // s2.v0
    public final long k0() {
        h21 h21Var = this.f20171t;
        if (h21Var == null || h21Var.e() == null) {
            return 0L;
        }
        return h21Var.e().a();
    }

    @Override // s2.v0
    public final Bundle l() {
        int i7 = v2.n1.f26802b;
        w2.p.e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // s2.v0
    public final void m2(long j7) {
        h21 h21Var = this.f20171t;
        if (h21Var.e() != null) {
            h21Var.e().b(j7);
        }
    }

    @Override // s2.v0
    public final void n() {
        this.f20171t.s();
    }

    @Override // s2.v0
    public final s2.g5 o() {
        p3.o.f("getAdSize must be called on the main UI thread.");
        return c13.a(this.f20168q, Collections.singletonList(this.f20171t.o()));
    }

    @Override // s2.v0
    public final String p() {
        h21 h21Var = this.f20171t;
        if (h21Var.d() != null) {
            return h21Var.d().c();
        }
        return null;
    }

    @Override // s2.v0
    public final s2.y2 r() {
        return this.f20171t.d();
    }

    @Override // s2.v0
    public final String t() {
        return this.f20170s.f17961g;
    }

    @Override // s2.v0
    public final void v2(s2.l1 l1Var) {
        ai2 ai2Var = this.f20170s.f17957c;
        if (ai2Var != null) {
            ai2Var.s(l1Var);
        }
    }

    @Override // s2.v0
    public final String w() {
        h21 h21Var = this.f20171t;
        if (h21Var.d() != null) {
            return h21Var.d().c();
        }
        return null;
    }

    @Override // s2.v0
    public final void x5(boolean z7) {
        int i7 = v2.n1.f26802b;
        w2.p.e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.v0
    public final s2.l1 z() {
        return this.f20170s.f17969o;
    }

    @Override // s2.v0
    public final void k() {
    }

    @Override // s2.v0
    public final void I6(s2.m5 m5Var) {
    }

    @Override // s2.v0
    public final void O1(s2.s1 s1Var) {
    }

    @Override // s2.v0
    public final void Q7(xh0 xh0Var) {
    }

    @Override // s2.v0
    public final void R5(String str) {
    }

    @Override // s2.v0
    public final void U4(String str) {
    }

    @Override // s2.v0
    public final void W1(w3.a aVar) {
    }

    @Override // s2.v0
    public final void Y5(lf0 lf0Var) {
    }

    @Override // s2.v0
    public final void j3(et etVar) {
    }

    @Override // s2.v0
    public final void x6(s2.f3 f3Var) {
    }

    @Override // s2.v0
    public final void z0(boolean z7) {
    }

    @Override // s2.v0
    public final void p3(s2.b5 b5Var, s2.l0 l0Var) {
    }

    @Override // s2.v0
    public final void v4(of0 of0Var, String str) {
    }
}
