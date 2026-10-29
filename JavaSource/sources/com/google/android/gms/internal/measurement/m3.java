package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* compiled from: MyApplication */
final class m3 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Activity f21129u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ o3 f21130v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m3(o3 o3Var, Activity activity) {
        super(o3Var.f21202q, true);
        this.f21129u = activity;
        Objects.requireNonNull(o3Var);
        this.f21130v = o3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21130v.f21202q.j())).onActivityDestroyedByScionActivityInfo(j2.M0(this.f21129u), this.f20939r);
    }
}
