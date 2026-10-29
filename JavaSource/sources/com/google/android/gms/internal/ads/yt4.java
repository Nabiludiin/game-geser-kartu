package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class yt4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f19778a;

    /* renamed from: b, reason: collision with root package name */
    private static final hw4 f19779b;

    /* renamed from: c, reason: collision with root package name */
    private static final di4 f19780c;

    /* renamed from: d, reason: collision with root package name */
    private static final ai4 f19781d;

    /* renamed from: e, reason: collision with root package name */
    private static final wg4 f19782e;

    /* renamed from: f, reason: collision with root package name */
    private static final sg4 f19783f;

    /* renamed from: g, reason: collision with root package name */
    private static final wg4 f19784g;

    /* renamed from: h, reason: collision with root package name */
    private static final sg4 f19785h;

    /* renamed from: i, reason: collision with root package name */
    private static final ig4 f19786i;

    /* renamed from: j, reason: collision with root package name */
    private static final ig4 f19787j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f19788k = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        f19778a = a8;
        hw4 a9 = ej4.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f19779b = a9;
        f19780c = di4.d(xt4.f19027a, xr4.class, si4.class);
        f19781d = ai4.d(st4.f15819a, a8, si4.class);
        f19782e = wg4.d(tt4.f16362a, bs4.class, ri4.class);
        f19783f = sg4.d(ut4.f16985a, a9, ri4.class);
        f19784g = wg4.d(vt4.f17765a, zr4.class, ri4.class);
        f19785h = sg4.d(wt4.f18422a, a8, ri4.class);
        hg4 a10 = ig4.a();
        a10.a(uo4.RAW, wr4.f18395e);
        a10.a(uo4.TINK, wr4.f18392b);
        a10.a(uo4.CRUNCHY, wr4.f18393c);
        a10.a(uo4.LEGACY, wr4.f18394d);
        f19786i = a10.b();
        hg4 a11 = ig4.a();
        a11.a(on4.SHA256, vr4.f17734b);
        a11.a(on4.SHA384, vr4.f17735c);
        a11.a(on4.SHA512, vr4.f17736d);
        f19787j = a11.b();
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f19780c);
        wh4Var.e(f19781d);
        wh4Var.b(f19782e);
        wh4Var.c(f19783f);
        wh4Var.b(f19784g);
        wh4Var.c(f19785h);
    }

    static /* synthetic */ si4 b(xr4 xr4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        xo4 h03 = yo4.h0();
        h03.E(h(xr4Var));
        h03.F(xr4Var.c());
        byte[] a8 = uf4.a(xr4Var.d());
        qy4 qy4Var = qy4.f14669r;
        h03.G(qy4.s(a8, 0, a8.length));
        h02.F(((yo4) h03.A()).d());
        h02.G((uo4) f19786i.b(xr4Var.e()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ xr4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            yo4 g02 = yo4.g0(si4Var.c().e0(), ez4.a());
            ur4 b8 = xr4.b();
            b8.d((vr4) f19787j.c(g02.d0().d0()));
            b8.b(new BigInteger(1, g02.f0().w()));
            b8.a(g02.e0());
            b8.c((wr4) f19786i.c(si4Var.c().f0()));
            return b8.e();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e8);
        }
    }

    static /* synthetic */ bs4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(ri4Var.g())));
        }
        try {
            fp4 h02 = fp4.h0(ri4Var.b(), ez4.a());
            if (h02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, h02.f0().w());
            int bitLength = bigInteger.bitLength();
            ur4 b8 = xr4.b();
            b8.d((vr4) f19787j.c(h02.e0().d0()));
            b8.b(new BigInteger(1, h02.g0().w()));
            b8.a(bitLength);
            b8.c((wr4) f19786i.c(ri4Var.d()));
            xr4 e8 = b8.e();
            as4 d8 = bs4.d();
            d8.a(e8);
            d8.b(bigInteger);
            d8.c(ri4Var.f());
            return d8.d();
        } catch (e05 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    static /* synthetic */ ri4 f(zr4 zr4Var, w84 w84Var) {
        cp4 m02 = dp4.m0();
        m02.E(0);
        m02.F(i(zr4Var.e()));
        byte[] a8 = uf4.a(zr4Var.h().b(w84Var));
        qy4 qy4Var = qy4.f14669r;
        m02.G(qy4.s(a8, 0, a8.length));
        byte[] a9 = uf4.a(zr4Var.f().b(w84Var));
        m02.H(qy4.s(a9, 0, a9.length));
        byte[] a10 = uf4.a(zr4Var.g().b(w84Var));
        m02.I(qy4.s(a10, 0, a10.length));
        byte[] a11 = uf4.a(zr4Var.i().b(w84Var));
        m02.J(qy4.s(a11, 0, a11.length));
        byte[] a12 = uf4.a(zr4Var.j().b(w84Var));
        m02.K(qy4.s(a12, 0, a12.length));
        byte[] a13 = uf4.a(zr4Var.k().b(w84Var));
        m02.L(qy4.s(a13, 0, a13.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((dp4) m02.A()).d(), wn4.ASYMMETRIC_PRIVATE, (uo4) f19786i.b(zr4Var.d().e()), zr4Var.e().b());
    }

    static /* synthetic */ zr4 g(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ri4Var.g())));
        }
        try {
            dp4 l02 = dp4.l0(ri4Var.b(), ez4.a());
            if (l02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            fp4 e02 = l02.e0();
            if (e02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, e02.f0().w());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, e02.g0().w());
            ur4 b8 = xr4.b();
            b8.d((vr4) f19787j.c(e02.e0().d0()));
            b8.b(bigInteger2);
            b8.a(bitLength);
            b8.c((wr4) f19786i.c(ri4Var.d()));
            xr4 e8 = b8.e();
            as4 d8 = bs4.d();
            d8.a(e8);
            d8.b(bigInteger);
            d8.c(ri4Var.f());
            bs4 d9 = d8.d();
            yr4 c8 = zr4.c();
            c8.a(d9);
            c8.b(j(l02.g0(), w84Var), j(l02.h0(), w84Var));
            c8.c(j(l02.f0(), w84Var));
            c8.d(j(l02.i0(), w84Var), j(l02.j0(), w84Var));
            c8.e(j(l02.k0(), w84Var));
            return c8.f();
        } catch (e05 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static ap4 h(xr4 xr4Var) {
        zo4 e02 = ap4.e0();
        e02.E((on4) f19787j.b(xr4Var.f()));
        return (ap4) e02.A();
    }

    private static fp4 i(bs4 bs4Var) {
        ep4 i02 = fp4.i0();
        i02.E(h(bs4Var.f()));
        byte[] a8 = uf4.a(bs4Var.e());
        qy4 qy4Var = qy4.f14669r;
        i02.F(qy4.s(a8, 0, a8.length));
        byte[] a9 = uf4.a(bs4Var.f().d());
        i02.G(qy4.s(a9, 0, a9.length));
        return (fp4) i02.A();
    }

    private static jw4 j(qy4 qy4Var, w84 w84Var) {
        return jw4.a(new BigInteger(1, qy4Var.w()), w84Var);
    }
}
