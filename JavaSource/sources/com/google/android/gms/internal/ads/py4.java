package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class py4 extends OutputStream {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f14160v = new byte[0];

    /* renamed from: s, reason: collision with root package name */
    private int f14163s;

    /* renamed from: u, reason: collision with root package name */
    private int f14165u;

    /* renamed from: q, reason: collision with root package name */
    private final int f14161q = 128;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f14162r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private byte[] f14164t = new byte[128];

    py4(int i7) {
    }

    private final void e(int i7) {
        this.f14162r.add(new oy4(this.f14164t));
        int length = this.f14163s + this.f14164t.length;
        this.f14163s = length;
        this.f14164t = new byte[Math.max(this.f14161q, Math.max(i7, length >>> 1))];
        this.f14165u = 0;
    }

    public final synchronized qy4 a() {
        try {
            int i7 = this.f14165u;
            byte[] bArr = this.f14164t;
            if (i7 >= bArr.length) {
                this.f14162r.add(new oy4(this.f14164t));
                this.f14164t = f14160v;
            } else if (i7 > 0) {
                this.f14162r.add(new oy4(Arrays.copyOf(bArr, i7)));
            }
            this.f14163s += this.f14165u;
            this.f14165u = 0;
        } catch (Throwable th) {
            throw th;
        }
        return qy4.u(this.f14162r);
    }

    public final synchronized int c() {
        return this.f14163s + this.f14165u;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i7) {
        try {
            if (this.f14165u == this.f14164t.length) {
                e(1);
            }
            byte[] bArr = this.f14164t;
            int i8 = this.f14165u;
            this.f14165u = i8 + 1;
            bArr[i8] = (byte) i7;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = this.f14164t;
        int length = bArr2.length;
        int i9 = this.f14165u;
        int i10 = length - i9;
        if (i8 <= i10) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f14165u += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i10);
        int i11 = i8 - i10;
        e(i11);
        System.arraycopy(bArr, i7 + i10, this.f14164t, 0, i11);
        this.f14165u = i11;
    }
}
