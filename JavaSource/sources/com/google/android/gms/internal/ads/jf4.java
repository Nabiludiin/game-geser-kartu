package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: MyApplication */
public abstract class jf4 implements u74 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f10533a = new hf4();

    public static u74 b(ta4 ta4Var) {
        return yd4.c(ta4Var, if4.f10031a);
    }

    static /* synthetic */ Cipher c() {
        try {
            Cipher cipher = (Cipher) f10533a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e8) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e8);
        }
    }
}
