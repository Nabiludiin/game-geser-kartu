package b3;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.wx1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import k2.g;

/* compiled from: MyApplication */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f3268a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f3269b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Context f3270c;

    /* renamed from: d, reason: collision with root package name */
    private final wx1 f3271d;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f3272e;

    j1(Context context, wx1 wx1Var, ExecutorService executorService) {
        this.f3270c = context;
        this.f3271d = wx1Var;
        this.f3272e = executorService;
    }

    private final void h(final boolean z7) {
        Map map = this.f3269b;
        Boolean valueOf = Boolean.valueOf(z7);
        if (map.containsKey(valueOf)) {
            return;
        }
        map.put(valueOf, new ArrayList());
        this.f3272e.submit(new Runnable() { // from class: b3.g1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                j1.this.f(z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final synchronized void e(boolean z7, boolean z8) {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z7);
                Map map = this.f3268a;
                Boolean valueOf = Boolean.valueOf(z7);
                l1 l1Var = (l1) map.get(valueOf);
                int i7 = 0;
                if (z8 && l1Var != null) {
                    try {
                        i7 = l1Var.d() + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                l1 l1Var2 = (l1) map.get(valueOf);
                final k1 k1Var = new k1(this, z7, i7, l1Var2 == null ? null : Boolean.valueOf(l1Var2.e()), this.f3271d);
                final k2.g k7 = ((g.a) new g.a().c(AdMobAdapter.class, bundle)).k();
                if (((Boolean) s2.b0.c().d(uy.ec)).booleanValue()) {
                    this.f3272e.submit(new Callable() { // from class: b3.h1
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return j1.this.g(k7, k1Var);
                        }
                    });
                } else {
                    e3.a.a(this.f3270c, k2.c.BANNER, k7, k1Var);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final void j(l1 l1Var, Pair pair, boolean z7) {
        l1Var.f();
        e3.a a8 = l1Var.a();
        if (a8 != null) {
            ((e3.b) pair.first).b(a8);
        } else {
            ((e3.b) pair.first).a(l1Var.b());
        }
        c.e(this.f3271d, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", k2.c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(r2.t.o().a() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z7)), new Pair("sgpc_rs", Boolean.toString(l1Var.a() != null)));
    }

    public final synchronized void a() {
        h(true);
        h(false);
    }

    public final synchronized void b(final Object obj, e3.b bVar) {
        final Pair pair = new Pair(bVar, Long.valueOf(r2.t.o().a()));
        cm0.f6505f.execute(new Runnable() { // from class: b3.i1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                j1.this.d(obj, pair);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void c(final boolean r8, b3.l1 r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Map r0 = r7.f3268a     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L22
            b3.l1 r2 = (b3.l1) r2     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L24
            e3.a r2 = r2.a()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            e3.a r2 = r9.a()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L27
            goto L24
        L22:
            r8 = move-exception
            goto L81
        L24:
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L22
        L27:
            e3.a r0 = r9.a()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L36
            com.google.android.gms.internal.ads.g00 r0 = com.google.android.gms.internal.ads.b10.f5456f     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L22
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L22
            goto L3e
        L36:
            com.google.android.gms.internal.ads.g00 r0 = com.google.android.gms.internal.ads.b10.f5457g     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L22
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L22
        L3e:
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L22
            e3.a r0 = r9.a()     // Catch: java.lang.Throwable -> L22
            r4 = 0
            if (r0 != 0) goto L4b
            r0 = 1
            goto L4c
        L4b:
            r0 = r4
        L4c:
            java.util.concurrent.ScheduledExecutorService r5 = com.google.android.gms.internal.ads.cm0.f6503d     // Catch: java.lang.Throwable -> L22
            b3.f1 r6 = new b3.f1     // Catch: java.lang.Throwable -> L22
            r6.<init>()     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L22
            r5.schedule(r6, r2, r8)     // Catch: java.lang.Throwable -> L22
            java.util.Map r8 = r7.f3269b     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r8.get(r1)     // Catch: java.lang.Throwable -> L22
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            r8.put(r1, r2)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L6b
            goto L7f
        L6b:
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> L22
        L6f:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L22
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L22
            r7.j(r9, r0, r4)     // Catch: java.lang.Throwable -> L22
            goto L6f
        L7f:
            monitor-exit(r7)
            return
        L81:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L22
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.j1.c(boolean, b3.l1):void");
    }

    final /* synthetic */ void d(Object obj, Pair pair) {
        boolean z7 = false;
        if (obj instanceof WebView) {
            CookieManager a8 = r2.t.j().a(this.f3270c);
            if (a8 != null) {
                z7 = a8.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.f3268a;
        Boolean valueOf = Boolean.valueOf(z7);
        l1 l1Var = (l1) map.get(valueOf);
        if (l1Var != null && !l1Var.c()) {
            j(l1Var, pair, true);
            return;
        }
        Map map2 = this.f3269b;
        List list = (List) map2.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            map2.put(valueOf, list);
        }
        list.add(pair);
    }

    final /* synthetic */ void f(boolean z7) {
        e(z7, false);
    }

    final /* synthetic */ Object g(k2.g gVar, k1 k1Var) {
        e3.a.a(this.f3270c, k2.c.BANNER, gVar, k1Var);
        return Boolean.TRUE;
    }
}
