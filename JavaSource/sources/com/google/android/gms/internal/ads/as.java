package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
final class as implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q, reason: collision with root package name */
    private Activity f5255q;

    /* renamed from: r, reason: collision with root package name */
    private Context f5256r;

    /* renamed from: x, reason: collision with root package name */
    private Runnable f5262x;

    /* renamed from: z, reason: collision with root package name */
    private long f5264z;

    /* renamed from: s, reason: collision with root package name */
    private final Object f5257s = new Object();

    /* renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f5258t = new AtomicBoolean(true);

    /* renamed from: u, reason: collision with root package name */
    private boolean f5259u = false;

    /* renamed from: v, reason: collision with root package name */
    private final List f5260v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private final List f5261w = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    private boolean f5263y = false;

    as() {
    }

    private final void k(Activity activity) {
        synchronized (this.f5257s) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f5255q = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Application application, Context context) {
        if (this.f5263y) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f5256r = application;
        this.f5264z = ((Long) s2.b0.c().d(uy.f17143l1)).longValue();
        this.f5263y = true;
    }

    public final void b(bs bsVar) {
        synchronized (this.f5257s) {
            this.f5260v.add(bsVar);
        }
    }

    public final void c(bs bsVar) {
        synchronized (this.f5257s) {
            this.f5260v.remove(bsVar);
        }
    }

    public final Activity d() {
        return this.f5255q;
    }

    public final Context e() {
        return this.f5256r;
    }

    final /* synthetic */ Object f() {
        return this.f5257s;
    }

    final /* synthetic */ AtomicBoolean g() {
        return this.f5258t;
    }

    final /* synthetic */ boolean h() {
        return this.f5259u;
    }

    final /* synthetic */ List i() {
        return this.f5260v;
    }

    public final void j(wu1 wu1Var) {
        synchronized (this.f5257s) {
            this.f5261w.add(wu1Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f5257s) {
            try {
                Activity activity2 = this.f5255q;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f5255q = null;
                }
                Iterator it = this.f5261w.iterator();
                while (it.hasNext()) {
                    try {
                        ((wu1) it.next()).g(activity);
                    } catch (Exception e8) {
                        r2.t.l().i(e8, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i7 = v2.n1.f26802b;
                        w2.p.d("", e8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f5257s) {
            Iterator it = this.f5261w.iterator();
            while (it.hasNext()) {
                try {
                    ((wu1) it.next()).f(activity);
                } catch (Exception e8) {
                    r2.t.l().i(e8, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i7 = v2.n1.f26802b;
                    w2.p.d("", e8);
                }
            }
        }
        this.f5259u = true;
        Runnable runnable = this.f5262x;
        if (runnable != null) {
            v2.f2.f26746l.removeCallbacks(runnable);
        }
        of3 of3Var = v2.f2.f26746l;
        zr zrVar = new zr(this);
        this.f5262x = zrVar;
        of3Var.postDelayed(zrVar, this.f5264z);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.f5259u = false;
        boolean andSet = this.f5258t.getAndSet(true);
        Runnable runnable = this.f5262x;
        if (runnable != null) {
            v2.f2.f26746l.removeCallbacks(runnable);
        }
        synchronized (this.f5257s) {
            Iterator it = this.f5261w.iterator();
            while (it.hasNext()) {
                try {
                    ((wu1) it.next()).e(activity);
                } catch (Exception e8) {
                    r2.t.l().i(e8, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i7 = v2.n1.f26802b;
                    w2.p.d("", e8);
                }
            }
            if (andSet) {
                int i8 = v2.n1.f26802b;
                w2.p.a("App is still foreground.");
            } else {
                Iterator it2 = this.f5260v.iterator();
                while (it2.hasNext()) {
                    try {
                        ((bs) it2.next()).r0(true);
                    } catch (Exception e9) {
                        int i9 = v2.n1.f26802b;
                        w2.p.d("", e9);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
