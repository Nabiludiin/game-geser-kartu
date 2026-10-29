package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class d83 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6970a;

    /* renamed from: b, reason: collision with root package name */
    private final f93 f6971b;

    /* renamed from: c, reason: collision with root package name */
    private final m83 f6972c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f6973d;

    /* renamed from: e, reason: collision with root package name */
    private volatile ConnectivityManager f6974e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f6975f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f6976g;

    /* renamed from: h, reason: collision with root package name */
    private AtomicInteger f6977h;

    d83(f93 f93Var, m83 m83Var, Context context, com.google.android.gms.common.util.e eVar) {
        HashMap hashMap = new HashMap();
        this.f6970a = hashMap;
        hashMap.put(k2.c.APP_OPEN_AD, new HashMap());
        hashMap.put(k2.c.INTERSTITIAL, new HashMap());
        hashMap.put(k2.c.REWARDED, new HashMap());
        this.f6971b = f93Var;
        this.f6972c = m83Var;
        this.f6973d = context;
        this.f6976g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final synchronized void k(boolean z7) {
        if (((Boolean) s2.b0.c().d(uy.f17237x)).booleanValue()) {
            l(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final synchronized void l(boolean z7) {
        try {
            Iterator it = this.f6970a.values().iterator();
            while (it.hasNext()) {
                for (e93 e93Var : ((Map) it.next()).values()) {
                    if (z7) {
                        e93Var.y();
                    } else {
                        e93Var.x();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized Object o(Class cls, k2.c cVar, String str) {
        m83 m83Var = this.f6972c;
        com.google.android.gms.common.util.e eVar = this.f6976g;
        m83Var.e(eVar.a(), "2");
        Map map = this.f6970a;
        if (!map.containsKey(cVar)) {
            return null;
        }
        e93 e93Var = (e93) ((Map) map.get(cVar)).get(str);
        if (e93Var != null && cVar.equals(e93Var.D())) {
            t83 t83Var = new t83(e93Var.f7479e.f26189q, e93Var.D());
            t83Var.a(str);
            u83 u83Var = new u83(t83Var, null);
            m83Var.f(eVar.a(), u83Var, e93Var.f7479e.f26192t, e93Var.E(), "2");
            try {
                String z7 = e93Var.z();
                Object v7 = e93Var.v();
                Object cast = v7 == null ? null : cls.cast(v7);
                if (cast != null) {
                    m83Var.h(eVar.a(), e93Var.f7479e.f26192t, e93Var.E(), z7, u83Var, "2");
                }
                return cast;
            } catch (ClassCastException e8) {
                r2.t.l().i(e8, "PreloadAdManager.pollAd");
                v2.n1.l("Unable to cast ad to the requested type:".concat(cls.getName()), e8);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean p(k2.c cVar) {
        int size;
        int ordinal;
        try {
            Map map = this.f6970a;
            size = map.containsKey(cVar) ? ((Map) map.get(cVar)).size() : 0;
            ordinal = cVar.ordinal();
        } finally {
        }
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) s2.b0.c().d(uy.f17078d5)).intValue(), 1) : Math.max(((Integer) s2.b0.c().d(uy.f17069c5)).intValue(), 1) : Math.max(((Integer) s2.b0.c().d(uy.f17060b5)).intValue(), 1));
    }

    public final synchronized boolean a(String str, s2.m4 m4Var, s2.e1 e1Var) {
        e93 b8;
        try {
            if (!this.f6975f.getAndSet(true)) {
                if (this.f6974e == null) {
                    synchronized (this) {
                        if (this.f6974e == null) {
                            try {
                                this.f6974e = (ConnectivityManager) this.f6973d.getSystemService("connectivity");
                            } catch (ClassCastException e8) {
                                int i7 = v2.n1.f26802b;
                                w2.p.g("Failed to get connectivity manager", e8);
                            }
                        }
                    }
                }
                if (!com.google.android.gms.common.util.n.f() || this.f6974e == null) {
                    this.f6977h = new AtomicInteger(((Integer) s2.b0.c().d(uy.F)).intValue());
                } else {
                    try {
                        this.f6974e.registerDefaultNetworkCallback(new b83(this));
                    } catch (RuntimeException e9) {
                        int i8 = v2.n1.f26802b;
                        w2.p.g("Failed to register network callback", e9);
                        this.f6977h = new AtomicInteger(((Integer) s2.b0.c().d(uy.F)).intValue());
                    }
                }
                r2.t.k().b(new c83(this));
            }
            k2.c c8 = k2.c.c(m4Var.f26190r);
            if (c8 != null) {
                Map map = this.f6970a;
                if (map.containsKey(c8) && !((Map) map.get(c8)).containsKey(str) && p(c8) && (b8 = this.f6971b.b(str, m4Var, e1Var)) != null) {
                    AtomicInteger atomicInteger = this.f6977h;
                    if (atomicInteger != null) {
                        b8.B(atomicInteger.get());
                    }
                    m83 m83Var = this.f6972c;
                    b8.A(m83Var);
                    b8.t();
                    ((Map) map.get(c8)).put(str, b8);
                    t83 t83Var = new t83(m4Var.f26189q, c8);
                    t83Var.a(str);
                    m83Var.a(m4Var.f26192t, this.f6976g.a(), new u83(t83Var, null), "2");
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b(k2.c cVar, String str) {
        u83 u83Var;
        try {
            com.google.android.gms.common.util.e eVar = this.f6976g;
            long a8 = eVar.a();
            Map map = this.f6970a;
            int i7 = 0;
            if (!map.containsKey(cVar)) {
                return false;
            }
            e93 e93Var = (e93) ((Map) map.get(cVar)).get(str);
            String z7 = e93Var == null ? null : e93Var.z();
            boolean z8 = z7 != null && cVar.equals(e93Var.D());
            Long valueOf = z8 ? Long.valueOf(eVar.a()) : null;
            if (e93Var == null) {
                u83Var = null;
            } else {
                t83 t83Var = new t83(e93Var.f7479e.f26189q, cVar);
                t83Var.a(str);
                u83Var = new u83(t83Var, null);
            }
            m83 m83Var = this.f6972c;
            int i8 = e93Var == null ? 0 : e93Var.f7479e.f26192t;
            if (e93Var != null) {
                i7 = e93Var.E();
            }
            m83Var.d(i8, i7, a8, valueOf, z7, u83Var, "2");
            return z8;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ki0 c(String str) {
        return (ki0) o(ki0.class, k2.c.REWARDED, str);
    }

    public final synchronized bt d(String str) {
        return (bt) o(bt.class, k2.c.APP_OPEN_AD, str);
    }

    public final synchronized s2.v0 e(String str) {
        return (s2.v0) o(s2.v0.class, k2.c.INTERSTITIAL, str);
    }

    public final synchronized s2.m4 f(k2.c cVar, String str) {
        Map map = this.f6970a;
        if (map.containsKey(cVar)) {
            e93 e93Var = (e93) ((Map) map.get(cVar)).get(str);
            this.f6972c.o(this.f6976g.a(), str, e93Var == null ? null : e93Var.f7479e.f26189q, cVar, e93Var == null ? -1 : e93Var.f7479e.f26192t, e93Var != null ? e93Var.E() : -1);
            if (e93Var != null) {
                return e93Var.f7479e;
            }
        }
        return null;
    }

    public final synchronized int g(k2.c cVar, String str) {
        Map map = this.f6970a;
        if (!map.containsKey(cVar)) {
            return 0;
        }
        e93 e93Var = (e93) ((Map) map.get(cVar)).get(str);
        int E = e93Var != null ? e93Var.E() : 0;
        this.f6972c.p(E, this.f6976g.a(), str, e93Var == null ? null : e93Var.f7479e.f26189q, cVar, e93Var == null ? -1 : e93Var.f7479e.f26192t);
        return E;
    }

    public final synchronized Map h(int i7) {
        try {
            HashMap hashMap = new HashMap();
            k2.c c8 = k2.c.c(i7);
            if (c8 != null) {
                Map map = this.f6970a;
                if (map.containsKey(c8)) {
                    for (e93 e93Var : ((Map) map.get(c8)).values()) {
                        hashMap.put(e93Var.C(), e93Var.f7479e);
                    }
                    this.f6972c.n(c8, this.f6976g.a(), hashMap.size());
                    return hashMap;
                }
            }
            return hashMap;
        } finally {
        }
    }

    public final synchronized boolean i(k2.c cVar, String str) {
        e93 e93Var;
        Map map = this.f6970a;
        if (map.containsKey(cVar) && (e93Var = (e93) ((Map) map.get(cVar)).get(str)) != null) {
            ((Map) map.get(cVar)).remove(str);
            e93Var.w();
            e93Var.F();
            m83 m83Var = this.f6972c;
            long a8 = this.f6976g.a();
            s2.m4 m4Var = e93Var.f7479e;
            m83Var.m(a8, str, m4Var.f26189q, cVar, m4Var.f26192t, e93Var.E());
            return true;
        }
        return false;
    }

    public final synchronized void j(int i7) {
        try {
            k2.c c8 = k2.c.c(i7);
            if (c8 != null) {
                Map map = this.f6970a;
                if (map.containsKey(c8)) {
                    Map map2 = (Map) map.get(c8);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        e93 e93Var = (e93) map2.get(str);
                        if (e93Var != null) {
                            e93Var.w();
                            e93Var.F();
                            String valueOf = String.valueOf(str);
                            int i8 = v2.n1.f26802b;
                            w2.p.e("Destroyed ad preloader for preloadId: ".concat(valueOf));
                        }
                    }
                    map2.clear();
                    String concat = "Destroyed all ad preloaders for ad format: ".concat(c8.toString());
                    int i9 = v2.n1.f26802b;
                    w2.p.e(concat);
                    this.f6972c.l(this.f6976g.a(), c8, size);
                }
            }
        } finally {
        }
    }
}
