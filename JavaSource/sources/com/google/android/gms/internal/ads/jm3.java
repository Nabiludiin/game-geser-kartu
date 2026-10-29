package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class jm3 {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f10643a;

    /* renamed from: b, reason: collision with root package name */
    private final nu3 f10644b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f10645c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f10646d = false;

    /* renamed from: e, reason: collision with root package name */
    private SecureRandom f10647e;

    public jm3(nu3 nu3Var) {
        this.f10644b = nu3Var;
    }

    public final void a() {
        if (c()) {
            return;
        }
        b(new SecureRandom());
    }

    final synchronized void b(SecureRandom secureRandom) {
        lu3 a8 = this.f10644b.a(202);
        try {
            try {
                try {
                    a8.a();
                    this.f10647e = secureRandom;
                    this.f10643a = MessageDigest.getInstance("MD5");
                    this.f10646d = true;
                } catch (Throwable th) {
                    a8.b(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e8) {
                a8.b(e8);
            }
            a8.c();
        } catch (Throwable th2) {
            a8.c();
            throw th2;
        }
    }

    public final synchronized boolean c() {
        return this.f10646d;
    }

    final byte[] d(byte[] bArr, String str, boolean z7) {
        int length = bArr.length;
        int i7 = true != z7 ? 255 : 239;
        rx3.a(length <= i7);
        ByteBuffer put = ByteBuffer.allocate(i7 + 1).put((byte) length);
        if (length < i7) {
            int i8 = i7 - length;
            byte[] bArr2 = new byte[i8];
            this.f10647e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i8);
            System.arraycopy(bArr2, 0, bArr, length, i8);
        }
        byte[] array = put.put(bArr).array();
        if (z7) {
            array = ByteBuffer.allocate(256).put(e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        mm3[] mm3VarArr = new an3().G2;
        int length2 = mm3VarArr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            mm3VarArr[i9].a(array, bArr3);
        }
        if (!iy3.c(str)) {
            new lm3(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).a(bArr3);
        }
        return bArr3;
    }

    public final byte[] e(byte[] bArr) {
        byte[] digest;
        synchronized (this.f10645c) {
            this.f10643a.reset();
            this.f10643a.update(bArr);
            digest = this.f10643a.digest();
        }
        return digest;
    }

    public final ol f(byte[] bArr, String str) {
        ol d02 = pl.d0();
        byte[] e8 = e(bArr);
        qy4 qy4Var = qy4.f14669r;
        d02.F(qy4.s(e8, 0, e8.length));
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            int length = bArr.length;
            if (i7 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i8 = i7 * 255;
            int i9 = i8 + 255;
            if (length > i9) {
                length = i9;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i8, length));
            i7++;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d02.E(qy4.s(d((byte[]) obj, str, false), 0, 256));
        }
        return d02;
    }

    public final String g(int i7, String str) {
        ak g12 = xk.g1();
        g12.z0(i7);
        return Base64.encodeToString(d(((xk) g12.A()).e(), str, true), 11);
    }
}
