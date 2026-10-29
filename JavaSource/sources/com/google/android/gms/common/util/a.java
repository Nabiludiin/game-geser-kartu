package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: MyApplication */
public abstract class a {
    public static byte[] a(Context context, String str) {
        MessageDigest b8;
        PackageInfo f8 = u3.e.a(context).f(str, 64);
        Signature[] signatureArr = f8.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b8 = b("SHA1")) == null) {
            return null;
        }
        return b8.digest(f8.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
