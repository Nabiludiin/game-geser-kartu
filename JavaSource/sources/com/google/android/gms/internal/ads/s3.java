package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class s3 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15443a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15444b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15445c;

    /* renamed from: d, reason: collision with root package name */
    private int f15446d;

    /* renamed from: e, reason: collision with root package name */
    private int f15447e;

    /* renamed from: f, reason: collision with root package name */
    private p2 f15448f;

    /* renamed from: g, reason: collision with root package name */
    private a4 f15449g;

    public s3(int i7, int i8, String str) {
        this.f15443a = i7;
        this.f15444b = i8;
        this.f15445c = str;
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
        if (j7 == 0 || this.f15447e == 1) {
            this.f15447e = 1;
            this.f15446d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        int i7 = this.f15443a;
        rx3.h((i7 == -1 || this.f15444b == -1) ? false : true);
        int i8 = this.f15444b;
        y82 y82Var = new y82(i8);
        ((b2) n2Var).x(y82Var.H(), 0, i8, false);
        return y82Var.S() == i7;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f15448f = p2Var;
        a4 A = p2Var.A(1024, 4);
        this.f15449g = A;
        xn5 xn5Var = new xn5();
        String str = this.f15445c;
        xn5Var.k0(str);
        xn5Var.l0(str);
        A.c(xn5Var.m());
        this.f15448f.z();
        this.f15448f.B(new t3(-9223372036854775807L));
        this.f15447e = 1;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        int i7 = this.f15447e;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        a4 a4Var = this.f15449g;
        a4Var.getClass();
        int f8 = a4Var.f(n2Var, 1024, true);
        if (f8 == -1) {
            this.f15447e = 2;
            this.f15449g.a(0L, 1, this.f15446d, 0, null);
            this.f15446d = 0;
        } else {
            this.f15446d += f8;
        }
        return 0;
    }
}
