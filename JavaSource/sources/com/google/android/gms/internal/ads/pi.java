package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: MyApplication */
public final class pi {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13888a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f13889b = 0;

    public pi(int i7) {
    }

    public final int a(long j7) {
        long j8;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + (((((~i7) & i8) | i9) + ((i7 & i10) | i11)) - i12);
        int i16 = i14 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j9 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        long j17 = j15 + (((((~j9) & j10) | j11) + ((j9 & j12) | j13)) - j14);
        long j18 = j16 % 438792350;
        if (j7 >= 0) {
            j8 = (this.f13889b + (i15 ^ i16)) - j7;
        } else {
            j8 = (j17 ^ j18) + (-j7);
        }
        if (j8 < 0 || j8 >= this.f13889b) {
            throw new ni();
        }
        return (int) j8;
    }

    public final void b(zi ziVar) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        int i16 = this.f13889b;
        if (i16 >= ((i14 % 937558955) ^ i15)) {
            throw new oi();
        }
        ArrayList arrayList = this.f13888a;
        if (i16 == arrayList.size()) {
            arrayList.add(ziVar);
        } else {
            arrayList.set(this.f13889b, ziVar);
        }
        this.f13889b++;
    }

    public final zi c() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        int i16 = i14 % 459541652;
        int i17 = this.f13889b;
        if (i17 <= 0) {
            throw new ni();
        }
        int i18 = i16 ^ i15;
        ArrayList arrayList = this.f13888a;
        zi ziVar = (zi) arrayList.get(i17 + i18);
        arrayList.set(this.f13889b + i18, null);
        this.f13889b += i18;
        return ziVar;
    }

    public final zi d(long j7) {
        return (zi) this.f13888a.get(a(j7));
    }

    public final void e(long j7, zi ziVar) {
        this.f13888a.set(a(j7), ziVar);
    }
}
