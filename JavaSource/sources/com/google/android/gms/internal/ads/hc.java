package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class hc {

    /* renamed from: a, reason: collision with root package name */
    private final a4 f9417a;

    /* renamed from: b, reason: collision with root package name */
    private long f9418b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9419c;

    /* renamed from: d, reason: collision with root package name */
    private int f9420d;

    /* renamed from: e, reason: collision with root package name */
    private long f9421e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9422f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9423g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9424h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9425i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9426j;

    /* renamed from: k, reason: collision with root package name */
    private long f9427k;

    /* renamed from: l, reason: collision with root package name */
    private long f9428l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9429m;

    public hc(a4 a4Var) {
        this.f9417a = a4Var;
    }

    private final void e(int i7) {
        long j7 = this.f9428l;
        if (j7 != -9223372036854775807L) {
            long j8 = this.f9418b;
            long j9 = this.f9427k;
            if (j8 == j9) {
                return;
            }
            int i8 = (int) (j8 - j9);
            this.f9417a.a(j7, this.f9429m ? 1 : 0, i8, i7, null);
        }
    }

    public final void a() {
        this.f9422f = false;
        this.f9423g = false;
        this.f9424h = false;
        this.f9425i = false;
        this.f9426j = false;
    }

    public final void b(long j7, int i7, int i8, long j8, boolean z7) {
        this.f9423g = false;
        this.f9424h = false;
        this.f9421e = j8;
        this.f9420d = 0;
        this.f9418b = j7;
        if (i8 >= 32 && i8 != 40) {
            if (this.f9425i && !this.f9426j) {
                if (z7) {
                    e(i7);
                }
                this.f9425i = false;
            }
            if (i8 <= 35 || i8 == 39) {
                this.f9424h = !this.f9426j;
                this.f9426j = true;
            }
        }
        boolean z8 = i8 >= 16 && i8 <= 21;
        this.f9419c = z8;
        this.f9422f = z8 || i8 <= 9;
    }

    public final void c(byte[] bArr, int i7, int i8) {
        if (this.f9422f) {
            int i9 = this.f9420d;
            int i10 = (i7 + 2) - i9;
            if (i10 >= i8) {
                this.f9420d = i9 + (i8 - i7);
            } else {
                this.f9423g = (bArr[i10] & 128) != 0;
                this.f9422f = false;
            }
        }
    }

    public final void d(long j7, int i7, boolean z7) {
        if (this.f9426j && this.f9423g) {
            this.f9429m = this.f9419c;
            this.f9426j = false;
        } else if (this.f9424h || this.f9423g) {
            if (z7 && this.f9425i) {
                e(i7 + ((int) (j7 - this.f9418b)));
            }
            this.f9427k = this.f9418b;
            this.f9428l = this.f9421e;
            this.f9429m = this.f9419c;
            this.f9425i = true;
        }
    }
}
