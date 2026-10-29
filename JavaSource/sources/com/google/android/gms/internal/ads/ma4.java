package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
final /* synthetic */ class ma4 implements kh4 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ ma4 f12160a = new ma4();

    private /* synthetic */ ma4() {
    }

    @Override // com.google.android.gms.internal.ads.kh4
    public final /* synthetic */ b84 a(s84 s84Var, Integer num) {
        ra4 ra4Var = (ra4) s84Var;
        int i7 = oa4.f13261f;
        if (ra4Var.c() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        ia4 ia4Var = new ia4(null);
        ia4Var.a(ra4Var);
        ia4Var.c(num);
        ia4Var.b(kw4.b(ra4Var.c()));
        return ia4Var.d();
    }
}
