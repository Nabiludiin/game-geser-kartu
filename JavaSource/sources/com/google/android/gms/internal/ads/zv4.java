package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: MyApplication */
public abstract class zv4 implements v84 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f20369a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f20370b = {0};

    /* renamed from: c, reason: collision with root package name */
    static final ig4 f20371c;

    static {
        hg4 a8 = ig4.a();
        a8.a(qv4.SHA256, vr4.f17734b);
        a8.a(qv4.SHA384, vr4.f17735c);
        a8.a(qv4.SHA512, vr4.f17736d);
        f20371c = a8.b();
    }

    public static v84 b(bs4 bs4Var) {
        try {
            return au4.d(bs4Var);
        } catch (NoSuchProviderException unused) {
            return new yv4((RSAPublicKey) ((KeyFactory) gv4.f9174g.b("RSA")).generatePublic(new RSAPublicKeySpec(bs4Var.e(), bs4Var.f().d())), (qv4) f20371c.b(bs4Var.f().f()), bs4Var.c().c(), bs4Var.f().e().equals(wr4.f18394d) ? f20370b : f20369a, null);
        }
    }
}
