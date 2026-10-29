package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
abstract class vb4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f17532a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f17533b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f17534c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f17535d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f17536e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f17537f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f17532a = a8;
        f17533b = di4.d(ub4.f16685a, qb4.class, si4.class);
        f17534c = ai4.d(rb4.f14837a, a8, si4.class);
        f17535d = wg4.d(sb4.f15533a, ob4.class, ri4.class);
        f17536e = sg4.d(tb4.f16119a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f17533b);
        wh4Var.e(f17534c);
        wh4Var.b(f17535d);
        wh4Var.c(f17536e);
    }

    static /* synthetic */ si4 b(qb4 qb4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        oo4 f02 = po4.f0();
        f02.E(qb4Var.c());
        h02.F(((po4) f02.A()).d());
        h02.G(f(qb4Var.d()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ qb4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            return qb4.b(po4.e0(si4Var.c().e0(), ez4.a()).d0(), g(si4Var.c().f0()));
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(ob4 ob4Var, w84 w84Var) {
        mo4 g02 = no4.g0();
        oo4 f02 = po4.f0();
        f02.E(ob4Var.e().c());
        g02.E((po4) f02.A());
        return ri4.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((no4) g02.A()).d(), wn4.REMOTE, f(ob4Var.e().d()), ob4Var.b());
    }

    static /* synthetic */ ob4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            no4 f02 = no4.f0(ri4Var.b(), ez4.a());
            if (f02.d0() == 0) {
                return ob4.d(qb4.b(f02.e0().d0(), g(ri4Var.d())), ri4Var.f());
            }
            String valueOf = String.valueOf(f02);
            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e8);
        }
    }

    private static uo4 f(pb4 pb4Var) {
        if (pb4.f13791b.equals(pb4Var)) {
            return uo4.TINK;
        }
        if (pb4.f13792c.equals(pb4Var)) {
            return uo4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(pb4Var.toString()));
    }

    private static pb4 g(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return pb4.f13791b;
        }
        if (ordinal == 3) {
            return pb4.f13792c;
        }
        int a8 = uo4Var.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(a8);
        throw new GeneralSecurityException(sb.toString());
    }
}
