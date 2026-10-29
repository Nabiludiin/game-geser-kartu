package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* compiled from: MyApplication */
final class lb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ pb f22337q;

    lb(pb pbVar) {
        Objects.requireNonNull(pbVar);
        this.f22337q = pbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22337q.f22485c;
        w6 w6Var = vbVar.f22928a;
        Context e8 = w6Var.e();
        w6Var.c();
        vbVar.K(new ComponentName(e8, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
