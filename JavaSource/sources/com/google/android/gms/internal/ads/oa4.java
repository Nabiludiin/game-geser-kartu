package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class oa4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ki4 f13256a = ki4.d(la4.f11480a, ja4.class, u74.class);

    /* renamed from: b, reason: collision with root package name */
    private static final c84 f13257b = zg4.e("type.googleapis.com/google.crypto.tink.AesGcmKey", u74.class, wn4.SYMMETRIC, mm4.h0());

    /* renamed from: c, reason: collision with root package name */
    private static final nh4 f13258c = na4.f12655a;

    /* renamed from: d, reason: collision with root package name */
    private static final kh4 f13259d = ma4.f12160a;

    /* renamed from: e, reason: collision with root package name */
    private static final int f13260e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13261f = 0;

    public static void a(boolean z7) {
        int i7 = f13260e;
        if (!nf4.a(i7)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = wd4.f18223f;
        wd4.a(wh4.a());
        sh4.a().b(f13256a);
        rh4 a8 = rh4.a();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", rc4.f14848a);
        pa4 pa4Var = new pa4(null);
        pa4Var.b(12);
        pa4Var.a(16);
        pa4Var.c(16);
        qa4 qa4Var = qa4.f14348d;
        pa4Var.d(qa4Var);
        hashMap.put("AES128_GCM_RAW", pa4Var.e());
        hashMap.put("AES256_GCM", rc4.f14849b);
        pa4 pa4Var2 = new pa4(null);
        pa4Var2.b(12);
        pa4Var2.a(32);
        pa4Var2.c(16);
        pa4Var2.d(qa4Var);
        hashMap.put("AES256_GCM_RAW", pa4Var2.e());
        a8.d(Collections.unmodifiableMap(hashMap));
        oh4.a().b(f13258c, ra4.class);
        mh4.a().b(f13259d, ra4.class);
        pg4.a().f(f13257b, i7, true);
    }
}
