package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class iu4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f10204a;

    /* renamed from: b, reason: collision with root package name */
    private static final hw4 f10205b;

    /* renamed from: c, reason: collision with root package name */
    private static final di4 f10206c;

    /* renamed from: d, reason: collision with root package name */
    private static final ai4 f10207d;

    /* renamed from: e, reason: collision with root package name */
    private static final wg4 f10208e;

    /* renamed from: f, reason: collision with root package name */
    private static final sg4 f10209f;

    /* renamed from: g, reason: collision with root package name */
    private static final wg4 f10210g;

    /* renamed from: h, reason: collision with root package name */
    private static final sg4 f10211h;

    /* renamed from: i, reason: collision with root package name */
    private static final ig4 f10212i;

    /* renamed from: j, reason: collision with root package name */
    private static final ig4 f10213j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10214k = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        f10204a = a8;
        hw4 a9 = ej4.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f10205b = a9;
        f10206c = di4.d(hu4.f9701a, ks4.class, si4.class);
        f10207d = ai4.d(bu4.f6017a, a8, si4.class);
        f10208e = wg4.d(cu4.f6640a, os4.class, ri4.class);
        f10209f = sg4.d(du4.f7312a, a9, ri4.class);
        f10210g = wg4.d(eu4.f7829a, ms4.class, ri4.class);
        f10211h = sg4.d(fu4.f8503a, a8, ri4.class);
        hg4 a10 = ig4.a();
        a10.a(uo4.RAW, js4.f10743e);
        a10.a(uo4.TINK, js4.f10740b);
        a10.a(uo4.CRUNCHY, js4.f10741c);
        a10.a(uo4.LEGACY, js4.f10742d);
        f10212i = a10.b();
        hg4 a11 = ig4.a();
        a11.a(on4.SHA256, is4.f10178b);
        a11.a(on4.SHA384, is4.f10179c);
        a11.a(on4.SHA512, is4.f10180d);
        f10213j = a11.b();
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f10206c);
        wh4Var.e(f10207d);
        wh4Var.b(f10208e);
        wh4Var.c(f10209f);
        wh4Var.b(f10210g);
        wh4Var.c(f10211h);
    }

    static /* synthetic */ si4 b(ks4 ks4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        gp4 h03 = hp4.h0();
        h03.E(h(ks4Var));
        h03.F(ks4Var.c());
        byte[] a8 = uf4.a(ks4Var.d());
        qy4 qy4Var = qy4.f14669r;
        h03.G(qy4.s(a8, 0, a8.length));
        h02.F(((hp4) h03.A()).d());
        h02.G((uo4) f10212i.b(ks4Var.e()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ ks4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            hp4 g02 = hp4.g0(si4Var.c().e0(), ez4.a());
            hs4 b8 = ks4.b();
            ig4 ig4Var = f10213j;
            b8.d((is4) ig4Var.c(g02.d0().d0()));
            b8.e((is4) ig4Var.c(g02.d0().e0()));
            b8.b(new BigInteger(1, g02.f0().w()));
            b8.a(g02.e0());
            b8.f(g02.d0().f0());
            b8.c((js4) f10212i.c(si4Var.c().f0()));
            return b8.g();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e8);
        }
    }

    static /* synthetic */ os4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(ri4Var.g())));
        }
        try {
            np4 h02 = np4.h0(ri4Var.b(), ez4.a());
            if (h02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, h02.f0().w());
            int bitLength = bigInteger.bitLength();
            hs4 b8 = ks4.b();
            ig4 ig4Var = f10213j;
            b8.d((is4) ig4Var.c(h02.e0().d0()));
            b8.e((is4) ig4Var.c(h02.e0().e0()));
            b8.b(new BigInteger(1, h02.g0().w()));
            b8.a(bitLength);
            b8.f(h02.e0().f0());
            b8.c((js4) f10212i.c(ri4Var.d()));
            ks4 g8 = b8.g();
            ns4 d8 = os4.d();
            d8.a(g8);
            d8.b(bigInteger);
            d8.c(ri4Var.f());
            return d8.d();
        } catch (e05 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    static /* synthetic */ ri4 f(ms4 ms4Var, w84 w84Var) {
        kp4 m02 = lp4.m0();
        m02.E(0);
        m02.F(i(ms4Var.e()));
        byte[] a8 = uf4.a(ms4Var.h().b(w84Var));
        qy4 qy4Var = qy4.f14669r;
        m02.G(qy4.s(a8, 0, a8.length));
        byte[] a9 = uf4.a(ms4Var.f().b(w84Var));
        m02.H(qy4.s(a9, 0, a9.length));
        byte[] a10 = uf4.a(ms4Var.g().b(w84Var));
        m02.I(qy4.s(a10, 0, a10.length));
        byte[] a11 = uf4.a(ms4Var.i().b(w84Var));
        m02.J(qy4.s(a11, 0, a11.length));
        byte[] a12 = uf4.a(ms4Var.j().b(w84Var));
        m02.K(qy4.s(a12, 0, a12.length));
        byte[] a13 = uf4.a(ms4Var.k().b(w84Var));
        m02.L(qy4.s(a13, 0, a13.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((lp4) m02.A()).d(), wn4.ASYMMETRIC_PRIVATE, (uo4) f10212i.b(ms4Var.d().e()), ms4Var.e().b());
    }

    static /* synthetic */ ms4 g(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ri4Var.g())));
        }
        try {
            lp4 l02 = lp4.l0(ri4Var.b(), ez4.a());
            if (l02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            np4 e02 = l02.e0();
            if (e02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, e02.f0().w());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, e02.g0().w());
            hs4 b8 = ks4.b();
            ig4 ig4Var = f10213j;
            b8.d((is4) ig4Var.c(e02.e0().d0()));
            b8.e((is4) ig4Var.c(e02.e0().e0()));
            b8.b(bigInteger2);
            b8.a(bitLength);
            b8.f(e02.e0().f0());
            b8.c((js4) f10212i.c(ri4Var.d()));
            ks4 g8 = b8.g();
            ns4 d8 = os4.d();
            d8.a(g8);
            d8.b(bigInteger);
            d8.c(ri4Var.f());
            os4 d9 = d8.d();
            ls4 c8 = ms4.c();
            c8.a(d9);
            c8.b(j(l02.g0(), w84Var), j(l02.h0(), w84Var));
            c8.c(j(l02.f0(), w84Var));
            c8.d(j(l02.i0(), w84Var), j(l02.j0(), w84Var));
            c8.e(j(l02.k0(), w84Var));
            return c8.f();
        } catch (e05 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static jp4 h(ks4 ks4Var) {
        ip4 g02 = jp4.g0();
        ig4 ig4Var = f10213j;
        g02.E((on4) ig4Var.b(ks4Var.f()));
        g02.F((on4) ig4Var.b(ks4Var.g()));
        g02.G(ks4Var.h());
        return (jp4) g02.A();
    }

    private static np4 i(os4 os4Var) {
        mp4 i02 = np4.i0();
        i02.F(h(os4Var.f()));
        byte[] a8 = uf4.a(os4Var.e());
        qy4 qy4Var = qy4.f14669r;
        i02.G(qy4.s(a8, 0, a8.length));
        byte[] a9 = uf4.a(os4Var.f().d());
        i02.H(qy4.s(a9, 0, a9.length));
        i02.E(0);
        return (np4) i02.A();
    }

    private static jw4 j(qy4 qy4Var, w84 w84Var) {
        return jw4.a(new BigInteger(1, qy4Var.w()), w84Var);
    }
}
