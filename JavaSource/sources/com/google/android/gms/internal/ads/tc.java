package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class tc {

    /* renamed from: a, reason: collision with root package name */
    private final int f16120a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16121b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16122c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f16123d;

    /* renamed from: e, reason: collision with root package name */
    public int f16124e;

    public tc(int i7, int i8) {
        this.f16120a = i7;
        byte[] bArr = new byte[131];
        this.f16123d = bArr;
        bArr[2] = 1;
    }

    public final void a() {
        this.f16121b = false;
        this.f16122c = false;
    }

    public final boolean b() {
        return this.f16122c;
    }

    public final void c(int i7) {
        rx3.h(!this.f16121b);
        boolean z7 = i7 == this.f16120a;
        this.f16121b = z7;
        if (z7) {
            this.f16124e = 3;
            this.f16122c = false;
        }
    }

    public final void d(byte[] bArr, int i7, int i8) {
        if (this.f16121b) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f16123d;
            int length = bArr2.length;
            int i10 = this.f16124e + i9;
            if (length < i10) {
                this.f16123d = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.f16123d, this.f16124e, i9);
            this.f16124e += i9;
        }
    }

    public final boolean e(int i7) {
        if (!this.f16121b) {
            return false;
        }
        this.f16124e -= i7;
        this.f16121b = false;
        this.f16122c = true;
        return true;
    }
}
