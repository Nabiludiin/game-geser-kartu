package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
final class ac {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f4862e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f4863a;

    /* renamed from: b, reason: collision with root package name */
    public int f4864b;

    /* renamed from: c, reason: collision with root package name */
    public int f4865c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4866d = new byte[128];

    public ac(int i7) {
    }

    public final void a() {
        this.f4863a = false;
        this.f4864b = 0;
        this.f4865c = 0;
    }

    public final boolean b(int i7, int i8) {
        if (this.f4863a) {
            int i9 = this.f4864b - i8;
            this.f4864b = i9;
            if (this.f4865c != 0 || i7 != 181) {
                this.f4863a = false;
                return true;
            }
            this.f4865c = i9;
        } else if (i7 == 179) {
            this.f4863a = true;
        }
        c(f4862e, 0, 3);
        return false;
    }

    public final void c(byte[] bArr, int i7, int i8) {
        if (this.f4863a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f4866d;
            int length = bArr2.length;
            int i10 = this.f4864b + i9;
            if (length < i10) {
                this.f4866d = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.f4866d, this.f4864b, i9);
            this.f4864b += i9;
        }
    }
}
