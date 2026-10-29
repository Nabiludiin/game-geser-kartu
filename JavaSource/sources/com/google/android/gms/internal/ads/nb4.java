package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class nb4 {

    /* renamed from: a, reason: collision with root package name */
    private static final c84 f12664a = zg4.e("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", u74.class, wn4.SYMMETRIC, ro4.h0());

    /* renamed from: b, reason: collision with root package name */
    private static final kh4 f12665b = mb4.f12174a;

    /* renamed from: c, reason: collision with root package name */
    private static final ki4 f12666c = ki4.d(lb4.f11515a, wb4.class, u74.class);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12667d = 0;

    public static void a(boolean z7) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i7 = fc4.f8182f;
        fc4.a(wh4.a());
        mh4.a().b(f12665b, ac4.class);
        sh4.a().b(f12666c);
        pg4.a().b(f12664a, true);
    }
}
