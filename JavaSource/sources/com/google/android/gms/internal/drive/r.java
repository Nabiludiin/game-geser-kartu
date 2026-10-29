package com.google.android.gms.internal.drive;

import java.nio.charset.Charset;

class r extends q {

    /* renamed from: u, reason: collision with root package name */
    protected final byte[] f20710u;

    r(byte[] bArr) {
        bArr.getClass();
        this.f20710u = bArr;
    }

    @Override // com.google.android.gms.internal.drive.i
    protected final int e(int i7, int i8, int i9) {
        return m0.b(i7, this.f20710u, s(), i9);
    }

    @Override // com.google.android.gms.internal.drive.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || size() != ((i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof r)) {
            return obj.equals(this);
        }
        r rVar = (r) obj;
        int n7 = n();
        int n8 = rVar.n();
        if (n7 == 0 || n8 == 0 || n7 == n8) {
            return r(rVar, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.drive.i
    public final i g(int i7, int i8) {
        int k7 = i.k(0, i8, size());
        return k7 == 0 ? i.f20619r : new n(this.f20710u, s(), k7);
    }

    @Override // com.google.android.gms.internal.drive.i
    protected final String h(Charset charset) {
        return new String(this.f20710u, s(), size(), charset);
    }

    @Override // com.google.android.gms.internal.drive.i
    final void i(h hVar) {
        hVar.a(this.f20710u, s(), size());
    }

    @Override // com.google.android.gms.internal.drive.i
    public final boolean m() {
        int s7 = s();
        return t2.h(this.f20710u, s7, size() + s7);
    }

    @Override // com.google.android.gms.internal.drive.i
    public byte p(int i7) {
        return this.f20710u[i7];
    }

    @Override // com.google.android.gms.internal.drive.i
    byte q(int i7) {
        return this.f20710u[i7];
    }

    @Override // com.google.android.gms.internal.drive.q
    final boolean r(i iVar, int i7, int i8) {
        if (i8 > iVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i8);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i8 > iVar.size()) {
            int size2 = iVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i8);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(iVar instanceof r)) {
            return iVar.g(0, i8).equals(g(0, i8));
        }
        r rVar = (r) iVar;
        byte[] bArr = this.f20710u;
        byte[] bArr2 = rVar.f20710u;
        int s7 = s() + i8;
        int s8 = s();
        int s9 = rVar.s();
        while (s8 < s7) {
            if (bArr[s8] != bArr2[s9]) {
                return false;
            }
            s8++;
            s9++;
        }
        return true;
    }

    protected int s() {
        return 0;
    }

    @Override // com.google.android.gms.internal.drive.i
    public int size() {
        return this.f20710u.length;
    }
}
