package com.google.android.gms.internal.drive;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class i implements Serializable, Iterable {

    /* renamed from: r, reason: collision with root package name */
    public static final i f20619r = new r(m0.f20657c);

    /* renamed from: s, reason: collision with root package name */
    private static final o f20620s;

    /* renamed from: t, reason: collision with root package name */
    private static final Comparator f20621t;

    /* renamed from: q, reason: collision with root package name */
    private int f20622q = 0;

    static {
        j jVar = null;
        f20620s = g.a() ? new s(jVar) : new m(jVar);
        f20621t = new k();
    }

    i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(byte b8) {
        return b8 & 255;
    }

    static int k(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i7);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i8 < i7) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i8);
        sb3.append(" >= ");
        sb3.append(i9);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static i o(String str) {
        return new r(str.getBytes(m0.f20655a));
    }

    protected abstract int e(int i7, int i8, int i9);

    public abstract boolean equals(Object obj);

    public abstract i g(int i7, int i8);

    protected abstract String h(Charset charset);

    public final int hashCode() {
        int i7 = this.f20622q;
        if (i7 == 0) {
            int size = size();
            i7 = e(size, 0, size);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f20622q = i7;
        }
        return i7;
    }

    abstract void i(h hVar);

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new j(this);
    }

    public final String l() {
        return size() == 0 ? "" : h(m0.f20655a);
    }

    public abstract boolean m();

    protected final int n() {
        return this.f20622q;
    }

    public abstract byte p(int i7);

    abstract byte q(int i7);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
