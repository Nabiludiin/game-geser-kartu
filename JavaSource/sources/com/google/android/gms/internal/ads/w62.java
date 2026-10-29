package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class w62 extends rg0 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f18085q;

    /* renamed from: r, reason: collision with root package name */
    private final z64 f18086r;

    /* renamed from: s, reason: collision with root package name */
    private final e72 f18087s;

    /* renamed from: t, reason: collision with root package name */
    private final oy0 f18088t;

    /* renamed from: u, reason: collision with root package name */
    private final ArrayDeque f18089u;

    /* renamed from: v, reason: collision with root package name */
    private final e63 f18090v;

    /* renamed from: w, reason: collision with root package name */
    private final mh0 f18091w;

    public w62(Context context, z64 z64Var, mh0 mh0Var, oy0 oy0Var, e72 e72Var, ArrayDeque arrayDeque, b72 b72Var, e63 e63Var) {
        uy.a(context);
        this.f18085q = context;
        this.f18086r = z64Var;
        this.f18091w = mh0Var;
        this.f18087s = e72Var;
        this.f18088t = oy0Var;
        this.f18089u = arrayDeque;
        this.f18090v = e63Var;
    }

    private static a5.d o8(final eh0 eh0Var, f53 f53Var, final dt2 dt2Var) {
        w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.h62
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return dt2.this.a().a(s2.z.a().u((Bundle) obj), eh0Var.C, false);
            }
        };
        return f53Var.a(z43.GMS_SIGNALS, p64.a(eh0Var.f7624q)).c(w54Var).b(i62.f9852a).i();
    }

    private static a5.d p8(a5.d dVar, f53 f53Var, pa0 pa0Var, b63 b63Var, r53 r53Var) {
        fa0 a8 = pa0Var.a("AFMA_getAdDictionary", ma0.f12152b, n62.f12597a);
        a63.b(dVar, r53Var);
        l43 i7 = f53Var.a(z43.BUILD_URL, dVar).c(a8).i();
        a63.f(i7, b63Var, r53Var);
        return i7;
    }

    private final void q8(a5.d dVar, wg0 wg0Var, eh0 eh0Var) {
        p64.r(p64.j(dVar, new w54(this) { // from class: com.google.android.gms.internal.ads.l62
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return p64.a(y13.a((InputStream) obj));
            }
        }, cm0.f6500a), new e62(this, eh0Var, wg0Var), cm0.f6506g);
    }

    private final synchronized void r8(o62 o62Var) {
        s();
        this.f18089u.addLast(o62Var);
    }

    private final synchronized void s() {
        int intValue = ((Long) d10.f6904b.e()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.f18089u;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized o62 s8(String str) {
        Iterator it = this.f18089u.iterator();
        while (it.hasNext()) {
            o62 o62Var = (o62) it.next();
            if (o62Var.f13209c.equals(str)) {
                it.remove();
                return o62Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void a2(eh0 eh0Var, wg0 wg0Var) {
        Bundle bundle;
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() && (bundle = eh0Var.C) != null) {
            bundle.putLong(yw1.SERVICE_CONNECTED.c(), r2.t.o().a());
        }
        a5.d j8 = j8(eh0Var, Binder.getCallingUid());
        q8(j8, wg0Var, eh0Var);
        if (((Boolean) w00.f17940g.e()).booleanValue()) {
            final e72 e72Var = this.f18087s;
            Objects.requireNonNull(e72Var);
            j8.c(new Runnable() { // from class: com.google.android.gms.internal.ads.s62
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    e72.this.a();
                }
            }, this.f18086r);
        }
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void c0(String str) {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) s2.b0.c().d(uy.Re)).booleanValue()) {
            String str2 = (String) s2.b0.c().d(uy.Se);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> d8 = gy3.a(ex3.b(',')).d(str2);
            v2.n1.k("AdRequestServiceImpl: Preconnecting");
            for (String str3 : d8) {
                Context context = this.f18085q;
                a72 a72Var = new a72(context, str, this.f18091w, callingUid, "HEAD");
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", r2.t.g().Q(context, str));
                try {
                    z62 d9 = a72Var.d(new y62(str3, 30000, hashMap, new byte[0], "", false));
                    if (d9.f20027a != 200) {
                        int i7 = d9.f20027a;
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i7);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e8) {
                    throw new RemoteException(e8.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void h4(String str, wg0 wg0Var) {
        q8(l8(str), wg0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void i6(og0 og0Var, xg0 xg0Var) {
        if (((Boolean) l10.f11335a.e()).booleanValue()) {
            this.f18088t.D();
            String str = og0Var.f13317q;
            p64.r(p64.a(null), new c62(this, xg0Var, og0Var), cm0.f6506g);
        } else {
            try {
                xg0Var.D2("", og0Var);
            } catch (RemoteException e8) {
                v2.n1.l("Service can't call client", e8);
            }
        }
    }

    public final a5.d j8(final eh0 eh0Var, int i7) {
        o62 s8;
        l43 i8;
        ga0 v7 = r2.t.v();
        Context context = this.f18085q;
        pa0 a8 = v7.a(context, w2.a.M0(), this.f18090v);
        dt2 a9 = this.f18088t.a(eh0Var, i7);
        fa0 a10 = a8.a("google.afma.response.normalize", q62.f14272d, ma0.f12153c);
        if (((Boolean) d10.f6903a.e()).booleanValue()) {
            s8 = s8(eh0Var.f7631x);
            if (s8 == null) {
                v2.n1.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = eh0Var.f7633z;
            s8 = null;
            if (str != null && !str.isEmpty()) {
                v2.n1.k("Request contained a PoolKey but split request is disabled.");
            }
        }
        o62 o62Var = s8;
        r53 a11 = o62Var == null ? q53.a(context, 9) : o62Var.f13210d;
        b63 d8 = a9.d();
        d8.b(eh0Var.f7624q.getStringArrayList("ad_types"));
        d72 d72Var = new d72(eh0Var.f7630w, d8, a11);
        a72 a72Var = new a72(context, eh0Var.f7625r.f27051q, this.f18091w, i7, null);
        f53 c8 = a9.c();
        r53 a12 = q53.a(context, 11);
        if (o62Var == null) {
            final a5.d o8 = o8(eh0Var, c8, a9);
            final a5.d p8 = p8(o8, c8, a8, d8, a11);
            r53 a13 = q53.a(context, 10);
            final l43 i9 = c8.b(z43.HTTP, p8, o8).a(new Callable() { // from class: com.google.android.gms.internal.ads.m62
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    gh0 gh0Var = (gh0) a5.d.this.get();
                    if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() && (bundle = eh0Var.C) != null) {
                        bundle.putLong(yw1.GET_AD_DICTIONARY_SDKCORE_START.c(), gh0Var.j());
                        bundle.putLong(yw1.GET_AD_DICTIONARY_SDKCORE_END.c(), gh0Var.k());
                    }
                    return new c72((JSONObject) o8.get(), gh0Var);
                }
            }).b(d72Var).b(a63.c(a13)).b(a72Var).i();
            a63.d(i9, d8, a13);
            a63.b(i9, a12);
            i8 = c8.b(z43.PRE_PROCESS, o8, p8, i9).a(new Callable() { // from class: com.google.android.gms.internal.ads.f62
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() && (bundle = eh0.this.C) != null) {
                        bundle.putLong(yw1.HTTP_RESPONSE_READY.c(), r2.t.o().a());
                    }
                    return new q62((z62) i9.get(), (JSONObject) o8.get(), (gh0) p8.get());
                }
            }).c(a10).i();
        } else {
            c72 c72Var = new c72(o62Var.f13208b, o62Var.f13207a);
            r53 a14 = q53.a(context, 10);
            final l43 i10 = c8.a(z43.HTTP, p64.a(c72Var)).b(d72Var).b(a63.c(a14)).b(a72Var).i();
            a63.d(i10, d8, a14);
            final a5.d a15 = p64.a(o62Var);
            a63.b(i10, a12);
            i8 = c8.b(z43.PRE_PROCESS, i10, a15).a(new Callable() { // from class: com.google.android.gms.internal.ads.g62
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    z62 z62Var = (z62) a5.d.this.get();
                    a5.d dVar = a15;
                    return new q62(z62Var, ((o62) dVar.get()).f13208b, ((o62) dVar.get()).f13207a);
                }
            }).c(a10).i();
        }
        a63.d(i8, d8, a12);
        return i8;
    }

    public final a5.d k8(final eh0 eh0Var, int i7) {
        if (!((Boolean) d10.f6903a.e()).booleanValue()) {
            return p64.c(new Exception("Split request is disabled."));
        }
        u23 u23Var = eh0Var.f7632y;
        if (u23Var == null) {
            return p64.c(new Exception("Pool configuration missing from request."));
        }
        if (u23Var.f16555u == 0 || u23Var.f16556v == 0) {
            return p64.c(new Exception("Caching is disabled."));
        }
        Context context = this.f18085q;
        pa0 a8 = r2.t.v().a(context, w2.a.M0(), this.f18090v);
        dt2 a9 = this.f18088t.a(eh0Var, i7);
        f53 c8 = a9.c();
        final a5.d o8 = o8(eh0Var, c8, a9);
        b63 d8 = a9.d();
        final r53 a10 = q53.a(context, 9);
        final a5.d p8 = p8(o8, c8, a8, d8, a10);
        return c8.b(z43.GET_URL_AND_CACHE_KEY, o8, p8).a(new Callable() { // from class: com.google.android.gms.internal.ads.j62
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return w62.this.n8(p8, o8, eh0Var, a10);
            }
        }).i();
    }

    public final a5.d l8(String str) {
        if (((Boolean) d10.f6903a.e()).booleanValue()) {
            return s8(str) == null ? p64.c(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : p64.a(new d62(this));
        }
        return p64.c(new Exception("Split request is disabled."));
    }

    public final a5.d m8(final eh0 eh0Var, int i7) {
        ga0 v7 = r2.t.v();
        Context context = this.f18085q;
        pa0 a8 = v7.a(context, w2.a.M0(), this.f18090v);
        if (!((Boolean) j10.f10294a.e()).booleanValue()) {
            return p64.c(new Exception("Signal collection disabled."));
        }
        dt2 a9 = this.f18088t.a(eh0Var, i7);
        final bs2 b8 = a9.b();
        fa0 a10 = a8.a("google.afma.request.getSignals", ma0.f12152b, ma0.f12153c);
        r53 a11 = q53.a(context, 22);
        f53 c8 = a9.c();
        z43 z43Var = z43.GET_SIGNALS;
        Bundle bundle = eh0Var.f7624q;
        l43 i8 = c8.a(z43Var, p64.a(bundle)).b(a63.c(a11)).c(new w54() { // from class: com.google.android.gms.internal.ads.k62
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return bs2.this.a(s2.z.a().u((Bundle) obj), eh0Var.C, false);
            }
        }).j(z43.JS_SIGNALS).c(a10).i();
        b63 d8 = a9.d();
        d8.b(bundle.getStringArrayList("ad_types"));
        d8.d(bundle.getBundle("extras"));
        a63.e(i8, d8, a11);
        if (((Boolean) w00.f17941h.e()).booleanValue()) {
            final e72 e72Var = this.f18087s;
            Objects.requireNonNull(e72Var);
            i8.c(new Runnable() { // from class: com.google.android.gms.internal.ads.r62
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    e72.this.a();
                }
            }, this.f18086r);
        }
        return i8;
    }

    final /* synthetic */ InputStream n8(a5.d dVar, a5.d dVar2, eh0 eh0Var, r53 r53Var) {
        String i7 = ((gh0) dVar.get()).i();
        r8(new o62((gh0) dVar.get(), (JSONObject) dVar2.get(), eh0Var.f7631x, i7, r53Var));
        return new ByteArrayInputStream(i7.getBytes(StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void y3(eh0 eh0Var, wg0 wg0Var) {
        q8(k8(eh0Var, Binder.getCallingUid()), wg0Var, eh0Var);
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void z4(eh0 eh0Var, wg0 wg0Var) {
        Bundle bundle;
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() && (bundle = eh0Var.C) != null) {
            bundle.putLong(yw1.SERVICE_CONNECTED.c(), r2.t.o().a());
        }
        q8(m8(eh0Var, Binder.getCallingUid()), wg0Var, eh0Var);
    }
}
