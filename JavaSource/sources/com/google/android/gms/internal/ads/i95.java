package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: MyApplication */
public final class i95 {

    /* renamed from: a, reason: collision with root package name */
    final Context f9903a;

    /* renamed from: b, reason: collision with root package name */
    pd1 f9904b;

    /* renamed from: c, reason: collision with root package name */
    jy3 f9905c;

    /* renamed from: d, reason: collision with root package name */
    jy3 f9906d;

    /* renamed from: e, reason: collision with root package name */
    jy3 f9907e;

    /* renamed from: f, reason: collision with root package name */
    jy3 f9908f;

    /* renamed from: g, reason: collision with root package name */
    jy3 f9909g;

    /* renamed from: h, reason: collision with root package name */
    hx3 f9910h;

    /* renamed from: i, reason: collision with root package name */
    Looper f9911i;

    /* renamed from: j, reason: collision with root package name */
    int f9912j;

    /* renamed from: k, reason: collision with root package name */
    mb1 f9913k;

    /* renamed from: l, reason: collision with root package name */
    int f9914l;

    /* renamed from: m, reason: collision with root package name */
    boolean f9915m;

    /* renamed from: n, reason: collision with root package name */
    yc5 f9916n;

    /* renamed from: o, reason: collision with root package name */
    xc5 f9917o;

    /* renamed from: p, reason: collision with root package name */
    long f9918p;

    /* renamed from: q, reason: collision with root package name */
    long f9919q;

    /* renamed from: r, reason: collision with root package name */
    int f9920r;

    /* renamed from: s, reason: collision with root package name */
    int f9921s;

    /* renamed from: t, reason: collision with root package name */
    int f9922t;

    /* renamed from: u, reason: collision with root package name */
    int f9923u;

    /* renamed from: v, reason: collision with root package name */
    boolean f9924v;

    /* renamed from: w, reason: collision with root package name */
    boolean f9925w;

    /* renamed from: x, reason: collision with root package name */
    String f9926x;

    /* renamed from: y, reason: collision with root package name */
    jx4 f9927y;

    public i95(final Context context, final vc5 vc5Var) {
        jy3 jy3Var = new jy3() { // from class: com.google.android.gms.internal.ads.h95
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                return vc5.this;
            }
        };
        jy3 jy3Var2 = new jy3() { // from class: com.google.android.gms.internal.ads.e75
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                return new kp5(context, new g2());
            }
        };
        jy3 jy3Var3 = new jy3() { // from class: com.google.android.gms.internal.ads.f85
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                return new xt5(context);
            }
        };
        d65 d65Var = d65.f6937q;
        jy3 jy3Var4 = new jy3() { // from class: com.google.android.gms.internal.ads.e95
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                return tu5.e(context);
            }
        };
        c55 c55Var = c55.f6268a;
        context.getClass();
        this.f9903a = context;
        this.f9905c = jy3Var;
        this.f9906d = jy3Var2;
        this.f9907e = jy3Var3;
        this.f9908f = d65Var;
        this.f9909g = jy3Var4;
        this.f9910h = c55Var;
        this.f9911i = hi2.B();
        this.f9913k = mb1.f12165b;
        this.f9914l = 1;
        this.f9915m = true;
        this.f9916n = yc5.f19504e;
        this.f9917o = xc5.f18749i;
        this.f9927y = new jx4(0.97f, 1.03f, 1000L, 1.0E-7f, hi2.N(20L), hi2.N(500L), 0.999f, null);
        this.f9904b = pd1.f13828a;
        this.f9918p = 500L;
        this.f9919q = 2000L;
        this.f9920r = 600000;
        this.f9921s = Integer.MAX_VALUE;
        this.f9922t = Integer.MAX_VALUE;
        this.f9923u = 600000;
        this.f9924v = true;
        this.f9926x = "";
        this.f9912j = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i7 = a35.f4714a;
        }
    }
}
