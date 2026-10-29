package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class vq4 extends ws4 {

    /* renamed from: a, reason: collision with root package name */
    private final oq4 f17716a;

    /* renamed from: b, reason: collision with root package name */
    private final hw4 f17717b;

    /* renamed from: c, reason: collision with root package name */
    private final hw4 f17718c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f17719d;

    private vq4(oq4 oq4Var, hw4 hw4Var, hw4 hw4Var2, Integer num) {
        this.f17716a = oq4Var;
        this.f17717b = hw4Var;
        this.f17718c = hw4Var2;
        this.f17719d = num;
    }

    public static vq4 d(nq4 nq4Var, hw4 hw4Var, Integer num) {
        hw4 a8;
        oq4 b8 = oq4.b(nq4Var);
        nq4 nq4Var2 = nq4.f12849e;
        if (!nq4Var.equals(nq4Var2) && num == null) {
            String obj = nq4Var.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (nq4Var.equals(nq4Var2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (hw4Var.d() != 32) {
            int d8 = hw4Var.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(d8).length() + 65);
            sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb2.append(d8);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (b8.c() == nq4Var2) {
            a8 = xh4.f18842a;
        } else if (b8.c() == nq4.f12847c || b8.c() == nq4.f12848d) {
            a8 = xh4.a(num.intValue());
        } else {
            if (b8.c() != nq4.f12846b) {
                throw new IllegalStateException("Unknown Variant: ".concat(b8.c().toString()));
            }
            a8 = xh4.b(num.intValue());
        }
        return new vq4(b8, hw4Var, a8, num);
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final /* synthetic */ s84 a() {
        return this.f17716a;
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final Integer b() {
        return this.f17719d;
    }

    @Override // com.google.android.gms.internal.ads.ws4
    public final hw4 c() {
        return this.f17718c;
    }

    public final hw4 e() {
        return this.f17717b;
    }

    public final oq4 f() {
        return this.f17716a;
    }
}
