package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class xr5 implements vp5, up5 {

    /* renamed from: q, reason: collision with root package name */
    private final vp5 f18990q;

    /* renamed from: r, reason: collision with root package name */
    private final long f18991r;

    /* renamed from: s, reason: collision with root package name */
    private up5 f18992s;

    public xr5(vp5 vp5Var, long j7) {
        this.f18990q = vp5Var;
        this.f18991r = j7;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean a(mb5 mb5Var) {
        long j7 = mb5Var.f12175a;
        long j8 = this.f18991r;
        lb5 a8 = mb5Var.a();
        a8.a(j7 - j8);
        return this.f18990q.a(a8.d());
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final void b(long j7) {
        this.f18990q.b(j7 - this.f18991r);
    }

    @Override // com.google.android.gms.internal.ads.rr5
    public final /* bridge */ /* synthetic */ void c(sr5 sr5Var) {
        up5 up5Var = this.f18992s;
        up5Var.getClass();
        up5Var.c(this);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void d() {
        this.f18990q.d();
    }

    @Override // com.google.android.gms.internal.ads.up5
    public final void e(vp5 vp5Var) {
        up5 up5Var = this.f18992s;
        up5Var.getClass();
        up5Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void f(long j7, boolean z7) {
        this.f18990q.f(j7 - this.f18991r, false);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long g() {
        long g8 = this.f18990q.g();
        if (g8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return g8 + this.f18991r;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final as5 h() {
        return this.f18990q.h();
    }

    public final vp5 i() {
        return this.f18990q;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long j() {
        long j7 = this.f18990q.j();
        if (j7 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7 + this.f18991r;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long k() {
        long k7 = this.f18990q.k();
        if (k7 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return k7 + this.f18991r;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long n(long j7) {
        long j8 = this.f18991r;
        return this.f18990q.n(j7 - j8) + j8;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean o() {
        return this.f18990q.o();
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long p(zt5[] zt5VarArr, boolean[] zArr, qr5[] qr5VarArr, boolean[] zArr2, long j7) {
        qr5[] qr5VarArr2 = new qr5[qr5VarArr.length];
        int i7 = 0;
        while (true) {
            qr5 qr5Var = null;
            if (i7 >= qr5VarArr.length) {
                break;
            }
            wr5 wr5Var = (wr5) qr5VarArr[i7];
            if (wr5Var != null) {
                qr5Var = wr5Var.c();
            }
            qr5VarArr2[i7] = qr5Var;
            i7++;
        }
        vp5 vp5Var = this.f18990q;
        long j8 = this.f18991r;
        long p7 = vp5Var.p(zt5VarArr, zArr, qr5VarArr2, zArr2, j7 - j8);
        for (int i8 = 0; i8 < qr5VarArr.length; i8++) {
            qr5 qr5Var2 = qr5VarArr2[i8];
            if (qr5Var2 == null) {
                qr5VarArr[i8] = null;
            } else {
                qr5 qr5Var3 = qr5VarArr[i8];
                if (qr5Var3 == null || ((wr5) qr5Var3).c() != qr5Var2) {
                    qr5VarArr[i8] = new wr5(qr5Var2, j8);
                }
            }
        }
        return p7 + j8;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long r(long j7, yc5 yc5Var) {
        long j8 = this.f18991r;
        return this.f18990q.r(j7 - j8, yc5Var) + j8;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void s(up5 up5Var, long j7) {
        this.f18992s = up5Var;
        this.f18990q.s(this, j7 - this.f18991r);
    }
}
