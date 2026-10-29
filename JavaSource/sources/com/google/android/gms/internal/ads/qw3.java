package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
final class qw3 {

    /* renamed from: a, reason: collision with root package name */
    private final jy3 f14651a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14652b;

    /* renamed from: c, reason: collision with root package name */
    private final rw3 f14653c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14656f;

    /* renamed from: g, reason: collision with root package name */
    private final Intent f14657g;

    /* renamed from: i, reason: collision with root package name */
    private ServiceConnection f14659i;

    /* renamed from: j, reason: collision with root package name */
    private IInterface f14660j;

    /* renamed from: e, reason: collision with root package name */
    private final List f14655e = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final String f14654d = "OverlayDisplayService";

    /* renamed from: h, reason: collision with root package name */
    private final IBinder.DeathRecipient f14658h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.kw3
        @Override // android.os.IBinder.DeathRecipient
        public final /* synthetic */ void binderDied() {
            qw3.this.d();
        }
    };

    qw3(Context context, rw3 rw3Var, String str, Intent intent, gw3 gw3Var) {
        this.f14652b = context;
        this.f14653c = rw3Var;
        final String str2 = "OverlayDisplayService";
        this.f14657g = intent;
        this.f14651a = ny3.a(new jy3(str2) { // from class: com.google.android.gms.internal.ads.pw3
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void h(final Runnable runnable) {
        ((Handler) this.f14651a.a()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.ow3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qw3.this.g(runnable);
            }
        });
    }

    public final void a(final Runnable runnable) {
        h(new Runnable() { // from class: com.google.android.gms.internal.ads.mw3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qw3.this.e(runnable);
            }
        });
    }

    public final void b() {
        h(new Runnable() { // from class: com.google.android.gms.internal.ads.nw3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qw3.this.f();
            }
        });
    }

    public final IInterface c() {
        return this.f14660j;
    }

    final /* synthetic */ void d() {
        this.f14653c.a("%s : Binder has died.", this.f14654d);
        List list = this.f14655e;
        synchronized (list) {
            list.clear();
        }
    }

    final /* synthetic */ void e(Runnable runnable) {
        if (this.f14660j != null || this.f14656f) {
            if (!this.f14656f) {
                runnable.run();
                return;
            }
            this.f14653c.a("Waiting to bind to the service.", new Object[0]);
            List list = this.f14655e;
            synchronized (list) {
                list.add(runnable);
            }
            return;
        }
        this.f14653c.a("Initiate binding to the service.", new Object[0]);
        List list2 = this.f14655e;
        synchronized (list2) {
            list2.add(runnable);
        }
        jw3 jw3Var = new jw3(this, null);
        this.f14659i = jw3Var;
        this.f14656f = true;
        if (this.f14652b.bindService(this.f14657g, jw3Var, 1)) {
            return;
        }
        this.f14653c.a("Failed to bind to the service.", new Object[0]);
        this.f14656f = false;
        List list3 = this.f14655e;
        synchronized (list3) {
            list3.clear();
        }
    }

    final /* synthetic */ void f() {
        if (this.f14660j != null) {
            this.f14653c.a("Unbind from service.", new Object[0]);
            Context context = this.f14652b;
            ServiceConnection serviceConnection = this.f14659i;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.f14656f = false;
            this.f14660j = null;
            this.f14659i = null;
            List list = this.f14655e;
            synchronized (list) {
                list.clear();
            }
        }
    }

    final /* synthetic */ void g(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e8) {
            this.f14653c.c("error caused by ", e8);
        }
    }

    final /* synthetic */ rw3 i() {
        return this.f14653c;
    }

    final /* synthetic */ List j() {
        return this.f14655e;
    }

    final /* synthetic */ void k(boolean z7) {
        this.f14656f = false;
    }

    final /* synthetic */ IBinder.DeathRecipient l() {
        return this.f14658h;
    }

    final /* synthetic */ IInterface m() {
        return this.f14660j;
    }

    final /* synthetic */ void n(IInterface iInterface) {
        this.f14660j = iInterface;
    }
}
