package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class xf5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18805a;

    /* renamed from: b, reason: collision with root package name */
    private int f18806b;

    /* renamed from: c, reason: collision with root package name */
    private long f18807c;

    /* renamed from: d, reason: collision with root package name */
    private xp5 f18808d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18809e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18810f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ yf5 f18811g;

    public xf5(yf5 yf5Var, String str, int i7, xp5 xp5Var) {
        Objects.requireNonNull(yf5Var);
        this.f18811g = yf5Var;
        this.f18805a = str;
        this.f18806b = i7;
        this.f18807c = xp5Var == null ? -1L : xp5Var.f18927d;
        if (xp5Var == null || !xp5Var.b()) {
            return;
        }
        this.f18808d = xp5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.a()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.google.android.gms.internal.ads.az r8, com.google.android.gms.internal.ads.az r9) {
        /*
            r7 = this;
            int r0 = r7.f18806b
            int r1 = r8.a()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r8 = r9.a()
            if (r0 >= r8) goto L11
            goto L44
        L11:
            r0 = r3
            goto L44
        L13:
            com.google.android.gms.internal.ads.yf5 r1 = r7.f18811g
            com.google.android.gms.internal.ads.yx r4 = r1.j()
            r5 = 0
            r8.b(r0, r4, r5)
            com.google.android.gms.internal.ads.yx r0 = r1.j()
            int r0 = r0.f19908m
        L24:
            com.google.android.gms.internal.ads.yx r4 = r1.j()
            int r4 = r4.f19909n
            if (r0 > r4) goto L11
            java.lang.Object r4 = r8.f(r0)
            int r4 = r9.e(r4)
            if (r4 == r3) goto L41
            com.google.android.gms.internal.ads.ot r8 = r1.k()
            com.google.android.gms.internal.ads.ot r8 = r9.d(r4, r8, r2)
            int r0 = r8.f13477c
            goto L44
        L41:
            int r0 = r0 + 1
            goto L24
        L44:
            r7.f18806b = r0
            if (r0 != r3) goto L49
            return r2
        L49:
            com.google.android.gms.internal.ads.xp5 r8 = r7.f18808d
            r0 = 1
            if (r8 != 0) goto L4f
            return r0
        L4f:
            java.lang.Object r8 = r8.f18924a
            int r8 = r9.e(r8)
            if (r8 == r3) goto L58
            return r0
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xf5.a(com.google.android.gms.internal.ads.az, com.google.android.gms.internal.ads.az):boolean");
    }

    public final boolean b(int i7, xp5 xp5Var) {
        if (xp5Var == null) {
            return i7 == this.f18806b;
        }
        xp5 xp5Var2 = this.f18808d;
        return xp5Var2 == null ? !xp5Var.b() && xp5Var.f18927d == this.f18807c : xp5Var.f18927d == xp5Var2.f18927d && xp5Var.f18925b == xp5Var2.f18925b && xp5Var.f18926c == xp5Var2.f18926c;
    }

    public final void c(int i7, xp5 xp5Var) {
        if (this.f18807c == -1 && i7 == this.f18806b && xp5Var != null) {
            yf5 yf5Var = this.f18811g;
            long j7 = xp5Var.f18927d;
            if (j7 >= yf5Var.i()) {
                this.f18807c = j7;
            }
        }
    }

    public final boolean d(nd5 nd5Var) {
        xp5 xp5Var = nd5Var.f12712d;
        if (xp5Var == null) {
            return this.f18806b != nd5Var.f12711c;
        }
        long j7 = this.f18807c;
        if (j7 == -1) {
            return false;
        }
        long j8 = xp5Var.f18927d;
        if (j8 > j7) {
            return true;
        }
        if (this.f18808d == null) {
            return false;
        }
        az azVar = nd5Var.f12710b;
        int e8 = azVar.e(xp5Var.f18924a);
        int e9 = azVar.e(this.f18808d.f18924a);
        xp5 xp5Var2 = this.f18808d;
        if (j8 < xp5Var2.f18927d || e8 < e9) {
            return false;
        }
        if (e8 > e9) {
            return true;
        }
        if (!xp5Var.b()) {
            int i7 = xp5Var.f18928e;
            return i7 == -1 || i7 > xp5Var2.f18925b;
        }
        int i8 = xp5Var.f18925b;
        int i9 = xp5Var.f18926c;
        int i10 = xp5Var2.f18925b;
        if (i8 <= i10) {
            return i8 == i10 && i9 > xp5Var2.f18926c;
        }
        return true;
    }

    final /* synthetic */ String e() {
        return this.f18805a;
    }

    final /* synthetic */ int f() {
        return this.f18806b;
    }

    final /* synthetic */ long g() {
        return this.f18807c;
    }

    final /* synthetic */ xp5 h() {
        return this.f18808d;
    }

    final /* synthetic */ boolean i() {
        return this.f18809e;
    }

    final /* synthetic */ void j(boolean z7) {
        this.f18809e = true;
    }

    final /* synthetic */ boolean k() {
        return this.f18810f;
    }

    final /* synthetic */ void l(boolean z7) {
        this.f18810f = true;
    }
}
