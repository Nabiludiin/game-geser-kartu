package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class x9 extends ba {

    /* renamed from: t, reason: collision with root package name */
    private final int f21440t;

    x9(byte[] bArr, int i7, int i8) {
        super(bArr);
        ca.m(0, i8, bArr.length);
        this.f21440t = i8;
    }

    @Override // com.google.android.gms.internal.measurement.ba, com.google.android.gms.internal.measurement.ca
    public final byte c(int i7) {
        int i8 = this.f21440t;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f20834s[i7];
        }
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

    @Override // com.google.android.gms.internal.measurement.ba, com.google.android.gms.internal.measurement.ca
    final byte e(int i7) {
        return this.f20834s[i7];
    }

    @Override // com.google.android.gms.internal.measurement.ba, com.google.android.gms.internal.measurement.ca
    public final int g() {
        return this.f21440t;
    }

    @Override // com.google.android.gms.internal.measurement.ba
    protected final int n() {
        return 0;
    }
}
