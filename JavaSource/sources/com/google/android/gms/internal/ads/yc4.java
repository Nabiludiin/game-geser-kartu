package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class yc4 extends k94 {

    /* renamed from: a, reason: collision with root package name */
    private final ed4 f19498a;

    /* renamed from: b, reason: collision with root package name */
    private final kw4 f19499b;

    /* renamed from: c, reason: collision with root package name */
    private final hw4 f19500c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f19501d;

    private yc4(ed4 ed4Var, kw4 kw4Var, hw4 hw4Var, Integer num) {
        this.f19498a = ed4Var;
        this.f19499b = kw4Var;
        this.f19500c = hw4Var;
        this.f19501d = num;
    }

    public static yc4 d(dd4 dd4Var, kw4 kw4Var, Integer num) {
        hw4 b8;
        dd4 dd4Var2 = dd4.f7065d;
        if (dd4Var != dd4Var2 && num == null) {
            String obj = dd4Var.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (dd4Var == dd4Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (kw4Var.d() != 32) {
            int d8 = kw4Var.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(d8).length() + 75);
            sb2.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(d8);
            throw new GeneralSecurityException(sb2.toString());
        }
        ed4 b9 = ed4.b(dd4Var);
        if (b9.c() == dd4Var2) {
            b8 = xh4.f18842a;
        } else if (b9.c() == dd4.f7064c) {
            b8 = xh4.a(num.intValue());
        } else {
            if (b9.c() != dd4.f7063b) {
                throw new IllegalStateException("Unknown Variant: ".concat(b9.c().toString()));
            }
            b8 = xh4.b(num.intValue());
        }
        return new yc4(b9, kw4Var, b8, num);
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final /* synthetic */ s84 a() {
        return this.f19498a;
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final Integer b() {
        return this.f19501d;
    }

    @Override // com.google.android.gms.internal.ads.k94
    public final hw4 c() {
        return this.f19500c;
    }

    public final kw4 e() {
        return this.f19499b;
    }

    public final ed4 f() {
        return this.f19498a;
    }
}
