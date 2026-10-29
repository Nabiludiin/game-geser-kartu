package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class i94 {

    /* renamed from: a, reason: collision with root package name */
    private static final lg4 f9901a = b();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9902b = 0;

    public static y74 a() {
        if (of4.a()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return f9901a;
    }

    private static lg4 b() {
        try {
            li4 a8 = oi4.a();
            p94.e(a8);
            a8.a(ki4.d(g94.f8728a, r94.class, u74.class));
            a8.a(ki4.d(e94.f7493a, ja4.class, u74.class));
            a8.a(ki4.d(f94.f8099a, ta4.class, u74.class));
            a8.a(ki4.d(d94.f6999a, ba4.class, u74.class));
            a8.a(ki4.d(c94.f6329a, bb4.class, u74.class));
            a8.a(ki4.d(b94.f5634a, yc4.class, u74.class));
            a8.a(ki4.d(h94.f9391a, sc4.class, u74.class));
            return lg4.b(a8.c());
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
