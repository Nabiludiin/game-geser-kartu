package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class fc4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f8177a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f8178b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f8179c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f8180d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f8181e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8182f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f8177a = a8;
        f8178b = di4.d(ec4.f7551a, ac4.class, si4.class);
        f8179c = ai4.d(bc4.f5713a, a8, si4.class);
        f8180d = wg4.d(cc4.f6369a, wb4.class, ri4.class);
        f8181e = sg4.d(dc4.f7056a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f8178b);
        wh4Var.e(f8179c);
        wh4Var.b(f8180d);
        wh4Var.c(f8181e);
    }

    static /* synthetic */ si4 b(ac4 ac4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        h02.F(g(ac4Var).d());
        h02.G(f(ac4Var.c()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ ac4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            return h(to4.f0(si4Var.c().e0(), ez4.a()), si4Var.c().f0());
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(wb4 wb4Var, w84 w84Var) {
        qo4 g02 = ro4.g0();
        g02.E(g(wb4Var.e()));
        return ri4.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((ro4) g02.A()).d(), wn4.REMOTE, f(wb4Var.e().c()), wb4Var.b());
    }

    static /* synthetic */ wb4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            ro4 f02 = ro4.f0(ri4Var.b(), ez4.a());
            if (f02.d0() == 0) {
                return wb4.d(h(f02.e0(), ri4Var.d()), ri4Var.f());
            }
            String valueOf = String.valueOf(f02);
            StringBuilder sb = new StringBuilder(valueOf.length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e8);
        }
    }

    private static uo4 f(zb4 zb4Var) {
        if (zb4.f20117b.equals(zb4Var)) {
            return uo4.TINK;
        }
        if (zb4.f20118c.equals(zb4Var)) {
            return uo4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zb4Var)));
    }

    private static to4 g(ac4 ac4Var) {
        try {
            bo4 g02 = bo4.g0(y84.a(ac4Var.d()), ez4.a());
            so4 g03 = to4.g0();
            g03.E(ac4Var.b());
            g03.F(g02);
            return (to4) g03.A();
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
        }
    }

    private static ac4 h(to4 to4Var, uo4 uo4Var) {
        yb4 yb4Var;
        zb4 zb4Var;
        zn4 h02 = bo4.h0();
        h02.E(to4Var.e0().d0());
        h02.F(to4Var.e0().e0());
        h02.G(uo4.RAW);
        s84 b8 = y84.b(((bo4) h02.A()).e());
        if (b8 instanceof ra4) {
            yb4Var = yb4.f19468b;
        } else if (b8 instanceof gb4) {
            yb4Var = yb4.f19470d;
        } else if (b8 instanceof ed4) {
            yb4Var = yb4.f19469c;
        } else if (b8 instanceof z94) {
            yb4Var = yb4.f19471e;
        } else if (b8 instanceof ha4) {
            yb4Var = yb4.f19472f;
        } else {
            if (!(b8 instanceof ab4)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(b8.toString()));
            }
            yb4Var = yb4.f19473g;
        }
        xb4 xb4Var = new xb4(null);
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            zb4Var = zb4.f20117b;
        } else {
            if (ordinal != 3) {
                int a8 = uo4Var.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(a8);
                throw new GeneralSecurityException(sb.toString());
            }
            zb4Var = zb4.f20118c;
        }
        xb4Var.a(zb4Var);
        xb4Var.b(to4Var.d0());
        xb4Var.d((l94) b8);
        xb4Var.c(yb4Var);
        return xb4Var.e();
    }
}
