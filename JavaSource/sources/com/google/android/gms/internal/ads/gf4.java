package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class gf4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f8883a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f8884b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f8885c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f8886d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f8887e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8888f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f8883a = a8;
        f8884b = di4.d(ff4.f8229a, ed4.class, si4.class);
        f8885c = ai4.d(cf4.f6417a, a8, si4.class);
        f8886d = wg4.d(df4.f7092a, yc4.class, ri4.class);
        f8887e = sg4.d(ef4.f7600a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f8884b);
        wh4Var.e(f8885c);
        wh4Var.b(f8886d);
        wh4Var.c(f8887e);
    }

    static /* synthetic */ si4 b(ed4 ed4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        h02.F(xp4.f0().d());
        h02.G(f(ed4Var.c()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ ed4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            if (xp4.e0(si4Var.c().e0(), ez4.a()).d0() == 0) {
                return ed4.b(g(si4Var.c().f0()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(yc4 yc4Var, w84 w84Var) {
        up4 g02 = vp4.g0();
        byte[] c8 = yc4Var.e().c(w84Var);
        g02.E(qy4.s(c8, 0, c8.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((vp4) g02.A()).d(), wn4.SYMMETRIC, f(yc4Var.f().c()), yc4Var.b());
    }

    static /* synthetic */ yc4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            vp4 f02 = vp4.f0(ri4Var.b(), ez4.a());
            if (f02.d0() == 0) {
                return yc4.d(g(ri4Var.d()), kw4.a(f02.e0().w(), w84Var), ri4Var.f());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (e05 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static uo4 f(dd4 dd4Var) {
        if (dd4.f7063b.equals(dd4Var)) {
            return uo4.TINK;
        }
        if (dd4.f7064c.equals(dd4Var)) {
            return uo4.CRUNCHY;
        }
        if (dd4.f7065d.equals(dd4Var)) {
            return uo4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(dd4Var.toString()));
    }

    private static dd4 g(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return dd4.f7063b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return dd4.f7065d;
            }
            if (ordinal != 4) {
                int a8 = uo4Var.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(a8);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return dd4.f7064c;
    }
}
