package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
final class b3 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ String f20830u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ Object f20831v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ p3 f20832w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b3(p3 p3Var, boolean z7, int i7, String str, Object obj, Object obj2, Object obj3) {
        super(p3Var, false);
        this.f20830u = str;
        this.f20831v = obj;
        Objects.requireNonNull(p3Var);
        this.f20832w = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f20832w.j())).logHealthData(5, this.f20830u, w3.b.C1(this.f20831v), w3.b.C1(null), w3.b.C1(null));
    }
}
