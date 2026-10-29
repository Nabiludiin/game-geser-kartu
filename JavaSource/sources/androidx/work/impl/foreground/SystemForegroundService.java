package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.m;
import androidx.work.impl.foreground.a;
import e1.j;

/* compiled from: MyApplication */
public class SystemForegroundService extends m implements a.b {

    /* renamed from: v, reason: collision with root package name */
    private static final String f3063v = j.f("SystemFgService");

    /* renamed from: w, reason: collision with root package name */
    private static SystemForegroundService f3064w = null;

    /* renamed from: r, reason: collision with root package name */
    private Handler f3065r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f3066s;

    /* renamed from: t, reason: collision with root package name */
    androidx.work.impl.foreground.a f3067t;

    /* renamed from: u, reason: collision with root package name */
    NotificationManager f3068u;

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f3069q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Notification f3070r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f3071s;

        a(int i7, Notification notification, int i8) {
            this.f3069q = i7;
            this.f3070r = notification;
            this.f3071s = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f3069q, this.f3070r, this.f3071s);
            } else {
                SystemForegroundService.this.startForeground(this.f3069q, this.f3070r);
            }
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f3073q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Notification f3074r;

        b(int i7, Notification notification) {
            this.f3073q = i7;
            this.f3074r = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f3068u.notify(this.f3073q, this.f3074r);
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f3076q;

        c(int i7) {
            this.f3076q = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f3068u.cancel(this.f3076q);
        }
    }

    private void f() {
        this.f3065r = new Handler(Looper.getMainLooper());
        this.f3068u = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f3067t = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i7, int i8, Notification notification) {
        this.f3065r.post(new a(i7, notification, i8));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i7, Notification notification) {
        this.f3065r.post(new b(i7, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i7) {
        this.f3065r.post(new c(i7));
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onCreate() {
        super.onCreate();
        f3064w = this;
        f();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3067t.k();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f3066s) {
            j.c().d(f3063v, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f3067t.k();
            f();
            this.f3066s = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3067t.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f3066s = true;
        j.c().a(f3063v, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f3064w = null;
        stopSelf();
    }
}
