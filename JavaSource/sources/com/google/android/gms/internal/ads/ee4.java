package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: MyApplication */
final class ee4 extends ThreadLocal {
    ee4() {
    }

    protected static final Cipher a() {
        boolean f8;
        try {
            Cipher cipher = (Cipher) gv4.f9169b.b("ChaCha20-Poly1305");
            f8 = fe4.f(cipher);
            if (f8) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
