package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: MyApplication */
final class ee implements fe {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f7579a;

    public ee(ByteBuffer byteBuffer) {
        this.f7579a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.fe
    public final long a() {
        return this.f7579a.capacity();
    }

    @Override // com.google.android.gms.internal.ads.fe
    public final void b(MessageDigest[] messageDigestArr, long j7, int i7) {
        ByteBuffer slice;
        ByteBuffer byteBuffer = this.f7579a;
        synchronized (byteBuffer) {
            int i8 = (int) j7;
            byteBuffer.position(i8);
            byteBuffer.limit(i8 + i7);
            slice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
