package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class j3 extends l3 {

    /* renamed from: b, reason: collision with root package name */
    private int f21582b;

    /* renamed from: c, reason: collision with root package name */
    private int f21583c;

    /* renamed from: d, reason: collision with root package name */
    private int f21584d;

    /* synthetic */ j3(byte[] bArr, int i7, int i8, boolean z7, k3 k3Var) {
        super(null);
        this.f21584d = Integer.MAX_VALUE;
        this.f21582b = 0;
    }

    public final int c(int i7) {
        int i8 = this.f21584d;
        this.f21584d = 0;
        int i9 = this.f21582b + this.f21583c;
        this.f21582b = i9;
        if (i9 <= 0) {
            this.f21583c = 0;
            return i8;
        }
        this.f21583c = i9;
        this.f21582b = 0;
        return i8;
    }
}
