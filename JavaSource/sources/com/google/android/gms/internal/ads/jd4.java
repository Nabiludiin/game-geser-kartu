package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class jd4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f10509a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f10510b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f10511c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f10512d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f10513e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f10514f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f10509a = a8;
        f10510b = di4.d(id4.f10005a, z94.class, si4.class);
        f10511c = ai4.d(fd4.f8202a, a8, si4.class);
        f10512d = wg4.d(gd4.f8814a, r94.class, ri4.class);
        f10513e = sg4.d(hd4.f9451a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f10510b);
        wh4Var.e(f10511c);
        wh4Var.b(f10512d);
        wh4Var.c(f10513e);
    }

    static /* synthetic */ si4 b(z94 z94Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        wl4 g02 = xl4.g0();
        bm4 f02 = cm4.f0();
        dm4 e02 = em4.e0();
        e02.E(z94Var.f());
        f02.E((em4) e02.A());
        f02.F(z94Var.c());
        g02.E((cm4) f02.A());
        rn4 h03 = sn4.h0();
        h03.E(i(z94Var));
        h03.F(z94Var.d());
        g02.F((sn4) h03.A());
        h02.F(((xl4) g02.A()).d());
        h02.G(f(z94Var.g()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ z94 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            xl4 f02 = xl4.f0(si4Var.c().e0(), ez4.a());
            if (f02.e0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            w94 b8 = z94.b();
            b8.a(f02.d0().e0());
            b8.b(f02.e0().e0());
            b8.c(f02.d0().d0().d0());
            b8.d(f02.e0().d0().e0());
            b8.f(h(f02.e0().d0().d0()));
            b8.e(g(si4Var.c().f0()));
            return b8.g();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(r94 r94Var, w84 w84Var) {
        ul4 h02 = vl4.h0();
        zl4 g02 = am4.g0();
        dm4 e02 = em4.e0();
        e02.E(r94Var.g().f());
        g02.E((em4) e02.A());
        byte[] c8 = r94Var.e().c(w84Var);
        g02.F(qy4.s(c8, 0, c8.length));
        h02.E((am4) g02.A());
        pn4 h03 = qn4.h0();
        h03.E(i(r94Var.g()));
        byte[] c9 = r94Var.f().c(w84Var);
        h03.F(qy4.s(c9, 0, c9.length));
        h02.F((qn4) h03.A());
        return ri4.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((vl4) h02.A()).d(), wn4.SYMMETRIC, f(r94Var.g().g()), r94Var.b());
    }

    static /* synthetic */ r94 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            vl4 g02 = vl4.g0(ri4Var.b(), ez4.a());
            if (g02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (g02.e0().d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (g02.f0().d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            w94 b8 = z94.b();
            b8.a(g02.e0().f0().h());
            b8.b(g02.f0().f0().h());
            b8.c(g02.e0().e0().d0());
            b8.d(g02.f0().e0().e0());
            b8.f(h(g02.f0().e0().d0()));
            b8.e(g(ri4Var.d()));
            z94 g8 = b8.g();
            q94 d8 = r94.d();
            d8.a(g8);
            d8.b(kw4.a(g02.e0().f0().w(), w84Var));
            d8.c(kw4.a(g02.f0().f0().w(), w84Var));
            d8.d(ri4Var.f());
            return d8.e();
        } catch (e05 unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static uo4 f(y94 y94Var) {
        if (y94.f19430b.equals(y94Var)) {
            return uo4.TINK;
        }
        if (y94.f19431c.equals(y94Var)) {
            return uo4.CRUNCHY;
        }
        if (y94.f19432d.equals(y94Var)) {
            return uo4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(y94Var)));
    }

    private static y94 g(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return y94.f19430b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return y94.f19432d;
            }
            if (ordinal != 4) {
                int a8 = uo4Var.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(a8);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return y94.f19431c;
    }

    private static x94 h(on4 on4Var) {
        int ordinal = on4Var.ordinal();
        if (ordinal == 1) {
            return x94.f18677b;
        }
        if (ordinal == 2) {
            return x94.f18680e;
        }
        if (ordinal == 3) {
            return x94.f18679d;
        }
        if (ordinal == 4) {
            return x94.f18681f;
        }
        if (ordinal == 5) {
            return x94.f18678c;
        }
        int a8 = on4Var.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(a8);
        throw new GeneralSecurityException(sb.toString());
    }

    private static un4 i(z94 z94Var) {
        on4 on4Var;
        tn4 f02 = un4.f0();
        f02.F(z94Var.e());
        x94 h8 = z94Var.h();
        if (x94.f18677b.equals(h8)) {
            on4Var = on4.SHA1;
        } else if (x94.f18678c.equals(h8)) {
            on4Var = on4.SHA224;
        } else if (x94.f18679d.equals(h8)) {
            on4Var = on4.SHA256;
        } else if (x94.f18680e.equals(h8)) {
            on4Var = on4.SHA384;
        } else {
            if (!x94.f18681f.equals(h8)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(h8)));
            }
            on4Var = on4.SHA512;
        }
        f02.E(on4Var);
        return (un4) f02.A();
    }
}
