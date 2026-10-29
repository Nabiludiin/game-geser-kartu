package com.google.android.gms.internal.ads;

import java.util.Optional;

/* compiled from: MyApplication */
public final class wh {
    public static zi a(final long j7) {
        return zi.f(new qi() { // from class: com.google.android.gms.internal.ads.vh
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                Optional of;
                Optional empty;
                try {
                    ((ti) obj).f16199b.b(zi.b(j7));
                    empty = Optional.empty();
                    return empty;
                } catch (oi unused) {
                    of = Optional.of(yg.f19565r);
                    return of;
                }
            }
        });
    }

    public static int b(long j7, yi yiVar, boolean z7) {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        long j16 = j14 + (((((~j8) & j9) | j10) + ((j8 & j11) | j12)) - j13);
        long j17 = j15 % 1629190168;
        int i7 = ((((~1725868784) & 388366538) | 739792167) + ((1725868784 & 1395525853) | 1087913783)) - 2073845026;
        int i8 = 1550046828 % 184366026;
        int i9 = ((((~84870791) & 719462960) | 688752780) + ((84870791 & 317383283) | 806209731)) - 1437974767;
        int i10 = 2023762697 % 959200313;
        int i11 = ((((~294151249) & 1465191424) | 201912514) + ((294151249 & 1398095366) | 75641662)) - 1330100008;
        int i12 = 1583887958 % 619175679;
        long j18 = z7 ? (j7 >> ((((((~1375552878) & 930005102) | 1249030018) + ((1375552878 & 1024213116) | 136481682)) - 2090967727) ^ (2014126950 % 228698447))) ^ (j7 + j7) : j7;
        int i13 = 1;
        while (true) {
            long j19 = j16 ^ j17;
            long j20 = j18 >>> (i9 ^ i10);
            boolean z8 = j20 != 0 || i13 < 0;
            int i14 = (int) (j18 & j19);
            if (z8) {
                int i15 = i7 ^ i8;
                i14 = ((i14 | (i11 ^ i12)) << i15) >> i15;
            }
            yiVar.a((byte) i14);
            if (!z8) {
                return i13;
            }
            i13++;
            j18 = j20;
        }
    }
}
