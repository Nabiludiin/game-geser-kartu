package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class n13 {
    public n13() {
        try {
            a94.a();
        } catch (GeneralSecurityException e8) {
            v2.n1.k("Failed to Configure Aead. ".concat(e8.toString()));
            r2.t.l().i(e8, "CryptoUtils.registerAead");
        }
    }

    public static final String a() {
        byte[] bArr;
        try {
            n84 e8 = n84.e(e84.b(rh4.a().c("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                x74.b(e8, w74.b(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e9) {
            v2.n1.k("Failed to generate key".concat(e9.toString()));
            r2.t.l().i(e9, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final String b(byte[] bArr, byte[] bArr2, String str, lx1 lx1Var) {
        n84 c8;
        if (str != null && (c8 = c(str)) != null) {
            try {
                byte[] a8 = ((u74) c8.f(tf4.a(), u74.class)).a(bArr, bArr2);
                lx1Var.c().put("ds", "1");
                return new String(a8, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e8) {
                v2.n1.k("Failed to decrypt ".concat(e8.toString()));
                r2.t.l().i(e8, "CryptoUtils.decrypt");
                lx1Var.c().put("dsf", e8.toString());
            }
        }
        return null;
    }

    private static final n84 c(String str) {
        try {
            try {
                return x74.a(v74.a(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e8) {
            v2.n1.k("Failed to get keysethandle".concat(e8.toString()));
            r2.t.l().i(e8, "CryptoUtils.getHandle");
            return null;
        }
    }
}
