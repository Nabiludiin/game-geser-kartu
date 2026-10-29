package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class bx3 extends ax3 {

    /* renamed from: q, reason: collision with root package name */
    private final char f6124q;

    bx3(char c8) {
        this.f6124q = c8;
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final boolean a(char c8) {
        return c8 == this.f6124q;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i7 = this.f6124q;
        for (int i8 = 0; i8 < 4; i8++) {
            cArr[5 - i8] = "0123456789ABCDEF".charAt(i7 & 15);
            i7 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
