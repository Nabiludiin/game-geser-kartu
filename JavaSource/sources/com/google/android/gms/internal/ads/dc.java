package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class dc {

    /* renamed from: a, reason: collision with root package name */
    private final a4 f7045a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7046b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7047c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7048d;

    /* renamed from: e, reason: collision with root package name */
    private int f7049e;

    /* renamed from: f, reason: collision with root package name */
    private int f7050f;

    /* renamed from: g, reason: collision with root package name */
    private long f7051g;

    /* renamed from: h, reason: collision with root package name */
    private long f7052h;

    public dc(a4 a4Var) {
        this.f7045a = a4Var;
    }

    public final void a() {
        this.f7046b = false;
        this.f7047c = false;
        this.f7048d = false;
        this.f7049e = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r5, long r6) {
        /*
            r4 = this;
            r4.f7049e = r5
            r0 = 0
            r4.f7048d = r0
            r1 = 1
            r2 = 182(0xb6, float:2.55E-43)
            if (r5 == r2) goto Lf
            r3 = 179(0xb3, float:2.51E-43)
            if (r5 != r3) goto L11
            r5 = r3
        Lf:
            r3 = r1
            goto L12
        L11:
            r3 = r0
        L12:
            r4.f7046b = r3
            if (r5 != r2) goto L17
            goto L18
        L17:
            r1 = r0
        L18:
            r4.f7047c = r1
            r4.f7050f = r0
            r4.f7052h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dc.b(int, long):void");
    }

    public final void c(byte[] bArr, int i7, int i8) {
        if (this.f7047c) {
            int i9 = this.f7050f;
            int i10 = (i7 + 1) - i9;
            if (i10 >= i8) {
                this.f7050f = i9 + (i8 - i7);
            } else {
                this.f7048d = ((bArr[i10] & 192) >> 6) == 0;
                this.f7047c = false;
            }
        }
    }

    public final void d(long j7, int i7, boolean z7) {
        rx3.h(this.f7052h != -9223372036854775807L);
        if (this.f7049e == 182 && z7 && this.f7046b) {
            this.f7045a.a(this.f7052h, this.f7048d ? 1 : 0, (int) (j7 - this.f7051g), i7, null);
        }
        if (this.f7049e != 179) {
            this.f7051g = j7;
        }
    }
}
