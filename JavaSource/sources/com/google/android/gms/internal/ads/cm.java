package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* compiled from: MyApplication */
abstract class cm {

    /* renamed from: a, reason: collision with root package name */
    static boolean f6495a = false;

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f6496b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6497c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f6498d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final CountDownLatch f6499e = new CountDownLatch(1);

    static void a() {
        synchronized (f6498d) {
            try {
                if (!f6495a) {
                    f6495a = true;
                    new Thread(new bm(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static String b(byte[] bArr, String str) {
        ol c8 = c(bArr, str);
        return sl.a(c8 == null ? h(g(4096).e(), str, true) : ((pl) c8.A()).e(), true);
    }

    static ol c(byte[] bArr, String str) {
        Vector d8 = d(bArr, 255);
        if (d8 == null || d8.isEmpty()) {
            return null;
        }
        ol d02 = pl.d0();
        int size = d8.size();
        for (int i7 = 0; i7 < size; i7++) {
            d02.E(qy4.s(h((byte[]) d8.get(i7), str, false), 0, 256));
        }
        byte[] e8 = e(bArr);
        qy4 qy4Var = qy4.f14669r;
        d02.F(qy4.s(e8, 0, e8.length));
        return d02;
    }

    static Vector d(byte[] bArr, int i7) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i8 = length + 254;
        Vector vector = new Vector();
        for (int i9 = 0; i9 < i8 / 255; i9++) {
            int i10 = i9 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i10 > 255) {
                    length2 = i10 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i10, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.cm.f6496b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(byte[] r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.cm.f6497c
            monitor-enter(r0)
            a()     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.cm.f6499e     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            if (r2 != 0) goto L14
            goto L1d
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.cm.f6496b     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L19
            goto L1d
        L19:
            r1 = r2
            goto L1d
        L1b:
            r6 = move-exception
            goto L35
        L1d:
            if (r1 == 0) goto L2d
            r1.reset()     // Catch: java.lang.Throwable -> L1b
            r1.update(r6)     // Catch: java.lang.Throwable -> L1b
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.cm.f6496b     // Catch: java.lang.Throwable -> L1b
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r6
        L2d:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r6     // Catch: java.lang.Throwable -> L1b
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cm.e(byte[]):byte[]");
    }

    static xk g(int i7) {
        ak g12 = xk.g1();
        g12.z0(4096L);
        return (xk) g12.A();
    }

    private static byte[] h(byte[] bArr, String str, boolean z7) {
        byte[] array;
        int length = bArr.length;
        int i7 = true != z7 ? 255 : 239;
        if (length > i7) {
            bArr = g(4096).e();
        }
        int i8 = i7 + 1;
        int length2 = bArr.length;
        byte b8 = (byte) length2;
        if (length2 < i7) {
            byte[] bArr2 = new byte[i7 - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i8).put(b8).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i8).put(b8).put(bArr).array();
        }
        if (z7) {
            array = ByteBuffer.allocate(256).put(e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        em[] emVarArr = new rm().G2;
        int length3 = emVarArr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            emVarArr[i9].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new ql(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
