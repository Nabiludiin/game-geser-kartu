package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class pr implements ur {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f14025a;

    pr(vr vrVar, Activity activity) {
        this.f14025a = activity;
        Objects.requireNonNull(vrVar);
    }

    @Override // com.google.android.gms.internal.ads.ur
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f14025a);
    }
}
