package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
class oy4 extends ny4 {

    /* renamed from: s, reason: collision with root package name */
    protected final byte[] f13555s;

    oy4(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f13555s = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ny4
    final boolean A(qy4 qy4Var, int i7, int i8) {
        if (i8 > qy4Var.h()) {
            int h8 = h();
            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 18 + String.valueOf(h8).length());
            sb.append("Length too large: ");
            sb.append(i8);
            sb.append(h8);
            throw new IllegalArgumentException(sb.toString());
        }
        int i9 = i7 + i8;
        if (i9 > qy4Var.h()) {
            int h9 = qy4Var.h();
            int length = String.valueOf(i7).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i8).length() + 2 + String.valueOf(h9).length());
            sb2.append("Ran off end of other: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            sb2.append(", ");
            sb2.append(h9);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(qy4Var instanceof oy4)) {
            return qy4Var.m(i7, i9).equals(m(0, i8));
        }
        oy4 oy4Var = (oy4) qy4Var;
        byte[] bArr = this.f13555s;
        byte[] bArr2 = oy4Var.f13555s;
        int C = C() + i8;
        int C2 = C();
        int C3 = oy4Var.C() + i7;
        while (C2 < C) {
            if (bArr[C2] != bArr2[C3]) {
                return false;
            }
            C2++;
            C3++;
        }
        return true;
    }

    protected int C() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public byte e(int i7) {
        return this.f13555s[i7];
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qy4) || h() != ((qy4) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof oy4)) {
            return obj.equals(this);
        }
        oy4 oy4Var = (oy4) obj;
        int y7 = y();
        int y8 = oy4Var.y();
        if (y7 == 0 || y8 == 0 || y7 == y8) {
            return A(oy4Var, 0, h());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qy4
    byte g(int i7) {
        return this.f13555s[i7];
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public int h() {
        return this.f13555s.length;
    }

    @Override // com.google.android.gms.internal.ads.qy4
    protected void j(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.f13555s, i7, bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public final qy4 m(int i7, int i8) {
        int c8 = qy4.c(i7, i8, h());
        return c8 == 0 ? qy4.f14669r : new ky4(this.f13555s, C() + i7, c8);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public final ByteBuffer n() {
        return ByteBuffer.wrap(this.f13555s, C(), h()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.qy4
    final void o(gy4 gy4Var) {
        gy4Var.a(this.f13555s, C(), h());
    }

    @Override // com.google.android.gms.internal.ads.qy4
    protected final int p(int i7, int i8, int i9) {
        return c05.c(i7, this.f13555s, C() + i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.qy4
    public final uy4 q() {
        return uy4.e(this.f13555s, C(), h(), true);
    }
}
