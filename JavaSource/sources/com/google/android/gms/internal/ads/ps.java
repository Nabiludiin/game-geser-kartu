package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: MyApplication */
public final class ps extends js {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f14061c;

    @Override // com.google.android.gms.internal.ads.js
    public final byte[] a(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i7 = 4;
        if (length == 1) {
            int a8 = os.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a8);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i8 = 0; i8 < split.length; i8++) {
                    int a9 = os.a(split[i8]);
                    int i9 = (a9 >> 16) ^ ((char) a9);
                    byte b8 = (byte) i9;
                    byte b9 = (byte) (i9 >> 8);
                    int i10 = i8 + i8;
                    bArr[i10] = new byte[]{b8, b9}[0];
                    bArr[i10 + 1] = b9;
                }
            } else {
                bArr = new byte[length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int a10 = os.a(split[i11]);
                    bArr[i11] = (byte) ((a10 >> 24) ^ (((a10 & 255) ^ ((a10 >> 8) & 255)) ^ ((a10 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f14061c = b();
        synchronized (this.f10731a) {
            try {
                MessageDigest messageDigest = this.f14061c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f14061c.update(bArr2);
                byte[] digest = this.f14061c.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i7 = length2;
                }
                byte[] bArr3 = new byte[i7];
                System.arraycopy(digest, 0, bArr3, 0, i7);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
