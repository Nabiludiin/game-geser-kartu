package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class nr implements ur {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f12860a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f12861b;

    nr(vr vrVar, Activity activity, Bundle bundle) {
        this.f12860a = activity;
        this.f12861b = bundle;
        Objects.requireNonNull(vrVar);
    }

    @Override // com.google.android.gms.internal.ads.ur
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f12860a, this.f12861b);
    }
}
