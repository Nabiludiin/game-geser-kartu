package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class ss4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f15791a = ki4.d(ps4.f14093a, ms4.class, u84.class);

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f15792b = ki4.d(rs4.f15207a, os4.class, v84.class);

    /* renamed from: c, reason: collision with root package name */
    private static final t84 f15793c = zg4.f("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", u84.class, lp4.n0());

    /* renamed from: d, reason: collision with root package name */
    private static final c84 f15794d = zg4.e("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", v84.class, wn4.ASYMMETRIC_PUBLIC, np4.k0());

    /* renamed from: e, reason: collision with root package name */
    private static final kh4 f15795e = qs4.f14612a;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15796f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f15797g = 0;

    public static void a(boolean z7) {
        int i7 = f15796f;
        if (!nf4.a(i7)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = iu4.f10214k;
        iu4.a(wh4.a());
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        BigInteger bigInteger = ks4.f11224g;
        hs4 hs4Var = new hs4(null);
        is4 is4Var = is4.f10178b;
        hs4Var.d(is4Var);
        hs4Var.e(is4Var);
        hs4Var.f(32);
        hs4Var.a(3072);
        BigInteger bigInteger2 = ks4.f11224g;
        hs4Var.b(bigInteger2);
        js4 js4Var = js4.f10740b;
        hs4Var.c(js4Var);
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4", hs4Var.g());
        hs4 hs4Var2 = new hs4(null);
        hs4Var2.d(is4Var);
        hs4Var2.e(is4Var);
        hs4Var2.f(32);
        hs4Var2.a(3072);
        hs4Var2.b(bigInteger2);
        js4 js4Var2 = js4.f10743e;
        hs4Var2.c(js4Var2);
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", hs4Var2.g());
        hashMap.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", lr4.f11757k);
        hs4 hs4Var3 = new hs4(null);
        is4 is4Var2 = is4.f10180d;
        hs4Var3.d(is4Var2);
        hs4Var3.e(is4Var2);
        hs4Var3.f(64);
        hs4Var3.a(4096);
        hs4Var3.b(bigInteger2);
        hs4Var3.c(js4Var);
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4", hs4Var3.g());
        hs4 hs4Var4 = new hs4(null);
        hs4Var4.d(is4Var2);
        hs4Var4.e(is4Var2);
        hs4Var4.f(64);
        hs4Var4.a(4096);
        hs4Var4.b(bigInteger2);
        hs4Var4.c(js4Var2);
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", hs4Var4.g());
        hashMap.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", lr4.f11758l);
        a8.d(Collections.unmodifiableMap(hashMap));
        sh4.a().b(f15791a);
        sh4.a().b(f15792b);
        mh4.a().b(f15795e, ks4.class);
        pg4.a().f(f15793c, i7, true);
        pg4.a().f(f15794d, i7, false);
    }
}
