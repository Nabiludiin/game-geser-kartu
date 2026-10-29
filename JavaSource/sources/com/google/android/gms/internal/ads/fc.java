package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: MyApplication */
final class fc {

    /* renamed from: a, reason: collision with root package name */
    private final a4 f8158a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f8159b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f8160c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8161d;

    /* renamed from: e, reason: collision with root package name */
    private int f8162e;

    /* renamed from: f, reason: collision with root package name */
    private long f8163f;

    /* renamed from: g, reason: collision with root package name */
    private long f8164g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8165h;

    /* renamed from: i, reason: collision with root package name */
    private long f8166i;

    /* renamed from: j, reason: collision with root package name */
    private long f8167j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8168k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8169l;

    public fc(a4 a4Var, boolean z7, boolean z8) {
        this.f8158a = a4Var;
        byte[] bArr = new byte[128];
        this.f8161d = bArr;
        new q73(bArr, 0, 0);
        this.f8165h = false;
    }

    public final void a(n53 n53Var) {
        this.f8159b.append(n53Var.f12582d, n53Var);
    }

    public final void b(m43 m43Var) {
        this.f8160c.append(m43Var.f12070a, m43Var);
    }

    public final void c() {
        this.f8165h = false;
    }

    public final void d(long j7, int i7, long j8, boolean z7) {
        this.f8162e = i7;
        this.f8164g = j8;
        this.f8163f = j7;
        this.f8169l = z7;
    }

    public final boolean e(long j7, int i7, boolean z7) {
        boolean z8 = false;
        if (this.f8162e == 9) {
            if (z7 && this.f8165h) {
                long j8 = this.f8163f;
                int i8 = i7 + ((int) (j7 - j8));
                long j9 = this.f8167j;
                if (j9 != -9223372036854775807L) {
                    long j10 = this.f8166i;
                    if (j8 != j10) {
                        this.f8158a.a(j9, this.f8168k ? 1 : 0, (int) (j8 - j10), i8, null);
                    }
                }
            }
            this.f8166i = this.f8163f;
            this.f8167j = this.f8164g;
            this.f8168k = false;
            this.f8165h = true;
        }
        boolean z9 = this.f8169l;
        boolean z10 = this.f8168k;
        int i9 = this.f8162e;
        if (i9 == 5 || (z9 && i9 == 1)) {
            z8 = true;
        }
        boolean z11 = z10 | z8;
        this.f8168k = z11;
        this.f8162e = 24;
        return z11;
    }
}
