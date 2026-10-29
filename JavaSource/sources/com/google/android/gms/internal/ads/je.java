package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* compiled from: MyApplication */
final class je extends ke {

    /* renamed from: r, reason: collision with root package name */
    private final byte[] f10517r;

    public je(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f10517r = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f10517r;
    }
}
