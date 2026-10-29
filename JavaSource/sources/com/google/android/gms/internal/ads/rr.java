package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class rr implements ur {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15158a;

    rr(vr vrVar, Activity activity) {
        this.f15158a = activity;
        Objects.requireNonNull(vrVar);
    }

    @Override // com.google.android.gms.internal.ads.ur
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f15158a);
    }
}
