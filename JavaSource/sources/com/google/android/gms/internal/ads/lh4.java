package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
final /* synthetic */ class lh4 implements kh4 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ lh4 f11616a = new lh4();

    private /* synthetic */ lh4() {
    }

    @Override // com.google.android.gms.internal.ads.kh4
    public final /* synthetic */ b84 a(s84 s84Var, Integer num) {
        int i7 = mh4.f12261d;
        bo4 c8 = ((dh4) s84Var).b().c();
        c84 d8 = pg4.a().d(c8.d0());
        if (!pg4.a().e(c8.d0())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        xn4 c9 = d8.c(c8.e0());
        return new ch4(ri4.a(c9.d0(), c9.e0(), c9.f0(), c8.f0(), num), z74.a());
    }
}
