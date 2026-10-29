package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* compiled from: MyApplication */
public final class ln {

    /* renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f11659a;

    ln(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new kn(this));
        } catch (RuntimeException unused) {
            synchronized (ln.class) {
                this.f11659a = null;
            }
        }
    }

    public static ln a(Context context) {
        if (context != null) {
            return new ln((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final NetworkCapabilities b() {
        return this.f11659a;
    }

    public final long c() {
        synchronized (ln.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f11659a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f11659a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f11659a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void d(NetworkCapabilities networkCapabilities) {
        this.f11659a = networkCapabilities;
    }
}
