package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
final /* synthetic */ class da4 implements kh4 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ da4 f7019a = new da4();

    private /* synthetic */ da4() {
    }

    @Override // com.google.android.gms.internal.ads.kh4
    public final /* synthetic */ b84 a(s84 s84Var, Integer num) {
        ha4 ha4Var = (ha4) s84Var;
        int i7 = ea4.f7516d;
        if (ha4Var.c() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        aa4 aa4Var = new aa4(null);
        aa4Var.a(ha4Var);
        aa4Var.c(num);
        aa4Var.b(kw4.b(ha4Var.c()));
        return aa4Var.d();
    }
}
