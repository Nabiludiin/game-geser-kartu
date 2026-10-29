package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class e3 extends f3 {
    final /* synthetic */ p3 A;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Long f20895u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ String f20896v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ String f20897w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ Bundle f20898x;

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ boolean f20899y;

    /* renamed from: z, reason: collision with root package name */
    final /* synthetic */ boolean f20900z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e3(p3 p3Var, Long l7, String str, String str2, Bundle bundle, boolean z7, boolean z8) {
        super(p3Var, true);
        this.f20895u = l7;
        this.f20896v = str;
        this.f20897w = str2;
        this.f20898x = bundle;
        this.f20899y = z7;
        this.f20900z = z8;
        Objects.requireNonNull(p3Var);
        this.A = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        Long l7 = this.f20895u;
        ((v1) p3.o.m(this.A.j())).logEvent(this.f20896v, this.f20897w, this.f20898x, this.f20899y, this.f20900z, l7 == null ? this.f20938q : l7.longValue());
    }
}
