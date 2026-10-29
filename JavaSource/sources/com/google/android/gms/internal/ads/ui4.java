package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* compiled from: MyApplication */
public abstract class ui4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f16786a = new ti4();

    public static byte[] a(int i7) {
        byte[] bArr = new byte[i7];
        ((SecureRandom) f16786a.get()).nextBytes(bArr);
        return bArr;
    }

    static /* synthetic */ SecureRandom b() {
        SecureRandom c8 = c();
        c8.nextLong();
        return c8;
    }

    private static SecureRandom c() {
        Provider a8 = vf4.a();
        if (a8 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", a8);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
