package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class f02 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f7913f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f7914g;

    /* renamed from: h, reason: collision with root package name */
    private final ev1 f7915h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f7916i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f7917j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f7918k;

    /* renamed from: l, reason: collision with root package name */
    private final cy1 f7919l;

    /* renamed from: m, reason: collision with root package name */
    private final w2.a f7920m;

    /* renamed from: o, reason: collision with root package name */
    private final nh1 f7922o;

    /* renamed from: p, reason: collision with root package name */
    private final e63 f7923p;

    /* renamed from: a, reason: collision with root package name */
    private boolean f7908a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7909b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7910c = false;

    /* renamed from: e, reason: collision with root package name */
    private final im0 f7912e = new im0();

    /* renamed from: n, reason: collision with root package name */
    private final Map f7921n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    private boolean f7924q = true;

    /* renamed from: d, reason: collision with root package name */
    private final long f7911d = r2.t.o().b();

    public f02(Executor executor, Context context, WeakReference weakReference, Executor executor2, ev1 ev1Var, ScheduledExecutorService scheduledExecutorService, cy1 cy1Var, w2.a aVar, nh1 nh1Var, e63 e63Var) {
        this.f7915h = ev1Var;
        this.f7913f = context;
        this.f7914g = weakReference;
        this.f7916i = executor2;
        this.f7918k = scheduledExecutorService;
        this.f7917j = executor;
        this.f7919l = cy1Var;
        this.f7920m = aVar;
        this.f7922o = nh1Var;
        this.f7923p = e63Var;
        m("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized a5.d u() {
        String d8 = r2.t.l().q().j().d();
        if (!TextUtils.isEmpty(d8)) {
            return p64.a(d8);
        }
        final im0 im0Var = new im0();
        r2.t.l().q().y(new Runnable() { // from class: com.google.android.gms.internal.ads.yz1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                f02.this.g(im0Var);
            }
        });
        return im0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m(String str, boolean z7, String str2, int i7) {
        this.f7921n.put(str, new t70(str, z7, i7, str2));
    }

    public final void a() {
        this.f7924q = false;
    }

    public final void b(final a80 a80Var) {
        this.f7912e.c(new Runnable() { // from class: com.google.android.gms.internal.ads.e02
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    a80Var.m6(f02.this.d());
                } catch (RemoteException e8) {
                    int i7 = v2.n1.f26802b;
                    w2.p.d("", e8);
                }
            }
        }, this.f7917j);
    }

    public final void c() {
        if (!((Boolean) c10.f6207a.e()).booleanValue()) {
            if (this.f7920m.f27053s >= ((Integer) s2.b0.c().d(uy.f17084e2)).intValue() && this.f7924q) {
                if (this.f7908a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f7908a) {
                            return;
                        }
                        this.f7919l.e();
                        this.f7922o.c();
                        im0 im0Var = this.f7912e;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.xz1
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                f02.this.f();
                            }
                        };
                        Executor executor = this.f7916i;
                        im0Var.c(runnable, executor);
                        this.f7908a = true;
                        a5.d u7 = u();
                        this.f7918k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zz1
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                f02.this.h();
                            }
                        }, ((Long) s2.b0.c().d(uy.f17102g2)).longValue(), TimeUnit.SECONDS);
                        p64.r(u7, new vz1(this), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f7908a) {
            return;
        }
        m("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f7912e.b(Boolean.FALSE);
        this.f7908a = true;
        this.f7909b = true;
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        Map map = this.f7921n;
        for (String str : map.keySet()) {
            t70 t70Var = (t70) map.get(str);
            arrayList.add(new t70(str, t70Var.f16008r, t70Var.f16009s, t70Var.f16010t));
        }
        return arrayList;
    }

    public final boolean e() {
        return this.f7909b;
    }

    final /* synthetic */ void f() {
        this.f7919l.f();
        this.f7922o.e();
        this.f7909b = true;
    }

    final /* synthetic */ void g(final im0 im0Var) {
        this.f7916i.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.d02
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String d8 = r2.t.l().q().j().d();
                boolean isEmpty = TextUtils.isEmpty(d8);
                im0 im0Var2 = im0Var;
                if (isEmpty) {
                    im0Var2.e(new Exception());
                } else {
                    im0Var2.b(d8);
                }
            }
        });
    }

    final /* synthetic */ void h() {
        synchronized (this) {
            try {
                if (this.f7910c) {
                    return;
                }
                m("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (r2.t.o().b() - this.f7911d));
                this.f7919l.c("com.google.android.gms.ads.MobileAds", "timeout");
                this.f7922o.h("com.google.android.gms.ads.MobileAds", "timeout");
                this.f7912e.e(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void i(Object obj, im0 im0Var, String str, long j7, r53 r53Var) {
        synchronized (obj) {
            try {
                if (!im0Var.isDone()) {
                    m(str, false, "Timeout.", (int) (r2.t.o().b() - j7));
                    this.f7919l.c(str, "timeout");
                    this.f7922o.h(str, "timeout");
                    e63 e63Var = this.f7923p;
                    r53Var.h0("Timeout");
                    r53Var.e(false);
                    e63Var.b(r53Var.n());
                    im0Var.b(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Object j(r53 r53Var) {
        this.f7912e.b(Boolean.TRUE);
        r53Var.e(true);
        this.f7923p.b(r53Var.n());
        return null;
    }

    final /* synthetic */ void k(String str, x70 x70Var, v13 v13Var, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    x70Var.c();
                    return;
                }
                Context context = (Context) this.f7914g.get();
                if (context == null) {
                    context = this.f7913f;
                }
                v13Var.a(context, x70Var, list);
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.d("", e8);
            }
        } catch (RemoteException e9) {
            throw new qy3(e9);
        } catch (d13 unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            x70Var.u(sb.toString());
        }
    }

    final /* synthetic */ void l(String str) {
        final f02 f02Var = this;
        Context context = f02Var.f7913f;
        int i7 = 5;
        final r53 a8 = q53.a(context, 5);
        a8.a();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final r53 a9 = q53.a(context, i7);
                a9.a();
                a9.c0(next);
                final Object obj = new Object();
                final im0 im0Var = new im0();
                a5.d i8 = p64.i(im0Var, ((Long) s2.b0.c().d(uy.f17093f2)).longValue(), TimeUnit.SECONDS, f02Var.f7918k);
                f02Var.f7919l.a(next);
                f02Var.f7922o.b(next);
                final long b8 = r2.t.o().b();
                i8.c(new Runnable() { // from class: com.google.android.gms.internal.ads.a02
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        f02.this.i(obj, im0Var, next, b8, a9);
                    }
                }, f02Var.f7916i);
                arrayList.add(i8);
                try {
                    try {
                        final wz1 wz1Var = new wz1(this, obj, next, b8, a9, im0Var);
                        f02Var = this;
                        JSONObject optJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (optJSONObject != null) {
                            try {
                                JSONArray jSONArray = optJSONObject.getJSONArray("data");
                                int i9 = 0;
                                while (i9 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                                    String optString = jSONObject2.optString("format", "");
                                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys2 = optJSONObject2.keys();
                                        while (keys2.hasNext()) {
                                            String next2 = keys2.next();
                                            bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new d80(optString, bundle));
                                    i9++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        f02Var.m(next, false, "", 0);
                        try {
                            final v13 a10 = f02Var.f7915h.a(next, new JSONObject());
                            f02Var.f7917j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.c02
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    f02.this.k(next, wz1Var, a10, arrayList2);
                                }
                            });
                        } catch (d13 e8) {
                            try {
                                String str2 = "Failed to create Adapter.";
                                if (((Boolean) s2.b0.c().d(uy.be)).booleanValue()) {
                                    String message = e8.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb.append("Failed to create Adapter.");
                                    sb.append(" ");
                                    sb.append(message);
                                    str2 = sb.toString();
                                }
                                wz1Var.u(str2);
                            } catch (RemoteException e9) {
                                int i10 = v2.n1.f26802b;
                                w2.p.d("", e9);
                            }
                        }
                        i7 = 5;
                    } catch (JSONException e10) {
                        e = e10;
                        f02Var = this;
                        v2.n1.l("Malformed CLD response", e);
                        f02Var.f7922o.l0("MalformedJson");
                        f02Var.f7919l.d("MalformedJson");
                        f02Var.f7912e.e(e);
                        r2.t.l().i(e, "AdapterInitializer.updateAdapterStatus");
                        e63 e63Var = f02Var.f7923p;
                        a8.j0(e);
                        a8.e(false);
                        e63Var.b(a8.n());
                    }
                } catch (JSONException e11) {
                    e = e11;
                    f02Var = this;
                }
            }
            p64.n(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.b02
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    f02.this.j(a8);
                    return null;
                }
            }, f02Var.f7916i);
        } catch (JSONException e12) {
            e = e12;
            v2.n1.l("Malformed CLD response", e);
            f02Var.f7922o.l0("MalformedJson");
            f02Var.f7919l.d("MalformedJson");
            f02Var.f7912e.e(e);
            r2.t.l().i(e, "AdapterInitializer.updateAdapterStatus");
            e63 e63Var2 = f02Var.f7923p;
            a8.j0(e);
            a8.e(false);
            e63Var2.b(a8.n());
        }
    }

    final /* synthetic */ void n(boolean z7) {
        this.f7910c = true;
    }

    final /* synthetic */ long o() {
        return this.f7911d;
    }

    final /* synthetic */ im0 p() {
        return this.f7912e;
    }

    final /* synthetic */ Executor q() {
        return this.f7916i;
    }

    final /* synthetic */ cy1 r() {
        return this.f7919l;
    }

    final /* synthetic */ nh1 s() {
        return this.f7922o;
    }

    final /* synthetic */ e63 t() {
        return this.f7923p;
    }
}
