package com.google.android.gms.internal.ads;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public abstract class rd4 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f14874a = new qd4();

    public static Cipher a() {
        return (Cipher) f14874a.get();
    }

    public static SecretKey b(byte[] bArr) {
        fw4.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i7, int i8) {
        ej4.d();
        return new GCMParameterSpec(128, bArr, i7, 12);
    }
}
