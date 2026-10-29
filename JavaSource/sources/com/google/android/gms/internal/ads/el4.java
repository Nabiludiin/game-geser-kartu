package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class el4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f7689a;

    /* renamed from: b, reason: collision with root package name */
    private static final ig4 f7690b;

    /* renamed from: c, reason: collision with root package name */
    private static final ig4 f7691c;

    /* renamed from: d, reason: collision with root package name */
    private static final di4 f7692d;

    /* renamed from: e, reason: collision with root package name */
    private static final ai4 f7693e;

    /* renamed from: f, reason: collision with root package name */
    private static final wg4 f7694f;

    /* renamed from: g, reason: collision with root package name */
    private static final sg4 f7695g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f7696h = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.HmacKey");
        f7689a = a8;
        hg4 a9 = ig4.a();
        a9.a(uo4.RAW, bk4.f5843e);
        a9.a(uo4.TINK, bk4.f5840b);
        a9.a(uo4.LEGACY, bk4.f5842d);
        a9.a(uo4.CRUNCHY, bk4.f5841c);
        f7690b = a9.b();
        hg4 a10 = ig4.a();
        a10.a(on4.SHA1, ak4.f5019b);
        a10.a(on4.SHA224, ak4.f5020c);
        a10.a(on4.SHA256, ak4.f5021d);
        a10.a(on4.SHA384, ak4.f5022e);
        a10.a(on4.SHA512, ak4.f5023f);
        f7691c = a10.b();
        f7692d = di4.d(dl4.f7157a, ck4.class, si4.class);
        f7693e = ai4.d(al4.f5033a, a8, si4.class);
        f7694f = wg4.d(bl4.f5856a, sj4.class, ri4.class);
        f7695g = sg4.d(cl4.f6494a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f7692d);
        wh4Var.e(f7693e);
        wh4Var.b(f7694f);
        wh4Var.c(f7695g);
    }

    static /* synthetic */ si4 b(ck4 ck4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.HmacKey");
        rn4 h03 = sn4.h0();
        h03.E(f(ck4Var));
        h03.F(ck4Var.c());
        h02.F(((sn4) h03.A()).d());
        h02.G((uo4) f7690b.b(ck4Var.f()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ ck4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            sn4 g02 = sn4.g0(si4Var.c().e0(), ez4.a());
            if (g02.f0() != 0) {
                int f02 = g02.f0();
                StringBuilder sb = new StringBuilder(String.valueOf(f02).length() + 47);
                sb.append("Parsing HmacParameters failed: unknown Version ");
                sb.append(f02);
                throw new GeneralSecurityException(sb.toString());
            }
            zj4 b8 = ck4.b();
            b8.a(g02.e0());
            b8.b(g02.d0().e0());
            b8.d((ak4) f7691c.c(g02.d0().d0()));
            b8.c((bk4) f7690b.c(si4Var.c().f0()));
            return b8.e();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(sj4 sj4Var, w84 w84Var) {
        pn4 h02 = qn4.h0();
        h02.E(f(sj4Var.f()));
        byte[] c8 = sj4Var.e().c(w84Var);
        h02.F(qy4.s(c8, 0, c8.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.HmacKey", ((qn4) h02.A()).d(), wn4.SYMMETRIC, (uo4) f7690b.b(sj4Var.f().f()), sj4Var.b());
    }

    static /* synthetic */ sj4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            qn4 g02 = qn4.g0(ri4Var.b(), ez4.a());
            if (g02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zj4 b8 = ck4.b();
            b8.a(g02.f0().h());
            b8.b(g02.e0().e0());
            b8.d((ak4) f7691c.c(g02.e0().d0()));
            b8.c((bk4) f7690b.c(ri4Var.d()));
            ck4 e8 = b8.e();
            rj4 d8 = sj4.d();
            d8.a(e8);
            d8.b(kw4.a(g02.f0().w(), w84Var));
            d8.c(ri4Var.f());
            return d8.d();
        } catch (e05 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static un4 f(ck4 ck4Var) {
        tn4 f02 = un4.f0();
        f02.F(ck4Var.d());
        f02.E((on4) f7691c.b(ck4Var.g()));
        return (un4) f02.A();
    }
}
