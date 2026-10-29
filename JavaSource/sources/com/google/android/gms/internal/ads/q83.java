package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class q83 {

    /* renamed from: c, reason: collision with root package name */
    private final f93 f14297c;

    /* renamed from: d, reason: collision with root package name */
    private final m83 f14298d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f14299e;

    /* renamed from: f, reason: collision with root package name */
    private volatile ConnectivityManager f14300f;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f14302h;

    /* renamed from: i, reason: collision with root package name */
    private AtomicInteger f14303i;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f14301g = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f14295a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f14296b = new ConcurrentHashMap();

    q83(f93 f93Var, m83 m83Var, Context context, com.google.android.gms.common.util.e eVar) {
        this.f14297c = f93Var;
        this.f14298d = m83Var;
        this.f14299e = context;
        this.f14302h = eVar;
    }

    static String h(String str, k2.c cVar) {
        String name = cVar == null ? "NULL" : cVar.name();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append("#");
        sb.append(name);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final synchronized void i(boolean z7) {
        if (((Boolean) s2.b0.c().d(uy.f17237x)).booleanValue()) {
            j(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized void j(boolean z7) {
        try {
            if (z7) {
                Iterator it = this.f14295a.values().iterator();
                while (it.hasNext()) {
                    ((e93) it.next()).y();
                }
            } else {
                Iterator it2 = this.f14295a.values().iterator();
                while (it2.hasNext()) {
                    ((e93) it2.next()).x();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.A)).booleanValue() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized java.util.List m(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L48
            r0.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L48
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L48
            s2.m4 r2 = (s2.m4) r2     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r2.f26189q     // Catch: java.lang.Throwable -> L48
            int r4 = r2.f26190r     // Catch: java.lang.Throwable -> L48
            k2.c r4 = k2.c.c(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = h(r3, r4)     // Catch: java.lang.Throwable -> L48
            r0.add(r3)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.ConcurrentMap r4 = r8.f14295a     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.e93 r5 = (com.google.android.gms.internal.ads.e93) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L51
            s2.m4 r6 = r5.f7479e     // Catch: java.lang.Throwable -> L48
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L48
            if (r6 != 0) goto L4b
            java.util.concurrent.ConcurrentMap r6 = r8.f14296b     // Catch: java.lang.Throwable -> L48
            r6.put(r3, r5)     // Catch: java.lang.Throwable -> L48
            r4.remove(r3)     // Catch: java.lang.Throwable -> L48
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L48:
            r9 = move-exception
            goto L107
        L4b:
            int r2 = r2.f26192t     // Catch: java.lang.Throwable -> L48
            r5.I(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L51:
            java.util.concurrent.ConcurrentMap r5 = r8.f14296b     // Catch: java.lang.Throwable -> L48
            boolean r6 = r5.containsKey(r3)     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r5.get(r3)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.e93 r6 = (com.google.android.gms.internal.ads.e93) r6     // Catch: java.lang.Throwable -> L48
            s2.m4 r7 = r6.f7479e     // Catch: java.lang.Throwable -> L48
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L76
            int r2 = r2.f26192t     // Catch: java.lang.Throwable -> L48
            r6.I(r2)     // Catch: java.lang.Throwable -> L48
            r6.y()     // Catch: java.lang.Throwable -> L48
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> L48
            r5.remove(r3)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L76:
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L7a:
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L7e:
            java.util.concurrent.ConcurrentMap r9 = r8.f14295a     // Catch: java.lang.Throwable -> L48
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L48
        L88:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L48
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L48
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L88
            java.util.concurrent.ConcurrentMap r3 = r8.f14296b     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.e93 r2 = (com.google.android.gms.internal.ads.e93) r2     // Catch: java.lang.Throwable -> L48
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L48
            r9.remove()     // Catch: java.lang.Throwable -> L48
            goto L88
        Lb5:
            java.util.concurrent.ConcurrentMap r9 = r8.f14296b     // Catch: java.lang.Throwable -> L48
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L48
        Lbf:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L105
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L48
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.e93 r0 = (com.google.android.gms.internal.ads.e93) r0     // Catch: java.lang.Throwable -> L48
            r0.w()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.f17253z     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.sy r3 = s2.b0.c()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r3.d(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L48
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto Lf8
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.A     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.sy r3 = s2.b0.c()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r3.d(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L48
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto Lfb
        Lf8:
            r0.F()     // Catch: java.lang.Throwable -> L48
        Lfb:
            boolean r0 = r0.u()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto Lbf
            r9.remove()     // Catch: java.lang.Throwable -> L48
            goto Lbf
        L105:
            monitor-exit(r8)
            return r1
        L107:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L48
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q83.m(java.util.List):java.util.List");
    }

    private final synchronized void n(String str, e93 e93Var) {
        e93Var.t();
        this.f14295a.put(str, e93Var);
    }

    private final synchronized boolean o(String str, k2.c cVar) {
        boolean z7;
        try {
            com.google.android.gms.common.util.e eVar = this.f14302h;
            long a8 = eVar.a();
            e93 q7 = q(str, cVar);
            int i7 = 0;
            z7 = q7 != null && q7.u();
            Long valueOf = z7 ? Long.valueOf(eVar.a()) : null;
            u83 u83Var = new u83(new t83(str, cVar), null);
            m83 m83Var = this.f14298d;
            int i8 = q7 == null ? 0 : q7.f7479e.f26192t;
            if (q7 != null) {
                i7 = q7.E();
            }
            m83Var.d(i8, i7, a8, valueOf, q7 != null ? q7.z() : null, u83Var, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z7;
    }

    private final synchronized Object p(Class cls, String str, k2.c cVar) {
        u83 u83Var = new u83(new t83(str, cVar), null);
        m83 m83Var = this.f14298d;
        com.google.android.gms.common.util.e eVar = this.f14302h;
        m83Var.f(eVar.a(), u83Var, -1, -1, "1");
        e93 q7 = q(str, cVar);
        if (q7 == null) {
            return null;
        }
        try {
            String z7 = q7.z();
            Object v7 = q7.v();
            Object cast = v7 == null ? null : cls.cast(v7);
            if (cast != null) {
                m83Var.h(eVar.a(), q7.f7479e.f26192t, q7.E(), z7, u83Var, "1");
            }
            return cast;
        } catch (ClassCastException e8) {
            r2.t.l().i(e8, "PreloadAdManager.pollAd");
            v2.n1.l("Unable to cast ad to the requested type:".concat(cls.getName()), e8);
            return null;
        }
    }

    private final synchronized e93 q(String str, k2.c cVar) {
        return (e93) this.f14295a.get(h(str, cVar));
    }

    public final synchronized void a(List list, s2.c1 c1Var) {
        try {
            if (!this.f14301g.getAndSet(true)) {
                if (this.f14300f == null) {
                    synchronized (this) {
                        if (this.f14300f == null) {
                            try {
                                this.f14300f = (ConnectivityManager) this.f14299e.getSystemService("connectivity");
                            } catch (ClassCastException e8) {
                                int i7 = v2.n1.f26802b;
                                w2.p.g("Failed to get connectivity manager", e8);
                            }
                        }
                    }
                }
                if (!com.google.android.gms.common.util.n.f() || this.f14300f == null) {
                    this.f14303i = new AtomicInteger(((Integer) s2.b0.c().d(uy.F)).intValue());
                } else {
                    try {
                        this.f14300f.registerDefaultNetworkCallback(new p83(this));
                    } catch (RuntimeException e9) {
                        int i8 = v2.n1.f26802b;
                        w2.p.g("Failed to register network callback", e9);
                        this.f14303i = new AtomicInteger(((Integer) s2.b0.c().d(uy.F)).intValue());
                    }
                }
                r2.t.k().b(new o83(this));
            }
            List<s2.m4> m7 = m(list);
            EnumMap enumMap = new EnumMap(k2.c.class);
            for (s2.m4 m4Var : m7) {
                String str = m4Var.f26189q;
                k2.c c8 = k2.c.c(m4Var.f26190r);
                e93 a8 = this.f14297c.a(m4Var, c1Var);
                if (c8 != null && a8 != null) {
                    AtomicInteger atomicInteger = this.f14303i;
                    if (atomicInteger != null) {
                        a8.B(atomicInteger.get());
                    }
                    m83 m83Var = this.f14298d;
                    a8.A(m83Var);
                    n(h(str, c8), a8);
                    enumMap.put((EnumMap) c8, (k2.c) Integer.valueOf(((Integer) w2.g.m(enumMap, c8, 0)).intValue() + 1));
                    m83Var.a(m4Var.f26192t, this.f14302h.a(), new u83(new t83(str, c8), null), "1");
                }
            }
            this.f14298d.b(enumMap, this.f14302h.a(), "1");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b(String str) {
        return o(str, k2.c.REWARDED);
    }

    public final synchronized ki0 c(String str) {
        return (ki0) p(ki0.class, str, k2.c.REWARDED);
    }

    public final synchronized boolean d(String str) {
        return o(str, k2.c.APP_OPEN_AD);
    }

    public final synchronized bt e(String str) {
        return (bt) p(bt.class, str, k2.c.APP_OPEN_AD);
    }

    public final synchronized boolean f(String str) {
        return o(str, k2.c.INTERSTITIAL);
    }

    public final synchronized s2.v0 g(String str) {
        return (s2.v0) p(s2.v0.class, str, k2.c.INTERSTITIAL);
    }
}
