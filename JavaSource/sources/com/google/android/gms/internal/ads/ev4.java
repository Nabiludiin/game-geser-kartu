package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: MyApplication */
final class ev4 implements fv4 {

    /* renamed from: a, reason: collision with root package name */
    private final pv4 f7839a;

    @Override // com.google.android.gms.internal.ads.fv4
    public final Object b(String str) {
        Iterator it = gv4.a("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f7839a.a(str, (Provider) it.next());
            } catch (Exception e8) {
                if (exc == null) {
                    exc = e8;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
