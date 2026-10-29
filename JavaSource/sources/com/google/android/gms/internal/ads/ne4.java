package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: MyApplication */
abstract class ne4 {

    /* renamed from: a, reason: collision with root package name */
    int[] f12723a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12724b;

    public ne4(byte[] bArr, int i7) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f12723a = le4.d(bArr);
        this.f12724b = i7;
    }

    abstract int[] a(int[] iArr, int i7);

    abstract int b();

    public final byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != b()) {
            int b8 = b();
            StringBuilder sb = new StringBuilder(String.valueOf(b8).length() + 36);
            sb.append("The nonce length (in bytes) must be ");
            sb.append(b8);
            throw new GeneralSecurityException(sb.toString());
        }
        int remaining = byteBuffer.remaining();
        int i7 = remaining / 64;
        for (int i8 = 0; i8 < i7 + 1; i8++) {
            ByteBuffer d8 = d(bArr, this.f12724b + i8);
            if (i8 == i7) {
                tu4.c(allocate, byteBuffer, d8, remaining % 64);
            } else {
                tu4.c(allocate, byteBuffer, d8, 64);
            }
        }
        return allocate.array();
    }

    final ByteBuffer d(byte[] bArr, int i7) {
        int[] a8 = a(le4.d(bArr), i7);
        int[] iArr = (int[]) a8.clone();
        le4.b(iArr);
        for (int i8 = 0; i8 < 16; i8++) {
            a8[i8] = a8[i8] + iArr[i8];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a8, 0, 16);
        return order;
    }
}
