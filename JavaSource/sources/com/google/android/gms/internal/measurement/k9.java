package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class k9 implements p8 {

    /* renamed from: f, reason: collision with root package name */
    private static final Map f21071f = new r.a();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f21072a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f21073b;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f21075d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21074c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final List f21076e = new ArrayList();

    private k9(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f21072a = sharedPreferences;
    }

    static k9 a(Context context, String str, Runnable runnable) {
        final k9 k9Var;
        SharedPreferences a8;
        if (f8.a() && !str.startsWith("direct_boot:") && !f8.c(context)) {
            return null;
        }
        synchronized (k9.class) {
            Map map = f21071f;
            k9Var = (k9) map.get(str);
            if (k9Var == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (f8.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        a8 = k1.a(context, str.substring(12), 0, g1.f20972a);
                    } else {
                        a8 = k1.a(context, str, 0, g1.f20972a);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    k9Var = new k9(a8, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.j9
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            k9.this.c(sharedPreferences, str2);
                        }
                    };
                    k9Var.f21073b = onSharedPreferenceChangeListener;
                    k9Var.f21072a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, k9Var);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        }
        return k9Var;
    }

    static synchronized void b() {
        synchronized (k9.class) {
            try {
                Map map = f21071f;
                for (k9 k9Var : map.values()) {
                    k9Var.f21072a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) y4.h.h(k9Var.f21073b));
                }
                map.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void c(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f21074c) {
            this.f21075d = null;
            i9.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f21076e.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final Object y(String str) {
        Map<String, ?> map = this.f21075d;
        if (map == null) {
            synchronized (this.f21074c) {
                try {
                    map = this.f21075d;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f21072a.getAll();
                            this.f21075d = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
