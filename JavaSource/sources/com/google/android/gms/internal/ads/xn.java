package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
final class xn implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q, reason: collision with root package name */
    private final Application f18874q;

    /* renamed from: r, reason: collision with root package name */
    private final WeakReference f18875r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18876s = false;

    public xn(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f18875r = new WeakReference(activityLifecycleCallbacks);
        this.f18874q = application;
    }

    protected final void a(wn wnVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f18875r.get();
            if (activityLifecycleCallbacks != null) {
                wnVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f18876s) {
                    return;
                }
                this.f18874q.unregisterActivityLifecycleCallbacks(this);
                this.f18876s = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new pn(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new vn(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new sn(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new rn(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new un(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new qn(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new tn(this, activity));
    }
}
