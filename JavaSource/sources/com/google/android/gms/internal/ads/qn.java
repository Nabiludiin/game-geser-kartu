package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class qn implements wn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f14511a;

    qn(xn xnVar, Activity activity) {
        this.f14511a = activity;
        Objects.requireNonNull(xnVar);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f14511a);
    }
}
