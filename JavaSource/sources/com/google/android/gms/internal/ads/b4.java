package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f5521a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f5522b;

    /* renamed from: c, reason: collision with root package name */
    private int f5523c;

    /* renamed from: d, reason: collision with root package name */
    private long f5524d;

    /* renamed from: e, reason: collision with root package name */
    private int f5525e;

    /* renamed from: f, reason: collision with root package name */
    private int f5526f;

    /* renamed from: g, reason: collision with root package name */
    private int f5527g;

    public final void a() {
        this.f5522b = false;
        this.f5523c = 0;
    }

    public final void b(n2 n2Var) {
        if (this.f5522b) {
            return;
        }
        byte[] bArr = this.f5521a;
        n2Var.u(bArr, 0, 10);
        n2Var.k();
        int i7 = k1.f10847g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f5522b = true;
        }
    }

    public final void c(a4 a4Var, long j7, int i7, int i8, int i9, y3 y3Var) {
        rx3.i(this.f5527g <= i8 + i9, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f5522b) {
            int i10 = this.f5523c;
            int i11 = i10 + 1;
            this.f5523c = i11;
            if (i10 == 0) {
                this.f5524d = j7;
                this.f5525e = i7;
                this.f5526f = 0;
            }
            this.f5526f += i8;
            this.f5527g = i9;
            if (i11 >= 16) {
                d(a4Var, y3Var);
            }
        }
    }

    public final void d(a4 a4Var, y3 y3Var) {
        if (this.f5523c > 0) {
            a4Var.a(this.f5524d, this.f5525e, this.f5526f, this.f5527g, y3Var);
            this.f5523c = 0;
        }
    }
}
