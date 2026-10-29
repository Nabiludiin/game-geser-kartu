package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: MyApplication */
public abstract class js {

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f10730b;

    /* renamed from: a, reason: collision with root package name */
    protected final Object f10731a = new Object();

    abstract byte[] a(String str);

    protected final MessageDigest b() {
        synchronized (this.f10731a) {
            MessageDigest messageDigest = f10730b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i7 = 0; i7 < 2; i7++) {
                try {
                    f10730b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f10730b;
        }
    }
}
