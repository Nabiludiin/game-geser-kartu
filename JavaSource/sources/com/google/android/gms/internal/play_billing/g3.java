package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
class g3 extends f3 {

    /* renamed from: s, reason: collision with root package name */
    protected final byte[] f21534s;

    g3(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f21534s = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.i3
    public byte c(int i7) {
        return this.f21534s[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.i3
    byte e(int i7) {
        return this.f21534s[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.i3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i3) || g() != ((i3) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return obj.equals(this);
        }
        g3 g3Var = (g3) obj;
        int l7 = l();
        int l8 = g3Var.l();
        if (l7 != 0 && l8 != 0 && l7 != l8) {
            return false;
        }
        int g8 = g();
        if (g8 > g3Var.g()) {
            throw new IllegalArgumentException("Length too large: " + g8 + g());
        }
        if (g8 > g3Var.g()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + g8 + ", " + g3Var.g());
        }
        byte[] bArr = this.f21534s;
        byte[] bArr2 = g3Var.f21534s;
        g3Var.n();
        int i7 = 0;
        int i8 = 0;
        while (i7 < g8) {
            if (bArr[i7] != bArr2[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.i3
    public int g() {
        return this.f21534s.length;
    }

    @Override // com.google.android.gms.internal.play_billing.i3
    protected final int h(int i7, int i8, int i9) {
        return j4.b(i7, this.f21534s, 0, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.i3
    public final i3 i(int i7, int i8) {
        int k7 = i3.k(0, i8, g());
        return k7 == 0 ? i3.f21564r : new d3(this.f21534s, 0, k7);
    }

    @Override // com.google.android.gms.internal.play_billing.i3
    final void j(z2 z2Var) {
        ((m3) z2Var).A(this.f21534s, 0, g());
    }

    protected int n() {
        return 0;
    }
}
