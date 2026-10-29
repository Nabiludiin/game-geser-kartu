package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class l2 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Bundle f21086u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ p3 f21087v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l2(p3 p3Var, Bundle bundle) {
        super(p3Var, true);
        this.f21086u = bundle;
        Objects.requireNonNull(p3Var);
        this.f21087v = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21087v.j())).setConditionalUserProperty(this.f21086u, this.f20938q);
    }
}
