package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* compiled from: MyApplication */
public abstract class vf4 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f17595a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        String[] strArr = f17595a;
        for (int i7 = 0; i7 < 3; i7++) {
            Provider provider = Security.getProvider(strArr[i7]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
