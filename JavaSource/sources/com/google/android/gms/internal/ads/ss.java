package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: MyApplication */
public final class ss extends js {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f15773c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15774d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15775e;

    public ss(int i7) {
        int i8 = i7 >> 3;
        this.f15774d = (i7 & 7) > 0 ? i8 + 1 : i8;
        this.f15775e = i7;
    }

    @Override // com.google.android.gms.internal.ads.js
    public final byte[] a(String str) {
        synchronized (this.f10731a) {
            try {
                MessageDigest b8 = b();
                this.f15773c = b8;
                if (b8 == null) {
                    return new byte[0];
                }
                b8.reset();
                this.f15773c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] digest = this.f15773c.digest();
                int length = digest.length;
                int i7 = this.f15774d;
                if (length > i7) {
                    length = i7;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                int i8 = this.f15775e & 7;
                if (i8 > 0) {
                    long j7 = 0;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 > 0) {
                            j7 <<= 8;
                        }
                        j7 += bArr[i9] & 255;
                    }
                    long j8 = j7 >>> (8 - i8);
                    while (true) {
                        i7--;
                        if (i7 < 0) {
                            break;
                        }
                        bArr[i7] = (byte) (255 & j8);
                        j8 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
