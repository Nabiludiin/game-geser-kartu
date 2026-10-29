package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: MyApplication */
final class ge implements fe {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f8822a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8823b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8824c;

    public ge(FileChannel fileChannel, long j7, long j8) {
        this.f8822a = fileChannel;
        this.f8823b = j7;
        this.f8824c = j8;
    }

    @Override // com.google.android.gms.internal.ads.fe
    public final long a() {
        return this.f8824c;
    }

    @Override // com.google.android.gms.internal.ads.fe
    public final void b(MessageDigest[] messageDigestArr, long j7, int i7) {
        MappedByteBuffer map = this.f8822a.map(FileChannel.MapMode.READ_ONLY, this.f8823b + j7, i7);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
