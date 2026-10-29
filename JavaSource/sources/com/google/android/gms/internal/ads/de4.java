package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class de4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f7082a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f7083b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f7084c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f7085d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f7086e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7087f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f7082a = a8;
        f7083b = di4.d(ce4.f6401a, ab4.class, si4.class);
        f7084c = ai4.d(zd4.f20150a, a8, si4.class);
        f7085d = wg4.d(ae4.f4902a, ta4.class, ri4.class);
        f7086e = sg4.d(be4.f5737a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f7083b);
        wh4Var.e(f7084c);
        wh4Var.b(f7085d);
        wh4Var.c(f7086e);
    }

    static /* synthetic */ si4 b(ab4 ab4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        rm4 g02 = sm4.g0();
        g02.E(ab4Var.c());
        h02.F(((sm4) g02.A()).d());
        h02.G(f(ab4Var.d()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ ab4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            sm4 f02 = sm4.f0(si4Var.c().e0(), ez4.a());
            if (f02.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            ya4 b8 = ab4.b();
            b8.a(f02.d0());
            b8.b(g(si4Var.c().f0()));
            return b8.c();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(ta4 ta4Var, w84 w84Var) {
        pm4 g02 = qm4.g0();
        byte[] c8 = ta4Var.e().c(w84Var);
        g02.E(qy4.s(c8, 0, c8.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((qm4) g02.A()).d(), wn4.SYMMETRIC, f(ta4Var.f().d()), ta4Var.b());
    }

    static /* synthetic */ ta4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            qm4 f02 = qm4.f0(ri4Var.b(), ez4.a());
            if (f02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ya4 b8 = ab4.b();
            b8.a(f02.e0().h());
            b8.b(g(ri4Var.d()));
            ab4 c8 = b8.c();
            sa4 d8 = ta4.d();
            d8.a(c8);
            d8.b(kw4.a(f02.e0().w(), w84Var));
            d8.c(ri4Var.f());
            return d8.d();
        } catch (e05 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static uo4 f(za4 za4Var) {
        if (za4.f20105b.equals(za4Var)) {
            return uo4.TINK;
        }
        if (za4.f20106c.equals(za4Var)) {
            return uo4.CRUNCHY;
        }
        if (za4.f20107d.equals(za4Var)) {
            return uo4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(za4Var)));
    }

    private static za4 g(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return za4.f20105b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return za4.f20107d;
            }
            if (ordinal != 4) {
                int a8 = uo4Var.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(a8);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return za4.f20106c;
    }
}
