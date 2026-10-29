package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: MyApplication */
public abstract class af4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f4916a;

    /* renamed from: b, reason: collision with root package name */
    private static final di4 f4917b;

    /* renamed from: c, reason: collision with root package name */
    private static final ai4 f4918c;

    /* renamed from: d, reason: collision with root package name */
    private static final wg4 f4919d;

    /* renamed from: e, reason: collision with root package name */
    private static final sg4 f4920e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4921f = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f4916a = a8;
        f4917b = di4.d(ze4.f20156a, xc4.class, si4.class);
        f4918c = ai4.d(we4.f18234a, a8, si4.class);
        f4919d = wg4.d(xe4.f18790a, sc4.class, ri4.class);
        f4920e = sg4.d(ye4.f19536a, a8, ri4.class);
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f4917b);
        wh4Var.e(f4918c);
        wh4Var.b(f4919d);
        wh4Var.c(f4920e);
    }

    static /* synthetic */ si4 b(xc4 xc4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        qp4 g02 = rp4.g0();
        sp4 e02 = tp4.e0();
        e02.E(xc4Var.d());
        g02.E((tp4) e02.A());
        h02.F(((rp4) g02.A()).d());
        h02.G(f(xc4Var.c()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ xc4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            rp4 f02 = rp4.f0(si4Var.c().e0(), ez4.a());
            if (f02.d0() == 0) {
                return xc4.b(g(si4Var.c().f0()), f02.e0().d0());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e8);
        }
    }

    static /* synthetic */ ri4 d(sc4 sc4Var, w84 w84Var) {
        op4 h02 = pp4.h0();
        byte[] c8 = sc4Var.e().c(w84Var);
        h02.F(qy4.s(c8, 0, c8.length));
        sp4 e02 = tp4.e0();
        e02.E(sc4Var.f().d());
        h02.E((tp4) e02.A());
        return ri4.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((pp4) h02.A()).d(), wn4.SYMMETRIC, f(sc4Var.f().c()), sc4Var.b());
    }

    static /* synthetic */ sc4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            pp4 g02 = pp4.g0(ri4Var.b(), ez4.a());
            if (g02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (g02.f0().h() == 32) {
                return sc4.d(xc4.b(g(ri4Var.d()), g02.e0().d0()), kw4.a(g02.f0().w(), w84Var), ri4Var.f());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (e05 unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static uo4 f(wc4 wc4Var) {
        if (Objects.equals(wc4Var, wc4.f18198b)) {
            return uo4.TINK;
        }
        if (Objects.equals(wc4Var, wc4.f18199c)) {
            return uo4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(wc4Var.toString()));
    }

    private static wc4 g(uo4 uo4Var) {
        int ordinal = uo4Var.ordinal();
        if (ordinal == 1) {
            return wc4.f18198b;
        }
        if (ordinal == 3) {
            return wc4.f18199c;
        }
        int a8 = uo4Var.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(a8);
        throw new GeneralSecurityException(sb.toString());
    }
}
