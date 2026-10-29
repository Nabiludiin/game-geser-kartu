package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class xa4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f18700a = ki4.d(ua4.f16670a, ta4.class, u74.class);

    /* renamed from: b, reason: collision with root package name */
    private static final kh4 f18701b = wa4.f18164a;

    /* renamed from: c, reason: collision with root package name */
    private static final nh4 f18702c = va4.f17490a;

    /* renamed from: d, reason: collision with root package name */
    private static final c84 f18703d = zg4.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey", u74.class, wn4.SYMMETRIC, qm4.h0());

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18704e = 0;

    public static void a(boolean z7) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i7 = de4.f7087f;
        de4.a(wh4.a());
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        ya4 ya4Var = new ya4(null);
        ya4Var.a(16);
        za4 za4Var = za4.f20105b;
        ya4Var.b(za4Var);
        hashMap.put("AES128_GCM_SIV", ya4Var.c());
        ya4 ya4Var2 = new ya4(null);
        ya4Var2.a(16);
        za4 za4Var2 = za4.f20107d;
        ya4Var2.b(za4Var2);
        hashMap.put("AES128_GCM_SIV_RAW", ya4Var2.c());
        ya4 ya4Var3 = new ya4(null);
        ya4Var3.a(32);
        ya4Var3.b(za4Var);
        hashMap.put("AES256_GCM_SIV", ya4Var3.c());
        ya4 ya4Var4 = new ya4(null);
        ya4Var4.a(32);
        ya4Var4.b(za4Var2);
        hashMap.put("AES256_GCM_SIV_RAW", ya4Var4.c());
        a8.d(Collections.unmodifiableMap(hashMap));
        oh4.a().b(f18702c, ab4.class);
        mh4.a().b(f18701b, ab4.class);
        sh4.a().b(f18700a);
        pg4.a().b(f18703d, true);
    }
}
