package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public abstract class ay1 {

    /* renamed from: a, reason: collision with root package name */
    protected final Map f5392a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f5393b;

    /* renamed from: c, reason: collision with root package name */
    protected final Executor f5394c;

    /* renamed from: d, reason: collision with root package name */
    protected final w2.v f5395d;

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f5396e;

    /* renamed from: f, reason: collision with root package name */
    private final c3.c f5397f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5398g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5399h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f5400i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference f5401j;

    protected ay1(Executor executor, w2.v vVar, c3.c cVar, Context context) {
        this.f5392a = new HashMap();
        this.f5400i = new AtomicBoolean();
        this.f5401j = new AtomicReference(new Bundle());
        this.f5394c = executor;
        this.f5395d = vVar;
        this.f5396e = ((Boolean) s2.b0.c().d(uy.f17168o2)).booleanValue();
        this.f5397f = cVar;
        this.f5398g = ((Boolean) s2.b0.c().d(uy.f17208t2)).booleanValue();
        this.f5399h = ((Boolean) s2.b0.c().d(uy.x7)).booleanValue();
        this.f5393b = context;
    }

    private final void a(Map map, boolean z7) {
        if (map.isEmpty()) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Empty paramMap.");
            return;
        }
        i(map);
        final String a8 = this.f5397f.a(map);
        v2.n1.k(a8);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f5396e) {
            if (!z7 || this.f5398g) {
                if (!parseBoolean || this.f5399h) {
                    this.f5394c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xx1
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            ay1.this.f5395d.c(a8, null);
                        }
                    });
                }
            }
        }
    }

    private final void i(Map map) {
        if (map == null || map.isEmpty()) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Empty or null paramMap.");
            return;
        }
        if (!this.f5400i.getAndSet(true)) {
            final String str = (String) s2.b0.c().d(uy.Bb);
            this.f5401j.set(v2.d.c(this.f5393b, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.yx1
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    ay1.this.h(str, sharedPreferences, str2);
                }
            }));
        }
        Bundle bundle = (Bundle) this.f5401j.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void b(Map map) {
        a(map, false);
    }

    protected final String c(Map map) {
        return this.f5397f.a(map);
    }

    public final ConcurrentHashMap d() {
        return new ConcurrentHashMap(this.f5392a);
    }

    public final void e(Map map) {
        a(map, true);
    }

    public final w2.u f(Map map) {
        if (map.isEmpty()) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Empty paramMap.");
            return w2.u.SUCCESS;
        }
        String a8 = this.f5397f.a(map);
        v2.n1.k(a8);
        return this.f5395d.c(a8, null);
    }

    public final void g(Map map) {
        if (map.isEmpty()) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Empty paramMap.");
            return;
        }
        i(map);
        final String a8 = this.f5397f.a(map);
        v2.n1.k(a8);
        if (((Boolean) s2.b0.c().d(uy.je)).booleanValue() || this.f5396e) {
            this.f5394c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zx1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ay1.this.f5395d.c(a8, null);
                }
            });
        }
    }

    final /* synthetic */ void h(String str, SharedPreferences sharedPreferences, String str2) {
        this.f5401j.set(v2.d.b(this.f5393b, str));
    }
}
