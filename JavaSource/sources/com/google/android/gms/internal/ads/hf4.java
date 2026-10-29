package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: MyApplication */
final class hf4 extends ThreadLocal {
    hf4() {
    }

    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) gv4.f9169b.b("AES/GCM-SIV/NoPadding");
            if (yd4.b(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
