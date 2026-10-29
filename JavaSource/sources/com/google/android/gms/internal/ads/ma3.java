package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* compiled from: MyApplication */
public class ma3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q, reason: collision with root package name */
    private boolean f12157q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f12158r;

    /* renamed from: s, reason: collision with root package name */
    private la3 f12159s;

    private final boolean a() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || b();
    }

    private final void h(boolean z7) {
        if (this.f12158r != z7) {
            this.f12158r = z7;
            if (this.f12157q) {
                c(z7);
                la3 la3Var = this.f12159s;
                if (la3Var != null) {
                    la3Var.e(z7);
                }
            }
        }
    }

    protected boolean b() {
        return false;
    }

    public final void d(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void e() {
        this.f12157q = true;
        boolean a8 = a();
        this.f12158r = a8;
        c(a8);
    }

    public final void f() {
        this.f12157q = false;
        this.f12159s = null;
    }

    public final void g(la3 la3Var) {
        this.f12159s = la3Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        h(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        h(a());
    }

    protected void c(boolean z7) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
