package com.google.android.gms.internal.drive;

final class v extends t {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f20753d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20754e;

    /* renamed from: f, reason: collision with root package name */
    private int f20755f;

    /* renamed from: g, reason: collision with root package name */
    private int f20756g;

    /* renamed from: h, reason: collision with root package name */
    private int f20757h;

    /* renamed from: i, reason: collision with root package name */
    private int f20758i;

    /* renamed from: j, reason: collision with root package name */
    private int f20759j;

    private v(byte[] bArr, int i7, int i8, boolean z7) {
        super();
        this.f20759j = Integer.MAX_VALUE;
        this.f20753d = bArr;
        this.f20755f = i8 + i7;
        this.f20757h = i7;
        this.f20758i = i7;
        this.f20754e = z7;
    }

    @Override // com.google.android.gms.internal.drive.t
    public final int b() {
        return this.f20757h - this.f20758i;
    }

    @Override // com.google.android.gms.internal.drive.t
    public final int c(int i7) {
        if (i7 < 0) {
            throw o0.b();
        }
        int b8 = i7 + b();
        int i8 = this.f20759j;
        if (b8 > i8) {
            throw o0.a();
        }
        this.f20759j = b8;
        int i9 = this.f20755f + this.f20756g;
        this.f20755f = i9;
        int i10 = i9 - this.f20758i;
        if (i10 <= b8) {
            this.f20756g = 0;
            return i8;
        }
        int i11 = i10 - b8;
        this.f20756g = i11;
        this.f20755f = i9 - i11;
        return i8;
    }
}
