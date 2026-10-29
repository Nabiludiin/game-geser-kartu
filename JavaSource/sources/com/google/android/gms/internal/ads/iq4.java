package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* compiled from: MyApplication */
public final class iq4 extends ws4 {

    /* renamed from: a, reason: collision with root package name */
    private final eq4 f10129a;

    /* renamed from: b, reason: collision with root package name */
    private final ECPoint f10130b;

    /* renamed from: c, reason: collision with root package name */
    private final hw4 f10131c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f10132d;

    /* synthetic */ iq4(eq4 eq4Var, ECPoint eCPoint, hw4 hw4Var, Integer num, byte[] bArr) {
        this.f10129a = eq4Var;
        this.f10130b = eCPoint;
        this.f10131c = hw4Var;
        this.f10132d = num;
    }

    public static hq4 d() {
        return new hq4(null);
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final /* synthetic */ s84 a() {
        return this.f10129a;
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final Integer b() {
        return this.f10132d;
    }

    @Override // com.google.android.gms.internal.ads.ws4
    public final hw4 c() {
        return this.f10131c;
    }

    public final ECPoint e() {
        return this.f10130b;
    }

    public final eq4 f() {
        return this.f10129a;
    }
}
