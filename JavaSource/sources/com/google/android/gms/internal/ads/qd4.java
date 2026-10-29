package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: MyApplication */
final class qd4 extends ThreadLocal {
    qd4() {
    }

    protected static final Cipher a() {
        try {
            return (Cipher) gv4.f9169b.b("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
