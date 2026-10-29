package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: MyApplication */
public final class j33 {

    /* renamed from: a, reason: collision with root package name */
    private final n23 f10329a;

    /* renamed from: b, reason: collision with root package name */
    private final g33 f10330b;

    /* renamed from: c, reason: collision with root package name */
    private final i23 f10331c;

    /* renamed from: e, reason: collision with root package name */
    private q33 f10333e;

    /* renamed from: f, reason: collision with root package name */
    private int f10334f = 1;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f10332d = new ArrayDeque();

    public j33(n23 n23Var, i23 i23Var, g33 g33Var) {
        this.f10329a = n23Var;
        this.f10331c = i23Var;
        this.f10330b = g33Var;
        i23Var.a(new h23() { // from class: com.google.android.gms.internal.ads.i33
            @Override // com.google.android.gms.internal.ads.h23
            public final /* synthetic */ void a() {
                j33.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r3 = new com.google.android.gms.internal.ads.q33(r4.f10329a, r4.f10330b, r0);
        r4.f10333e = r3;
        r3.a(new com.google.android.gms.internal.ads.e33(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        return;
     */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.O6     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r1.d(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.ql0 r0 = r2.t.l()     // Catch: java.lang.Throwable -> L2d
            v2.p1 r0 = r0.q()     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.ll0 r0 = r0.j()     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.i()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L26
            goto L2f
        L26:
            java.util.ArrayDeque r0 = r4.f10332d     // Catch: java.lang.Throwable -> L2d
            r0.clear()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r4)
            return
        L2d:
            r0 = move-exception
            goto L6e
        L2f:
            boolean r0 = r4.i()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6c
        L35:
            java.util.ArrayDeque r0 = r4.f10332d     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L6c
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.h33 r0 = (com.google.android.gms.internal.ads.h33) r0     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L57
            com.google.android.gms.internal.ads.x23 r1 = r0.b()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.n23 r1 = r4.f10329a     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.x23 r2 = r0.b()     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L35
        L57:
            com.google.android.gms.internal.ads.n23 r1 = r4.f10329a     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.g33 r2 = r4.f10330b     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.q33 r3 = new com.google.android.gms.internal.ads.q33     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L2d
            r4.f10333e = r3     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.e33 r1 = new com.google.android.gms.internal.ads.e33     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2d
            r3.a(r1)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r4)
            return
        L6c:
            monitor-exit(r4)
            return
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j33.d():void");
    }

    private final synchronized boolean i() {
        return this.f10333e == null;
    }

    public final synchronized void a(h33 h33Var) {
        this.f10332d.add(h33Var);
    }

    public final synchronized a5.d b(h33 h33Var) {
        this.f10334f = 2;
        if (i()) {
            return null;
        }
        return this.f10333e.b(h33Var);
    }

    final /* synthetic */ void c() {
        synchronized (this) {
            this.f10334f = 1;
            d();
        }
    }

    final /* synthetic */ ArrayDeque e() {
        return this.f10332d;
    }

    final /* synthetic */ void f(q33 q33Var) {
        this.f10333e = null;
    }

    final /* synthetic */ int g() {
        return this.f10334f;
    }
}
