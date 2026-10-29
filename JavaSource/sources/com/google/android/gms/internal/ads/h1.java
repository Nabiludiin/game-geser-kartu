package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f9281a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f9282b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static g1 a(byte[] bArr) {
        return b(new w72(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.g1 b(com.google.android.gms.internal.ads.w72 r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h1.b(com.google.android.gms.internal.ads.w72, boolean):com.google.android.gms.internal.ads.g1");
    }

    private static int c(w72 w72Var) {
        int j7 = w72Var.j(5);
        return j7 == 31 ? w72Var.j(6) + 32 : j7;
    }

    private static int d(w72 w72Var) {
        int j7 = w72Var.j(4);
        if (j7 == 15) {
            if (w72Var.c() >= 24) {
                return w72Var.j(24);
            }
            throw wi.b("AAC header insufficient data", null);
        }
        if (j7 < 13) {
            return f9281a[j7];
        }
        throw wi.b("AAC header wrong Sampling Frequency Index", null);
    }
}
