package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class pn1 {

    /* renamed from: a, reason: collision with root package name */
    private int f13942a;

    /* renamed from: b, reason: collision with root package name */
    private s2.b3 f13943b;

    /* renamed from: c, reason: collision with root package name */
    private e20 f13944c;

    /* renamed from: d, reason: collision with root package name */
    private View f13945d;

    /* renamed from: e, reason: collision with root package name */
    private List f13946e;

    /* renamed from: g, reason: collision with root package name */
    private s2.u3 f13948g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f13949h;

    /* renamed from: i, reason: collision with root package name */
    private mr0 f13950i;

    /* renamed from: j, reason: collision with root package name */
    private mr0 f13951j;

    /* renamed from: k, reason: collision with root package name */
    private mr0 f13952k;

    /* renamed from: l, reason: collision with root package name */
    private fa2 f13953l;

    /* renamed from: m, reason: collision with root package name */
    private a5.d f13954m;

    /* renamed from: n, reason: collision with root package name */
    private im0 f13955n;

    /* renamed from: o, reason: collision with root package name */
    private View f13956o;

    /* renamed from: p, reason: collision with root package name */
    private View f13957p;

    /* renamed from: q, reason: collision with root package name */
    private w3.a f13958q;

    /* renamed from: r, reason: collision with root package name */
    private double f13959r;

    /* renamed from: s, reason: collision with root package name */
    private l20 f13960s;

    /* renamed from: t, reason: collision with root package name */
    private l20 f13961t;

    /* renamed from: u, reason: collision with root package name */
    private String f13962u;

    /* renamed from: x, reason: collision with root package name */
    private float f13965x;

    /* renamed from: y, reason: collision with root package name */
    private String f13966y;

    /* renamed from: v, reason: collision with root package name */
    private final r.h f13963v = new r.h();

    /* renamed from: w, reason: collision with root package name */
    private final r.h f13964w = new r.h();

    /* renamed from: f, reason: collision with root package name */
    private List f13947f = Collections.EMPTY_LIST;

    public static pn1 G(yb0 yb0Var) {
        try {
            return L(N(yb0Var.o(), yb0Var), yb0Var.q(), (View) M(yb0Var.s()), yb0Var.c(), yb0Var.e(), yb0Var.f(), yb0Var.p(), yb0Var.j(), (View) M(yb0Var.m()), yb0Var.w(), yb0Var.k(), yb0Var.n(), yb0Var.l(), yb0Var.g(), yb0Var.i(), yb0Var.x());
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Failed to get native ad assets from unified ad mapper", e8);
            return null;
        }
    }

    public static pn1 H(vb0 vb0Var) {
        try {
            on1 N = N(vb0Var.v3(), null);
            e20 a42 = vb0Var.a4();
            View view = (View) M(vb0Var.w());
            String c8 = vb0Var.c();
            List e8 = vb0Var.e();
            String f8 = vb0Var.f();
            Bundle H2 = vb0Var.H2();
            String j7 = vb0Var.j();
            View view2 = (View) M(vb0Var.t());
            w3.a z7 = vb0Var.z();
            String i7 = vb0Var.i();
            l20 g8 = vb0Var.g();
            pn1 pn1Var = new pn1();
            pn1Var.f13942a = 1;
            pn1Var.f13943b = N;
            pn1Var.f13944c = a42;
            pn1Var.f13945d = view;
            pn1Var.f0("headline", c8);
            pn1Var.f13946e = e8;
            pn1Var.f0("body", f8);
            pn1Var.f13949h = H2;
            pn1Var.f0("call_to_action", j7);
            pn1Var.f13956o = view2;
            pn1Var.f13958q = z7;
            pn1Var.f0("advertiser", i7);
            pn1Var.f13961t = g8;
            return pn1Var;
        } catch (RemoteException e9) {
            int i8 = v2.n1.f26802b;
            w2.p.g("Failed to get native ad from content ad mapper", e9);
            return null;
        }
    }

    public static pn1 I(ub0 ub0Var) {
        pn1 pn1Var;
        try {
            on1 N = N(ub0Var.u4(), null);
            e20 P4 = ub0Var.P4();
            View view = (View) M(ub0Var.t());
            String c8 = ub0Var.c();
            List e8 = ub0Var.e();
            String f8 = ub0Var.f();
            Bundle v32 = ub0Var.v3();
            String j7 = ub0Var.j();
            View view2 = (View) M(ub0Var.Z4());
            w3.a q52 = ub0Var.q5();
            String H2 = ub0Var.H2();
            String k7 = ub0Var.k();
            double D2 = ub0Var.D2();
            l20 g8 = ub0Var.g();
            pn1Var = null;
            try {
                pn1 pn1Var2 = new pn1();
                pn1Var2.f13942a = 2;
                pn1Var2.f13943b = N;
                pn1Var2.f13944c = P4;
                pn1Var2.f13945d = view;
                pn1Var2.f0("headline", c8);
                pn1Var2.f13946e = e8;
                pn1Var2.f0("body", f8);
                pn1Var2.f13949h = v32;
                pn1Var2.f0("call_to_action", j7);
                pn1Var2.f13956o = view2;
                pn1Var2.f13958q = q52;
                pn1Var2.f0("store", H2);
                pn1Var2.f0("price", k7);
                pn1Var2.f13959r = D2;
                pn1Var2.f13960s = g8;
                return pn1Var2;
            } catch (RemoteException e9) {
                e = e9;
                int i7 = v2.n1.f26802b;
                w2.p.g("Failed to get native ad from app install ad mapper", e);
                return pn1Var;
            }
        } catch (RemoteException e10) {
            e = e10;
            pn1Var = null;
        }
    }

    public static pn1 J(ub0 ub0Var) {
        try {
            return L(N(ub0Var.u4(), null), ub0Var.P4(), (View) M(ub0Var.t()), ub0Var.c(), ub0Var.e(), ub0Var.f(), ub0Var.v3(), ub0Var.j(), (View) M(ub0Var.Z4()), ub0Var.q5(), ub0Var.H2(), ub0Var.k(), ub0Var.D2(), ub0Var.g(), null, 0.0f);
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Failed to get native ad assets from app install ad mapper", e8);
            return null;
        }
    }

    public static pn1 K(vb0 vb0Var) {
        try {
            return L(N(vb0Var.v3(), null), vb0Var.a4(), (View) M(vb0Var.w()), vb0Var.c(), vb0Var.e(), vb0Var.f(), vb0Var.H2(), vb0Var.j(), (View) M(vb0Var.t()), vb0Var.z(), null, null, -1.0d, vb0Var.g(), vb0Var.i(), 0.0f);
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Failed to get native ad assets from content ad mapper", e8);
            return null;
        }
    }

    private static pn1 L(s2.b3 b3Var, e20 e20Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, w3.a aVar, String str4, String str5, double d8, l20 l20Var, String str6, float f8) {
        pn1 pn1Var = new pn1();
        pn1Var.f13942a = 6;
        pn1Var.f13943b = b3Var;
        pn1Var.f13944c = e20Var;
        pn1Var.f13945d = view;
        pn1Var.f0("headline", str);
        pn1Var.f13946e = list;
        pn1Var.f0("body", str2);
        pn1Var.f13949h = bundle;
        pn1Var.f0("call_to_action", str3);
        pn1Var.f13956o = view2;
        pn1Var.f13958q = aVar;
        pn1Var.f0("store", str4);
        pn1Var.f0("price", str5);
        pn1Var.f13959r = d8;
        pn1Var.f13960s = l20Var;
        pn1Var.f0("advertiser", str6);
        pn1Var.h0(f8);
        return pn1Var;
    }

    private static Object M(w3.a aVar) {
        if (aVar == null) {
            return null;
        }
        return w3.b.r0(aVar);
    }

    private static on1 N(s2.b3 b3Var, yb0 yb0Var) {
        if (b3Var == null) {
            return null;
        }
        return new on1(b3Var, yb0Var);
    }

    public final synchronized void A(int i7) {
        this.f13942a = i7;
    }

    public final synchronized r.h B() {
        return this.f13963v;
    }

    public final synchronized float C() {
        return this.f13965x;
    }

    public final synchronized String D() {
        return this.f13966y;
    }

    public final synchronized r.h E() {
        return this.f13964w;
    }

    public final synchronized void F() {
        try {
            mr0 mr0Var = this.f13950i;
            if (mr0Var != null) {
                mr0Var.destroy();
                this.f13950i = null;
            }
            mr0 mr0Var2 = this.f13951j;
            if (mr0Var2 != null) {
                mr0Var2.destroy();
                this.f13951j = null;
            }
            mr0 mr0Var3 = this.f13952k;
            if (mr0Var3 != null) {
                mr0Var3.destroy();
                this.f13952k = null;
            }
            a5.d dVar = this.f13954m;
            if (dVar != null) {
                dVar.cancel(false);
                this.f13954m = null;
            }
            im0 im0Var = this.f13955n;
            if (im0Var != null) {
                im0Var.cancel(false);
                this.f13955n = null;
            }
            this.f13953l = null;
            this.f13963v.clear();
            this.f13964w.clear();
            this.f13943b = null;
            this.f13944c = null;
            this.f13945d = null;
            this.f13946e = null;
            this.f13949h = null;
            this.f13956o = null;
            this.f13957p = null;
            this.f13958q = null;
            this.f13960s = null;
            this.f13961t = null;
            this.f13962u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void O(s2.b3 b3Var) {
        this.f13943b = b3Var;
    }

    public final synchronized void P(e20 e20Var) {
        this.f13944c = e20Var;
    }

    public final synchronized void Q(List list) {
        this.f13946e = list;
    }

    public final synchronized void R(List list) {
        this.f13947f = list;
    }

    public final synchronized void S(s2.u3 u3Var) {
        this.f13948g = u3Var;
    }

    public final synchronized void T(View view) {
        this.f13956o = view;
    }

    public final synchronized void U(View view) {
        this.f13957p = view;
    }

    public final synchronized void V(double d8) {
        this.f13959r = d8;
    }

    public final synchronized void W(l20 l20Var) {
        this.f13960s = l20Var;
    }

    public final synchronized void X(l20 l20Var) {
        this.f13961t = l20Var;
    }

    public final synchronized void Y(String str) {
        this.f13962u = str;
    }

    public final synchronized void Z(mr0 mr0Var) {
        this.f13950i = mr0Var;
    }

    public final synchronized View a() {
        return this.f13945d;
    }

    public final synchronized void a0(mr0 mr0Var) {
        this.f13951j = mr0Var;
    }

    public final synchronized String b() {
        return j0("headline");
    }

    public final synchronized void b0(mr0 mr0Var) {
        this.f13952k = mr0Var;
    }

    public final synchronized List c() {
        return this.f13946e;
    }

    public final synchronized void c0(a5.d dVar) {
        this.f13954m = dVar;
    }

    public final l20 d() {
        List list = this.f13946e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f13946e.get(0);
        if (obj instanceof IBinder) {
            return k20.j8((IBinder) obj);
        }
        return null;
    }

    public final synchronized void d0(fa2 fa2Var) {
        this.f13953l = fa2Var;
    }

    public final synchronized List e() {
        return this.f13947f;
    }

    public final synchronized void e0(im0 im0Var) {
        this.f13955n = im0Var;
    }

    public final synchronized s2.u3 f() {
        return this.f13948g;
    }

    public final synchronized void f0(String str, String str2) {
        if (str2 == null) {
            this.f13964w.remove(str);
        } else {
            this.f13964w.put(str, str2);
        }
    }

    public final synchronized String g() {
        return j0("body");
    }

    public final synchronized void g0(String str, v10 v10Var) {
        if (v10Var == null) {
            this.f13963v.remove(str);
        } else {
            this.f13963v.put(str, v10Var);
        }
    }

    public final synchronized Bundle h() {
        try {
            if (this.f13949h == null) {
                this.f13949h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13949h;
    }

    public final synchronized void h0(float f8) {
        this.f13965x = f8;
    }

    public final synchronized String i() {
        return j0("call_to_action");
    }

    public final synchronized void i0(String str) {
        this.f13966y = str;
    }

    public final synchronized View j() {
        return this.f13956o;
    }

    public final synchronized String j0(String str) {
        return (String) this.f13964w.get(str);
    }

    public final synchronized View k() {
        return this.f13957p;
    }

    public final synchronized int k0() {
        return this.f13942a;
    }

    public final synchronized w3.a l() {
        return this.f13958q;
    }

    public final synchronized s2.b3 l0() {
        return this.f13943b;
    }

    public final synchronized String m() {
        return j0("store");
    }

    public final synchronized e20 m0() {
        return this.f13944c;
    }

    public final synchronized String n() {
        return j0("price");
    }

    public final synchronized double o() {
        return this.f13959r;
    }

    public final synchronized l20 p() {
        return this.f13960s;
    }

    public final synchronized String q() {
        return j0("advertiser");
    }

    public final synchronized l20 r() {
        return this.f13961t;
    }

    public final synchronized String s() {
        return this.f13962u;
    }

    public final synchronized mr0 t() {
        return this.f13950i;
    }

    public final synchronized mr0 u() {
        return this.f13951j;
    }

    public final synchronized boolean v() {
        return this.f13951j != null;
    }

    public final synchronized mr0 w() {
        return this.f13952k;
    }

    public final synchronized a5.d x() {
        return this.f13954m;
    }

    public final synchronized im0 y() {
        return this.f13955n;
    }

    public final synchronized fa2 z() {
        return this.f13953l;
    }
}
