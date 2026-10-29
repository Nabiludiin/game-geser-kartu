package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class jb4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f10448a = ki4.d(ib4.f9953a, ob4.class, u74.class);

    /* renamed from: b, reason: collision with root package name */
    private static final c84 f10449b = zg4.e("type.googleapis.com/google.crypto.tink.KmsAeadKey", u74.class, wn4.REMOTE, no4.h0());

    /* renamed from: c, reason: collision with root package name */
    private static final kh4 f10450c = hb4.f9414a;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f10451d = 0;

    public static void a(boolean z7) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i7 = vb4.f17537f;
        vb4.a(wh4.a());
        sh4.a().b(f10448a);
        mh4.a().b(f10450c, qb4.class);
        pg4.a().b(f10449b, true);
    }
}
