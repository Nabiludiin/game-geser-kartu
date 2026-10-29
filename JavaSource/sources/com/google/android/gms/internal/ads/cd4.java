package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class cd4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f6389a = ki4.d(bd4.f5721a, yc4.class, u74.class);

    /* renamed from: b, reason: collision with root package name */
    private static final c84 f6390b = zg4.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", u74.class, wn4.SYMMETRIC, vp4.h0());

    /* renamed from: c, reason: collision with root package name */
    private static final nh4 f6391c = zc4.f20136a;

    /* renamed from: d, reason: collision with root package name */
    private static final kh4 f6392d = ad4.f4891a;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6393e = 0;

    public static void a(boolean z7) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i7 = gf4.f8888f;
        gf4.a(wh4.a());
        sh4.a().b(f6389a);
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", ed4.b(dd4.f7063b));
        hashMap.put("XCHACHA20_POLY1305_RAW", ed4.b(dd4.f7065d));
        a8.d(Collections.unmodifiableMap(hashMap));
        mh4.a().b(f6392d, ed4.class);
        oh4.a().b(f6391c, ed4.class);
        pg4.a().b(f6390b, true);
    }
}
