package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: MyApplication */
public abstract class dt4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f7293a;

    /* renamed from: b, reason: collision with root package name */
    private static final hw4 f7294b;

    /* renamed from: c, reason: collision with root package name */
    private static final di4 f7295c;

    /* renamed from: d, reason: collision with root package name */
    private static final ai4 f7296d;

    /* renamed from: e, reason: collision with root package name */
    private static final wg4 f7297e;

    /* renamed from: f, reason: collision with root package name */
    private static final sg4 f7298f;

    /* renamed from: g, reason: collision with root package name */
    private static final wg4 f7299g;

    /* renamed from: h, reason: collision with root package name */
    private static final sg4 f7300h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f7301i = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        f7293a = a8;
        hw4 a9 = ej4.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f7294b = a9;
        f7295c = di4.d(ct4.f6629a, eq4.class, si4.class);
        f7296d = ai4.d(xs4.f19015a, a8, si4.class);
        f7297e = wg4.d(ys4.f19767a, iq4.class, ri4.class);
        f7298f = sg4.d(zs4.f20335a, a9, ri4.class);
        f7299g = wg4.d(at4.f5284a, gq4.class, ri4.class);
        f7300h = sg4.d(bt4.f5997a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f7295c);
        wh4Var.e(f7296d);
        wh4Var.b(f7297e);
        wh4Var.c(f7298f);
        wh4Var.b(f7299g);
        wh4Var.c(f7300h);
    }

    static /* synthetic */ si4 b(eq4 eq4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        xm4 f02 = ym4.f0();
        f02.E(l(eq4Var));
        h02.F(((ym4) f02.A()).d());
        h02.G(h(eq4Var.f()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ eq4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            ym4 e02 = ym4.e0(si4Var.c().e0(), ez4.a());
            yp4 b8 = eq4.b();
            b8.c(i(e02.d0().d0()));
            b8.a(o(e02.d0().j0()));
            b8.b(n(e02.d0().i0()));
            b8.d(j(si4Var.c().f0()));
            return b8.e();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e8);
        }
    }

    static /* synthetic */ iq4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ri4Var.g())));
        }
        try {
            fn4 h02 = fn4.h0(ri4Var.b(), ez4.a());
            if (h02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            yp4 b8 = eq4.b();
            b8.c(i(h02.e0().d0()));
            b8.a(o(h02.e0().j0()));
            b8.b(n(h02.e0().i0()));
            b8.d(j(ri4Var.d()));
            eq4 e8 = b8.e();
            hq4 d8 = iq4.d();
            d8.a(e8);
            d8.b(new ECPoint(new BigInteger(1, h02.f0().w()), new BigInteger(1, h02.g0().w())));
            d8.c(ri4Var.f());
            return d8.d();
        } catch (e05 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    static /* synthetic */ ri4 f(gq4 gq4Var, w84 w84Var) {
        int k7 = k(gq4Var.d().d());
        cn4 h02 = dn4.h0();
        h02.E(m(gq4Var.e()));
        byte[] b8 = uf4.b(gq4Var.f().b(w84Var), k7);
        qy4 qy4Var = qy4.f14669r;
        h02.F(qy4.s(b8, 0, b8.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((dn4) h02.A()).d(), wn4.ASYMMETRIC_PRIVATE, h(gq4Var.d().f()), gq4Var.e().b());
    }

    static /* synthetic */ gq4 g(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ri4Var.g())));
        }
        try {
            dn4 g02 = dn4.g0(ri4Var.b(), ez4.a());
            if (g02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            fn4 e02 = g02.e0();
            if (e02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            yp4 b8 = eq4.b();
            b8.c(i(e02.e0().d0()));
            b8.a(o(e02.e0().j0()));
            b8.b(n(e02.e0().i0()));
            b8.d(j(ri4Var.d()));
            eq4 e8 = b8.e();
            hq4 d8 = iq4.d();
            d8.a(e8);
            d8.b(new ECPoint(new BigInteger(1, e02.f0().w()), new BigInteger(1, e02.g0().w())));
            d8.c(ri4Var.f());
            iq4 d9 = d8.d();
            fq4 c8 = gq4.c();
            c8.a(d9);
            c8.b(jw4.a(new BigInteger(1, g02.f0().w()), w84Var));
            return c8.c();
        } catch (e05 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static uo4 h(dq4 dq4Var) {
        if (dq4.f7235b.equals(dq4Var)) {
            return uo4.TINK;
        }
        if (dq4.f7236c.equals(dq4Var)) {
            return uo4.CRUNCHY;
        }
        if (dq4.f7238e.equals(dq4Var)) {
            return uo4.RAW;
        }
        if (dq4.f7237d.equals(dq4Var)) {
            return uo4.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(dq4Var.toString()));
    }

    private static aq4 i(on4 on4Var) {
        int ordinal = on4Var.ordinal();
        if (ordinal == 2) {
            return aq4.f5218c;
        }
        if (ordinal == 3) {
            return aq4.f5217b;
        }
        if (ordinal == 4) {
            return aq4.f5219d;
        }
        int a8 = on4Var.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(a8);
        throw new GeneralSecurityException(sb.toString());
    }

    private static dq4 j(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return dq4.f7235b;
        }
        if (ordinal == 2) {
            return dq4.f7237d;
        }
        if (ordinal == 3) {
            return dq4.f7238e;
        }
        if (ordinal == 4) {
            return dq4.f7236c;
        }
        int a8 = uo4Var.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(a8);
        throw new GeneralSecurityException(sb.toString());
    }

    private static int k(zp4 zp4Var) {
        if (zp4.f20273c.equals(zp4Var)) {
            return 33;
        }
        if (zp4.f20274d.equals(zp4Var)) {
            return 49;
        }
        if (zp4.f20275e.equals(zp4Var)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zp4Var.toString()));
    }

    private static bn4 l(eq4 eq4Var) {
        on4 on4Var;
        int i7;
        an4 e02 = bn4.e0();
        aq4 e8 = eq4Var.e();
        if (aq4.f5217b.equals(e8)) {
            on4Var = on4.SHA256;
        } else if (aq4.f5218c.equals(e8)) {
            on4Var = on4.SHA384;
        } else {
            if (!aq4.f5219d.equals(e8)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(e8.toString()));
            }
            on4Var = on4.SHA512;
        }
        e02.E(on4Var);
        zp4 d8 = eq4Var.d();
        int i8 = 4;
        if (zp4.f20273c.equals(d8)) {
            i7 = 4;
        } else if (zp4.f20274d.equals(d8)) {
            i7 = 5;
        } else {
            if (!zp4.f20275e.equals(d8)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(d8.toString()));
            }
            i7 = 6;
        }
        e02.F(i7);
        bq4 c8 = eq4Var.c();
        if (bq4.f5925b.equals(c8)) {
            i8 = 3;
        } else if (!bq4.f5926c.equals(c8)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(c8.toString()));
        }
        e02.G(i8);
        return (bn4) e02.A();
    }

    private static fn4 m(iq4 iq4Var) {
        int k7 = k(iq4Var.f().d());
        ECPoint e8 = iq4Var.e();
        en4 i02 = fn4.i0();
        i02.E(l(iq4Var.f()));
        byte[] b8 = uf4.b(e8.getAffineX(), k7);
        qy4 qy4Var = qy4.f14669r;
        i02.F(qy4.s(b8, 0, b8.length));
        byte[] b9 = uf4.b(e8.getAffineY(), k7);
        i02.G(qy4.s(b9, 0, b9.length));
        return (fn4) i02.A();
    }

    private static zp4 n(int i7) {
        int i8 = i7 - 2;
        if (i8 == 2) {
            return zp4.f20273c;
        }
        if (i8 == 3) {
            return zp4.f20274d;
        }
        if (i8 == 4) {
            return zp4.f20275e;
        }
        int a8 = nn4.a(i7);
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 35);
        sb.append("Unable to parse EllipticCurveType: ");
        sb.append(a8);
        throw new GeneralSecurityException(sb.toString());
    }

    private static bq4 o(int i7) {
        int i8 = i7 - 2;
        if (i8 == 1) {
            return bq4.f5925b;
        }
        if (i8 == 2) {
            return bq4.f5926c;
        }
        int a8 = gn4.a(i7);
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 40);
        sb.append("Unable to parse EcdsaSignatureEncoding: ");
        sb.append(a8);
        throw new GeneralSecurityException(sb.toString());
    }
}
