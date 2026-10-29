package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class un implements wn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f16837a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f16838b;

    un(xn xnVar, Activity activity, Bundle bundle) {
        this.f16837a = activity;
        this.f16838b = bundle;
        Objects.requireNonNull(xnVar);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f16837a, this.f16838b);
    }
}
