package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
final class vt3 implements it3, ek3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17762a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f17763b;

    /* renamed from: c, reason: collision with root package name */
    private NetworkCapabilities f17764c = null;

    vt3(Context context, ExecutorService executorService) {
        this.f17762a = context;
        this.f17763b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.ek3
    public final a5.d a() {
        return Build.VERSION.SDK_INT < 24 ? p64.b() : p64.e(new Runnable() { // from class: com.google.android.gms.internal.ads.ut3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vt3.this.e();
            }
        }, this.f17763b);
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void c(Map map) {
        NetworkCapabilities networkCapabilities;
        long j7;
        synchronized (this) {
            networkCapabilities = this.f17764c;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.f17764c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j7 = 2;
                    } else if (this.f17764c.hasTransport(1)) {
                        j7 = 1;
                    } else if (this.f17764c.hasTransport(0)) {
                        j7 = 0;
                    }
                }
                j7 = -1;
            } finally {
            }
        }
        map.put("nt", Long.valueOf(j7));
    }

    final /* synthetic */ void e() {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        tt3 tt3Var = new tt3(this);
        try {
            Object systemService = this.f17762a.getSystemService("connectivity");
            if (systemService == null) {
                throw null;
            }
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(tt3Var);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void f(NetworkCapabilities networkCapabilities) {
        this.f17764c = networkCapabilities;
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void b(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void d(Map map, Context context, View view) {
    }
}
