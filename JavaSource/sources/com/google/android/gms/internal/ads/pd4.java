package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class pd4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f13837a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f13838b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f13839c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f13840d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f13841e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13842f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f13837a = a8;
        f13838b = di4.d(od4.f13303a, ha4.class, si4.class);
        f13839c = ai4.d(kd4.f10986a, a8, si4.class);
        f13840d = wg4.d(ld4.f11574a, ba4.class, ri4.class);
        f13841e = sg4.d(md4.f12235a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f13838b);
        wh4Var.e(f13839c);
        wh4Var.b(f13840d);
        wh4Var.c(f13841e);
    }

    static /* synthetic */ si4 b(ha4 ha4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.AesEaxKey");
        hm4 g02 = im4.g0();
        g02.E(h(ha4Var));
        g02.F(ha4Var.c());
        h02.F(((im4) g02.A()).d());
        h02.G(f(ha4Var.e()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ ha4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            im4 f02 = im4.f0(si4Var.c().e0(), ez4.a());
            fa4 b8 = ha4.b();
            b8.a(f02.e0());
            b8.b(f02.d0().d0());
            b8.c(16);
            b8.d(g(si4Var.c().f0()));
            return b8.e();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(ba4 ba4Var, w84 w84Var) {
        fm4 h02 = gm4.h0();
        h02.E(h(ba4Var.f()));
        byte[] c8 = ba4Var.e().c(w84Var);
        h02.F(qy4.s(c8, 0, c8.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((gm4) h02.A()).d(), wn4.SYMMETRIC, f(ba4Var.f().e()), ba4Var.b());
    }

    static /* synthetic */ ba4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            gm4 g02 = gm4.g0(ri4Var.b(), ez4.a());
            if (g02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            fa4 b8 = ha4.b();
            b8.a(g02.f0().h());
            b8.b(g02.e0().d0());
            b8.c(16);
            b8.d(g(ri4Var.d()));
            ha4 e8 = b8.e();
            aa4 d8 = ba4.d();
            d8.a(e8);
            d8.b(kw4.a(g02.f0().w(), w84Var));
            d8.c(ri4Var.f());
            return d8.d();
        } catch (e05 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static uo4 f(ga4 ga4Var) {
        if (ga4.f8748b.equals(ga4Var)) {
            return uo4.TINK;
        }
        if (ga4.f8749c.equals(ga4Var)) {
            return uo4.CRUNCHY;
        }
        if (ga4.f8750d.equals(ga4Var)) {
            return uo4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ga4Var)));
    }

    private static ga4 g(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return ga4.f8748b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return ga4.f8750d;
            }
            if (ordinal != 4) {
                int a8 = uo4Var.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(a8);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return ga4.f8749c;
    }

    private static km4 h(ha4 ha4Var) {
        jm4 e02 = km4.e0();
        e02.E(ha4Var.d());
        return (km4) e02.A();
    }
}
