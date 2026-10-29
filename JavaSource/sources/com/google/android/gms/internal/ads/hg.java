package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* compiled from: MyApplication */
public final class hg extends ByteArrayOutputStream {

    /* renamed from: q, reason: collision with root package name */
    private final wf f9495q;

    public hg(wf wfVar, int i7) {
        this.f9495q = wfVar;
        ((ByteArrayOutputStream) this).buf = wfVar.a(Math.max(i7, 256));
    }

    private final void a(int i7) {
        int i8 = ((ByteArrayOutputStream) this).count;
        if (i8 + i7 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        wf wfVar = this.f9495q;
        int i9 = i8 + i7;
        byte[] a8 = wfVar.a(i9 + i9);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a8, 0, ((ByteArrayOutputStream) this).count);
        wfVar.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a8;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9495q.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f9495q.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i7) {
        a(1);
        super.write(i7);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i8) {
        a(i8);
        super.write(bArr, i7, i8);
    }
}
