package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: MyApplication */
final class sr4 implements v84 {

    /* renamed from: a, reason: collision with root package name */
    private final hi4 f15772a;

    public sr4(hi4 hi4Var, gh4 gh4Var) {
        this.f15772a = hi4Var;
    }

    @Override // com.google.android.gms.internal.ads.v84
    public final void a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f15772a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((rr4) it.next()).f15173a.a(bArr, bArr2);
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
