package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class tr implements ur {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f16317a;

    tr(vr vrVar, Activity activity) {
        this.f16317a = activity;
        Objects.requireNonNull(vrVar);
    }

    @Override // com.google.android.gms.internal.ads.ur
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f16317a);
    }
}
