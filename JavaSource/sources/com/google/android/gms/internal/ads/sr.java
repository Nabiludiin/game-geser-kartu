package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class sr implements ur {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15763a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f15764b;

    sr(vr vrVar, Activity activity, Bundle bundle) {
        this.f15763a = activity;
        this.f15764b = bundle;
        Objects.requireNonNull(vrVar);
    }

    @Override // com.google.android.gms.internal.ads.ur
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f15763a, this.f15764b);
    }
}
