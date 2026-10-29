package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class rn implements wn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15120a;

    rn(xn xnVar, Activity activity) {
        this.f15120a = activity;
        Objects.requireNonNull(xnVar);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f15120a);
    }
}
