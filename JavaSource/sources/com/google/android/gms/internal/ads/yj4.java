package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class yj4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f19620a = ki4.d(tj4.f16226a, sj4.class, oj4.class);

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f19621b = ki4.d(xj4.f18853a, sj4.class, r84.class);

    /* renamed from: c, reason: collision with root package name */
    private static final c84 f19622c = zg4.e("type.googleapis.com/google.crypto.tink.HmacKey", r84.class, wn4.SYMMETRIC, qn4.j0());

    /* renamed from: d, reason: collision with root package name */
    private static final nh4 f19623d = vj4.f17654a;

    /* renamed from: e, reason: collision with root package name */
    private static final kh4 f19624e = uj4.f16793a;

    /* renamed from: f, reason: collision with root package name */
    private static final int f19625f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f19626g = 0;

    public static void a(boolean z7) {
        int i7 = f19625f;
        if (!nf4.a(i7)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = el4.f7696h;
        el4.a(wh4.a());
        sh4.a().b(f19620a);
        sh4.a().b(f19621b);
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", pk4.f13910a);
        zj4 zj4Var = new zj4(null);
        zj4Var.a(32);
        zj4Var.b(16);
        bk4 bk4Var = bk4.f5843e;
        zj4Var.c(bk4Var);
        ak4 ak4Var = ak4.f5021d;
        zj4Var.d(ak4Var);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zj4Var.e());
        zj4 zj4Var2 = new zj4(null);
        zj4Var2.a(32);
        zj4Var2.b(32);
        bk4 bk4Var2 = bk4.f5840b;
        zj4Var2.c(bk4Var2);
        zj4Var2.d(ak4Var);
        hashMap.put("HMAC_SHA256_256BITTAG", zj4Var2.e());
        zj4 zj4Var3 = new zj4(null);
        zj4Var3.a(32);
        zj4Var3.b(32);
        zj4Var3.c(bk4Var);
        zj4Var3.d(ak4Var);
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zj4Var3.e());
        zj4 zj4Var4 = new zj4(null);
        zj4Var4.a(64);
        zj4Var4.b(16);
        zj4Var4.c(bk4Var2);
        ak4 ak4Var2 = ak4.f5023f;
        zj4Var4.d(ak4Var2);
        hashMap.put("HMAC_SHA512_128BITTAG", zj4Var4.e());
        zj4 zj4Var5 = new zj4(null);
        zj4Var5.a(64);
        zj4Var5.b(16);
        zj4Var5.c(bk4Var);
        zj4Var5.d(ak4Var2);
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zj4Var5.e());
        zj4 zj4Var6 = new zj4(null);
        zj4Var6.a(64);
        zj4Var6.b(32);
        zj4Var6.c(bk4Var2);
        zj4Var6.d(ak4Var2);
        hashMap.put("HMAC_SHA512_256BITTAG", zj4Var6.e());
        zj4 zj4Var7 = new zj4(null);
        zj4Var7.a(64);
        zj4Var7.b(32);
        zj4Var7.c(bk4Var);
        zj4Var7.d(ak4Var2);
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zj4Var7.e());
        hashMap.put("HMAC_SHA512_512BITTAG", pk4.f13911b);
        zj4 zj4Var8 = new zj4(null);
        zj4Var8.a(64);
        zj4Var8.b(64);
        zj4Var8.c(bk4Var);
        zj4Var8.d(ak4Var2);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zj4Var8.e());
        a8.d(Collections.unmodifiableMap(hashMap));
        mh4.a().b(f19624e, ck4.class);
        oh4.a().b(f19623d, ck4.class);
        pg4.a().f(f19622c, i7, true);
    }
}
