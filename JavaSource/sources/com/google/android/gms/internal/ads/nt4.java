package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class nt4 {

    /* renamed from: a, reason: collision with root package name */
    private static final hw4 f12912a;

    /* renamed from: b, reason: collision with root package name */
    private static final hw4 f12913b;

    /* renamed from: c, reason: collision with root package name */
    private static final di4 f12914c;

    /* renamed from: d, reason: collision with root package name */
    private static final ai4 f12915d;

    /* renamed from: e, reason: collision with root package name */
    private static final wg4 f12916e;

    /* renamed from: f, reason: collision with root package name */
    private static final sg4 f12917f;

    /* renamed from: g, reason: collision with root package name */
    private static final wg4 f12918g;

    /* renamed from: h, reason: collision with root package name */
    private static final sg4 f12919h;

    /* renamed from: i, reason: collision with root package name */
    private static final ig4 f12920i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f12921j = 0;

    static {
        hw4 a8 = ej4.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        f12912a = a8;
        hw4 a9 = ej4.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f12913b = a9;
        f12914c = di4.d(mt4.f12417a, oq4.class, si4.class);
        f12915d = ai4.d(ht4.f9691a, a8, si4.class);
        f12916e = wg4.d(it4.f10185a, vq4.class, ri4.class);
        f12917f = sg4.d(jt4.f10761a, a9, ri4.class);
        f12918g = wg4.d(kt4.f11239a, pq4.class, ri4.class);
        f12919h = sg4.d(lt4.f11795a, a8, ri4.class);
        hg4 a10 = ig4.a();
        a10.a(uo4.RAW, nq4.f12849e);
        a10.a(uo4.TINK, nq4.f12846b);
        a10.a(uo4.CRUNCHY, nq4.f12847c);
        a10.a(uo4.LEGACY, nq4.f12848d);
        f12920i = a10.b();
    }

    public static void a(wh4 wh4Var) {
        wh4Var.d(f12914c);
        wh4Var.e(f12915d);
        wh4Var.b(f12916e);
        wh4Var.c(f12917f);
        wh4Var.b(f12918g);
        wh4Var.c(f12919h);
    }

    static /* synthetic */ si4 b(oq4 oq4Var) {
        zn4 h02 = bo4.h0();
        h02.E("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        h02.F(in4.f0().d());
        h02.G((uo4) f12920i.b(oq4Var.c()));
        return si4.a((bo4) h02.A());
    }

    static /* synthetic */ oq4 c(si4 si4Var) {
        if (!si4Var.c().d0().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(si4Var.c().d0())));
        }
        try {
            if (in4.e0(si4Var.c().e0(), ez4.a()).d0() == 0) {
                return oq4.b((nq4) f12920i.c(si4Var.c().f0()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (e05 e8) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e8);
        }
    }

    static /* synthetic */ vq4 e(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(ri4Var.g())));
        }
        try {
            mn4 f02 = mn4.f0(ri4Var.b(), ez4.a());
            if (f02.d0() == 0) {
                return vq4.d((nq4) f12920i.c(ri4Var.d()), hw4.a(f02.e0().w()), ri4Var.f());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (e05 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    static /* synthetic */ ri4 f(pq4 pq4Var, w84 w84Var) {
        jn4 h02 = kn4.h0();
        h02.F(h(pq4Var.e()));
        byte[] c8 = pq4Var.f().c(w84Var);
        h02.E(qy4.s(c8, 0, c8.length));
        return ri4.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((kn4) h02.A()).d(), wn4.ASYMMETRIC_PRIVATE, (uo4) f12920i.b(pq4Var.d().c()), pq4Var.e().b());
    }

    static /* synthetic */ pq4 g(ri4 ri4Var, w84 w84Var) {
        if (!ri4Var.g().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ri4Var.g())));
        }
        try {
            kn4 g02 = kn4.g0(ri4Var.b(), ez4.a());
            if (g02.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            mn4 f02 = g02.f0();
            if (f02.d0() == 0) {
                return pq4.c(vq4.d((nq4) f12920i.c(ri4Var.d()), hw4.a(f02.e0().w()), ri4Var.f()), kw4.a(g02.e0().w(), w84Var));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (e05 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static mn4 h(vq4 vq4Var) {
        ln4 g02 = mn4.g0();
        byte[] c8 = vq4Var.e().c();
        g02.E(qy4.s(c8, 0, c8.length));
        return (mn4) g02.A();
    }
}
