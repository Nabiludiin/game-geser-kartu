package com.google.android.gms.internal.ads;

import android.text.Layout;

/* compiled from: MyApplication */
final class wa {

    /* renamed from: a, reason: collision with root package name */
    private String f18132a;

    /* renamed from: b, reason: collision with root package name */
    private int f18133b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18134c;

    /* renamed from: d, reason: collision with root package name */
    private int f18135d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18136e;

    /* renamed from: k, reason: collision with root package name */
    private float f18142k;

    /* renamed from: l, reason: collision with root package name */
    private String f18143l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f18146o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f18147p;

    /* renamed from: r, reason: collision with root package name */
    private pa f18149r;

    /* renamed from: t, reason: collision with root package name */
    private String f18151t;

    /* renamed from: u, reason: collision with root package name */
    private String f18152u;

    /* renamed from: f, reason: collision with root package name */
    private int f18137f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f18138g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f18139h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f18140i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f18141j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f18144m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f18145n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f18148q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f18150s = Float.MAX_VALUE;

    public final int A() {
        if (this.f18136e) {
            return this.f18135d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final wa B(int i7) {
        this.f18135d = i7;
        this.f18136e = true;
        return this;
    }

    public final boolean C() {
        return this.f18136e;
    }

    public final wa D(float f8) {
        this.f18150s = f8;
        return this;
    }

    public final float E() {
        return this.f18150s;
    }

    public final wa F(wa waVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (waVar != null) {
            if (!this.f18134c && waVar.f18134c) {
                y(waVar.f18133b);
            }
            if (this.f18139h == -1) {
                this.f18139h = waVar.f18139h;
            }
            if (this.f18140i == -1) {
                this.f18140i = waVar.f18140i;
            }
            if (this.f18132a == null && (str = waVar.f18132a) != null) {
                this.f18132a = str;
            }
            if (this.f18137f == -1) {
                this.f18137f = waVar.f18137f;
            }
            if (this.f18138g == -1) {
                this.f18138g = waVar.f18138g;
            }
            if (this.f18145n == -1) {
                this.f18145n = waVar.f18145n;
            }
            if (this.f18146o == null && (alignment2 = waVar.f18146o) != null) {
                this.f18146o = alignment2;
            }
            if (this.f18147p == null && (alignment = waVar.f18147p) != null) {
                this.f18147p = alignment;
            }
            if (this.f18148q == -1) {
                this.f18148q = waVar.f18148q;
            }
            if (this.f18141j == -1) {
                this.f18141j = waVar.f18141j;
                this.f18142k = waVar.f18142k;
            }
            if (this.f18149r == null) {
                this.f18149r = waVar.f18149r;
            }
            if (this.f18150s == Float.MAX_VALUE) {
                this.f18150s = waVar.f18150s;
            }
            if (this.f18151t == null) {
                this.f18151t = waVar.f18151t;
            }
            if (this.f18152u == null) {
                this.f18152u = waVar.f18152u;
            }
            if (!this.f18136e && waVar.f18136e) {
                B(waVar.f18135d);
            }
            if (this.f18144m == -1 && (i7 = waVar.f18144m) != -1) {
                this.f18144m = i7;
            }
        }
        return this;
    }

    public final wa G(String str) {
        this.f18143l = str;
        return this;
    }

    public final String H() {
        return this.f18143l;
    }

    public final wa I(int i7) {
        this.f18144m = i7;
        return this;
    }

    public final int J() {
        return this.f18144m;
    }

    public final wa K(int i7) {
        this.f18145n = i7;
        return this;
    }

    public final int L() {
        return this.f18145n;
    }

    public final Layout.Alignment M() {
        return this.f18146o;
    }

    public final wa N(Layout.Alignment alignment) {
        this.f18146o = alignment;
        return this;
    }

    public final Layout.Alignment a() {
        return this.f18147p;
    }

    public final wa b(Layout.Alignment alignment) {
        this.f18147p = alignment;
        return this;
    }

    public final boolean c() {
        return this.f18148q == 1;
    }

    public final wa d(boolean z7) {
        this.f18148q = z7 ? 1 : 0;
        return this;
    }

    public final pa e() {
        return this.f18149r;
    }

    public final wa f(pa paVar) {
        this.f18149r = paVar;
        return this;
    }

    public final wa g(float f8) {
        this.f18142k = f8;
        return this;
    }

    public final wa h(int i7) {
        this.f18141j = i7;
        return this;
    }

    public final int i() {
        return this.f18141j;
    }

    public final float j() {
        return this.f18142k;
    }

    public final wa k(String str) {
        this.f18151t = str;
        return this;
    }

    public final String l() {
        return this.f18151t;
    }

    public final wa m(String str) {
        this.f18152u = str;
        return this;
    }

    public final String n() {
        return this.f18152u;
    }

    public final int o() {
        int i7 = this.f18139h;
        if (i7 == -1 && this.f18140i == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.f18140i == 1 ? 2 : 0);
    }

    public final boolean p() {
        return this.f18137f == 1;
    }

    public final wa q(boolean z7) {
        this.f18137f = z7 ? 1 : 0;
        return this;
    }

    public final boolean r() {
        return this.f18138g == 1;
    }

    public final wa s(boolean z7) {
        this.f18138g = z7 ? 1 : 0;
        return this;
    }

    public final wa t(boolean z7) {
        this.f18139h = z7 ? 1 : 0;
        return this;
    }

    public final wa u(boolean z7) {
        this.f18140i = z7 ? 1 : 0;
        return this;
    }

    public final String v() {
        return this.f18132a;
    }

    public final wa w(String str) {
        this.f18132a = str;
        return this;
    }

    public final int x() {
        if (this.f18134c) {
            return this.f18133b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final wa y(int i7) {
        this.f18133b = i7;
        this.f18134c = true;
        return this;
    }

    public final boolean z() {
        return this.f18134c;
    }
}
