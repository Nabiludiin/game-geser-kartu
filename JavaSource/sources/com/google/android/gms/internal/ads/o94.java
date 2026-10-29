package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: MyApplication */
final class o94 implements u74 {

    /* renamed from: a, reason: collision with root package name */
    private final hi4 f13250a;

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f13250a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                byte[] a8 = ((m94) it.next()).f12138a.a(bArr, bArr2);
                int length = bArr.length;
                return a8;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
