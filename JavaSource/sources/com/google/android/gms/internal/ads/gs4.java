package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class gs4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f9120a = ki4.d(cs4.f6608a, zr4.class, u84.class);

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f9121b = ki4.d(fs4.f8465a, bs4.class, v84.class);

    /* renamed from: c, reason: collision with root package name */
    private static final t84 f9122c = zg4.f("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", u84.class, dp4.n0());

    /* renamed from: d, reason: collision with root package name */
    private static final c84 f9123d = zg4.e("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", v84.class, wn4.ASYMMETRIC_PUBLIC, fp4.k0());

    /* renamed from: e, reason: collision with root package name */
    private static final kh4 f9124e = ds4.f7289a;

    /* renamed from: f, reason: collision with root package name */
    private static final int f9125f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9126g = 0;

    public static void a(boolean z7) {
        int i7 = f9125f;
        if (!nf4.a(i7)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = yt4.f19788k;
        yt4.a(wh4.a());
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", lr4.f11754h);
        BigInteger bigInteger = xr4.f18985e;
        ur4 ur4Var = new ur4(null);
        ur4Var.d(vr4.f17734b);
        ur4Var.a(3072);
        BigInteger bigInteger2 = xr4.f18985e;
        ur4Var.b(bigInteger2);
        wr4 wr4Var = wr4.f18395e;
        ur4Var.c(wr4Var);
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", ur4Var.e());
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", lr4.f11755i);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", lr4.f11756j);
        ur4 ur4Var2 = new ur4(null);
        ur4Var2.d(vr4.f17736d);
        ur4Var2.a(4096);
        ur4Var2.b(bigInteger2);
        ur4Var2.c(wr4Var);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", ur4Var2.e());
        a8.d(hashMap);
        sh4.a().b(f9120a);
        sh4.a().b(f9121b);
        mh4.a().b(f9124e, xr4.class);
        pg4.a().f(f9122c, i7, true);
        pg4.a().f(f9123d, i7, false);
    }
}
