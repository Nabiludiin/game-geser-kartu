package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
final class jd2 {

    /* renamed from: c, reason: collision with root package name */
    private final j74 f10499c;

    /* renamed from: f, reason: collision with root package name */
    private zd2 f10502f;

    /* renamed from: h, reason: collision with root package name */
    private final String f10504h;

    /* renamed from: i, reason: collision with root package name */
    private final int f10505i;

    /* renamed from: j, reason: collision with root package name */
    private final yd2 f10506j;

    /* renamed from: k, reason: collision with root package name */
    private c03 f10507k;

    /* renamed from: a, reason: collision with root package name */
    private final Map f10497a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f10498b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f10500d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f10501e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private int f10503g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10508l = false;

    jd2(o03 o03Var, yd2 yd2Var, j74 j74Var) {
        this.f10505i = o03Var.f13137b.f12530b.f7942r;
        this.f10506j = yd2Var;
        this.f10499c = j74Var;
        this.f10504h = ge2.a(o03Var);
        List list = o03Var.f13137b.f12529a;
        for (int i7 = 0; i7 < list.size(); i7++) {
            this.f10497a.put((c03) list.get(i7), Integer.valueOf(i7));
        }
        this.f10498b.addAll(list);
    }

    private final synchronized boolean e() {
        if (this.f10508l) {
            return false;
        }
        List list = this.f10498b;
        if (!list.isEmpty() && ((c03) list.get(0)).f6193v0 && !this.f10500d.isEmpty()) {
            return false;
        }
        if (!d()) {
            List list2 = this.f10500d;
            if (list2.size() < this.f10505i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final synchronized boolean f(boolean z7) {
        try {
            for (c03 c03Var : this.f10498b) {
                Integer num = (Integer) this.f10497a.get(c03Var);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z7 || !this.f10501e.contains(c03Var.f6189t0)) {
                    int i7 = this.f10503g;
                    if (intValue < i7) {
                        return true;
                    }
                    if (intValue > i7) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean g() {
        try {
            Iterator it = this.f10500d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f10497a.get((c03) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f10503g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean h() {
        if (!f(true)) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized void i() {
        this.f10506j.d(this.f10507k);
        zd2 zd2Var = this.f10502f;
        if (zd2Var != null) {
            this.f10499c.l(zd2Var);
        } else {
            this.f10499c.m(new ce2(3, this.f10504h));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2.f6193v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6.f10508l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r6.f10500d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.c03) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized com.google.android.gms.internal.ads.c03 a() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.e()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L43
            r0 = 0
        L8:
            java.util.List r1 = r6.f10498b     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2b
            if (r0 >= r2) goto L43
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.c03 r2 = (com.google.android.gms.internal.ads.c03) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.f6189t0     // Catch: java.lang.Throwable -> L2b
            java.util.Set r4 = r6.f10501e     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L23
            int r0 = r0 + 1
            goto L8
        L23:
            boolean r5 = r2.f6193v0     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2d
            r5 = 1
            r6.f10508l = r5     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L46
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L2b
        L36:
            java.util.List r3 = r6.f10500d     // Catch: java.lang.Throwable -> L2b
            r3.add(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.c03 r0 = (com.google.android.gms.internal.ads.c03) r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r0
        L43:
            monitor-exit(r6)
            r0 = 0
            return r0
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jd2.a():com.google.android.gms.internal.ads.c03");
    }

    final synchronized void b(zd2 zd2Var, c03 c03Var) {
        this.f10508l = false;
        this.f10500d.remove(c03Var);
        if (d()) {
            zd2Var.n();
            return;
        }
        Integer num = (Integer) this.f10497a.get(c03Var);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (intValue > this.f10503g) {
            this.f10506j.f(c03Var);
            return;
        }
        if (this.f10502f != null) {
            this.f10506j.f(this.f10507k);
        }
        this.f10503g = intValue;
        this.f10502f = zd2Var;
        this.f10507k = c03Var;
        if (h()) {
            return;
        }
        i();
    }

    final synchronized void c(Throwable th, c03 c03Var) {
        this.f10508l = false;
        this.f10500d.remove(c03Var);
        this.f10501e.remove(c03Var.f6189t0);
        if (d() || h()) {
            return;
        }
        i();
    }

    final synchronized boolean d() {
        return this.f10499c.isDone();
    }
}
