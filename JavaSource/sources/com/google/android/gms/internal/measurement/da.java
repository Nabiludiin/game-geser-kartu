package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class da extends ea {

    /* renamed from: b, reason: collision with root package name */
    private int f20882b;

    /* renamed from: c, reason: collision with root package name */
    private int f20883c;

    /* renamed from: d, reason: collision with root package name */
    private int f20884d;

    /* synthetic */ da(byte[] bArr, int i7, int i8, boolean z7, byte[] bArr2) {
        super(null);
        this.f20884d = Integer.MAX_VALUE;
        this.f20882b = 0;
    }

    public final int c(int i7) {
        int i8 = this.f20884d;
        this.f20884d = 0;
        int i9 = this.f20882b + this.f20883c;
        this.f20882b = i9;
        if (i9 <= 0) {
            this.f20883c = 0;
            return i8;
        }
        this.f20883c = i9;
        this.f20882b = 0;
        return i8;
    }
}
