package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
final class vr implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q, reason: collision with root package name */
    private final Application f17720q;

    /* renamed from: r, reason: collision with root package name */
    private final WeakReference f17721r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f17722s = false;

    public vr(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f17721r = new WeakReference(activityLifecycleCallbacks);
        this.f17720q = application;
    }

    protected final void a(ur urVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17721r.get();
            if (activityLifecycleCallbacks != null) {
                urVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f17722s) {
                    return;
                }
                this.f17720q.unregisterActivityLifecycleCallbacks(this);
                this.f17722s = true;
            }
        } catch (Exception e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error while dispatching lifecycle callback.", e8);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new nr(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new tr(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new qr(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new pr(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new sr(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new or(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new rr(this, activity));
    }
}
