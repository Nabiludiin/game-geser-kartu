package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class tn implements wn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f16256a;

    tn(xn xnVar, Activity activity) {
        this.f16256a = activity;
        Objects.requireNonNull(xnVar);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f16256a);
    }
}
