package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nh implements mh {
    @Override // com.google.android.gms.internal.ads.mh
    public final byte a(ai aiVar, int i7) {
        return aiVar.b(i7);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final ai b(ai aiVar, int i7, int i8) {
        byte[] bArr;
        int length;
        if (i7 < 0 || i7 > i8 || i8 > (length = (bArr = aiVar.f4976a).length) || i7 > i8 || i8 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new ai(ai.h(bArr, i7, i8 - i7));
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final mh d() {
        return new nh();
    }
}
