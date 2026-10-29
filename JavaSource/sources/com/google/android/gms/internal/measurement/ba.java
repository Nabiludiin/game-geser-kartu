package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
class ba extends aa {

    /* renamed from: s, reason: collision with root package name */
    protected final byte[] f20834s;

    ba(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f20834s = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.ca
    public byte c(int i7) {
        return this.f20834s[i7];
    }

    @Override // com.google.android.gms.internal.measurement.ca
    byte e(int i7) {
        return this.f20834s[i7];
    }

    @Override // com.google.android.gms.internal.measurement.ca
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ca) || g() != ((ca) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return obj.equals(this);
        }
        ba baVar = (ba) obj;
        int l7 = l();
        int l8 = baVar.l();
        if (l7 != 0 && l8 != 0 && l7 != l8) {
            return false;
        }
        int g8 = g();
        if (g8 > baVar.g()) {
            int g9 = g();
            StringBuilder sb = new StringBuilder(String.valueOf(g8).length() + 18 + String.valueOf(g9).length());
            sb.append("Length too large: ");
            sb.append(g8);
            sb.append(g9);
            throw new IllegalArgumentException(sb.toString());
        }
        if (g8 > baVar.g()) {
            int g10 = baVar.g();
            StringBuilder sb2 = new StringBuilder(String.valueOf(g8).length() + 27 + String.valueOf(g10).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(g8);
            sb2.append(", ");
            sb2.append(g10);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f20834s;
        byte[] bArr2 = baVar.f20834s;
        baVar.n();
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

    @Override // com.google.android.gms.internal.measurement.ca
    public int g() {
        return this.f20834s.length;
    }

    @Override // com.google.android.gms.internal.measurement.ca
    public final ca h(int i7, int i8) {
        int m7 = ca.m(0, i8, g());
        return m7 == 0 ? ca.f20858r : new x9(this.f20834s, 0, m7);
    }

    @Override // com.google.android.gms.internal.measurement.ca
    final void i(t9 t9Var) {
        ((fa) t9Var).F(this.f20834s, 0, g());
    }

    @Override // com.google.android.gms.internal.measurement.ca
    protected final int j(int i7, int i8, int i9) {
        return eb.c(i7, this.f20834s, 0, i9);
    }

    protected int n() {
        return 0;
    }
}
