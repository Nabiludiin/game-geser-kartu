package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ox0 extends s2.y1 {
    private final e63 A;
    private final t13 B;
    private final e71 C;
    private final rx1 D;
    private boolean E = false;
    private final Long F = Long.valueOf(r2.t.o().b());

    /* renamed from: q, reason: collision with root package name */
    private final Context f13535q;

    /* renamed from: r, reason: collision with root package name */
    private final w2.a f13536r;

    /* renamed from: s, reason: collision with root package name */
    private final ev1 f13537s;

    /* renamed from: t, reason: collision with root package name */
    private final ma2 f13538t;

    /* renamed from: u, reason: collision with root package name */
    private final ug2 f13539u;

    /* renamed from: v, reason: collision with root package name */
    private final f02 f13540v;

    /* renamed from: w, reason: collision with root package name */
    private final jk0 f13541w;

    /* renamed from: x, reason: collision with root package name */
    private final kv1 f13542x;

    /* renamed from: y, reason: collision with root package name */
    private final b12 f13543y;

    /* renamed from: z, reason: collision with root package name */
    private final q10 f13544z;

    ox0(Context context, w2.a aVar, ev1 ev1Var, ma2 ma2Var, ug2 ug2Var, f02 f02Var, jk0 jk0Var, kv1 kv1Var, b12 b12Var, q10 q10Var, e63 e63Var, t13 t13Var, e71 e71Var, rx1 rx1Var) {
        this.f13535q = context;
        this.f13536r = aVar;
        this.f13537s = ev1Var;
        this.f13538t = ma2Var;
        this.f13539u = ug2Var;
        this.f13540v = f02Var;
        this.f13541w = jk0Var;
        this.f13542x = kv1Var;
        this.f13543y = b12Var;
        this.f13544z = q10Var;
        this.A = e63Var;
        this.B = t13Var;
        this.C = e71Var;
        this.D = rx1Var;
    }

    @Override // s2.z1
    public final void H0(String str) {
        this.f13539u.e(str);
    }

    @Override // s2.z1
    public final void L5(a80 a80Var) {
        this.f13540v.b(a80Var);
    }

    @Override // s2.z1
    public final synchronized void S2(float f8) {
        r2.t.m().a(f8);
    }

    @Override // s2.z1
    public final synchronized void a0(String str) {
        Context context = this.f13535q;
        uy.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) s2.b0.c().d(uy.B4)).booleanValue()) {
                r2.t.p().a(context, this.f13536r, str, null, this.A, null, null, this.f13543y.t());
            }
        }
    }

    final void b() {
        if (r2.t.l().q().V()) {
            String O = r2.t.l().q().O();
            if (r2.t.s().e(this.f13535q, O, this.f13536r.f27051q)) {
                return;
            }
            r2.t.l().q().z0(false);
            r2.t.l().q().v("");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // s2.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b5(java.lang.String r13, w3.a r14) {
        /*
            r12 = this;
            android.content.Context r0 = r12.f13535q
            com.google.android.gms.internal.ads.uy.a(r0)
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.I4
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2b
            r2.t.g()     // Catch: android.os.RemoteException -> L1f java.lang.RuntimeException -> L21
            java.lang.String r0 = v2.f2.f0(r0)     // Catch: android.os.RemoteException -> L1f java.lang.RuntimeException -> L21
            goto L2d
        L1f:
            r0 = move-exception
            goto L22
        L21:
            r0 = move-exception
        L22:
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            com.google.android.gms.internal.ads.ql0 r2 = r2.t.l()
            r2.i(r0, r1)
        L2b:
            java.lang.String r0 = ""
        L2d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L36
            r6 = r13
            goto L37
        L36:
            r6 = r0
        L37:
            boolean r13 = android.text.TextUtils.isEmpty(r6)
            if (r13 == 0) goto L3e
            goto L98
        L3e:
            com.google.android.gms.internal.ads.ly r13 = com.google.android.gms.internal.ads.uy.B4
            com.google.android.gms.internal.ads.sy r0 = s2.b0.c()
            java.lang.Object r13 = r0.d(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.f17127j1
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r1 = r1.d(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r13 = r13 | r1
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r0 = r1.d(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7c
            java.lang.Object r13 = w3.b.r0(r14)
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            com.google.android.gms.internal.ads.lx0 r14 = new com.google.android.gms.internal.ads.lx0
            r14.<init>()
        L7a:
            r7 = r14
            goto L7f
        L7c:
            r14 = 0
            r2 = r13
            goto L7a
        L7f:
            if (r2 == 0) goto L98
            android.content.Context r4 = r12.f13535q
            w2.a r5 = r12.f13536r
            com.google.android.gms.internal.ads.e63 r8 = r12.A
            com.google.android.gms.internal.ads.rx1 r9 = r12.D
            java.lang.Long r10 = r12.F
            com.google.android.gms.internal.ads.b12 r13 = r12.f13543y
            r2.f r3 = r2.t.p()
            boolean r11 = r13.t()
            r3.a(r4, r5, r6, r7, r8, r9, r10, r11)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ox0.b5(java.lang.String, w3.a):void");
    }

    @Override // s2.z1
    public final synchronized void c() {
        if (this.E) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Mobile ads is initialized already.");
            return;
        }
        Context context = this.f13535q;
        uy.a(context);
        r2.t.l().g(context, this.f13536r, this.D);
        this.C.b();
        r2.t.n().a(context);
        this.E = true;
        this.f13540v.c();
        this.f13539u.a();
        if (((Boolean) s2.b0.c().d(uy.D4)).booleanValue()) {
            this.f13542x.a();
        }
        this.f13543y.b();
        if (((Boolean) s2.b0.c().d(uy.ja)).booleanValue()) {
            cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nx0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ox0.this.b();
                }
            });
        }
        if (((Boolean) s2.b0.c().d(uy.Xb)).booleanValue()) {
            cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kx0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ox0.this.j8();
                }
            });
        }
        if (((Boolean) s2.b0.c().d(uy.f17241x3)).booleanValue()) {
            cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ix0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ox0.this.d();
                }
            });
        }
        if (((Boolean) s2.b0.c().d(uy.f17123i5)).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.f17131j5)).booleanValue()) {
                cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jx0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        ox0.this.h();
                    }
                });
            }
        }
    }

    @Override // s2.z1
    public final void c8(s2.k2 k2Var) {
        this.f13543y.p(k2Var, a12.API);
    }

    final /* synthetic */ void d() {
        c23.a(this.f13535q, true);
    }

    @Override // s2.z1
    public final void g1(w3.a aVar, String str) {
        if (aVar == null) {
            int i7 = v2.n1.f26802b;
            w2.p.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) w3.b.r0(aVar);
        if (context == null) {
            int i8 = v2.n1.f26802b;
            w2.p.c("Context is null. Failed to open debug menu.");
        } else {
            v2.u uVar = new v2.u(context);
            uVar.c(str);
            uVar.d(this.f13536r.f27051q);
            uVar.b();
        }
    }

    final /* synthetic */ void h() {
        r2.t.r().c(this.f13535q, this.D);
    }

    @Override // s2.z1
    public final void i0(String str) {
        if (((Boolean) s2.b0.c().d(uy.va)).booleanValue()) {
            r2.t.l().v(str);
        }
    }

    final /* synthetic */ void j8() {
        this.f13544z.a(new eg0());
    }

    @Override // s2.z1
    public final synchronized boolean k() {
        return r2.t.m().d();
    }

    final /* synthetic */ void k8(Runnable runnable) {
        p3.o.f("Adapters must be initialized on the main thread.");
        Map f8 = r2.t.l().q().j().f();
        if (f8.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i7 = v2.n1.f26802b;
                w2.p.g("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f13537s.c()) {
            HashMap hashMap = new HashMap();
            Iterator it = f8.values().iterator();
            while (it.hasNext()) {
                for (db0 db0Var : ((eb0) it.next()).f7521a) {
                    String str = db0Var.f7038b;
                    for (String str2 : db0Var.f7037a) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    na2 a8 = this.f13538t.a(str3, jSONObject);
                    if (a8 != null) {
                        v13 v13Var = (v13) a8.f12649b;
                        if (!v13Var.s() && v13Var.v()) {
                            v13Var.w(this.f13535q, (cc2) a8.f12650c, (List) entry.getValue());
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb.append("Initialized rewarded video mediation adapter ");
                            sb.append(str3);
                            String sb2 = sb.toString();
                            int i8 = v2.n1.f26802b;
                            w2.p.a(sb2);
                        }
                    }
                } catch (d13 e8) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb3.append("Failed to initialize rewarded video mediation adapter \"");
                    sb3.append(str3);
                    sb3.append("\"");
                    String sb4 = sb3.toString();
                    int i9 = v2.n1.f26802b;
                    w2.p.g(sb4, e8);
                }
            }
        }
    }

    @Override // s2.z1
    public final synchronized float l() {
        return r2.t.m().b();
    }

    @Override // s2.z1
    public final List m() {
        return this.f13540v.d();
    }

    @Override // s2.z1
    public final void m7(s2.o4 o4Var) {
        this.f13541w.b(this.f13535q, o4Var);
    }

    @Override // s2.z1
    public final String n() {
        return this.f13536r.f27051q;
    }

    @Override // s2.z1
    public final synchronized void o0(boolean z7) {
        r2.t.m().c(z7);
    }

    @Override // s2.z1
    public final void o1(boolean z7) {
        try {
            Context context = this.f13535q;
            lh3.a(context).b(z7);
            if (z7) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e8) {
                r2.t.l().i(e8, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e9) {
            throw new RemoteException(e9.getMessage());
        }
    }

    @Override // s2.z1
    public final void p() {
        this.f13540v.a();
    }

    @Override // s2.z1
    public final void r2(kb0 kb0Var) {
        this.B.c(kb0Var);
    }
}
