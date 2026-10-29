package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class or implements ur {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f13449a;

    or(vr vrVar, Activity activity) {
        this.f13449a = activity;
        Objects.requireNonNull(vrVar);
    }

    @Override // com.google.android.gms.internal.ads.ur
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f13449a);
    }
}
