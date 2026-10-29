package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class hw4 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9748a;

    private hw4(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8];
        this.f9748a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i8);
    }

    public static hw4 a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static hw4 b(byte[] bArr, int i7, int i8) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i8 > length) {
            i8 = length;
        }
        return new hw4(bArr, 0, i8);
    }

    public final byte[] c() {
        byte[] bArr = this.f9748a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int d() {
        return this.f9748a.length;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hw4) {
            return Arrays.equals(((hw4) obj).f9748a, this.f9748a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9748a);
    }

    public final String toString() {
        byte[] bArr = this.f9748a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b8 : bArr) {
            sb.append("0123456789abcdef".charAt((b8 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b8 & 15));
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(sb2.length() + 7);
        sb3.append("Bytes(");
        sb3.append(sb2);
        sb3.append(")");
        return sb3.toString();
    }
}
