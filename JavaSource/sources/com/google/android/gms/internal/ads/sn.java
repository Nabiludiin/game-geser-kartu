package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class sn implements wn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15721a;

    sn(xn xnVar, Activity activity) {
        this.f15721a = activity;
        Objects.requireNonNull(xnVar);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f15721a);
    }
}
