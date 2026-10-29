package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class sc4 extends k94 {

    /* renamed from: a, reason: collision with root package name */
    private final xc4 f15555a;

    /* renamed from: b, reason: collision with root package name */
    private final kw4 f15556b;

    /* renamed from: c, reason: collision with root package name */
    private final hw4 f15557c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f15558d;

    private sc4(xc4 xc4Var, kw4 kw4Var, hw4 hw4Var, Integer num) {
        this.f15555a = xc4Var;
        this.f15556b = kw4Var;
        this.f15557c = hw4Var;
        this.f15558d = num;
    }

    public static sc4 d(xc4 xc4Var, kw4 kw4Var, Integer num) {
        hw4 b8;
        wc4 c8 = xc4Var.c();
        wc4 wc4Var = wc4.f18199c;
        if (c8 != wc4Var && num == null) {
            String obj = xc4Var.c().toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (xc4Var.c() == wc4Var && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (kw4Var.d() != 32) {
            int d8 = kw4Var.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(d8).length() + 68);
            sb2.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb2.append(d8);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (xc4Var.c() == wc4Var) {
            b8 = xh4.f18842a;
        } else {
            if (xc4Var.c() != wc4.f18198b) {
                throw new IllegalStateException("Unknown Variant: ".concat(xc4Var.c().toString()));
            }
            b8 = xh4.b(num.intValue());
        }
        return new sc4(xc4Var, kw4Var, b8, num);
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final /* synthetic */ s84 a() {
        return this.f15555a;
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final Integer b() {
        return this.f15558d;
    }

    @Override // com.google.android.gms.internal.ads.k94
    public final hw4 c() {
        return this.f15557c;
    }

    public final kw4 e() {
        return this.f15556b;
    }

    public final xc4 f() {
        return this.f15555a;
    }
}
