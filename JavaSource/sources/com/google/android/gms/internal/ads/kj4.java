package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class kj4 {

    /* renamed from: a, reason: collision with root package name */
    private static final kh4 f11078a = jj4.f10575a;

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f11079b = ki4.d(hj4.f9554a, gj4.class, oj4.class);

    /* renamed from: c, reason: collision with root package name */
    private static final ki4 f11080c = ki4.d(ij4.f10067a, gj4.class, r84.class);

    /* renamed from: d, reason: collision with root package name */
    private static final c84 f11081d = zg4.e("type.googleapis.com/google.crypto.tink.AesCmacKey", r84.class, wn4.SYMMETRIC, pl4.i0());

    public static void a(boolean z7) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i7 = uk4.f16805f;
        uk4.a(wh4.a());
        mh4.a().b(f11078a, nj4.class);
        sh4.a().b(f11079b);
        sh4.a().b(f11080c);
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        nj4 nj4Var = pk4.f13912c;
        hashMap.put("AES_CMAC", nj4Var);
        hashMap.put("AES256_CMAC", nj4Var);
        lj4 lj4Var = new lj4(null);
        lj4Var.a(32);
        lj4Var.b(16);
        lj4Var.c(mj4.f12281e);
        hashMap.put("AES256_CMAC_RAW", lj4Var.d());
        a8.d(Collections.unmodifiableMap(hashMap));
        pg4.a().b(f11081d, true);
    }

    static /* synthetic */ gj4 b(nj4 nj4Var, Integer num) {
        e(nj4Var);
        fj4 fj4Var = new fj4(null);
        fj4Var.a(nj4Var);
        fj4Var.b(kw4.b(nj4Var.c()));
        fj4Var.c(num);
        return fj4Var.d();
    }

    static /* synthetic */ oj4 c(gj4 gj4Var) {
        e(gj4Var.f());
        return yk4.a(gj4Var);
    }

    static /* synthetic */ r84 d(gj4 gj4Var) {
        e(gj4Var.f());
        return xv4.a(gj4Var);
    }

    private static void e(nj4 nj4Var) {
        if (nj4Var.c() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
