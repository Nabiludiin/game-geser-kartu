package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class vc4 {

    /* renamed from: a, reason: collision with root package name */
    private static final kh4 f17555a = uc4.f16703a;

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f17556b = ki4.d(tc4.f16136a, sc4.class, u74.class);

    public static void a(boolean z7) {
        int i7 = af4.f4921f;
        af4.a(wh4.a());
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", rc4.f14854g);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", rc4.f14855h);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", rc4.f14856i);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", rc4.f14857j);
        a8.d(Collections.unmodifiableMap(hashMap));
        sh4.a().b(f17556b);
        mh4.a().b(f17555a, xc4.class);
    }
}
