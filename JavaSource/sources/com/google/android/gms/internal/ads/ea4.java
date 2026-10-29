package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class ea4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f7513a = ki4.d(ca4.f6340a, ba4.class, u74.class);

    /* renamed from: b, reason: collision with root package name */
    private static final c84 f7514b = zg4.e("type.googleapis.com/google.crypto.tink.AesEaxKey", u74.class, wn4.SYMMETRIC, gm4.i0());

    /* renamed from: c, reason: collision with root package name */
    private static final kh4 f7515c = da4.f7019a;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7516d = 0;

    public static void a(boolean z7) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i7 = pd4.f13842f;
        pd4.a(wh4.a());
        sh4.a().b(f7513a);
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", rc4.f14850c);
        fa4 fa4Var = new fa4(null);
        fa4Var.b(16);
        fa4Var.a(16);
        fa4Var.c(16);
        ga4 ga4Var = ga4.f8750d;
        fa4Var.d(ga4Var);
        hashMap.put("AES128_EAX_RAW", fa4Var.e());
        hashMap.put("AES256_EAX", rc4.f14851d);
        fa4 fa4Var2 = new fa4(null);
        fa4Var2.b(16);
        fa4Var2.a(32);
        fa4Var2.c(16);
        fa4Var2.d(ga4Var);
        hashMap.put("AES256_EAX_RAW", fa4Var2.e());
        a8.d(Collections.unmodifiableMap(hashMap));
        mh4.a().b(f7515c, ha4.class);
        pg4.a().b(f7514b, true);
    }
}
