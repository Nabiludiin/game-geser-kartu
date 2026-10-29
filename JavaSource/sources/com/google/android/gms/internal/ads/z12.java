package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import k2.f;

/* compiled from: MyApplication */
public final class z12 extends s2.s2 {

    /* renamed from: q, reason: collision with root package name */
    final Map f19968q = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    private final Context f19969r;

    /* renamed from: s, reason: collision with root package name */
    private final WeakReference f19970s;

    /* renamed from: t, reason: collision with root package name */
    private final m12 f19971t;

    /* renamed from: u, reason: collision with root package name */
    private final z64 f19972u;

    /* renamed from: v, reason: collision with root package name */
    private b12 f19973v;

    z12(Context context, WeakReference weakReference, m12 m12Var, b22 b22Var, z64 z64Var) {
        this.f19969r = context;
        this.f19970s = weakReference;
        this.f19971t = m12Var;
        this.f19972u = z64Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p8, reason: merged with bridge method [inline-methods] */
    public final synchronized void a0(String str) {
        try {
            p64.r(this.f19973v.o(str), new u12(this), this.f19972u);
        } catch (NullPointerException e8) {
            r2.t.l().i(e8, "OutOfContextTester.setAdAsOutOfContext");
            this.f19971t.d();
        }
    }

    private final synchronized void q8(String str) {
        try {
            p64.r(this.f19973v.o(str), new v12(this), this.f19972u);
        } catch (NullPointerException e8) {
            r2.t.l().i(e8, "OutOfContextTester.setAdAsShown");
            this.f19971t.d();
        }
    }

    private final Context r8() {
        Context context = (Context) this.f19970s.get();
        return context == null ? this.f19969r : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s8(Object obj) {
        k2.u c8;
        s2.y2 g8;
        if (obj instanceof k2.m) {
            c8 = ((k2.m) obj).f();
        } else if (obj instanceof m2.a) {
            c8 = ((m2.a) obj).a();
        } else if (obj instanceof x2.a) {
            c8 = ((x2.a) obj).a();
        } else if (obj instanceof f3.c) {
            c8 = ((f3.c) obj).a();
        } else if (obj instanceof g3.a) {
            c8 = ((g3.a) obj).a();
        } else if (obj instanceof k2.i) {
            c8 = ((k2.i) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            c8 = ((NativeAd) obj).c();
        }
        if (c8 == null || (g8 = c8.g()) == null) {
            return "";
        }
        try {
            return g8.i();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // s2.t2
    public final void G1(String str, w3.a aVar, w3.a aVar2) {
        Context context = (Context) w3.b.r0(aVar);
        ViewGroup viewGroup = (ViewGroup) w3.b.r0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.f19968q;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof k2.i) {
            b22.a(context, viewGroup, (k2.i) obj);
        } else if (obj instanceof NativeAd) {
            b22.b(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void j8(b12 b12Var) {
        this.f19973v = b12Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void k8(a22 a22Var) {
        try {
            String b8 = a22Var.b();
            switch (b8.hashCode()) {
                case -1999289321:
                    if (b8.equals("NATIVE")) {
                        final String a8 = a22Var.a();
                        f.a aVar = new f.a(r8(), a8);
                        aVar.b(new NativeAd.c() { // from class: com.google.android.gms.internal.ads.x12
                            @Override // com.google.android.gms.ads.nativead.NativeAd.c
                            public final /* synthetic */ void a(NativeAd nativeAd) {
                                z12.this.m8(a8, nativeAd);
                            }
                        });
                        aVar.c(new t12(this));
                        com.google.android.gms.ads.nativead.c e8 = a22Var.e();
                        if (((Boolean) s2.b0.c().d(uy.ua)).booleanValue() && e8 != null) {
                            aVar.d(e8);
                        }
                        aVar.a().a(a22Var.c());
                        return;
                    }
                    break;
                case -1372958932:
                    if (b8.equals("INTERSTITIAL")) {
                        String a9 = a22Var.a();
                        x2.a.b(r8(), a9, a22Var.c(), new q12(this, a9));
                        return;
                    }
                    break;
                case -428325382:
                    if (b8.equals("APP_OPEN_AD")) {
                        String a10 = a22Var.a();
                        m2.a.b(r8(), a10, a22Var.c(), new o12(this, a10));
                        return;
                    }
                    break;
                case 543046670:
                    if (b8.equals("REWARDED")) {
                        String a11 = a22Var.a();
                        f3.c.b(r8(), a11, a22Var.c(), new r12(this, a11));
                        return;
                    }
                    break;
                case 1854800829:
                    if (b8.equals("REWARDED_INTERSTITIAL")) {
                        String a12 = a22Var.a();
                        g3.a.b(r8(), a12, a22Var.c(), new s12(this, a12));
                        return;
                    }
                    break;
                case 1951953708:
                    if (b8.equals("BANNER")) {
                        String a13 = a22Var.a();
                        ly lyVar = uy.ua;
                        k2.k bVar = (((Boolean) s2.b0.c().d(lyVar)).booleanValue() && a22Var.g()) ? new l2.b(r8()) : new k2.i(r8());
                        bVar.setAdSize(a22Var.d());
                        bVar.setAdUnitId(a13);
                        bVar.setAdListener(new p12(this, a13, bVar));
                        k2.x f8 = a22Var.f();
                        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue() && a22Var.g() && f8 != null) {
                            ((l2.b) bVar).setVideoOptions(f8);
                        }
                        bVar.b(a22Var.c());
                        return;
                    }
                    break;
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003b, B:24:0x0046, B:27:0x004d, B:29:0x0051, B:32:0x0058, B:34:0x005c, B:37:0x0065, B:39:0x0069, B:42:0x0072, B:44:0x0082, B:46:0x0086, B:48:0x008a, B:51:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003b, B:24:0x0046, B:27:0x004d, B:29:0x0051, B:32:0x0058, B:34:0x005c, B:37:0x0065, B:39:0x0069, B:42:0x0072, B:44:0x0082, B:46:0x0086, B:48:0x008a, B:51:0x0038), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void l8(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.m12 r0 = r5.f19971t     // Catch: java.lang.Throwable -> L36
            android.app.Activity r0 = r0.e()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto Lb
            goto La5
        Lb:
            java.util.Map r1 = r5.f19968q     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto La5
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.ta     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.d(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L36
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L38
            boolean r4 = r2 instanceof m2.a     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L38
            boolean r4 = r2 instanceof x2.a     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L38
            boolean r4 = r2 instanceof f3.c     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L38
            boolean r4 = r2 instanceof g3.a     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L3b
            goto L38
        L36:
            r6 = move-exception
            goto La7
        L38:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L36
        L3b:
            java.lang.String r1 = s8(r2)     // Catch: java.lang.Throwable -> L36
            r5.q8(r1)     // Catch: java.lang.Throwable -> L36
            boolean r1 = r2 instanceof m2.a     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L4d
            m2.a r2 = (m2.a) r2     // Catch: java.lang.Throwable -> L36
            r2.c(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r5)
            return
        L4d:
            boolean r1 = r2 instanceof x2.a     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L58
            x2.a r2 = (x2.a) r2     // Catch: java.lang.Throwable -> L36
            r2.e(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r5)
            return
        L58:
            boolean r1 = r2 instanceof f3.c     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L65
            f3.c r2 = (f3.c) r2     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.y12 r6 = com.google.android.gms.internal.ads.y12.f19337a     // Catch: java.lang.Throwable -> L36
            r2.d(r0, r6)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r5)
            return
        L65:
            boolean r1 = r2 instanceof g3.a     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L72
            g3.a r2 = (g3.a) r2     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.w12 r6 = com.google.android.gms.internal.ads.w12.f17983a     // Catch: java.lang.Throwable -> L36
            r2.c(r0, r6)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r5)
            return
        L72:
            com.google.android.gms.internal.ads.sy r0 = s2.b0.c()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.d(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto La5
            boolean r0 = r2 instanceof k2.i     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L8a
            boolean r0 = r2 instanceof com.google.android.gms.ads.nativead.NativeAd     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto La5
        L8a:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L36
            r0.<init>()     // Catch: java.lang.Throwable -> L36
            android.content.Context r1 = r5.r8()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "com.google.android.gms.ads.OutOfContextTestingActivity"
            r0.setClassName(r1, r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "adUnit"
            r0.putExtra(r2, r6)     // Catch: java.lang.Throwable -> L36
            r2.t.g()     // Catch: java.lang.Throwable -> L36
            v2.f2.z(r1, r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r5)
            return
        La5:
            monitor-exit(r5)
            return
        La7:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L36
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z12.l8(java.lang.String):void");
    }

    protected final synchronized void m8(String str, Object obj) {
        this.f19968q.put(str, obj);
        a0(s8(obj));
    }

    final /* synthetic */ m12 o8() {
        return this.f19971t;
    }
}
