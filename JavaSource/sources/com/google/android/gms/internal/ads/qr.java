package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: MyApplication */
final class qr implements ur {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f14582a;

    qr(vr vrVar, Activity activity) {
        this.f14582a = activity;
        Objects.requireNonNull(vrVar);
    }

    @Override // com.google.android.gms.internal.ads.ur
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f14582a);
    }
}
