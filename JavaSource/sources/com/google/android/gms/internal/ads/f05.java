package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: MyApplication */
final class f05 extends InputStream {

    /* renamed from: q, reason: collision with root package name */
    private Iterator f7946q;

    /* renamed from: r, reason: collision with root package name */
    private ByteBuffer f7947r;

    /* renamed from: s, reason: collision with root package name */
    private int f7948s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f7949t;

    /* renamed from: u, reason: collision with root package name */
    private int f7950u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7951v;

    /* renamed from: w, reason: collision with root package name */
    private byte[] f7952w;

    /* renamed from: x, reason: collision with root package name */
    private int f7953x;

    /* renamed from: y, reason: collision with root package name */
    private long f7954y;

    f05(Iterable iterable) {
        this.f7946q = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f7948s++;
        }
        this.f7949t = -1;
        if (a()) {
            return;
        }
        this.f7947r = c05.f6205c;
        this.f7949t = 0;
        this.f7950u = 0;
        this.f7954y = 0L;
    }

    private final boolean a() {
        ByteBuffer byteBuffer;
        do {
            this.f7949t++;
            if (!this.f7946q.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.f7946q.next();
            this.f7947r = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f7950u = this.f7947r.position();
        if (this.f7947r.hasArray()) {
            this.f7951v = true;
            this.f7952w = this.f7947r.array();
            this.f7953x = this.f7947r.arrayOffset();
        } else {
            this.f7951v = false;
            this.f7954y = f25.A(this.f7947r);
            this.f7952w = null;
        }
        return true;
    }

    private final void c(int i7) {
        int i8 = this.f7950u + i7;
        this.f7950u = i8;
        if (i8 == this.f7947r.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f7949t == this.f7948s) {
            return -1;
        }
        if (this.f7951v) {
            int i7 = this.f7952w[this.f7950u + this.f7953x] & 255;
            c(1);
            return i7;
        }
        int z7 = f25.z(this.f7950u + this.f7954y) & 255;
        c(1);
        return z7;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        if (this.f7949t == this.f7948s) {
            return -1;
        }
        int limit = this.f7947r.limit();
        int i9 = this.f7950u;
        int i10 = limit - i9;
        if (i8 > i10) {
            i8 = i10;
        }
        if (this.f7951v) {
            System.arraycopy(this.f7952w, i9 + this.f7953x, bArr, i7, i8);
            c(i8);
            return i8;
        }
        int position = this.f7947r.position();
        this.f7947r.position(this.f7950u);
        this.f7947r.get(bArr, i7, i8);
        this.f7947r.position(position);
        c(i8);
        return i8;
    }
}
