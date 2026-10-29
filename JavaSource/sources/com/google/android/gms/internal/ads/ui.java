package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: MyApplication */
public final class ui implements Comparator {

    /* renamed from: q, reason: collision with root package name */
    private final boolean f16782q;

    public ui(boolean z7) {
        this.f16782q = z7;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparator;
        Object n7;
        Object n8;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        int i16 = i14 % 496612959;
        zi ziVar = (zi) obj;
        zi ziVar2 = (zi) obj2;
        int i17 = ziVar.f20190g;
        if (i17 != ziVar2.f20190g) {
            throw new IllegalArgumentException();
        }
        int i18 = i16 ^ i15;
        try {
            if (i17 == 0) {
                throw null;
            }
            switch (i17 + i18) {
                case 0:
                    return 0;
                case 1:
                    if (this.f16782q) {
                        return ziVar.l() != ziVar2.l() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(ziVar.m(), ziVar2.m());
                case 3:
                    comparator = ai.f4975c;
                    n7 = ziVar.n();
                    n8 = ziVar2.n();
                    break;
                case 4:
                    n7 = ziVar.o();
                    n8 = ziVar2.o();
                    comparator = g04.a(this);
                    break;
                case 5:
                    if (this.f16782q) {
                        return ziVar.p() != ziVar2.p() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(ziVar.q(), ziVar2.q());
                default:
                    return 0;
            }
            return comparator.compare(n7, n8);
        } catch (vi e8) {
            throw new AssertionError(yh.a("CEiv6BFfPnitUE+D"), e8);
        }
    }
}
