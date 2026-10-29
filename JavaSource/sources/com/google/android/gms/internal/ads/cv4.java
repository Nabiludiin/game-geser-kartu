package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* compiled from: MyApplication */
final class cv4 implements fv4 {

    /* renamed from: a, reason: collision with root package name */
    private final pv4 f6651a;

    @Override // com.google.android.gms.internal.ads.fv4
    public final Object b(String str) {
        Iterator it = gv4.a("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.f6651a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.f6651a.a(str, null);
    }
}
