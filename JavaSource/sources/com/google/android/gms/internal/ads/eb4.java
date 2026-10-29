package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class eb4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f7526a = ki4.d(db4.f7044a, bb4.class, u74.class);

    /* renamed from: b, reason: collision with root package name */
    private static final kh4 f7527b = cb4.f6350a;

    /* renamed from: c, reason: collision with root package name */
    private static final c84 f7528c = zg4.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", u74.class, wn4.SYMMETRIC, um4.h0());

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7529d = 0;

    public static void a(boolean z7) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i7 = ke4.f11000f;
        ke4.a(wh4.a());
        sh4.a().b(f7526a);
        mh4.a().b(f7527b, gb4.class);
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", gb4.b(fb4.f8124b));
        hashMap.put("CHACHA20_POLY1305_RAW", gb4.b(fb4.f8126d));
        a8.d(Collections.unmodifiableMap(hashMap));
        pg4.a().b(f7528c, true);
    }
}
