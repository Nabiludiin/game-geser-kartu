package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: MyApplication */
public abstract class dw4 implements v84 {

    /* renamed from: a, reason: collision with root package name */
    static final ig4 f7341a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f7342b;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f7343c;

    static {
        hg4 a8 = ig4.a();
        a8.a(qv4.SHA256, is4.f10178b);
        a8.a(qv4.SHA384, is4.f10179c);
        a8.a(qv4.SHA512, is4.f10180d);
        f7341a = a8.b();
        f7342b = new byte[0];
        f7343c = new byte[]{0};
    }

    public static v84 b(os4 os4Var) {
        try {
            return ku4.e(os4Var);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) gv4.f9174g.b("RSA")).generatePublic(new RSAPublicKeySpec(os4Var.e(), os4Var.f().d()));
            ks4 f8 = os4Var.f();
            ig4 ig4Var = f7341a;
            return new cw4(rSAPublicKey, (qv4) ig4Var.b(f8.f()), (qv4) ig4Var.b(f8.g()), f8.h(), os4Var.c().c(), os4Var.f().e().equals(js4.f10742d) ? f7343c : f7342b, null);
        }
    }
}
