package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
final class xo0 implements y75 {

    /* renamed from: q, reason: collision with root package name */
    private final ByteBuffer f18909q;

    xo0(ByteBuffer byteBuffer) {
        this.f18909q = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.y75
    public final int D0(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f18909q;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.y75
    public final long b() {
        return this.f18909q.limit();
    }

    @Override // com.google.android.gms.internal.ads.y75
    public final long d() {
        return this.f18909q.position();
    }

    @Override // com.google.android.gms.internal.ads.y75
    public final void f(long j7) {
        this.f18909q.position((int) j7);
    }

    @Override // com.google.android.gms.internal.ads.y75
    public final ByteBuffer i(long j7, long j8) {
        ByteBuffer byteBuffer = this.f18909q;
        int position = byteBuffer.position();
        byteBuffer.position((int) j7);
        ByteBuffer slice = byteBuffer.slice();
        slice.limit((int) j8);
        byteBuffer.position(position);
        return slice;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
