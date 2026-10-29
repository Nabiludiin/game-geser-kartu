package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class uq4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f16900a = ki4.d(sq4.f15762a, pq4.class, u84.class);

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f16901b = ki4.d(tq4.f16315a, vq4.class, v84.class);

    /* renamed from: c, reason: collision with root package name */
    private static final t84 f16902c = zg4.f("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", u84.class, kn4.i0());

    /* renamed from: d, reason: collision with root package name */
    private static final c84 f16903d = zg4.e("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", v84.class, wn4.ASYMMETRIC_PUBLIC, mn4.i0());

    /* renamed from: e, reason: collision with root package name */
    private static final nh4 f16904e = rq4.f15157a;

    /* renamed from: f, reason: collision with root package name */
    private static final kh4 f16905f = qq4.f14572a;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f16906g = 0;

    public static void a(boolean z7) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i7 = nt4.f12921j;
        nt4.a(wh4.a());
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("ED25519", oq4.b(nq4.f12846b));
        nq4 nq4Var = nq4.f12849e;
        hashMap.put("ED25519_RAW", oq4.b(nq4Var));
        hashMap.put("ED25519WithRawOutput", oq4.b(nq4Var));
        a8.d(Collections.unmodifiableMap(hashMap));
        mh4.a().b(f16905f, oq4.class);
        oh4.a().b(f16904e, oq4.class);
        sh4.a().b(f16900a);
        sh4.a().b(f16901b);
        pg4.a().b(f16902c, true);
        pg4.a().b(f16903d, false);
    }
}
