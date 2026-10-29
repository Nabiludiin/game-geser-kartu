package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class uo {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f16844e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    private long f16845a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f16846b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f16847c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16848d = false;

    uo(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new so(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static uo a(Context context, Executor executor) {
        return new uo(context, executor, f16844e);
    }

    public final void b() {
        if (this.f16848d) {
            this.f16846b = System.currentTimeMillis();
        }
    }

    public final long c() {
        if (this.f16848d) {
            return this.f16846b - this.f16845a;
        }
        return -1L;
    }

    public final long d() {
        long j7 = this.f16847c;
        this.f16847c = -1L;
        return j7;
    }

    final /* synthetic */ void e(long j7) {
        this.f16845a = j7;
    }

    final /* synthetic */ long f() {
        return this.f16846b;
    }

    final /* synthetic */ void g(long j7) {
        this.f16847c = j7;
    }

    final /* synthetic */ void h(boolean z7) {
        this.f16848d = z7;
    }
}
