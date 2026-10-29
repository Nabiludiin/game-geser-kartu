package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: MyApplication */
public abstract class ca implements Iterable, Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final ca f20858r = new ba(eb.f20914b);

    /* renamed from: q, reason: collision with root package name */
    private int f20859q = 0;

    static {
        int i7 = q9.f21249a;
    }

    ca() {
    }

    public static ca k(byte[] bArr, int i7, int i8) {
        m(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new ba(bArr2);
    }

    static int m(int i7, int i8, int i9) {
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

    public abstract byte c(int i7);

    abstract byte e(int i7);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public abstract ca h(int i7, int i8);

    public final int hashCode() {
        int i7 = this.f20859q;
        if (i7 == 0) {
            int g8 = g();
            i7 = j(g8, 0, g8);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f20859q = i7;
        }
        return i7;
    }

    abstract void i(t9 t9Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new v9(this);
    }

    protected abstract int j(int i7, int i8, int i9);

    protected final int l() {
        return this.f20859q;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? rc.a(this) : rc.a(h(0, 47)).concat("..."));
    }
}
