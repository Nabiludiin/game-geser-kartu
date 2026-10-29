package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class gt4 implements v84 {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f9133g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f9134h = {0};

    /* renamed from: i, reason: collision with root package name */
    static final ig4 f9135i;

    /* renamed from: j, reason: collision with root package name */
    static final ig4 f9136j;

    /* renamed from: k, reason: collision with root package name */
    static final ig4 f9137k;

    /* renamed from: a, reason: collision with root package name */
    private final ECPublicKey f9138a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9139b;

    /* renamed from: c, reason: collision with root package name */
    private final zu4 f9140c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f9141d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f9142e;

    /* renamed from: f, reason: collision with root package name */
    private final Provider f9143f;

    static {
        hg4 a8 = ig4.a();
        a8.a(qv4.SHA256, aq4.f5217b);
        a8.a(qv4.SHA384, aq4.f5218c);
        a8.a(qv4.SHA512, aq4.f5219d);
        f9135i = a8.b();
        hg4 a9 = ig4.a();
        a9.a(zu4.IEEE_P1363, bq4.f5925b);
        a9.a(zu4.DER, bq4.f5926c);
        f9136j = a9.b();
        hg4 a10 = ig4.a();
        a10.a(yu4.NIST_P256, zp4.f20273c);
        a10.a(yu4.NIST_P384, zp4.f20274d);
        a10.a(yu4.NIST_P521, zp4.f20275e);
        f9137k = a10.b();
    }

    private gt4(ECPublicKey eCPublicKey, qv4 qv4Var, zu4 zu4Var, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f9139b = ew4.a(qv4Var);
        this.f9138a = eCPublicKey;
        this.f9140c = zu4Var;
        this.f9141d = bArr;
        this.f9142e = bArr2;
        this.f9143f = provider;
    }

    public static v84 b(iq4 iq4Var, Provider provider) {
        return new gt4((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) gv4.f9174g.b("EC")).generatePublic(new ECPublicKeySpec(iq4Var.e(), av4.b((yu4) f9137k.b(iq4Var.f().d())))), (qv4) f9135i.b(iq4Var.f().e()), (zu4) f9136j.b(iq4Var.f().c()), iq4Var.c().c(), iq4Var.f().f().equals(dq4.f7237d) ? f9134h : f9133g, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(byte[] r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gt4.c(byte[], byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.v84
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f9141d;
        int length = bArr3.length;
        if (length == 0) {
            c(bArr, bArr2);
        } else {
            if (!ej4.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
