package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class kn1 extends r41 {
    public static final w04 J = w04.r("3010", "3008", "1005", "1009", "2011", "2007");
    private boolean A;
    private final gk0 B;
    private final fn C;
    private final w2.a D;
    private final Context E;
    private final mn1 F;
    private final di2 G;
    private final Map H;
    private final List I;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f11129l;

    /* renamed from: m, reason: collision with root package name */
    private final pn1 f11130m;

    /* renamed from: n, reason: collision with root package name */
    private final xn1 f11131n;

    /* renamed from: o, reason: collision with root package name */
    private final po1 f11132o;

    /* renamed from: p, reason: collision with root package name */
    private final un1 f11133p;

    /* renamed from: q, reason: collision with root package name */
    private final ao1 f11134q;

    /* renamed from: r, reason: collision with root package name */
    private final h85 f11135r;

    /* renamed from: s, reason: collision with root package name */
    private final h85 f11136s;

    /* renamed from: t, reason: collision with root package name */
    private final h85 f11137t;

    /* renamed from: u, reason: collision with root package name */
    private final h85 f11138u;

    /* renamed from: v, reason: collision with root package name */
    private final h85 f11139v;

    /* renamed from: w, reason: collision with root package name */
    private op1 f11140w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f11141x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f11142y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f11143z;

    public kn1(q41 q41Var, Executor executor, pn1 pn1Var, xn1 xn1Var, po1 po1Var, un1 un1Var, ao1 ao1Var, h85 h85Var, h85 h85Var2, h85 h85Var3, h85 h85Var4, h85 h85Var5, gk0 gk0Var, fn fnVar, w2.a aVar, Context context, mn1 mn1Var, di2 di2Var, jr jrVar) {
        super(q41Var);
        this.f11129l = executor;
        this.f11130m = pn1Var;
        this.f11131n = xn1Var;
        this.f11132o = po1Var;
        this.f11133p = un1Var;
        this.f11134q = ao1Var;
        this.f11135r = h85Var;
        this.f11136s = h85Var2;
        this.f11137t = h85Var3;
        this.f11138u = h85Var4;
        this.f11139v = h85Var5;
        this.B = gk0Var;
        this.C = fnVar;
        this.D = aVar;
        this.E = context;
        this.F = mn1Var;
        this.G = di2Var;
        this.H = new HashMap();
        this.I = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final synchronized void F(op1 op1Var) {
        Iterator<String> keys;
        View view;
        zm b8;
        try {
            if (!this.f11141x) {
                this.f11140w = op1Var;
                this.f11132o.a(op1Var);
                this.f11131n.H0(op1Var.q5(), op1Var.l(), op1Var.k(), op1Var, op1Var);
                if (((Boolean) s2.b0.c().d(uy.Z2)).booleanValue() && (b8 = this.C.b()) != null) {
                    b8.k(op1Var.q5());
                }
                if (((Boolean) s2.b0.c().d(uy.f17057b2)).booleanValue()) {
                    c03 c03Var = this.f14726b;
                    if (c03Var.f6171k0 && (keys = c03Var.f6169j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            op1 op1Var2 = this.f11140w;
                            WeakReference weakReference = op1Var2 == null ? null : (WeakReference) op1Var2.i().get(next);
                            this.H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ir irVar = new ir(this.E, view);
                                this.I.add(irVar);
                                irVar.a(new zm1(this, next));
                            }
                        }
                    }
                }
                if (op1Var.g() != null) {
                    op1Var.g().a(this.B);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void G(op1 op1Var) {
        this.f11131n.I0(op1Var.q5(), op1Var.i());
        if (op1Var.C1() != null) {
            op1Var.C1().setClickable(false);
            op1Var.C1().removeAllViews();
        }
        if (op1Var.g() != null) {
            op1Var.g().b(this.B);
        }
        this.f11140w = null;
    }

    private final synchronized void Q(View view, Map map, Map map2) {
        this.f11132o.c(this.f11140w);
        this.f11131n.T0(view, map, map2, T());
        this.f11142y = true;
    }

    private final synchronized void R(View view, Map map, Map map2) {
        View S;
        if (!this.f11143z && (S = S(map)) != null) {
            if (((Boolean) s2.b0.c().d(uy.ze)).booleanValue()) {
                Rect rect = new Rect();
                if (S.getGlobalVisibleRect(rect, new Point()) && S.getHeight() == rect.height() && S.getWidth() == rect.width()) {
                    this.f11131n.R0(view, map, map2, T());
                    this.f11143z = true;
                }
            } else if (!((Boolean) s2.b0.c().d(uy.Ae)).booleanValue()) {
                ly lyVar = uy.Be;
                if (((Float) s2.b0.c().d(lyVar)).floatValue() > 0.0d) {
                    double floatValue = ((Float) s2.b0.c().d(lyVar)).floatValue();
                    if (S.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r1.height() * r1.width() >= S.getHeight() * S.getWidth() * (floatValue / 100.0d)) {
                            this.f11131n.R0(view, map, map2, T());
                            this.f11143z = true;
                        }
                    }
                }
            } else if (t(S)) {
                this.f11131n.R0(view, map, map2, T());
                this.f11143z = true;
            }
        }
    }

    private final synchronized View S(Map map) {
        if (map != null) {
            w04 w04Var = J;
            int size = w04Var.size();
            int i7 = 0;
            while (i7 < size) {
                WeakReference weakReference = (WeakReference) map.get((String) w04Var.get(i7));
                i7++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType T() {
        op1 op1Var = this.f11140w;
        if (op1Var == null) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        w3.a q7 = op1Var.q();
        if (q7 != null) {
            return (ImageView.ScaleType) w3.b.r0(q7);
        }
        return po1.f13981k;
    }

    private final void U(String str, boolean z7) {
        if (!((Boolean) s2.b0.c().d(uy.W5)).booleanValue()) {
            w("Google", true);
            return;
        }
        a5.d x7 = this.f11130m.x();
        if (x7 == null) {
            return;
        }
        p64.r(x7, new an1(this, "Google", true), this.f11129l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void J(View view, fa2 fa2Var) {
        mr0 w7 = this.f11130m.w();
        if (!this.f11133p.d() || fa2Var == null || w7 == null || view == null) {
            return;
        }
        r2.t.y().a(fa2Var.a(), view);
    }

    public static boolean t(View view) {
        if (!((Boolean) s2.b0.c().d(uy.Fb)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        r2.t.g();
        long a8 = v2.f2.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (a8 >= ((Integer) s2.b0.c().d(uy.Gb)).intValue()) {
                return true;
            }
        }
        return false;
    }

    public final mn1 A() {
        return this.F;
    }

    public final synchronized void B(s2.q2 q2Var) {
        this.G.a(q2Var);
    }

    public final void C(Bundle bundle) {
        final mr0 t7 = this.f11130m.t();
        if (t7 == null) {
            int i7 = v2.n1.f26802b;
            w2.p.c("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.f11129l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hn1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    w04 w04Var = kn1.J;
                    mr0.this.a("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e8) {
            int i8 = v2.n1.f26802b;
            w2.p.d("Error reading event signals", e8);
        }
    }

    final /* synthetic */ void D() {
        try {
            pn1 pn1Var = this.f11130m;
            int k02 = pn1Var.k0();
            if (k02 == 1) {
                l30 a8 = this.f11134q.a();
                if (a8 != null) {
                    U("Google", true);
                    a8.A3((a30) this.f11135r.b());
                    return;
                }
                return;
            }
            if (k02 == 2) {
                i30 b8 = this.f11134q.b();
                if (b8 != null) {
                    U("Google", true);
                    b8.h5((y20) this.f11136s.b());
                    return;
                }
                return;
            }
            if (k02 == 3) {
                r30 f8 = this.f11134q.f(pn1Var.s());
                if (f8 != null) {
                    if (pn1Var.t() != null) {
                        w("Google", true);
                    }
                    f8.Z2((e30) this.f11139v.b());
                    return;
                }
                return;
            }
            if (k02 == 6) {
                y30 c8 = this.f11134q.c();
                if (c8 != null) {
                    U("Google", true);
                    c8.G5((e40) this.f11137t.b());
                    return;
                }
                return;
            }
            if (k02 != 7) {
                int i7 = v2.n1.f26802b;
                w2.p.c("Wrong native template id!");
            } else {
                o80 e8 = this.f11134q.e();
                if (e8 != null) {
                    e8.y1((i80) this.f11138u.b());
                }
            }
        } catch (RemoteException e9) {
            int i8 = v2.n1.f26802b;
            w2.p.d("RemoteException when notifyAdLoad is called", e9);
        }
    }

    final /* synthetic */ void E() {
        this.f11131n.C();
        this.f11130m.F();
    }

    final /* synthetic */ void H(boolean z7) {
        op1 op1Var = this.f11140w;
        if (op1Var != null) {
            this.f11131n.P0(null, op1Var.q5(), this.f11140w.i(), this.f11140w.l(), z7, T(), 0);
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void I(View view, boolean z7, int i7) {
        op1 op1Var = this.f11140w;
        if (op1Var != null) {
            this.f11131n.P0(view, op1Var.q5(), this.f11140w.i(), this.f11140w.l(), z7, T(), i7);
        } else {
            int i8 = v2.n1.f26802b;
            w2.p.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ pn1 K() {
        return this.f11130m;
    }

    public final synchronized void L(String str) {
        this.f11131n.l0(str);
    }

    final /* synthetic */ op1 M() {
        return this.f11140w;
    }

    final /* synthetic */ Map N() {
        return this.H;
    }

    public final synchronized void W() {
        if (this.f11142y) {
            return;
        }
        this.f11131n.o();
    }

    public final synchronized void X(Bundle bundle) {
        this.f11131n.F0(bundle);
    }

    public final synchronized boolean Y(Bundle bundle) {
        if (this.f11142y) {
            return true;
        }
        boolean U0 = this.f11131n.U0(bundle);
        this.f11142y = U0;
        return U0;
    }

    public final synchronized void Z(Bundle bundle) {
        this.f11131n.Q0(bundle);
    }

    @Override // com.google.android.gms.internal.ads.r41
    public final synchronized void a() {
        this.f11141x = true;
        this.f11129l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cn1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                kn1.this.E();
            }
        });
        super.a();
    }

    public final synchronized void a0(final op1 op1Var) {
        if (((Boolean) s2.b0.c().d(uy.Z1)).booleanValue()) {
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dn1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    kn1.this.F(op1Var);
                }
            });
        } else {
            F(op1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.r41
    public final void b() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.in1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                kn1.this.D();
            }
        };
        Executor executor = this.f11129l;
        executor.execute(runnable);
        if (this.f11130m.k0() != 7) {
            final xn1 xn1Var = this.f11131n;
            Objects.requireNonNull(xn1Var);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jn1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    xn1.this.E();
                }
            });
        }
        super.b();
    }

    public final synchronized void b0(final op1 op1Var) {
        if (((Boolean) s2.b0.c().d(uy.Z1)).booleanValue()) {
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.en1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    kn1.this.G(op1Var);
                }
            });
        } else {
            G(op1Var);
        }
    }

    public final synchronized void c0(View view, View view2, Map map, Map map2, boolean z7) {
        mr0 t7;
        this.f11132o.b(this.f11140w);
        this.f11131n.N0(view, view2, map, map2, z7, T());
        if (this.A) {
            pn1 pn1Var = this.f11130m;
            if (pn1Var.t() != null && (t7 = pn1Var.t()) != null) {
                t7.B("onSdkAdUserInteractionClick", new r.a());
            }
        }
    }

    public final synchronized void d0(View view, MotionEvent motionEvent, View view2) {
        this.f11131n.G0(view, motionEvent, view2);
    }

    public final synchronized void e0(View view, Map map, Map map2, boolean z7) {
        if (this.f11142y) {
            R(view, map, map2);
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.f17057b2)).booleanValue() && this.f14726b.f6171k0) {
            Map map3 = this.H;
            Iterator it = map3.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) map3.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z7) {
            Q(view, map, map2);
            R(view, map, map2);
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.f17218u4)).booleanValue() && map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view2 != null && t(view2)) {
                    Q(view, map, map2);
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject f0(View view, Map map, Map map2) {
        return this.f11131n.L0(view, map, map2, T());
    }

    public final synchronized JSONObject g0(View view, Map map, Map map2) {
        return this.f11131n.O0(view, map, map2, T());
    }

    public final synchronized void h0(View view) {
        this.f11131n.J0(view);
    }

    public final synchronized void i0(a40 a40Var) {
        this.f11131n.M0(a40Var);
    }

    public final synchronized void j0() {
        this.f11131n.m();
    }

    public final synchronized void k(s2.g2 g2Var) {
        this.f11131n.K0(g2Var);
    }

    public final synchronized void l(s2.d2 d2Var) {
        this.f11131n.S0(d2Var);
    }

    public final synchronized void m() {
        this.f11131n.f();
    }

    public final synchronized void o() {
        op1 op1Var = this.f11140w;
        if (op1Var == null) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z7 = op1Var instanceof jo1;
            this.f11129l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fn1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    kn1.this.H(z7);
                }
            });
        }
    }

    public final synchronized void p(final View view, final int i7) {
        if (((Boolean) s2.b0.c().d(uy.Bc)).booleanValue()) {
            op1 op1Var = this.f11140w;
            if (op1Var == null) {
                int i8 = v2.n1.f26802b;
                w2.p.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z7 = op1Var instanceof jo1;
                this.f11129l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gn1
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        kn1.this.I(view, z7, i7);
                    }
                });
            }
        }
    }

    public final synchronized boolean q() {
        return this.f11131n.g();
    }

    public final synchronized int r() {
        return this.f11131n.t();
    }

    public final synchronized boolean s() {
        return this.f11131n.z();
    }

    public final boolean u() {
        return this.f11133p.c();
    }

    public final String v() {
        return this.f11133p.f();
    }

    public final fa2 w(String str, boolean z7) {
        boolean z8;
        String str2;
        ba2 ba2Var;
        ca2 ca2Var;
        un1 un1Var = this.f11133p;
        if (un1Var.d() && !TextUtils.isEmpty(str)) {
            pn1 pn1Var = this.f11130m;
            mr0 w7 = pn1Var.w();
            mr0 t7 = pn1Var.t();
            if (w7 == null && t7 == null) {
                int i7 = v2.n1.f26802b;
                w2.p.f("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            un1Var.g();
            int c8 = un1Var.g().c();
            int i8 = c8 - 1;
            boolean z9 = false;
            if (i8 != 0) {
                if (i8 != 1) {
                    String str3 = c8 != 1 ? c8 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    String sb2 = sb.toString();
                    int i9 = v2.n1.f26802b;
                    w2.p.f(sb2);
                    return null;
                }
                if (w7 == null) {
                    int i10 = v2.n1.f26802b;
                    w2.p.f("Omid media type was display but there was no display webview.");
                    return null;
                }
                z8 = false;
                z9 = true;
            } else if (t7 != null) {
                z8 = true;
            } else {
                int i11 = v2.n1.f26802b;
                w2.p.f("Omid media type was video but there was no video webview.");
            }
            if (z9) {
                str2 = null;
            } else {
                str2 = "javascript";
                w7 = t7;
            }
            if (w7 == null) {
                int i12 = v2.n1.f26802b;
                w2.p.f("Webview is null in InternalNativeAd");
                return null;
            }
            if (!r2.t.y().h(this.E)) {
                int i13 = v2.n1.f26802b;
                w2.p.f("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            w2.a aVar = this.D;
            int i14 = aVar.f27052r;
            int i15 = aVar.f27053s;
            StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 1 + String.valueOf(i15).length());
            sb3.append(i14);
            sb3.append(".");
            sb3.append(i15);
            String sb4 = sb3.toString();
            if (z8) {
                ba2Var = ba2.VIDEO;
                ca2Var = ca2.DEFINED_BY_JAVASCRIPT;
            } else {
                ba2Var = ba2.NATIVE_DISPLAY;
                ca2Var = pn1Var.k0() == 3 ? ca2.UNSPECIFIED : ca2.ONE_PIXEL;
            }
            fa2 f8 = r2.t.y().f(sb4, w7.Q(), "", "javascript", str2, str, ca2Var, ba2Var, this.f14726b.f6173l0);
            if (f8 == null) {
                int i16 = v2.n1.f26802b;
                w2.p.f("Failed to create omid session in InternalNativeAd");
                return null;
            }
            pn1Var.d0(f8);
            w7.j1(f8);
            if (z8) {
                m93 a8 = f8.a();
                if (t7 != null) {
                    r2.t.y().a(a8, t7.Z());
                }
                this.A = true;
            }
            if (z7) {
                r2.t.y().b(f8.a());
                w7.B("onSdkLoaded", new r.a());
            }
            return f8;
        }
        return null;
    }

    public final boolean x() {
        return this.f11133p.d();
    }

    public final void y(View view) {
        if (((Boolean) s2.b0.c().d(uy.W5)).booleanValue()) {
            pn1 pn1Var = this.f11130m;
            if (pn1Var.k0() != 3) {
                im0 y7 = pn1Var.y();
                if (y7 == null) {
                    return;
                }
                p64.r(y7, new bn1(this, view), this.f11129l);
                return;
            }
        }
        J(view, this.f11130m.z());
    }

    public final void z(View view) {
        fa2 z7 = this.f11130m.z();
        if (!this.f11133p.d() || z7 == null || view == null) {
            return;
        }
        r2.t.y().c(z7.a(), view);
    }
}
