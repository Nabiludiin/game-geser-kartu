package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class mq4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f12373a = ki4.d(jq4.f10716a, gq4.class, u84.class);

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f12374b = ki4.d(lq4.f11738a, iq4.class, v84.class);

    /* renamed from: c, reason: collision with root package name */
    private static final t84 f12375c = zg4.f("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", u84.class, dn4.i0());

    /* renamed from: d, reason: collision with root package name */
    private static final c84 f12376d = zg4.e("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", v84.class, wn4.ASYMMETRIC_PUBLIC, fn4.k0());

    /* renamed from: e, reason: collision with root package name */
    private static final kh4 f12377e = kq4.f11207a;

    /* renamed from: f, reason: collision with root package name */
    private static final int f12378f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f12379g = 0;

    public static void a(boolean z7) {
        int i7 = f12378f;
        if (!nf4.a(i7)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = dt4.f7301i;
        dt4.a(wh4.a());
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", lr4.f11747a);
        hashMap.put("ECDSA_P256_IEEE_P1363", lr4.f11750d);
        yp4 yp4Var = new yp4(null);
        yp4Var.c(aq4.f5217b);
        yp4Var.b(zp4.f20273c);
        yp4Var.a(bq4.f5925b);
        yp4Var.d(dq4.f7238e);
        hashMap.put("ECDSA_P256_RAW", yp4Var.e());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", lr4.f11752f);
        hashMap.put("ECDSA_P384", lr4.f11748b);
        hashMap.put("ECDSA_P384_IEEE_P1363", lr4.f11751e);
        yp4 yp4Var2 = new yp4(null);
        yp4Var2.c(aq4.f5219d);
        zp4 zp4Var = zp4.f20274d;
        yp4Var2.b(zp4Var);
        bq4 bq4Var = bq4.f5926c;
        yp4Var2.a(bq4Var);
        dq4 dq4Var = dq4.f7235b;
        yp4Var2.d(dq4Var);
        hashMap.put("ECDSA_P384_SHA512", yp4Var2.e());
        yp4 yp4Var3 = new yp4(null);
        yp4Var3.c(aq4.f5218c);
        yp4Var3.b(zp4Var);
        yp4Var3.a(bq4Var);
        yp4Var3.d(dq4Var);
        hashMap.put("ECDSA_P384_SHA384", yp4Var3.e());
        hashMap.put("ECDSA_P521", lr4.f11749c);
        hashMap.put("ECDSA_P521_IEEE_P1363", lr4.f11753g);
        a8.d(Collections.unmodifiableMap(hashMap));
        sh4.a().b(f12373a);
        sh4.a().b(f12374b);
        mh4.a().b(f12377e, eq4.class);
        pg4.a().f(f12375c, i7, true);
        pg4.a().f(f12376d, i7, false);
    }
}
