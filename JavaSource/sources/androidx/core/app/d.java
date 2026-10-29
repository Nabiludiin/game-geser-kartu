package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: MyApplication */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class f1553a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f1554b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f1555c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f1556d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f1557e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f1558f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f1559g = new Handler(Looper.getMainLooper());

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ C0021d f1560q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Object f1561r;

        a(C0021d c0021d, Object obj) {
            this.f1560q = c0021d;
            this.f1561r = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1560q.f1566q = this.f1561r;
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Application f1562q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ C0021d f1563r;

        b(Application application, C0021d c0021d) {
            this.f1562q = application;
            this.f1563r = c0021d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1562q.unregisterActivityLifecycleCallbacks(this.f1563r);
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Object f1564q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Object f1565r;

        c(Object obj, Object obj2) {
            this.f1564q = obj;
            this.f1565r = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f1556d;
                if (method != null) {
                    method.invoke(this.f1564q, this.f1565r, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f1557e.invoke(this.f1564q, this.f1565r, Boolean.FALSE);
                }
            } catch (RuntimeException e8) {
                if (e8.getClass() == RuntimeException.class && e8.getMessage() != null && e8.getMessage().startsWith("Unable to stop")) {
                    throw e8;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class a8 = a();
        f1553a = a8;
        f1554b = b();
        f1555c = f();
        f1556d = d(a8);
        f1557e = c(a8);
        f1558f = e(a8);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 == 26 || i7 == 27;
    }

    protected static boolean h(Object obj, int i7, Activity activity) {
        try {
            Object obj2 = f1555c.get(activity);
            if (obj2 == obj && activity.hashCode() == i7) {
                f1559g.postAtFrontOfQueue(new c(f1554b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f1558f == null) {
            return false;
        }
        if (f1557e == null && f1556d == null) {
            return false;
        }
        try {
            Object obj2 = f1555c.get(activity);
            if (obj2 == null || (obj = f1554b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0021d c0021d = new C0021d(activity);
            application.registerActivityLifecycleCallbacks(c0021d);
            Handler handler = f1559g;
            handler.post(new a(c0021d, obj2));
            try {
                if (g()) {
                    Method method = f1558f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0021d));
                return true;
            } catch (Throwable th) {
                f1559g.post(new b(application, c0021d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0021d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: q, reason: collision with root package name */
        Object f1566q;

        /* renamed from: r, reason: collision with root package name */
        private Activity f1567r;

        /* renamed from: s, reason: collision with root package name */
        private final int f1568s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f1569t = false;

        /* renamed from: u, reason: collision with root package name */
        private boolean f1570u = false;

        /* renamed from: v, reason: collision with root package name */
        private boolean f1571v = false;

        C0021d(Activity activity) {
            this.f1567r = activity;
            this.f1568s = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1567r == activity) {
                this.f1567r = null;
                this.f1570u = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1570u || this.f1571v || this.f1569t || !d.h(this.f1566q, this.f1568s, activity)) {
                return;
            }
            this.f1571v = true;
            this.f1566q = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1567r == activity) {
                this.f1569t = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
