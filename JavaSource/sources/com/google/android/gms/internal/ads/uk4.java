package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class uk4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f16800a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f16801b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f16802c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f16803d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f16804e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16805f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f16800a = a8;
        f16801b = di4.d(tk4.f16232a, nj4.class, si4.class);
        f16802c = ai4.d(qk4.f14472a, a8, si4.class);
        f16803d = wg4.d(rk4.f14985a, gj4.class, ri4.class);
        f16804e = sg4.d(sk4.f15665a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f16801b);
        wh4Var.e(f16802c);
        wh4Var.b(f16803d);
        wh4Var.c(f16804e);
    }

    static /* synthetic */ si4 b(nj4 nj4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.AesCmacKey");
        ql4 g02 = rl4.g0();
        g02.F(h(nj4Var));
        g02.E(nj4Var.c());
        h02.F(((rl4) g02.A()).d());
        h02.G(f(nj4Var.f()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ nj4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            rl4 f02 = rl4.f0(si4Var.c().e0(), ez4.a());
            lj4 b8 = nj4.b();
            b8.a(f02.d0());
            b8.b(f02.e0().d0());
            b8.c(g(si4Var.c().f0()));
            return b8.d();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(gj4 gj4Var, w84 w84Var) {
        ol4 h02 = pl4.h0();
        h02.F(h(gj4Var.f()));
        byte[] c8 = gj4Var.e().c(w84Var);
        h02.E(qy4.s(c8, 0, c8.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((pl4) h02.A()).d(), wn4.SYMMETRIC, f(gj4Var.f().f()), gj4Var.b());
    }

    static /* synthetic */ gj4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            pl4 g02 = pl4.g0(ri4Var.b(), ez4.a());
            if (g02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            lj4 b8 = nj4.b();
            b8.a(g02.e0().h());
            b8.b(g02.f0().d0());
            b8.c(g(ri4Var.d()));
            nj4 d8 = b8.d();
            fj4 d9 = gj4.d();
            d9.a(d8);
            d9.b(kw4.a(g02.e0().w(), w84Var));
            d9.c(ri4Var.f());
            return d9.d();
        } catch (e05 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static uo4 f(mj4 mj4Var) {
        if (mj4.f12278b.equals(mj4Var)) {
            return uo4.TINK;
        }
        if (mj4.f12279c.equals(mj4Var)) {
            return uo4.CRUNCHY;
        }
        if (mj4.f12281e.equals(mj4Var)) {
            return uo4.RAW;
        }
        if (mj4.f12280d.equals(mj4Var)) {
            return uo4.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(mj4Var)));
    }

    private static mj4 g(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return mj4.f12278b;
        }
        if (ordinal == 2) {
            return mj4.f12280d;
        }
        if (ordinal == 3) {
            return mj4.f12281e;
        }
        if (ordinal == 4) {
            return mj4.f12279c;
        }
        int a8 = uo4Var.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(a8);
        throw new GeneralSecurityException(sb.toString());
    }

    private static tl4 h(nj4 nj4Var) {
        sl4 e02 = tl4.e0();
        e02.E(nj4Var.d());
        return (tl4) e02.A();
    }
}
