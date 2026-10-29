package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* compiled from: MyApplication */
abstract class qe4 {

    /* renamed from: a, reason: collision with root package name */
    private final ne4 f14414a;

    /* renamed from: b, reason: collision with root package name */
    private final ne4 f14415b;

    public qe4(byte[] bArr) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f14414a = a(bArr, 1);
        this.f14415b = a(bArr, 0);
    }

    abstract ne4 a(byte[] bArr, int i7);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f14415b.d(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i7 = length & 15;
            int i8 = i7 == 0 ? length : (length + 16) - i7;
            int remaining = byteBuffer.remaining();
            int i9 = remaining % 16;
            int i10 = (i9 == 0 ? remaining : (remaining + 16) - i9) + i8;
            ByteBuffer order = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i8);
            order.put(byteBuffer);
            order.position(i10);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(ue4.a(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            return this.f14414a.c(bArr, byteBuffer);
        } catch (GeneralSecurityException e8) {
            throw new AEADBadTagException(e8.toString());
        }
    }
}
