package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public abstract class qe1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f14404a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f14405b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f14406c = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14407d = 0;

    public static String a(int i7, int i8, int i9) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static String b(int i7, boolean z7, int i8, int i9, int[] iArr, int i10) {
        Object[] objArr = {f14405b[i7], Integer.valueOf(i8), Integer.valueOf(i9), Character.valueOf(true != z7 ? 'L' : 'H'), Integer.valueOf(i10)};
        String str = hi2.f9535a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i11 = 6;
        while (i11 > 0) {
            int i12 = i11 - 1;
            if (iArr[i12] != 0) {
                break;
            }
            i11 = i12;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb.toString();
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        rx3.d(length >= 17, "Invalid APV CSD length: %s", length);
        byte b8 = bArr[0];
        rx3.d(b8 == 1, "Invalid APV CSD version: %s", b8);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = hi2.f9535a;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0159, code lost:
    
        if (r0.equals("11") != false) goto L104;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0456 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(com.google.android.gms.internal.ads.eq5 r26) {
        /*
            Method dump skipped, instructions count: 2276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qe1.d(com.google.android.gms.internal.ads.eq5):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair e(java.lang.String r8, java.lang.String[] r9, com.google.android.gms.internal.ads.w25 r10) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qe1.e(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.w25):android.util.Pair");
    }

    public static byte[] f(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8 + 4];
        System.arraycopy(f14404a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i7, bArr2, 4, i8);
        return bArr2;
    }
}
