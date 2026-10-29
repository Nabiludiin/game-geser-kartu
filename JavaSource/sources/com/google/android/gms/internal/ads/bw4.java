package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: MyApplication */
public abstract class bw4 implements u84 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f6045a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f6046b = {0};

    public static u84 b(ms4 ms4Var) {
        try {
            return ju4.b(ms4Var);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ((KeyFactory) gv4.f9174g.b("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(ms4Var.e().e(), ms4Var.d().d(), ms4Var.h().b(z74.a()), ms4Var.f().b(z74.a()), ms4Var.g().b(z74.a()), ms4Var.i().b(z74.a()), ms4Var.j().b(z74.a()), ms4Var.k().b(z74.a())));
            ks4 d8 = ms4Var.d();
            ig4 ig4Var = dw4.f7341a;
            return new aw4(rSAPrivateCrtKey, (qv4) ig4Var.b(d8.f()), (qv4) ig4Var.b(d8.g()), d8.h(), ms4Var.e().c().c(), ms4Var.d().e().equals(js4.f10742d) ? f6046b : f6045a, null);
        }
    }
}
