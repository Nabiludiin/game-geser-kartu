package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class vn implements wn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f17677a;

    vn(xn xnVar, Activity activity) {
        this.f17677a = activity;
        Objects.requireNonNull(xnVar);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f17677a);
    }
}
