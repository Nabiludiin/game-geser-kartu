package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class pn implements wn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f13930a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f13931b;

    pn(xn xnVar, Activity activity, Bundle bundle) {
        this.f13930a = activity;
        this.f13931b = bundle;
        Objects.requireNonNull(xnVar);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f13930a, this.f13931b);
    }
}
