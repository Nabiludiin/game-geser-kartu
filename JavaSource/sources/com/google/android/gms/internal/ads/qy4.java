package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: MyApplication */
public abstract class qy4 implements Iterable, Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final qy4 f14669r = new oy4(c05.f6204b);

    /* renamed from: q, reason: collision with root package name */
    private int f14670q = 0;

    static {
        int i7 = dy4.f7358a;
    }

    qy4() {
    }

    static int c(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i7);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i8 < i7) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 44 + String.valueOf(i8).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 15 + String.valueOf(i9).length());
        sb3.append("End index: ");
        sb3.append(i8);
        sb3.append(" >= ");
        sb3.append(i9);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    private static qy4 i(Iterator it, int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i7)));
        }
        if (i7 == 1) {
            return (qy4) it.next();
        }
        int i8 = i7 >>> 1;
        qy4 i9 = i(it, i8);
        qy4 i10 = i(it, i7 - i8);
        if (Integer.MAX_VALUE - i9.h() >= i10.h()) {
            return m15.E(i9, i10);
        }
        int h8 = i9.h();
        int h9 = i10.h();
        StringBuilder sb = new StringBuilder(String.valueOf(h8).length() + 31 + String.valueOf(h9).length());
        sb.append("ByteString would be too long: ");
        sb.append(h8);
        sb.append("+");
        sb.append(h9);
        throw new IllegalArgumentException(sb.toString());
    }

    public static qy4 s(byte[] bArr, int i7, int i8) {
        c(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new oy4(bArr2);
    }

    public static qy4 t(String str) {
        return new oy4(str.getBytes(c05.f6203a));
    }

    public static qy4 u(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f14669r : i(iterable.iterator(), size);
    }

    public static py4 x() {
        return new py4(128);
    }

    static void z(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 11);
                sb.append("Index < 0: ");
                sb.append(i7);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 18 + String.valueOf(i8).length());
            sb2.append("Index > length: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public abstract byte e(int i7);

    public abstract boolean equals(Object obj);

    abstract byte g(int i7);

    public abstract int h();

    public final int hashCode() {
        int i7 = this.f14670q;
        if (i7 == 0) {
            int h8 = h();
            i7 = p(h8, 0, h8);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f14670q = i7;
        }
        return i7;
    }

    protected abstract void j(byte[] bArr, int i7, int i8, int i9);

    protected abstract int k();

    protected abstract boolean l();

    public abstract qy4 m(int i7, int i8);

    public abstract ByteBuffer n();

    abstract void o(gy4 gy4Var);

    protected abstract int p(int i7, int i8, int i9);

    public abstract uy4 q();

    @Override // java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ly4 iterator() {
        return new iy4(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()), h() <= 50 ? w15.a(this) : w15.a(m(0, 47)).concat("..."));
    }

    public final void v(byte[] bArr, int i7, int i8, int i9) {
        c(0, i9, h());
        c(i8, i8 + i9, bArr.length);
        if (i9 > 0) {
            j(bArr, 0, i8, i9);
        }
    }

    public final byte[] w() {
        int h8 = h();
        if (h8 == 0) {
            return c05.f6204b;
        }
        byte[] bArr = new byte[h8];
        j(bArr, 0, 0, h8);
        return bArr;
    }

    protected final int y() {
        return this.f14670q;
    }
}
