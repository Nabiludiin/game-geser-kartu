package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MyApplication */
final class u34 extends FilterInputStream {

    /* renamed from: q, reason: collision with root package name */
    private long f16571q;

    /* renamed from: r, reason: collision with root package name */
    private long f16572r;

    u34(InputStream inputStream, long j7) {
        super(inputStream);
        this.f16572r = -1L;
        inputStream.getClass();
        rx3.b(j7 >= 0, "limit must be non-negative");
        this.f16571q = j7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f16571q);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
        ((FilterInputStream) this).in.mark(i7);
        this.f16572r = this.f16571q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f16571q == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f16571q--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f16572r == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f16571q = this.f16572r;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j7, this.f16571q));
        this.f16571q -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        long j7 = this.f16571q;
        if (j7 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i8, j7));
        if (read != -1) {
            this.f16571q -= read;
        }
        return read;
    }
}
