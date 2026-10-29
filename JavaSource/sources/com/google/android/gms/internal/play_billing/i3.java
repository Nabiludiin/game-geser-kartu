package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: MyApplication */
public abstract class i3 implements Iterable, Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final i3 f21564r = new g3(j4.f21586b);

    /* renamed from: q, reason: collision with root package name */
    private int f21565q = 0;

    static {
        int i7 = w2.f21766a;
    }

    i3() {
    }

    static int k(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    public static i3 m(byte[] bArr, int i7, int i8) {
        k(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new g3(bArr2);
    }

    public abstract byte c(int i7);

    abstract byte e(int i7);

    public abstract boolean equals(Object obj);

    public abstract int g();

    protected abstract int h(int i7, int i8, int i9);

    public final int hashCode() {
        int i7 = this.f21565q;
        if (i7 == 0) {
            int g8 = g();
            i7 = h(g8, 0, g8);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f21565q = i7;
        }
        return i7;
    }

    public abstract i3 i(int i7, int i8);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new b3(this);
    }

    abstract void j(z2 z2Var);

    protected final int l() {
        return this.f21565q;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? n5.a(this) : n5.a(i(0, 47)).concat("..."));
    }
}
