package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ra0 implements km0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ im0 f14810a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u90 f14811b;

    ra0(ta0 ta0Var, im0 im0Var, u90 u90Var) {
        this.f14810a = im0Var;
        this.f14811b = u90Var;
        Objects.requireNonNull(ta0Var);
    }

    @Override // com.google.android.gms.internal.ads.km0
    public final void a() {
        v2.n1.k("callJs > getEngine: Promise rejected");
        this.f14810a.e(new ea0("Unable to obtain a JavascriptEngine."));
        this.f14811b.g();
    }
}
