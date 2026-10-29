package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class qa0 implements mm0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u90 f14339a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f14340b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ im0 f14341c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ta0 f14342d;

    qa0(ta0 ta0Var, u90 u90Var, Object obj, im0 im0Var) {
        this.f14339a = u90Var;
        this.f14340b = obj;
        this.f14341c = im0Var;
        Objects.requireNonNull(ta0Var);
        this.f14342d = ta0Var;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        v2.n1.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f14340b;
        im0 im0Var = this.f14341c;
        this.f14342d.a(this.f14339a, (ca0) obj, obj2, im0Var);
    }
}
