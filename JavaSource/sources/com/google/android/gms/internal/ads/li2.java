package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class li2 implements qi2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mi2 f11618a;

    li2(mi2 mi2Var) {
        Objects.requireNonNull(mi2Var);
        this.f11618a = mi2Var;
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final void a() {
        synchronized (this.f11618a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        r41 r41Var = (r41) obj;
        mi2 mi2Var = this.f11618a;
        synchronized (mi2Var) {
            mi2Var.e(r41Var.d());
            r41Var.b();
        }
    }
}
