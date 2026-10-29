package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class n34 extends p34 {
    private n34(l34 l34Var, Character ch) {
        super(l34Var, ch);
        rx3.a(l34Var.f().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.p34, com.google.android.gms.internal.ads.q34
    final void a(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        rx3.o(0, i8, bArr.length);
        for (int i10 = i8; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i9] & 255;
            int i12 = bArr[i9 + 1] & 255;
            int i13 = bArr[i9 + 2] & 255;
            l34 l34Var = this.f13652d;
            int i14 = (i12 << 8) | (i11 << 16) | i13;
            appendable.append(l34Var.a(i14 >>> 18));
            appendable.append(l34Var.a((i14 >>> 12) & 63));
            appendable.append(l34Var.a((i14 >>> 6) & 63));
            appendable.append(l34Var.a(i14 & 63));
            i9 += 3;
        }
        if (i9 < i8) {
            n(appendable, bArr, i9, i8 - i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.p34, com.google.android.gms.internal.ads.q34
    final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence e8 = e(charSequence);
        int length = e8.length();
        l34 l34Var = this.f13652d;
        if (!l34Var.b(length)) {
            int length2 = e8.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new o34(sb.toString());
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < e8.length()) {
            int i9 = i8 + 1;
            int c8 = (l34Var.c(e8.charAt(i7 + 1)) << 12) | (l34Var.c(e8.charAt(i7)) << 18);
            bArr[i8] = (byte) (c8 >>> 16);
            int i10 = i7 + 2;
            if (i10 < e8.length()) {
                int i11 = i7 + 3;
                int c9 = c8 | (l34Var.c(e8.charAt(i10)) << 6);
                int i12 = i8 + 2;
                bArr[i9] = (byte) ((c9 >>> 8) & 255);
                if (i11 < e8.length()) {
                    i7 += 4;
                    i8 += 3;
                    bArr[i12] = (byte) ((c9 | l34Var.c(e8.charAt(i11))) & 255);
                } else {
                    i8 = i12;
                    i7 = i11;
                }
            } else {
                i7 = i10;
                i8 = i9;
            }
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.p34
    final q34 m(l34 l34Var, Character ch) {
        return new n34(l34Var, ch);
    }

    n34(String str, String str2, Character ch) {
        this(new l34(str, str2.toCharArray()), ch);
    }
}
