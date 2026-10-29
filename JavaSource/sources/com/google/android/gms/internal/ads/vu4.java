package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class vu4 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f17783a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f17784b;

    private vu4(byte[] bArr, byte[] bArr2) {
        this.f17783a = bArr;
        this.f17784b = bArr2;
    }

    public static vu4 c() {
        byte[] a8 = ui4.a(32);
        if (a8.length == 32) {
            return new vu4(cg4.a(cg4.b(a8)), a8);
        }
        throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
    }

    public final byte[] a() {
        return Arrays.copyOf(this.f17783a, 32);
    }

    public final byte[] b() {
        byte[] bArr = this.f17784b;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
