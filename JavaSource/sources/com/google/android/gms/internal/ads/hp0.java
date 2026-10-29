package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class hp0 extends v2.b0 {

    /* renamed from: c, reason: collision with root package name */
    final bo0 f9600c;

    /* renamed from: d, reason: collision with root package name */
    final qp0 f9601d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9602e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f9603f;

    hp0(bo0 bo0Var, qp0 qp0Var, String str, String[] strArr) {
        this.f9600c = bo0Var;
        this.f9601d = qp0Var;
        this.f9602e = str;
        this.f9603f = strArr;
        r2.t.b().g(this);
    }

    @Override // v2.b0
    public final void a() {
        try {
            this.f9601d.h(this.f9602e, this.f9603f);
        } finally {
            v2.f2.f26746l.post(new fp0(this));
        }
    }

    @Override // v2.b0
    public final a5.d b() {
        return (((Boolean) s2.b0.c().d(uy.f17160n2)).booleanValue() && (this.f9601d instanceof zp0)) ? cm0.f6505f.B0(new Callable() { // from class: com.google.android.gms.internal.ads.gp0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return hp0.this.e();
            }
        }) : super.b();
    }

    public final String d() {
        return this.f9602e;
    }

    final /* synthetic */ Boolean e() {
        return Boolean.valueOf(this.f9601d.j(this.f9602e, this.f9603f, this));
    }
}
