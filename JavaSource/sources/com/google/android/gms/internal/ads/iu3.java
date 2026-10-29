package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
final class iu3 implements it3, ek3 {

    /* renamed from: h, reason: collision with root package name */
    static final String[] f10196h = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    private final Context f10197a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f10198b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f10199c;

    /* renamed from: d, reason: collision with root package name */
    private long f10200d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f10201e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f10202f = -1;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10203g = false;

    iu3(Context context, sh3 sh3Var, ExecutorService executorService, String[] strArr) {
        this.f10197a = context;
        this.f10198b = executorService;
        this.f10199c = strArr;
    }

    @Override // com.google.android.gms.internal.ads.ek3
    public final a5.d a() {
        return Build.VERSION.SDK_INT < 30 ? p64.b() : p64.e(new Runnable() { // from class: com.google.android.gms.internal.ads.hu3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                iu3.this.f();
            }
        }, this.f10198b);
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void b(Map map) {
        e();
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void c(Map map) {
        long j7;
        long j8;
        e();
        synchronized (this) {
            try {
                j7 = this.f10203g ? this.f10201e - this.f10200d : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j7));
        synchronized (this) {
            j8 = this.f10202f;
            this.f10202f = -1L;
        }
        map.put("vf", Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void d(Map map, Context context, View view) {
        e();
    }

    final void e() {
        synchronized (this) {
            try {
                if (this.f10203g) {
                    this.f10201e = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void f() {
        gu3 gu3Var = new gu3(this);
        try {
            Object systemService = this.f10197a.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(this.f10199c, this.f10198b, gu3Var);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void g(long j7) {
        this.f10200d = j7;
    }

    final /* synthetic */ long h() {
        return this.f10201e;
    }

    final /* synthetic */ void i(long j7) {
        this.f10202f = j7;
    }

    final /* synthetic */ void j(boolean z7) {
        this.f10203g = z7;
    }
}
