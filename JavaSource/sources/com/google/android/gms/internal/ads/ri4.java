package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class ri4 implements xi4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14934a;

    /* renamed from: b, reason: collision with root package name */
    private final hw4 f14935b;

    /* renamed from: c, reason: collision with root package name */
    private final qy4 f14936c;

    /* renamed from: d, reason: collision with root package name */
    private final wn4 f14937d;

    /* renamed from: e, reason: collision with root package name */
    private final uo4 f14938e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f14939f;

    private ri4(String str, hw4 hw4Var, qy4 qy4Var, wn4 wn4Var, uo4 uo4Var, Integer num) {
        this.f14934a = str;
        this.f14935b = hw4Var;
        this.f14936c = qy4Var;
        this.f14937d = wn4Var;
        this.f14938e = uo4Var;
        this.f14939f = num;
    }

    public static ri4 a(String str, qy4 qy4Var, wn4 wn4Var, uo4 uo4Var, Integer num) {
        if (uo4Var == uo4.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new ri4(str, ej4.b(str), qy4Var, wn4Var, uo4Var, num);
    }

    public final qy4 b() {
        return this.f14936c;
    }

    public final wn4 c() {
        return this.f14937d;
    }

    public final uo4 d() {
        return this.f14938e;
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final hw4 e() {
        return this.f14935b;
    }

    public final Integer f() {
        return this.f14939f;
    }

    public final String g() {
        return this.f14934a;
    }
}
