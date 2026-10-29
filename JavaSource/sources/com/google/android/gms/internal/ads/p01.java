package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class p01 implements w91, qb1, ra1, s2.a, na1, gi1, yc1 {
    private final WeakReference A;
    private final WeakReference B;
    private final w81 C;
    private final sc1 D;
    private final p81 E;
    private boolean F;
    private final AtomicBoolean G = new AtomicBoolean();

    /* renamed from: q, reason: collision with root package name */
    private final Context f13599q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f13600r;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f13601s;

    /* renamed from: t, reason: collision with root package name */
    private final ScheduledExecutorService f13602t;

    /* renamed from: u, reason: collision with root package name */
    private final o03 f13603u;

    /* renamed from: v, reason: collision with root package name */
    private final c03 f13604v;

    /* renamed from: w, reason: collision with root package name */
    private final t73 f13605w;

    /* renamed from: x, reason: collision with root package name */
    private final k13 f13606x;

    /* renamed from: y, reason: collision with root package name */
    private final fn f13607y;

    /* renamed from: z, reason: collision with root package name */
    private final d00 f13608z;

    p01(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, o03 o03Var, c03 c03Var, t73 t73Var, k13 k13Var, View view, mr0 mr0Var, fn fnVar, d00 d00Var, f00 f00Var, b63 b63Var, w81 w81Var, sc1 sc1Var, p81 p81Var) {
        this.f13599q = context;
        this.f13600r = executor;
        this.f13601s = executor2;
        this.f13602t = scheduledExecutorService;
        this.f13603u = o03Var;
        this.f13604v = c03Var;
        this.f13605w = t73Var;
        this.f13606x = k13Var;
        this.f13607y = fnVar;
        this.A = new WeakReference(view);
        this.B = new WeakReference(mr0Var);
        this.f13608z = d00Var;
        this.C = w81Var;
        this.D = sc1Var;
        this.E = p81Var;
    }

    private final void H(final int i7, final int i8) {
        View view;
        if (i7 <= 0 || !((view = (View) this.A.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            n();
        } else {
            this.f13602t.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.l01
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    p01.this.h(i7, i8);
                }
            }, i8, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void n() {
        String str;
        int i7;
        c03 c03Var = this.f13604v;
        List list = c03Var.f6156d;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.f17059b4)).booleanValue()) {
            str = this.f13607y.b().m(this.f13599q, (View) this.A.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) s2.b0.c().d(uy.K0)).booleanValue() && this.f13603u.f13137b.f12530b.f7932h) || !((Boolean) v00.f17306h.e()).booleanValue()) {
            this.f13606x.a(this.f13605w.b(this.f13603u, c03Var, false, str, null, o(), this.E), this.D);
            return;
        }
        if (((Boolean) v00.f17305g.e()).booleanValue() && ((i7 = c03Var.f6152b) == 1 || i7 == 2 || i7 == 5)) {
        }
        p64.r((h64) p64.i(h64.C(p64.a(null)), ((Long) s2.b0.c().d(uy.f17159n1)).longValue(), TimeUnit.MILLISECONDS, this.f13602t), new j01(this, str), this.f13600r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final List o() {
        if (((Boolean) s2.b0.c().d(uy.uc)).booleanValue()) {
            r2.t.g();
            Context context = this.f13599q;
            if (v2.f2.f(context)) {
                r2.t.g();
                Integer i02 = v2.f2.i0(context);
                if (i02 != null) {
                    int min = Math.min(i02.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f13604v.f6156d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.f13604v.f6156d;
    }

    final /* synthetic */ sc1 B() {
        return this.D;
    }

    final /* synthetic */ p81 C() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final void E() {
        if (this.G.compareAndSet(false, true)) {
            int intValue = ((Integer) s2.b0.c().d(uy.f17138k4)).intValue();
            if (intValue > 0) {
                H(intValue, ((Integer) s2.b0.c().d(uy.f17146l4)).intValue());
                return;
            }
            if (((Boolean) s2.b0.c().d(uy.f17130j4)).booleanValue()) {
                this.f13601s.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.k01
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        p01.this.d();
                    }
                });
            } else {
                n();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void c() {
        t73 t73Var = this.f13605w;
        o03 o03Var = this.f13603u;
        k13 k13Var = this.f13606x;
        c03 c03Var = this.f13604v;
        k13Var.a(t73Var.a(o03Var, c03Var, c03Var.f6162g), null);
    }

    @Override // s2.a
    public final void c0() {
        if (!(((Boolean) s2.b0.c().d(uy.K0)).booleanValue() && this.f13603u.f13137b.f12530b.f7932h) && ((Boolean) v00.f17302d.e()).booleanValue()) {
            p64.r((h64) p64.g(h64.C(this.f13608z.b()), Throwable.class, o01.f13131a, cm0.f6506g), new i01(this), this.f13600r);
            return;
        }
        k13 k13Var = this.f13606x;
        t73 t73Var = this.f13605w;
        o03 o03Var = this.f13603u;
        c03 c03Var = this.f13604v;
        k13Var.b(t73Var.a(o03Var, c03Var, c03Var.f6154c), true == r2.t.l().u(this.f13599q) ? 2 : 1);
    }

    final /* synthetic */ void d() {
        this.f13600r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.n01
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                p01.this.n();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void e() {
        t73 t73Var = this.f13605w;
        o03 o03Var = this.f13603u;
        k13 k13Var = this.f13606x;
        c03 c03Var = this.f13604v;
        k13Var.a(t73Var.a(o03Var, c03Var, c03Var.f6166i), null);
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final synchronized void f() {
        w81 w81Var;
        try {
            if (this.F) {
                ArrayList arrayList = new ArrayList(o());
                c03 c03Var = this.f13604v;
                arrayList.addAll(c03Var.f6160f);
                this.f13606x.a(this.f13605w.b(this.f13603u, c03Var, true, null, null, arrayList, null), null);
            } else {
                k13 k13Var = this.f13606x;
                t73 t73Var = this.f13605w;
                o03 o03Var = this.f13603u;
                c03 c03Var2 = this.f13604v;
                k13Var.a(t73Var.a(o03Var, c03Var2, c03Var2.f6174m), null);
                if (((Boolean) s2.b0.c().d(uy.f17104g4)).booleanValue() && (w81Var = this.C) != null) {
                    List list = w81Var.b().f6174m;
                    String g8 = w81Var.c().g();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(t73.d((String) it.next(), "@gw_adnetstatus@", g8));
                    }
                    long h8 = w81Var.c().h();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList2.get(i7);
                        i7++;
                        arrayList3.add(t73.d((String) obj, "@gw_ttr@", Long.toString(h8, 10)));
                    }
                    k13Var.a(t73Var.a(w81Var.a(), w81Var.b(), arrayList3), null);
                }
                k13Var.a(t73Var.a(o03Var, c03Var2, c03Var2.f6160f), null);
            }
            this.F = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void h(final int i7, final int i8) {
        this.f13600r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.m01
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                p01.this.k(i7, i8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.gi1
    public final void j() {
        t73 t73Var = this.f13605w;
        o03 o03Var = this.f13603u;
        k13 k13Var = this.f13606x;
        c03 c03Var = this.f13604v;
        k13Var.a(t73Var.a(o03Var, c03Var, c03Var.f6191u0), null);
    }

    final /* synthetic */ void k(int i7, int i8) {
        H(i7 - 1, i8);
    }

    @Override // com.google.android.gms.internal.ads.yc1
    public final void l() {
        c03 c03Var = this.f13604v;
        if (c03Var.f6158e == 4) {
            this.f13606x.a(this.f13605w.a(this.f13603u, c03Var, c03Var.A0), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.na1
    public final void q(s2.x2 x2Var) {
        if (((Boolean) s2.b0.c().d(uy.M1)).booleanValue()) {
            int i7 = x2Var.f26259q;
            c03 c03Var = this.f13604v;
            ArrayList arrayList = new ArrayList();
            for (String str : c03Var.f6178o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 2);
                sb.append("2.");
                sb.append(i7);
                arrayList.add(t73.d(str, "@gw_mpe@", sb.toString()));
            }
            this.f13606x.a(this.f13605w.a(this.f13603u, c03Var, arrayList), null);
        }
    }

    final /* synthetic */ Context s() {
        return this.f13599q;
    }

    final /* synthetic */ o03 t() {
        return this.f13603u;
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void u(qh0 qh0Var, String str, String str2) {
        t73 t73Var = this.f13605w;
        k13 k13Var = this.f13606x;
        c03 c03Var = this.f13604v;
        k13Var.a(t73Var.c(c03Var, c03Var.f6164h, qh0Var), null);
    }

    final /* synthetic */ c03 x() {
        return this.f13604v;
    }

    final /* synthetic */ t73 y() {
        return this.f13605w;
    }

    final /* synthetic */ k13 z() {
        return this.f13606x;
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void v() {
    }
}
