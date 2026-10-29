package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class bb4 extends k94 {

    /* renamed from: a, reason: collision with root package name */
    private final gb4 f5679a;

    /* renamed from: b, reason: collision with root package name */
    private final kw4 f5680b;

    /* renamed from: c, reason: collision with root package name */
    private final hw4 f5681c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f5682d;

    private bb4(gb4 gb4Var, kw4 kw4Var, hw4 hw4Var, Integer num) {
        this.f5679a = gb4Var;
        this.f5680b = kw4Var;
        this.f5681c = hw4Var;
        this.f5682d = num;
    }

    public static bb4 d(fb4 fb4Var, kw4 kw4Var, Integer num) {
        hw4 b8;
        fb4 fb4Var2 = fb4.f8126d;
        if (fb4Var != fb4Var2 && num == null) {
            String obj = fb4Var.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (fb4Var == fb4Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (kw4Var.d() != 32) {
            int d8 = kw4Var.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(d8).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(d8);
            throw new GeneralSecurityException(sb2.toString());
        }
        gb4 b9 = gb4.b(fb4Var);
        if (b9.c() == fb4Var2) {
            b8 = xh4.f18842a;
        } else if (b9.c() == fb4.f8125c) {
            b8 = xh4.a(num.intValue());
        } else {
            if (b9.c() != fb4.f8124b) {
                throw new IllegalStateException("Unknown Variant: ".concat(b9.c().toString()));
            }
            b8 = xh4.b(num.intValue());
        }
        return new bb4(b9, kw4Var, b8, num);
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final /* synthetic */ s84 a() {
        return this.f5679a;
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final Integer b() {
        return this.f5682d;
    }

    @Override // com.google.android.gms.internal.ads.k94
    public final hw4 c() {
        return this.f5681c;
    }

    public final kw4 e() {
        return this.f5680b;
    }

    public final gb4 f() {
        return this.f5679a;
    }
}
