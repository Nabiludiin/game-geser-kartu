package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class m2 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ String f21125u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ String f21126v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ Bundle f21127w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ p3 f21128x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m2(p3 p3Var, String str, String str2, Bundle bundle) {
        super(p3Var, true);
        this.f21125u = str;
        this.f21126v = str2;
        this.f21127w = bundle;
        Objects.requireNonNull(p3Var);
        this.f21128x = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21128x.j())).clearConditionalUserProperty(this.f21125u, this.f21126v, this.f21127w);
    }
}
