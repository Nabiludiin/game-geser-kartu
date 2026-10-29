package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* compiled from: MyApplication */
final class l3 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Activity f21088u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ s1 f21089v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ o3 f21090w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l3(o3 o3Var, Activity activity, s1 s1Var) {
        super(o3Var.f21202q, true);
        this.f21088u = activity;
        this.f21089v = s1Var;
        Objects.requireNonNull(o3Var);
        this.f21090w = o3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    final void a() {
        ((v1) p3.o.m(this.f21090w.f21202q.j())).onActivitySaveInstanceStateByScionActivityInfo(j2.M0(this.f21088u), this.f21089v, this.f20939r);
    }
}
