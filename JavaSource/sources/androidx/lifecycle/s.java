package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.u;

/* compiled from: MyApplication */
public class s implements k {

    /* renamed from: y, reason: collision with root package name */
    private static final s f2529y = new s();

    /* renamed from: u, reason: collision with root package name */
    private Handler f2534u;

    /* renamed from: q, reason: collision with root package name */
    private int f2530q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f2531r = 0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f2532s = true;

    /* renamed from: t, reason: collision with root package name */
    private boolean f2533t = true;

    /* renamed from: v, reason: collision with root package name */
    private final l f2535v = new l(this);

    /* renamed from: w, reason: collision with root package name */
    private Runnable f2536w = new a();

    /* renamed from: x, reason: collision with root package name */
    u.a f2537x = new b();

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.g();
            s.this.h();
        }
    }

    /* compiled from: MyApplication */
    class c extends d {

        /* compiled from: MyApplication */
        class a extends d {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                s.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                s.this.d();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                u.f(activity).h(s.this.f2537x);
            }
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            s.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            s.this.e();
        }
    }

    private s() {
    }

    public static k i() {
        return f2529y;
    }

    static void k(Context context) {
        f2529y.f(context);
    }

    void a() {
        int i7 = this.f2531r - 1;
        this.f2531r = i7;
        if (i7 == 0) {
            this.f2534u.postDelayed(this.f2536w, 700L);
        }
    }

    void b() {
        int i7 = this.f2531r + 1;
        this.f2531r = i7;
        if (i7 == 1) {
            if (!this.f2532s) {
                this.f2534u.removeCallbacks(this.f2536w);
            } else {
                this.f2535v.h(g.b.ON_RESUME);
                this.f2532s = false;
            }
        }
    }

    void d() {
        int i7 = this.f2530q + 1;
        this.f2530q = i7;
        if (i7 == 1 && this.f2533t) {
            this.f2535v.h(g.b.ON_START);
            this.f2533t = false;
        }
    }

    void e() {
        this.f2530q--;
        h();
    }

    void f(Context context) {
        this.f2534u = new Handler();
        this.f2535v.h(g.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void g() {
        if (this.f2531r == 0) {
            this.f2532s = true;
            this.f2535v.h(g.b.ON_PAUSE);
        }
    }

    void h() {
        if (this.f2530q == 0 && this.f2532s) {
            this.f2535v.h(g.b.ON_STOP);
            this.f2533t = true;
        }
    }

    @Override // androidx.lifecycle.k
    public g t() {
        return this.f2535v;
    }

    /* compiled from: MyApplication */
    class b implements u.a {
        b() {
        }

        @Override // androidx.lifecycle.u.a
        public void a() {
            s.this.d();
        }

        @Override // androidx.lifecycle.u.a
        public void onResume() {
            s.this.b();
        }

        @Override // androidx.lifecycle.u.a
        public void onCreate() {
        }
    }
}
