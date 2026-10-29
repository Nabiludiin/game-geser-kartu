package com.google.android.gms.internal.drive;

final class n extends r {

    /* renamed from: v, reason: collision with root package name */
    private final int f20685v;

    /* renamed from: w, reason: collision with root package name */
    private final int f20686w;

    n(byte[] bArr, int i7, int i8) {
        super(bArr);
        i.k(i7, i7 + i8, bArr.length);
        this.f20685v = i7;
        this.f20686w = i8;
    }

    @Override // com.google.android.gms.internal.drive.r, com.google.android.gms.internal.drive.i
    public final byte p(int i7) {
        int size = size();
        if (((size - (i7 + 1)) | i7) >= 0) {
            return this.f20710u[this.f20685v + i7];
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i7);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i7);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.drive.r, com.google.android.gms.internal.drive.i
    final byte q(int i7) {
        return this.f20710u[this.f20685v + i7];
    }

    @Override // com.google.android.gms.internal.drive.r
    protected final int s() {
        return this.f20685v;
    }

    @Override // com.google.android.gms.internal.drive.r, com.google.android.gms.internal.drive.i
    public final int size() {
        return this.f20686w;
    }
}
