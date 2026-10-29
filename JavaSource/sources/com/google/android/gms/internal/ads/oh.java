package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class oh implements mh {

    /* renamed from: a, reason: collision with root package name */
    private int f13325a = (((((~1539942439) & 2070175971) | 1100945533) + ((1539942439 & (-1166483302)) | (-2145608135))) - 96382817) ^ (1143565421 % 981914693);

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f13326b = new byte[(((((~991039875) & 475472926) | 1225689584) + ((991039875 & 357672014) | 1805818736)) - (-1256743880)) ^ (1671581032 % 1337434154)];

    /* renamed from: c, reason: collision with root package name */
    private final qh f13327c;

    public oh(qh qhVar) {
        this.f13327c = qhVar;
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final byte a(ai aiVar, int i7) {
        int i8 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i9 = 1761855727 % 1384724137;
        int i10 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i11 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i12 = 1694830070 % 1383960411;
        int i13 = i7 >>> i10;
        if (i13 != this.f13325a) {
            this.f13327c.a(i13, this.f13326b);
            this.f13325a = i13;
        }
        int i14 = i11 ^ i12;
        return (byte) (((aiVar.b(i7) ^ this.f13326b[i7 % (i8 ^ i9)]) << i14) >> i14);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final ai b(ai aiVar, int i7, int i8) {
        if (i7 < 0 || i7 > i8 || i8 > aiVar.f4976a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i8 - i7];
        int i9 = 0;
        while (i7 < i8) {
            bArr[i9] = a(aiVar, i7);
            i7++;
            i9++;
        }
        return ai.e(bArr);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final /* bridge */ /* synthetic */ mh d() {
        return new oh(this.f13327c);
    }
}
