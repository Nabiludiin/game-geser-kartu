package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class l53 implements uh1, na1, yh1 {

    /* renamed from: q, reason: collision with root package name */
    private final b63 f11426q;

    /* renamed from: r, reason: collision with root package name */
    private final r53 f11427r;

    l53(Context context, b63 b63Var) {
        this.f11426q = b63Var;
        this.f11427r = q53.a(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.yh1
    public final void a() {
        if (((Boolean) p00.f13597d.e()).booleanValue()) {
            b63 b63Var = this.f11426q;
            r53 r53Var = this.f11427r;
            r53Var.e(true);
            b63Var.a(r53Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.uh1
    public final void g() {
        if (((Boolean) p00.f13597d.e()).booleanValue()) {
            this.f11427r.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.na1
    public final void q(s2.x2 x2Var) {
        if (((Boolean) p00.f13597d.e()).booleanValue()) {
            b63 b63Var = this.f11426q;
            r53 r53Var = this.f11427r;
            r53Var.h0(x2Var.M0().toString());
            r53Var.e(false);
            b63Var.a(r53Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.yh1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.uh1
    public final void f() {
    }
}
