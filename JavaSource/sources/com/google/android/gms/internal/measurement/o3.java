package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class o3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ p3 f21202q;

    o3(p3 p3Var) {
        Objects.requireNonNull(p3Var);
        this.f21202q = p3Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f21202q.f(new g3(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f21202q.f(new m3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f21202q.f(new j3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f21202q.f(new i3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        s1 s1Var = new s1();
        this.f21202q.f(new l3(this, activity, s1Var));
        Bundle C1 = s1Var.C1(50L);
        if (C1 != null) {
            bundle.putAll(C1);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f21202q.f(new h3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f21202q.f(new k3(this, activity));
    }
}
