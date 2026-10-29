package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class v94 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f17466a = ki4.d(u94.f16655a, r94.class, u74.class);

    /* renamed from: b, reason: collision with root package name */
    private static final c84 f17467b = zg4.e("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", u74.class, wn4.SYMMETRIC, vl4.i0());

    /* renamed from: c, reason: collision with root package name */
    private static final nh4 f17468c = t94.f16049a;

    /* renamed from: d, reason: collision with root package name */
    private static final kh4 f17469d = s94.f15508a;

    /* renamed from: e, reason: collision with root package name */
    private static final int f17470e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f17471f = 0;

    public static void a(boolean z7) {
        int i7 = f17470e;
        if (!nf4.a(i7)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = jd4.f10514f;
        jd4.a(wh4.a());
        sh4.a().b(f17466a);
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", rc4.f14852e);
        w94 w94Var = new w94(null);
        w94Var.a(16);
        w94Var.b(32);
        w94Var.d(16);
        w94Var.c(16);
        x94 x94Var = x94.f18679d;
        w94Var.f(x94Var);
        y94 y94Var = y94.f19432d;
        w94Var.e(y94Var);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", w94Var.g());
        hashMap.put("AES256_CTR_HMAC_SHA256", rc4.f14853f);
        w94 w94Var2 = new w94(null);
        w94Var2.a(32);
        w94Var2.b(32);
        w94Var2.d(32);
        w94Var2.c(16);
        w94Var2.f(x94Var);
        w94Var2.e(y94Var);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", w94Var2.g());
        a8.d(Collections.unmodifiableMap(hashMap));
        oh4.a().b(f17468c, z94.class);
        mh4.a().b(f17469d, z94.class);
        pg4.a().f(f17467b, i7, true);
    }
}
