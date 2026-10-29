package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class ke4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f10995a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f10996b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f10997c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f10998d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f10999e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11000f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f10995a = a8;
        f10996b = di4.d(je4.f10528a, gb4.class, si4.class);
        f10997c = ai4.d(ge4.f8865a, a8, si4.class);
        f10998d = wg4.d(he4.f9478a, bb4.class, ri4.class);
        f10999e = sg4.d(ie4.f10021a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f10996b);
        wh4Var.e(f10997c);
        wh4Var.b(f10998d);
        wh4Var.c(f10999e);
    }

    static /* synthetic */ si4 b(gb4 gb4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        h02.F(wm4.e0().d());
        h02.G(f(gb4Var.c()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ gb4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            wm4.d0(si4Var.c().e0(), ez4.a());
            return gb4.b(g(si4Var.c().f0()));
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(bb4 bb4Var, w84 w84Var) {
        tm4 g02 = um4.g0();
        byte[] c8 = bb4Var.e().c(w84Var);
        g02.E(qy4.s(c8, 0, c8.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((um4) g02.A()).d(), wn4.SYMMETRIC, f(bb4Var.f().c()), bb4Var.b());
    }

    static /* synthetic */ bb4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            um4 f02 = um4.f0(ri4Var.b(), ez4.a());
            if (f02.d0() == 0) {
                return bb4.d(g(ri4Var.d()), kw4.a(f02.e0().w(), w84Var), ri4Var.f());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (e05 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static uo4 f(fb4 fb4Var) {
        if (fb4.f8124b.equals(fb4Var)) {
            return uo4.TINK;
        }
        if (fb4.f8125c.equals(fb4Var)) {
            return uo4.CRUNCHY;
        }
        if (fb4.f8126d.equals(fb4Var)) {
            return uo4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(fb4Var.toString()));
    }

    private static fb4 g(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return fb4.f8124b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return fb4.f8126d;
            }
            if (ordinal != 4) {
                int a8 = uo4Var.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(a8);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return fb4.f8125c;
    }
}
