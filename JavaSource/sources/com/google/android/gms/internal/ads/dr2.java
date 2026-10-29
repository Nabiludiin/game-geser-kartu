package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class dr2 implements yr2 {

    /* renamed from: k, reason: collision with root package name */
    private static final er2 f7252k = new er2(new JSONArray().toString(), new Bundle(), "");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f7253l = 0;

    /* renamed from: a, reason: collision with root package name */
    private final z64 f7254a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f7255b;

    /* renamed from: c, reason: collision with root package name */
    private final ug2 f7256c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f7257d;

    /* renamed from: e, reason: collision with root package name */
    private final w03 f7258e;

    /* renamed from: f, reason: collision with root package name */
    private final pg2 f7259f;

    /* renamed from: g, reason: collision with root package name */
    private final ev1 f7260g;

    /* renamed from: h, reason: collision with root package name */
    private final h02 f7261h;

    /* renamed from: i, reason: collision with root package name */
    private final int f7262i;

    /* renamed from: j, reason: collision with root package name */
    final String f7263j;

    dr2(z64 z64Var, ScheduledExecutorService scheduledExecutorService, String str, ug2 ug2Var, Context context, w03 w03Var, pg2 pg2Var, ev1 ev1Var, h02 h02Var, int i7) {
        this.f7254a = z64Var;
        this.f7255b = scheduledExecutorService;
        this.f7263j = str;
        this.f7256c = ug2Var;
        this.f7257d = context;
        this.f7258e = w03Var;
        this.f7259f = pg2Var;
        this.f7260g = ev1Var;
        this.f7261h = h02Var;
        this.f7262i = i7;
    }

    private final void f(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            yg2 yg2Var = (yg2) ((Map.Entry) it.next()).getValue();
            String str = yg2Var.f19576a;
            list.add(h(str, Collections.singletonList(yg2Var.f19580e), g(str), yg2Var.f19577b, yg2Var.f19578c));
        }
    }

    private final Bundle g(String str) {
        Bundle bundle = this.f7258e.f17958d.C;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final h64 h(final String str, final List list, final Bundle bundle, final boolean z7, final boolean z8) {
        v54 v54Var = new v54() { // from class: com.google.android.gms.internal.ads.yq2
            @Override // com.google.android.gms.internal.ads.v54
            public final /* synthetic */ a5.d a() {
                return dr2.this.d(str, list, bundle, z7, z8);
            }
        };
        z64 z64Var = this.f7254a;
        h64 C = h64.C(p64.f(v54Var, z64Var));
        if (!((Boolean) s2.b0.c().d(uy.Q1)).booleanValue()) {
            C = (h64) p64.i(C, ((Long) s2.b0.c().d(uy.J1)).longValue(), TimeUnit.MILLISECONDS, this.f7255b);
        }
        return (h64) p64.g(C, Throwable.class, new hx3() { // from class: com.google.android.gms.internal.ads.zq2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i7 = dr2.f7253l;
                String str2 = str;
                int i8 = v2.n1.f26802b;
                w2.p.c("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) s2.b0.c().d(uy.de)).booleanValue()) {
                    r2.t.l().j(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                r2.t.l().i(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, z64Var);
    }

    private final void i(id0 id0Var, Bundle bundle, List list, xg2 xg2Var) {
        id0Var.G7(w3.b.C1(this.f7257d), this.f7263j, bundle, (Bundle) list.get(0), this.f7258e.f17960f, xg2Var);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        if (this.f7262i == 2) {
            return p64.a(f7252k);
        }
        w03 w03Var = this.f7258e;
        if (w03Var.f17973s) {
            if (!Arrays.asList(((String) s2.b0.c().d(uy.W1)).split(",")).contains(b3.c.b(b3.c.c(w03Var.f17958d)))) {
                return p64.a(f7252k);
            }
        }
        return p64.f(new v54() { // from class: com.google.android.gms.internal.ads.br2
            @Override // com.google.android.gms.internal.ads.v54
            public final /* synthetic */ a5.d a() {
                return dr2.this.c();
            }
        }, this.f7254a);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 32;
    }

    final /* synthetic */ a5.d c() {
        final String str;
        dr2 dr2Var;
        String lowerCase = ((Boolean) s2.b0.c().d(uy.Vb)).booleanValue() ? this.f7258e.f17961g.toLowerCase(Locale.ROOT) : this.f7258e.f17961g;
        final Bundle a8 = ((Boolean) s2.b0.c().d(uy.U1)).booleanValue() ? this.f7261h.a() : new Bundle();
        if (((Boolean) s2.b0.c().d(uy.L4)).booleanValue()) {
            int k7 = r2.t.l().q().j().k();
            str = k7 != 1 ? k7 != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) s2.b0.c().d(uy.f17075d2)).booleanValue()) {
            dr2Var = this;
            f(arrayList, dr2Var.f7256c.d(dr2Var.f7263j, lowerCase));
        } else {
            ug2 ug2Var = this.f7256c;
            for (Map.Entry entry : ug2Var.c(this.f7263j, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(h(str2, (List) entry.getValue(), g(str2), true, true));
            }
            dr2Var = this;
            f(arrayList, ug2Var.b());
        }
        return p64.p(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.xq2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i7 = dr2.f7253l;
                JSONArray jSONArray = new JSONArray();
                for (a5.d dVar : arrayList) {
                    if (((JSONObject) dVar.get()) != null) {
                        jSONArray.put(dVar.get());
                    }
                }
                String str3 = str;
                Bundle bundle = a8;
                if (jSONArray.length() != 0) {
                    return new er2(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) s2.b0.c().d(uy.L4)).booleanValue()) {
                    return new er2(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, dr2Var.f7254a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(3:5|6|(2:8|(2:10|11)(1:13))(3:14|(1:16)|(2:18|(2:20|21)(2:22|23))(2:24|25))))|26|27|6|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002d, code lost:
    
        v2.n1.l("Couldn't create RTB adapter : ", r0);
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ a5.d d(java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.im0 r3 = new com.google.android.gms.internal.ads.im0
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L25
            com.google.android.gms.internal.ads.ly r12 = com.google.android.gms.internal.ads.uy.V1
            com.google.android.gms.internal.ads.sy r0 = s2.b0.c()
            java.lang.Object r12 = r0.d(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L25
            com.google.android.gms.internal.ads.pg2 r12 = r7.f7259f
            r12.a(r8)
            com.google.android.gms.internal.ads.id0 r12 = r12.b(r8)
        L23:
            r2 = r12
            goto L34
        L25:
            com.google.android.gms.internal.ads.ev1 r12 = r7.f7260g     // Catch: android.os.RemoteException -> L2c
            com.google.android.gms.internal.ads.id0 r12 = r12.b(r8)     // Catch: android.os.RemoteException -> L2c
            goto L23
        L2c:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            v2.n1.l(r0, r12)
            r2 = r1
        L34:
            if (r2 != 0) goto L4f
            com.google.android.gms.internal.ads.ly r9 = com.google.android.gms.internal.ads.uy.L1
            com.google.android.gms.internal.ads.sy r10 = s2.b0.c()
            java.lang.Object r9 = r10.d(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4e
            com.google.android.gms.internal.ads.xg2.j8(r8, r3)
            r1 = r7
            goto Lbb
        L4e:
            throw r1
        L4f:
            com.google.android.gms.internal.ads.xg2 r0 = new com.google.android.gms.internal.ads.xg2
            com.google.android.gms.common.util.e r12 = r2.t.o()
            long r4 = r12.b()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.ly r8 = com.google.android.gms.internal.ads.uy.Q1
            com.google.android.gms.internal.ads.sy r12 = s2.b0.c()
            java.lang.Object r8 = r12.d(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8b
            java.util.concurrent.ScheduledExecutorService r8 = r7.f7255b
            com.google.android.gms.internal.ads.cr2 r12 = new com.google.android.gms.internal.ads.cr2
            r12.<init>()
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.J1
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r1 = r4.d(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r12, r4, r1)
        L8b:
            if (r11 == 0) goto Lb7
            com.google.android.gms.internal.ads.ly r8 = com.google.android.gms.internal.ads.uy.X1
            com.google.android.gms.internal.ads.sy r11 = s2.b0.c()
            java.lang.Object r8 = r11.d(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb0
            com.google.android.gms.internal.ads.z64 r8 = r7.f7254a
            r5 = r0
            com.google.android.gms.internal.ads.ar2 r0 = new com.google.android.gms.internal.ads.ar2
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.H0(r0)
            goto Lbb
        Lb0:
            r1 = r7
            r4 = r9
            r8 = r10
            r7.i(r2, r8, r4, r0)
            goto Lbb
        Lb7:
            r1 = r7
            r0.b()
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dr2.d(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):a5.d");
    }

    final /* synthetic */ void e(id0 id0Var, Bundle bundle, List list, xg2 xg2Var, im0 im0Var) {
        try {
            i(id0Var, bundle, list, xg2Var);
        } catch (RemoteException e8) {
            im0Var.e(e8);
        }
    }
}
