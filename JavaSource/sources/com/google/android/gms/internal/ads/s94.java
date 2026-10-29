package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
final /* synthetic */ class s94 implements kh4 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ s94 f15508a = new s94();

    private /* synthetic */ s94() {
    }

    @Override // com.google.android.gms.internal.ads.kh4
    public final /* synthetic */ b84 a(s84 s84Var, Integer num) {
        z94 z94Var = (z94) s84Var;
        int i7 = v94.f17471f;
        if (z94Var.c() != 16 && z94Var.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        q94 q94Var = new q94(null);
        q94Var.a(z94Var);
        q94Var.d(num);
        q94Var.b(kw4.b(z94Var.c()));
        q94Var.c(kw4.b(z94Var.d()));
        return q94Var.e();
    }
}
