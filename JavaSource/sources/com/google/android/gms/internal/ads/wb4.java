package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class wb4 extends k94 {

    /* renamed from: a, reason: collision with root package name */
    private final ac4 f18176a;

    /* renamed from: b, reason: collision with root package name */
    private final hw4 f18177b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f18178c;

    private wb4(ac4 ac4Var, hw4 hw4Var, Integer num) {
        this.f18176a = ac4Var;
        this.f18177b = hw4Var;
        this.f18178c = num;
    }

    public static wb4 d(ac4 ac4Var, Integer num) {
        hw4 b8;
        if (ac4Var.c() == zb4.f20118c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b8 = xh4.f18842a;
        } else {
            if (ac4Var.c() != zb4.f20117b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(ac4Var.c())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b8 = xh4.b(num.intValue());
        }
        return new wb4(ac4Var, b8, num);
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final /* synthetic */ s84 a() {
        return this.f18176a;
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final Integer b() {
        return this.f18178c;
    }

    @Override // com.google.android.gms.internal.ads.k94
    public final hw4 c() {
        return this.f18177b;
    }

    public final ac4 e() {
        return this.f18176a;
    }
}
