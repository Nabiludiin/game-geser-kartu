package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class me {
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair a8 = ne.a(randomAccessFile2);
            try {
                if (a8 == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                    sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb.append(length);
                    sb.append(" bytes");
                    throw new ie(sb.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) a8.first;
                long longValue = ((Long) a8.second).longValue();
                long j7 = (-20) + longValue;
                if (j7 >= 0) {
                    randomAccessFile2.seek(j7);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new ie("ZIP64 APK not supported");
                    }
                }
                long b8 = ne.b(byteBuffer);
                if (b8 >= longValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b8).length() + 82 + String.valueOf(longValue).length());
                    sb2.append("ZIP Central Directory offset out of range: ");
                    sb2.append(b8);
                    sb2.append(". ZIP End of Central Directory offset: ");
                    sb2.append(longValue);
                    throw new ie(sb2.toString());
                }
                if (ne.d(byteBuffer) + b8 != longValue) {
                    throw new ie("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (b8 < 32) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(b8).length() + 67);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(b8);
                    throw new ie(sb3.toString());
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                randomAccessFile2.seek(b8 - allocate.capacity());
                randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                    throw new ie("No APK Signing Block before ZIP Central Directory");
                }
                long j8 = allocate.getLong(0);
                if (j8 < allocate.capacity() || j8 > 2147483639) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j8).length() + 37);
                    sb4.append("APK Signing Block size out of range: ");
                    sb4.append(j8);
                    throw new ie(sb4.toString());
                }
                int i7 = (int) (8 + j8);
                long j9 = b8 - i7;
                if (j9 < 0) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j9).length() + 39);
                    sb5.append("APK Signing Block offset out of range: ");
                    sb5.append(j9);
                    throw new ie(sb5.toString());
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(i7);
                allocate2.order(byteOrder);
                randomAccessFile2.seek(j9);
                long j10 = b8;
                randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                long j11 = allocate2.getLong(0);
                if (j11 != j8) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j8).length());
                    sb6.append("APK Signing Block sizes in header and footer do not match: ");
                    sb6.append(j11);
                    sb6.append(" vs ");
                    sb6.append(j8);
                    throw new ie(sb6.toString());
                }
                Pair create = Pair.create(allocate2, Long.valueOf(j9));
                ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                long longValue2 = ((Long) create.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int capacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (capacity < 8) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(capacity).length() + 17);
                    sb7.append("end < start: ");
                    sb7.append(capacity);
                    sb7.append(" < ");
                    sb7.append(8);
                    throw new IllegalArgumentException(sb7.toString());
                }
                int capacity2 = byteBuffer2.capacity();
                if (capacity > byteBuffer2.capacity()) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(capacity).length() + 19 + String.valueOf(capacity2).length());
                    sb8.append("end > capacity: ");
                    sb8.append(capacity);
                    sb8.append(" > ");
                    sb8.append(capacity2);
                    throw new IllegalArgumentException(sb8.toString());
                }
                int limit = byteBuffer2.limit();
                int position = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(capacity);
                    byteBuffer2.position(8);
                    ByteBuffer slice = byteBuffer2.slice();
                    slice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    int i8 = 0;
                    while (slice.hasRemaining()) {
                        int i9 = i8 + 1;
                        if (slice.remaining() < 8) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i9).length() + 59);
                            sb9.append("Insufficient data to read size of APK Signing Block entry #");
                            sb9.append(i9);
                            throw new ie(sb9.toString());
                        }
                        long j12 = slice.getLong();
                        if (j12 < 4 || j12 > 2147483647L) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i9).length() + 45 + String.valueOf(j12).length());
                            sb10.append("APK Signing Block entry #");
                            sb10.append(i9);
                            sb10.append(" size out of range: ");
                            sb10.append(j12);
                            throw new ie(sb10.toString());
                        }
                        int i10 = (int) j12;
                        int position2 = slice.position() + i10;
                        if (i10 > slice.remaining()) {
                            int remaining = slice.remaining();
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i9).length() + 45 + String.valueOf(i10).length() + 13 + String.valueOf(remaining).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i9);
                            sb11.append(" size out of range: ");
                            sb11.append(i10);
                            sb11.append(", available: ");
                            sb11.append(remaining);
                            throw new ie(sb11.toString());
                        }
                        if (slice.getInt() == 1896449818) {
                            X509Certificate[][] b9 = b(randomAccessFile.getChannel(), new he(i(slice, i10 - 4), longValue2, j10, longValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return b9;
                        }
                        long j13 = longValue2;
                        long j14 = j10;
                        slice.position(position2);
                        i8 = i9;
                        j10 = j14;
                        longValue2 = j13;
                    }
                    throw new ie("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static X509Certificate[][] b(FileChannel fileChannel, he heVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer j7 = j(heVar.a());
                int i7 = 0;
                while (j7.hasRemaining()) {
                    i7++;
                    try {
                        arrayList.add(c(j(j7), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e8) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 37);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i7);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e8);
                    }
                }
                if (i7 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                d(hashMap, fileChannel, heVar.b(), heVar.c(), heVar.d(), heVar.e());
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e9) {
                throw new SecurityException("Failed to read list of signers", e9);
            }
        } catch (CertificateException e10) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = f(r6);
        r12 = f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate[] c(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.me.c(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static void d(Map map, FileChannel fileChannel, long j7, long j8, long j9, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        ge geVar = new ge(fileChannel, 0L, j7);
        ge geVar2 = new ge(fileChannel, j8, j9 - j8);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        ne.c(duplicate, j7);
        ee eeVar = new ee(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Integer) it.next()).intValue();
            i7++;
        }
        try {
            byte[][] e8 = e(iArr, new fe[]{geVar, geVar2, eeVar});
            for (int i8 = 0; i8 < size; i8++) {
                int i9 = iArr[i8];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i9)), e8[i8])) {
                    throw new SecurityException(g(i9).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e9) {
            throw new SecurityException("Failed to compute digest(s) of contents", e9);
        }
    }

    private static byte[][] e(int[] iArr, fe[] feVarArr) {
        long j7;
        int i7;
        int length;
        char c8;
        int i8;
        String str;
        int i9 = 0;
        long j8 = 0;
        while (true) {
            j7 = 1048576;
            i7 = 3;
            if (i9 >= 3) {
                break;
            }
            j8 += (feVarArr[i9].a() + 1048575) / 1048576;
            i9++;
        }
        if (j8 >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(j8).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(j8);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i10 = 0;
        while (true) {
            length = iArr.length;
            c8 = 5;
            i8 = 1;
            if (i10 >= length) {
                break;
            }
            int i11 = (int) j8;
            byte[] bArr2 = new byte[(h(iArr[i10]) * i11) + 5];
            bArr2[0] = 90;
            l(i11, bArr2, 1);
            bArr[i10] = bArr2;
            i10++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i12 = 0;
        while (true) {
            str = " digest not supported";
            if (i12 >= iArr.length) {
                break;
            }
            String g8 = g(iArr[i12]);
            try {
                messageDigestArr[i12] = MessageDigest.getInstance(g8);
                i12++;
            } catch (NoSuchAlgorithmException e8) {
                throw new RuntimeException(g8.concat(" digest not supported"), e8);
            }
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i7) {
            fe feVar = feVarArr[i13];
            int i16 = i13;
            long a8 = feVar.a();
            long j9 = 0;
            while (a8 > 0) {
                int i17 = i14;
                String str2 = str;
                int min = (int) Math.min(a8, j7);
                l(min, bArr3, i8);
                for (int i18 = 0; i18 < length; i18++) {
                    messageDigestArr[i18].update(bArr3);
                }
                try {
                    feVar.b(messageDigestArr, j9, min);
                    int i19 = 0;
                    while (i19 < iArr.length) {
                        int i20 = iArr[i19];
                        byte[] bArr4 = bArr[i19];
                        int h8 = h(i20);
                        char c9 = c8;
                        MessageDigest messageDigest = messageDigestArr[i19];
                        int digest = messageDigest.digest(bArr4, (i17 * h8) + 5, h8);
                        if (digest != h8) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(digest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i19++;
                        c8 = c9;
                    }
                    long j10 = min;
                    j9 += j10;
                    a8 -= j10;
                    i14 = i17 + 1;
                    str = str2;
                    j7 = 1048576;
                    i8 = 1;
                } catch (IOException e9) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i17).length() + 37 + String.valueOf(i15).length());
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i17);
                    sb3.append(" of section #");
                    sb3.append(i15);
                    throw new DigestException(sb3.toString(), e9);
                }
            }
            i15++;
            i13 = i16 + 1;
            j7 = 1048576;
            i7 = 3;
            i8 = 1;
        }
        String str3 = str;
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i21 = 0; i21 < iArr.length; i21++) {
            int i22 = iArr[i21];
            byte[] bArr6 = bArr[i21];
            String g9 = g(i22);
            try {
                bArr5[i21] = MessageDigest.getInstance(g9).digest(bArr6);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(g9.concat(str3), e10);
            }
        }
        return bArr5;
    }

    private static int f(int i7) {
        if (i7 == 513) {
            return 1;
        }
        if (i7 == 514) {
            return 2;
        }
        if (i7 == 769) {
            return 1;
        }
        switch (i7) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
        }
    }

    private static String g(int i7) {
        if (i7 == 1) {
            return "SHA-256";
        }
        if (i7 == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 33);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int h(int i7) {
        if (i7 == 1) {
            return 32;
        }
        if (i7 == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 33);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    private static ByteBuffer i(ByteBuffer byteBuffer, int i7) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i8 = i7 + position;
        if (i8 < position || i8 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i8);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i8);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer j(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(String.valueOf(remaining).length() + 82);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i7 <= byteBuffer.remaining()) {
            return i(byteBuffer, i7);
        }
        int remaining2 = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 79 + String.valueOf(remaining2).length());
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i7);
        sb2.append(", remaining: ");
        sb2.append(remaining2);
        throw new IOException(sb2.toString());
    }

    private static byte[] k(ByteBuffer byteBuffer) {
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IOException("Negative length");
        }
        if (i7 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i7];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 68 + String.valueOf(remaining).length());
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i7);
        sb.append(", available: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }

    private static void l(int i7, byte[] bArr, int i8) {
        bArr[1] = (byte) (i7 & 255);
        bArr[2] = (byte) ((i7 >>> 8) & 255);
        bArr[3] = (byte) ((i7 >>> 16) & 255);
        bArr[4] = (byte) (i7 >> 24);
    }
}
