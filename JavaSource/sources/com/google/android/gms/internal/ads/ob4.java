package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class ob4 extends k94 {

    /* renamed from: a, reason: collision with root package name */
    private final qb4 f13266a;

    /* renamed from: b, reason: collision with root package name */
    private final hw4 f13267b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f13268c;

    private ob4(qb4 qb4Var, hw4 hw4Var, Integer num) {
        this.f13266a = qb4Var;
        this.f13267b = hw4Var;
        this.f13268c = num;
    }

    public static ob4 d(qb4 qb4Var, Integer num) {
        hw4 a8;
        if (qb4Var.d() == pb4.f13791b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            a8 = hw4.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (qb4Var.d() != pb4.f13792c) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(qb4Var.d().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            a8 = hw4.a(new byte[0]);
        }
        return new ob4(qb4Var, a8, num);
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final /* synthetic */ s84 a() {
        return this.f13266a;
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final Integer b() {
        return this.f13268c;
    }

    @Override // com.google.android.gms.internal.ads.k94
    public final hw4 c() {
        return this.f13267b;
    }

    public final qb4 e() {
        return this.f13266a;
    }
}
