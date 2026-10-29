package c6;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MyApplication */
final class n extends InputStream {

    /* renamed from: q, reason: collision with root package name */
    private final InputStream f3642q;

    /* renamed from: r, reason: collision with root package name */
    private long f3643r;

    /* renamed from: s, reason: collision with root package name */
    private long f3644s;

    /* renamed from: t, reason: collision with root package name */
    private long f3645t;

    /* renamed from: u, reason: collision with root package name */
    private long f3646u;

    public n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void e(long j7) {
        try {
            long j8 = this.f3644s;
            long j9 = this.f3643r;
            if (j8 >= j9 || j9 > this.f3645t) {
                this.f3644s = j9;
                this.f3642q.mark((int) (j7 - j9));
            } else {
                this.f3642q.reset();
                this.f3642q.mark((int) (j7 - this.f3644s));
                g(this.f3644s, this.f3643r);
            }
            this.f3645t = j7;
        } catch (IOException e8) {
            throw new IllegalStateException("Unable to mark: " + e8);
        }
    }

    private void g(long j7, long j8) {
        while (j7 < j8) {
            long skip = this.f3642q.skip(j8 - j7);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j7 += skip;
        }
    }

    public void a(long j7) {
        if (this.f3643r > this.f3645t || j7 < this.f3644s) {
            throw new IOException("Cannot reset");
        }
        this.f3642q.reset();
        g(this.f3644s, j7);
        this.f3643r = j7;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f3642q.available();
    }

    public long c(int i7) {
        long j7 = this.f3643r + i7;
        if (this.f3645t < j7) {
            e(j7);
        }
        return this.f3643r;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3642q.close();
    }

    @Override // java.io.InputStream
    public void mark(int i7) {
        this.f3646u = c(i7);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f3642q.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f3642q.read();
        if (read != -1) {
            this.f3643r++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        a(this.f3646u);
    }

    @Override // java.io.InputStream
    public long skip(long j7) {
        long skip = this.f3642q.skip(j7);
        this.f3643r += skip;
        return skip;
    }

    public n(InputStream inputStream, int i7) {
        this.f3646u = -1L;
        this.f3642q = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i7);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        int read = this.f3642q.read(bArr);
        if (read != -1) {
            this.f3643r += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        int read = this.f3642q.read(bArr, i7, i8);
        if (read != -1) {
            this.f3643r += read;
        }
        return read;
    }
}
