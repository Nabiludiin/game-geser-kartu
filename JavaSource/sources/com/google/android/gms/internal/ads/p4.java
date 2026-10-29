package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
final class p4 {

    /* renamed from: a, reason: collision with root package name */
    private final o4 f13655a;

    /* renamed from: b, reason: collision with root package name */
    private final a4 f13656b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13657c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13658d;

    /* renamed from: e, reason: collision with root package name */
    private final long f13659e;

    /* renamed from: f, reason: collision with root package name */
    private int f13660f;

    /* renamed from: g, reason: collision with root package name */
    private int f13661g;

    /* renamed from: h, reason: collision with root package name */
    private int f13662h;

    /* renamed from: i, reason: collision with root package name */
    private int f13663i;

    /* renamed from: j, reason: collision with root package name */
    private int f13664j;

    /* renamed from: k, reason: collision with root package name */
    private int f13665k;

    /* renamed from: l, reason: collision with root package name */
    private long f13666l;

    /* renamed from: m, reason: collision with root package name */
    private long[] f13667m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f13668n;

    public p4(int i7, o4 o4Var, a4 a4Var) {
        this.f13655a = o4Var;
        int c8 = o4Var.c();
        boolean z7 = true;
        if (c8 != 1) {
            if (c8 == 2) {
                c8 = 2;
            } else {
                z7 = false;
            }
        }
        rx3.a(z7);
        this.f13657c = j(i7, c8 == 2 ? 1667497984 : 1651965952);
        this.f13659e = o4Var.d();
        this.f13656b = a4Var;
        this.f13658d = c8 == 2 ? j(i7, 1650720768) : -1;
        this.f13666l = -1L;
        this.f13667m = new long[512];
        this.f13668n = new int[512];
        this.f13660f = o4Var.f13181d;
    }

    private final long h(int i7) {
        return (this.f13659e * i7) / this.f13660f;
    }

    private final r3 i(int i7) {
        return new r3(this.f13668n[i7] * h(1), this.f13667m[i7]);
    }

    private static int j(int i7, int i8) {
        return (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48) | i8;
    }

    public final void a(long j7, boolean z7) {
        if (this.f13666l == -1) {
            this.f13666l = j7;
        }
        if (z7) {
            if (this.f13665k == this.f13668n.length) {
                long[] jArr = this.f13667m;
                this.f13667m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f13668n;
                this.f13668n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f13667m;
            int i7 = this.f13665k;
            jArr2[i7] = j7;
            this.f13668n[i7] = this.f13664j;
            this.f13665k = i7 + 1;
        }
        this.f13664j++;
    }

    public final void b() {
        int i7;
        this.f13667m = Arrays.copyOf(this.f13667m, this.f13665k);
        this.f13668n = Arrays.copyOf(this.f13668n, this.f13665k);
        if ((this.f13657c & 1651965952) != 1651965952 || this.f13655a.f13183f == 0 || (i7 = this.f13665k) <= 0) {
            return;
        }
        this.f13660f = i7;
    }

    public final boolean c(int i7) {
        return this.f13657c == i7 || this.f13658d == i7;
    }

    public final void d(int i7) {
        this.f13661g = i7;
        this.f13662h = i7;
    }

    public final boolean e(n2 n2Var) {
        int i7 = this.f13662h;
        a4 a4Var = this.f13656b;
        int f8 = i7 - a4Var.f(n2Var, i7, false);
        this.f13662h = f8;
        boolean z7 = f8 == 0;
        if (z7) {
            if (this.f13661g > 0) {
                a4Var.a(h(this.f13663i), Arrays.binarySearch(this.f13668n, this.f13663i) >= 0 ? 1 : 0, this.f13661g, 0, null);
            }
            this.f13663i++;
        }
        return z7;
    }

    public final void f(long j7) {
        if (this.f13665k == 0) {
            this.f13663i = 0;
        } else {
            this.f13663i = this.f13668n[hi2.J(this.f13667m, j7, true, true)];
        }
    }

    public final o3 g(long j7) {
        if (this.f13665k == 0) {
            r3 r3Var = new r3(0L, this.f13666l);
            return new o3(r3Var, r3Var);
        }
        int h8 = (int) (j7 / h(1));
        int I = hi2.I(this.f13668n, h8, true, true);
        if (this.f13668n[I] == h8) {
            r3 i7 = i(I);
            return new o3(i7, i7);
        }
        r3 i8 = i(I);
        int i9 = I + 1;
        return i9 < this.f13667m.length ? new o3(i8, i(i9)) : new o3(i8, i8);
    }
}
