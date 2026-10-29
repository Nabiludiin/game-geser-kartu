package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MyApplication */
final class m15 extends qy4 {

    /* renamed from: x, reason: collision with root package name */
    static final int[] f12024x = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: s, reason: collision with root package name */
    private final int f12025s;

    /* renamed from: t, reason: collision with root package name */
    private final qy4 f12026t;

    /* renamed from: u, reason: collision with root package name */
    private final qy4 f12027u;

    /* renamed from: v, reason: collision with root package name */
    private final int f12028v;

    /* renamed from: w, reason: collision with root package name */
    private final int f12029w;

    /* synthetic */ m15(qy4 qy4Var, qy4 qy4Var2, byte[] bArr) {
        this(qy4Var, qy4Var2);
    }

    private static qy4 D(qy4 qy4Var, qy4 qy4Var2) {
        int h8 = qy4Var.h();
        int h9 = qy4Var2.h();
        byte[] bArr = new byte[h8 + h9];
        qy4Var.v(bArr, 0, 0, h8);
        qy4Var2.v(bArr, 0, h8, h9);
        return new oy4(bArr);
    }

    static qy4 E(qy4 qy4Var, qy4 qy4Var2) {
        if (qy4Var2.h() == 0) {
            return qy4Var;
        }
        if (qy4Var.h() == 0) {
            return qy4Var2;
        }
        int h8 = qy4Var.h() + qy4Var2.h();
        if (h8 < 128) {
            return D(qy4Var, qy4Var2);
        }
        if (qy4Var instanceof m15) {
            m15 m15Var = (m15) qy4Var;
            qy4 qy4Var3 = m15Var.f12027u;
            if (qy4Var3.h() + qy4Var2.h() < 128) {
                return new m15(m15Var.f12026t, D(qy4Var3, qy4Var2));
            }
            qy4 qy4Var4 = m15Var.f12026t;
            if (qy4Var4.k() > qy4Var3.k() && m15Var.f12029w > qy4Var2.k()) {
                return new m15(qy4Var4, new m15(qy4Var3, qy4Var2));
            }
        }
        return h8 >= G(Math.max(qy4Var.k(), qy4Var2.k()) + 1) ? new m15(qy4Var, qy4Var2) : k15.a(qy4Var, qy4Var2, new ArrayDeque());
    }

    static int G(int i7) {
        int[] iArr = f12024x;
        int length = iArr.length;
        if (i7 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i7];
    }

    final /* synthetic */ qy4 A() {
        return this.f12026t;
    }

    final /* synthetic */ qy4 C() {
        return this.f12027u;
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public final byte e(int i7) {
        qy4.z(i7, this.f12025s);
        return g(i7);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qy4)) {
            return false;
        }
        qy4 qy4Var = (qy4) obj;
        int i7 = this.f12025s;
        if (i7 != qy4Var.h()) {
            return false;
        }
        if (i7 == 0) {
            return true;
        }
        int y7 = y();
        int y8 = qy4Var.y();
        if (y7 != 0 && y8 != 0 && y7 != y8) {
            return false;
        }
        byte[] bArr = null;
        l15 l15Var = new l15(this, bArr);
        ny4 next = l15Var.next();
        l15 l15Var2 = new l15(qy4Var, bArr);
        ny4 next2 = l15Var2.next();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int h8 = next.h() - i8;
            int h9 = next2.h() - i9;
            int min = Math.min(h8, h9);
            if (!(i8 == 0 ? next.A(next2, i9, min) : next2.A(next, i8, min))) {
                return false;
            }
            i10 += min;
            if (i10 >= i7) {
                if (i10 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == h8) {
                next = l15Var.next();
                i8 = 0;
            } else {
                i8 += min;
                next = next;
            }
            if (min == h9) {
                next2 = l15Var2.next();
                i9 = 0;
            } else {
                i9 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qy4
    final byte g(int i7) {
        int i8 = this.f12028v;
        return i7 < i8 ? this.f12026t.g(i7) : this.f12027u.g(i7 - i8);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public final int h() {
        return this.f12025s;
    }

    @Override // com.google.android.gms.internal.ads.qy4, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new j15(this);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    protected final void j(byte[] bArr, int i7, int i8, int i9) {
        int i10 = i7 + i9;
        int i11 = this.f12028v;
        if (i10 <= i11) {
            this.f12026t.j(bArr, i7, i8, i9);
        } else {
            if (i7 >= i11) {
                this.f12027u.j(bArr, i7 - i11, i8, i9);
                return;
            }
            int i12 = i11 - i7;
            this.f12026t.j(bArr, i7, i8, i12);
            this.f12027u.j(bArr, 0, i8 + i12, i9 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.qy4
    protected final int k() {
        return this.f12029w;
    }

    @Override // com.google.android.gms.internal.ads.qy4
    protected final boolean l() {
        return this.f12025s >= G(this.f12029w);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public final qy4 m(int i7, int i8) {
        int i9 = this.f12025s;
        int c8 = qy4.c(i7, i8, i9);
        if (c8 == 0) {
            return qy4.f14669r;
        }
        if (c8 == i9) {
            return this;
        }
        int i10 = this.f12028v;
        if (i8 <= i10) {
            return this.f12026t.m(i7, i8);
        }
        int i11 = i8 - i10;
        if (i7 >= i10) {
            return this.f12027u.m(i7 - i10, i11);
        }
        qy4 qy4Var = this.f12026t;
        return new m15(qy4Var.m(i7, qy4Var.h()), this.f12027u.m(0, i11));
    }

    @Override // com.google.android.gms.internal.ads.qy4
    final void o(gy4 gy4Var) {
        this.f12026t.o(gy4Var);
        this.f12027u.o(gy4Var);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    protected final int p(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.f12028v;
        if (i10 <= i11) {
            return this.f12026t.p(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.f12027u.p(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.f12027u.p(this.f12026t.p(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public final uy4 q() {
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        l15 l15Var = new l15(this, bArr);
        while (l15Var.hasNext()) {
            arrayList.add(l15Var.next().n());
        }
        int i7 = uy4.f17266f;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            i9 += byteBuffer.remaining();
            i8 = byteBuffer.hasArray() ? i8 | 1 : byteBuffer.isDirect() ? i8 | 2 : i8 | 4;
        }
        return i8 == 2 ? new sy4(arrayList, i9, true, bArr) : uy4.d(new f05(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    /* renamed from: r */
    public final ly4 iterator() {
        return new j15(this);
    }

    private m15(qy4 qy4Var, qy4 qy4Var2) {
        this.f12026t = qy4Var;
        this.f12027u = qy4Var2;
        int h8 = qy4Var.h();
        this.f12028v = h8;
        this.f12025s = h8 + qy4Var2.h();
        this.f12029w = Math.max(qy4Var.k(), qy4Var2.k()) + 1;
    }
}
