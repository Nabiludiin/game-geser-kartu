package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class ge2 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    private final f53 f8844a;

    /* renamed from: b, reason: collision with root package name */
    private final y91 f8845b;

    /* renamed from: c, reason: collision with root package name */
    private final t73 f8846c;

    /* renamed from: d, reason: collision with root package name */
    private final x73 f8847d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f8848e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f8849f;

    /* renamed from: g, reason: collision with root package name */
    private final u41 f8850g;

    /* renamed from: h, reason: collision with root package name */
    private final yd2 f8851h;

    /* renamed from: i, reason: collision with root package name */
    private final pa2 f8852i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f8853j;

    /* renamed from: k, reason: collision with root package name */
    private final b63 f8854k;

    /* renamed from: l, reason: collision with root package name */
    private final id2 f8855l;

    /* renamed from: m, reason: collision with root package name */
    private final lx1 f8856m;

    ge2(Context context, f53 f53Var, yd2 yd2Var, y91 y91Var, t73 t73Var, x73 x73Var, u41 u41Var, Executor executor, ScheduledExecutorService scheduledExecutorService, pa2 pa2Var, b63 b63Var, id2 id2Var, lx1 lx1Var) {
        this.f8853j = context;
        this.f8844a = f53Var;
        this.f8851h = yd2Var;
        this.f8845b = y91Var;
        this.f8846c = t73Var;
        this.f8847d = x73Var;
        this.f8850g = u41Var;
        this.f8848e = executor;
        this.f8849f = scheduledExecutorService;
        this.f8852i = pa2Var;
        this.f8854k = b63Var;
        this.f8855l = id2Var;
        this.f8856m = lx1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.f17097f6)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String a(com.google.android.gms.internal.ads.o03 r5) {
        /*
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.f17106g6
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r0 = r1.d(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.n03 r5 = r5.f13137b
            com.google.android.gms.internal.ads.f03 r5 = r5.f12530b
            int r2 = r5.f7930f
            if (r2 == 0) goto L61
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.f17097f6
            com.google.android.gms.internal.ads.sy r3 = s2.b0.c()
            java.lang.Object r2 = r3.d(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L61
            goto L62
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L62
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L62
        L61:
            r1 = r0
        L62:
            com.google.android.gms.internal.ads.e03 r5 = r5.f7934j
            if (r5 == 0) goto L6b
            java.lang.String r5 = r5.a()
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ge2.a(com.google.android.gms.internal.ads.o03):java.lang.String");
    }

    final /* synthetic */ a5.d c(c03 c03Var, o03 o03Var, ka2 ka2Var, Throwable th) {
        r53 a8 = q53.a(this.f8853j, 12);
        a8.c0(c03Var.E);
        a8.a();
        a5.d i7 = p64.i(ka2Var.b(o03Var, c03Var), c03Var.R, TimeUnit.MILLISECONDS, this.f8849f);
        this.f8851h.e(o03Var, c03Var, i7, this.f8846c);
        a63.d(i7, this.f8854k, a8);
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final /* synthetic */ a5.d d(Object obj) {
        int i7;
        Bundle bundle;
        final o03 o03Var = (o03) obj;
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() && (bundle = o03Var.f13137b.f12532d) != null) {
            this.f8856m.e().putAll(bundle);
        }
        if (((Boolean) s2.b0.c().d(uy.f17232w2)).booleanValue()) {
            this.f8856m.e().putLong(yw1.RENDERING_START.c(), r2.t.o().a());
        }
        String a8 = a(o03Var);
        pa2 pa2Var = this.f8852i;
        n03 n03Var = o03Var.f13137b;
        f03 f03Var = n03Var.f12530b;
        pa2Var.a(f03Var);
        if (((Boolean) s2.b0.c().d(uy.i9)).booleanValue() && (i7 = f03Var.f7930f) != 0 && (i7 < 200 || i7 >= 300)) {
            return p64.c(new ce2(3, a8));
        }
        String str = f03Var.f7941q;
        if (!((Boolean) s2.b0.c().d(uy.f17086e4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (c03 c03Var : n03Var.f12529a) {
                pa2Var.b(c03Var);
                Iterator it = c03Var.f6150a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        pa2Var.e(c03Var, 0L, z13.d(1, null, null));
                        break;
                    }
                    ka2 m02 = this.f8850g.m0(c03Var.f6152b, (String) it.next());
                    if (m02 == null || !m02.a(o03Var, c03Var)) {
                    }
                }
            }
        } else {
            pa2Var.c(str, n03Var.f12529a);
        }
        y91 y91Var = this.f8845b;
        h01 h01Var = new h01(o03Var, this.f8847d, this.f8846c);
        Executor executor = this.f8848e;
        y91Var.y0(h01Var, executor);
        if (f03Var.f7942r > 1) {
            return this.f8855l.a(o03Var);
        }
        String a9 = a(o03Var);
        f53 f53Var = this.f8844a;
        z43 z43Var = z43.RENDER_CONFIG_INIT;
        Objects.requireNonNull(f53Var);
        l43 i8 = q43.a(p64.c(new ce2(3, a9)), z43Var, f53Var).i();
        final yd2 yd2Var = this.f8851h;
        yd2Var.a();
        int i9 = 0;
        for (final c03 c03Var2 : n03Var.f12529a) {
            Iterator it2 = c03Var2.f6150a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final ka2 m03 = this.f8850g.m0(c03Var2.f6152b, str2);
                if (m03 != null && m03.a(o03Var, c03Var2)) {
                    w43 a10 = f53Var.a(z43.RENDER_CONFIG_WATERFALL, i8);
                    StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i9);
                    sb.append("-");
                    sb.append(str2);
                    i8 = a10.a(sb.toString()).g(Throwable.class, new w54() { // from class: com.google.android.gms.internal.ads.fe2
                        @Override // com.google.android.gms.internal.ads.w54
                        public final /* synthetic */ a5.d d(Object obj2) {
                            return ge2.this.c(c03Var2, o03Var, m03, (Throwable) obj2);
                        }
                    }).i();
                    break;
                }
            }
            i9++;
        }
        i8.c(new Runnable() { // from class: com.google.android.gms.internal.ads.ee2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                yd2.this.b();
            }
        }, executor);
        return i8;
    }
}
