package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: MyApplication */
final class u42 implements jd1 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f16575q;

    /* renamed from: r, reason: collision with root package name */
    private final jk0 f16576r;

    u42(Context context, jk0 jk0Var) {
        this.f16575q = context;
        this.f16576r = jk0Var;
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void x(o03 o03Var) {
        String str = o03Var.f13137b.f12530b.f7929e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        jk0 jk0Var = this.f16576r;
        Context context = this.f16575q;
        jk0Var.c(context, o03Var.f13136a.f11326a.f17958d);
        jk0Var.m(context, str);
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
    }
}
