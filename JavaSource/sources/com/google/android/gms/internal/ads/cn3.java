package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class cn3 {

    /* renamed from: a, reason: collision with root package name */
    private static Cipher f6515a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f6516b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6517c = new Object();

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f6517c) {
            try {
                if (f6515a == null) {
                    f6515a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f6515a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final byte[] a(byte[] bArr, String str) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b8 = hj3.b(str, false);
            int length2 = b8.length;
            if (length2 <= 16) {
                throw new bn3();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(b8);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f6516b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = c().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e8) {
            e = e8;
            throw new bn3(e);
        } catch (InvalidAlgorithmParameterException e9) {
            e = e9;
            throw new bn3(e);
        } catch (InvalidKeyException e10) {
            e = e10;
            throw new bn3(e);
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw new bn3(e);
        } catch (BadPaddingException e12) {
            e = e12;
            throw new bn3(e);
        } catch (IllegalBlockSizeException e13) {
            e = e13;
            throw new bn3(e);
        } catch (NoSuchPaddingException e14) {
            e = e14;
            throw new bn3(e);
        }
    }

    public final String b(byte[] bArr, String str) {
        return new String(a(bArr, str), "UTF-8");
    }
}
