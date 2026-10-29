package p4;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class a0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: q, reason: collision with root package name */
    private final Activity f25286q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ e0 f25287r;

    public a0(e0 e0Var, Activity activity) {
        this.f25287r = e0Var;
        this.f25286q = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        Application application;
        application = this.f25287r.f25330a;
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Dialog dialog;
        Dialog dialog2;
        u0 u0Var;
        AtomicReference atomicReference;
        Dialog dialog3;
        Dialog dialog4;
        Application application;
        AtomicReference atomicReference2;
        u0 u0Var2;
        e0 e0Var = this.f25287r;
        dialog = e0Var.f25335f;
        if (dialog == null || !e0Var.f25341l) {
            return;
        }
        dialog2 = e0Var.f25335f;
        dialog2.setOwnerActivity(activity);
        u0Var = e0Var.f25331b;
        if (u0Var != null) {
            u0Var2 = e0Var.f25331b;
            u0Var2.a(activity);
        }
        atomicReference = e0Var.f25340k;
        a0 a0Var = (a0) atomicReference.getAndSet(null);
        if (a0Var != null) {
            a0Var.b();
            a0 a0Var2 = new a0(e0Var, activity);
            application = e0Var.f25330a;
            application.registerActivityLifecycleCallbacks(a0Var2);
            atomicReference2 = e0Var.f25340k;
            atomicReference2.set(a0Var2);
        }
        dialog3 = e0Var.f25335f;
        if (dialog3 != null) {
            dialog4 = e0Var.f25335f;
            dialog4.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        Dialog dialog2;
        if (activity != this.f25286q) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            e0 e0Var = this.f25287r;
            if (e0Var.f25341l) {
                dialog = e0Var.f25335f;
                if (dialog != null) {
                    dialog2 = e0Var.f25335f;
                    dialog2.dismiss();
                    return;
                }
            }
        }
        this.f25287r.i(new u2(3, "Activity is destroyed."));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
