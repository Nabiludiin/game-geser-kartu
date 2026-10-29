package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: MyApplication */
final class zf extends FilterInputStream {

    /* renamed from: q, reason: collision with root package name */
    private final long f20157q;

    /* renamed from: r, reason: collision with root package name */
    private long f20158r;

    zf(InputStream inputStream, long j7) {
        super(inputStream);
        this.f20157q = j7;
    }

    final long a() {
        return this.f20157q - this.f20158r;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f20158r++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int read = super.read(bArr, i7, i8);
        if (read != -1) {
            this.f20158r += read;
        }
        return read;
    }
}
