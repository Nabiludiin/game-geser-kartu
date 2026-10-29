package m3;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: u, reason: collision with root package name */
    private static final c f24768u = new c();

    /* renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f24769q = new AtomicBoolean();

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f24770r = new AtomicBoolean();

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList f24771s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private boolean f24772t = false;

    /* compiled from: MyApplication */
    public interface a {
        void a(boolean z7);
    }

    private c() {
    }

    public static c b() {
        return f24768u;
    }

    public static void c(Application application) {
        c cVar = f24768u;
        synchronized (cVar) {
            try {
                if (!cVar.f24772t) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f24772t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z7) {
        synchronized (f24768u) {
            try {
                ArrayList arrayList = this.f24771s;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((a) obj).a(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f24768u) {
            this.f24771s.add(aVar);
        }
    }

    public boolean d() {
        return this.f24769q.get();
    }

    public boolean e(boolean z7) {
        if (!this.f24770r.get()) {
            if (com.google.android.gms.common.util.q.b()) {
                return z7;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f24770r.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f24769q.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f24770r;
        boolean compareAndSet = this.f24769q.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f24770r;
        boolean compareAndSet = this.f24769q.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f24769q.compareAndSet(false, true)) {
            this.f24770r.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
