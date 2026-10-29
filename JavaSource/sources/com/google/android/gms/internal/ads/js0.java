package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class js0 extends FrameLayout implements mr0 {

    /* renamed from: q, reason: collision with root package name */
    private final mr0 f10732q;

    /* renamed from: r, reason: collision with root package name */
    private final qn0 f10733r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f10734s;

    /* JADX WARN: Multi-variable type inference failed */
    public js0(mr0 mr0Var, rx1 rx1Var) {
        super(mr0Var.getContext());
        this.f10734s = new AtomicBoolean();
        this.f10732q = mr0Var;
        this.f10733r = new qn0(mr0Var.S(), this, this, rx1Var);
        addView((View) mr0Var);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final da2 A0() {
        return this.f10732q.A0();
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void B(String str, Map map) {
        this.f10732q.B(str, map);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void B0() {
        setBackgroundColor(0);
        this.f10732q.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void C(u2.m mVar, boolean z7, boolean z8, String str) {
        this.f10732q.C(mVar, z7, z8, str);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final a13 C0() {
        return this.f10732q.C0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final List D() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt != this.f10732q) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final qp0 D0(String str) {
        return this.f10732q.D0(str);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final int E() {
        return ((Boolean) s2.b0.c().d(uy.f17210t4)).booleanValue() ? this.f10732q.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean E0() {
        return this.f10732q.E0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final x10 F0() {
        return this.f10732q.F0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final WebViewClient G0() {
        return this.f10732q.G0();
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final int H() {
        return ((Boolean) s2.b0.c().d(uy.f17210t4)).booleanValue() ? this.f10732q.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final void H0(us0 us0Var) {
        this.f10732q.H0(us0Var);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean I0() {
        return this.f10732q.I0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void J0(int i7) {
        this.f10732q.J0(i7);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void L0(u2.a0 a0Var) {
        this.f10732q.L0(a0Var);
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void M() {
        mr0 mr0Var = this.f10732q;
        if (mr0Var != null) {
            mr0Var.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void M0(x10 x10Var) {
        this.f10732q.M0(x10Var);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void N0(u2.a0 a0Var) {
        this.f10732q.N0(a0Var);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final u2.a0 O() {
        return this.f10732q.O();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void O0(String str, y50 y50Var) {
        this.f10732q.O0(str, y50Var);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.jt0
    public final fn P() {
        return this.f10732q.P();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void P0(c03 c03Var, f03 f03Var) {
        this.f10732q.P0(c03Var, f03Var);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final WebView Q() {
        return (WebView) this.f10732q;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void Q0(vs vsVar) {
        this.f10732q.Q0(vsVar);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.it0
    public final bu0 R() {
        return this.f10732q.R();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final a5.d R0() {
        return this.f10732q.R0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final Context S() {
        return this.f10732q.S();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void S0(boolean z7) {
        this.f10732q.S0(z7);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.dr0
    public final c03 T() {
        return this.f10732q.T();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void T0(bu0 bu0Var) {
        this.f10732q.T0(bu0Var);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void U() {
        this.f10732q.U();
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void U0(boolean z7) {
        this.f10732q.U0(false);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void V() {
        this.f10732q.V();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void V0(Context context) {
        this.f10732q.V0(context);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean W() {
        return this.f10732q.W();
    }

    final /* synthetic */ void X(boolean z7) {
        final mr0 mr0Var = this.f10732q;
        of3 of3Var = v2.f2.f26746l;
        Objects.requireNonNull(mr0Var);
        of3Var.post(new Runnable() { // from class: com.google.android.gms.internal.ads.es0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                mr0.this.destroy();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void Y0(int i7) {
        this.f10732q.Y0(i7);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void Z0(boolean z7) {
        this.f10732q.Z0(z7);
    }

    @Override // com.google.android.gms.internal.ads.q80, com.google.android.gms.internal.ads.s80
    public final void a(String str, JSONObject jSONObject) {
        this.f10732q.a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void a1(String str, String str2, String str3) {
        this.f10732q.a1(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.e90, com.google.android.gms.internal.ads.s80
    public final void b(String str) {
        ((rs0) this.f10732q).c1(str);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void b1(boolean z7, long j7) {
        this.f10732q.b1(z7, j7);
    }

    @Override // com.google.android.gms.internal.ads.e90
    public final void c(String str, JSONObject jSONObject) {
        ((rs0) this.f10732q).h(str, jSONObject.toString());
    }

    @Override // s2.a
    public final void c0() {
        mr0 mr0Var = this.f10732q;
        if (mr0Var != null) {
            mr0Var.c0();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean canGoBack() {
        return this.f10732q.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void d(boolean z7, int i7, String str, String str2, boolean z8) {
        this.f10732q.d(z7, i7, str, str2, z8);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void d1(u10 u10Var) {
        this.f10732q.d1(u10Var);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void destroy() {
        final da2 A0;
        final fa2 k02 = k0();
        if (k02 != null) {
            of3 of3Var = v2.f2.f26746l;
            of3Var.post(new Runnable() { // from class: com.google.android.gms.internal.ads.is0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    r2.t.y().k(fa2.this.a());
                }
            });
            final mr0 mr0Var = this.f10732q;
            Objects.requireNonNull(mr0Var);
            of3Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.fs0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    mr0.this.destroy();
                }
            }, ((Integer) s2.b0.c().d(uy.Q5)).intValue());
            return;
        }
        if (!((Boolean) s2.b0.c().d(uy.S5)).booleanValue() || (A0 = A0()) == null) {
            this.f10732q.destroy();
        } else {
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gs0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    final js0 js0Var = js0.this;
                    A0.e(new y93() { // from class: com.google.android.gms.internal.ads.hs0
                        @Override // com.google.android.gms.internal.ads.y93
                        public final /* synthetic */ void r0(boolean z7) {
                            js0.this.X(true);
                        }
                    });
                }
            });
        }
    }

    @Override // r2.n
    public final void e() {
        this.f10732q.e();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void e1(da2 da2Var) {
        this.f10732q.e1(da2Var);
    }

    @Override // r2.n
    public final void f() {
        this.f10732q.f();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final String f0() {
        return this.f10732q.f0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void f1(boolean z7) {
        this.f10732q.f1(true);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final us0 g() {
        return this.f10732q.g();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void g0() {
        this.f10732q.g0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void goBack() {
        this.f10732q.goBack();
    }

    @Override // com.google.android.gms.internal.ads.e90, com.google.android.gms.internal.ads.s80
    public final void h(String str, String str2) {
        this.f10732q.h("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void h1(int i7) {
        this.f10732q.h1(i7);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.at0, com.google.android.gms.internal.ads.bo0
    public final Activity i() {
        return this.f10732q.i();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean i1() {
        return this.f10734s.get();
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final hz j() {
        return this.f10732q.j();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void j1(fa2 fa2Var) {
        this.f10732q.j1(fa2Var);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void k() {
        this.f10732q.k();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final fa2 k0() {
        return this.f10732q.k0();
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final r2.a l() {
        return this.f10732q.l();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void l1(boolean z7) {
        this.f10732q.l1(z7);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void loadData(String str, String str2, String str3) {
        this.f10732q.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f10732q.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void loadUrl(String str) {
        this.f10732q.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final iz m() {
        return this.f10732q.m();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void m0() {
        this.f10733r.f();
        this.f10732q.m0();
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final String n() {
        return this.f10732q.n();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean n0() {
        return this.f10732q.n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean n1(boolean z7, int i7) {
        if (!this.f10734s.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) s2.b0.c().d(uy.f17074d1)).booleanValue()) {
            return false;
        }
        mr0 mr0Var = this.f10732q;
        if (mr0Var.getParent() instanceof ViewGroup) {
            ((ViewGroup) mr0Var.getParent()).removeView((View) mr0Var);
        }
        mr0Var.n1(z7, i7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final String o() {
        return this.f10732q.o();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void o0() {
        this.f10732q.o0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void o1(String str, com.google.android.gms.common.util.o oVar) {
        this.f10732q.o1(str, oVar);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void onPause() {
        this.f10733r.e();
        this.f10732q.onPause();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void onResume() {
        this.f10732q.onResume();
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.kt0, com.google.android.gms.internal.ads.bo0
    public final w2.a p() {
        return this.f10732q.p();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void p1(boolean z7) {
        this.f10732q.p1(z7);
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void q(String str, String str2, int i7) {
        this.f10732q.q(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean q0() {
        return this.f10732q.q0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void q1(boolean z7) {
        this.f10732q.q1(z7);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void r0() {
        this.f10732q.r0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void r1(boolean z7) {
        this.f10732q.r1(z7);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final int s() {
        return this.f10732q.s();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final ot0 s0() {
        return ((rs0) this.f10732q).v1();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void s1(String str, y50 y50Var) {
        this.f10732q.s1(str, y50Var);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.mr0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10732q.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.mr0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f10732q.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f10732q.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f10732q.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final void t(fr frVar) {
        this.f10732q.t(frVar);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.vs0
    public final f03 t0() {
        return this.f10732q.t0();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void u0() {
        fa2 k02;
        da2 A0;
        TextView textView = new TextView(getContext());
        r2.t.g();
        textView.setText(v2.f2.c());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && (A0 = A0()) != null) {
            A0.f(textView);
        } else if (((Boolean) s2.b0.c().d(uy.R5)).booleanValue() && (k02 = k0()) != null && k02.b()) {
            r2.t.y().c(k02.a(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void v(boolean z7, int i7, boolean z8) {
        this.f10732q.v(z7, i7, z8);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final u2.a0 v0() {
        return this.f10732q.v0();
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void w0(int i7) {
        this.f10733r.g(i7);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void x() {
        this.f10732q.x();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final vs x0() {
        return this.f10732q.x0();
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void y(boolean z7, int i7, String str, boolean z8, boolean z9) {
        this.f10732q.y(z7, i7, str, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final qn0 y0() {
        return this.f10733r;
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void z() {
        mr0 mr0Var = this.f10732q;
        if (mr0Var != null) {
            mr0Var.z();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final void z0(String str, qp0 qp0Var) {
        this.f10732q.z0(str, qp0Var);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.lt0
    public final View Z() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void K0(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void W0(int i7) {
    }
}
