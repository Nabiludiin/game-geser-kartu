package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class wd4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f18218a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f18219b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f18220c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f18221d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f18222e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f18223f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f18218a = a8;
        f18219b = di4.d(vd4.f17585a, ra4.class, si4.class);
        f18220c = ai4.d(sd4.f15569a, a8, si4.class);
        f18221d = wg4.d(td4.f16147a, ja4.class, ri4.class);
        f18222e = sg4.d(ud4.f16728a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f18219b);
        wh4Var.e(f18220c);
        wh4Var.b(f18221d);
        wh4Var.c(f18222e);
    }

    static /* synthetic */ si4 b(ra4 ra4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.AesGcmKey");
        nm4 g02 = om4.g0();
        g02.E(ra4Var.c());
        h02.F(((om4) g02.A()).d());
        h02.G(f(ra4Var.d()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ ra4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            om4 f02 = om4.f0(si4Var.c().e0(), ez4.a());
            if (f02.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            pa4 b8 = ra4.b();
            b8.a(f02.d0());
            b8.b(12);
            b8.c(16);
            b8.d(g(si4Var.c().f0()));
            return b8.e();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(ja4 ja4Var, w84 w84Var) {
        lm4 g02 = mm4.g0();
        byte[] c8 = ja4Var.e().c(w84Var);
        g02.E(qy4.s(c8, 0, c8.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((mm4) g02.A()).d(), wn4.SYMMETRIC, f(ja4Var.f().d()), ja4Var.b());
    }

    static /* synthetic */ ja4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            mm4 f02 = mm4.f0(ri4Var.b(), ez4.a());
            if (f02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            pa4 b8 = ra4.b();
            b8.a(f02.e0().h());
            b8.b(12);
            b8.c(16);
            b8.d(g(ri4Var.d()));
            ra4 e8 = b8.e();
            ia4 d8 = ja4.d();
            d8.a(e8);
            d8.b(kw4.a(f02.e0().w(), w84Var));
            d8.c(ri4Var.f());
            return d8.d();
        } catch (e05 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static uo4 f(qa4 qa4Var) {
        if (qa4.f14346b.equals(qa4Var)) {
            return uo4.TINK;
        }
        if (qa4.f14347c.equals(qa4Var)) {
            return uo4.CRUNCHY;
        }
        if (qa4.f14348d.equals(qa4Var)) {
            return uo4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(qa4Var)));
    }

    private static qa4 g(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return qa4.f14346b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return qa4.f14348d;
            }
            if (ordinal != 4) {
                int a8 = uo4Var.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(a8);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return qa4.f14347c;
    }
}
