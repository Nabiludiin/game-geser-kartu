package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class l4 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f11394a;

    /* renamed from: b, reason: collision with root package name */
    private final k4 f11395b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11396c;

    /* renamed from: d, reason: collision with root package name */
    private final q9 f11397d;

    /* renamed from: e, reason: collision with root package name */
    private int f11398e;

    /* renamed from: f, reason: collision with root package name */
    private p2 f11399f;

    /* renamed from: g, reason: collision with root package name */
    private m4 f11400g;

    /* renamed from: h, reason: collision with root package name */
    private long f11401h;

    /* renamed from: i, reason: collision with root package name */
    private p4[] f11402i;

    /* renamed from: j, reason: collision with root package name */
    private long f11403j;

    /* renamed from: k, reason: collision with root package name */
    private p4 f11404k;

    /* renamed from: l, reason: collision with root package name */
    private int f11405l;

    /* renamed from: m, reason: collision with root package name */
    private long f11406m;

    /* renamed from: n, reason: collision with root package name */
    private long f11407n;

    /* renamed from: o, reason: collision with root package name */
    private int f11408o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11409p;

    public l4(int i7, q9 q9Var) {
        this.f11397d = q9Var;
        this.f11396c = 1 == (i7 ^ 1);
        this.f11394a = new y82(12);
        this.f11395b = new k4(null);
        this.f11399f = new k3();
        this.f11402i = new p4[0];
        this.f11406m = -1L;
        this.f11407n = -1L;
        this.f11405l = -1;
        this.f11401h = -9223372036854775807L;
    }

    private final p4 c(int i7) {
        for (p4 p4Var : this.f11402i) {
            if (p4Var.c(i7)) {
                return p4Var;
            }
        }
        return null;
    }

    final /* synthetic */ p4[] a() {
        return this.f11402i;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        this.f11403j = -1L;
        this.f11404k = null;
        for (p4 p4Var : this.f11402i) {
            p4Var.f(j7);
        }
        if (j7 == 0) {
            this.f11398e = this.f11402i.length != 0 ? 3 : 0;
        } else {
            this.f11398e = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        y82 y82Var = this.f11394a;
        n2Var.u(y82Var.H(), 0, 12);
        y82Var.G(0);
        if (y82Var.c() != 1179011410) {
            return false;
        }
        y82Var.J(4);
        return y82Var.c() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f11398e = 0;
        if (this.f11396c) {
            p2Var = new t9(p2Var, this.f11397d);
        }
        this.f11399f = p2Var;
        this.f11403j = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    @Override // com.google.android.gms.internal.ads.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(com.google.android.gms.internal.ads.n2 r22, com.google.android.gms.internal.ads.n3 r23) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l4.l(com.google.android.gms.internal.ads.n2, com.google.android.gms.internal.ads.n3):int");
    }
}
