package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class m34 extends p34 {

    /* renamed from: g, reason: collision with root package name */
    final char[] f12063g;

    private m34(l34 l34Var) {
        super(l34Var, null);
        this.f12063g = new char[512];
        rx3.a(l34Var.f().length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            this.f12063g[i7] = l34Var.a(i7 >>> 4);
            this.f12063g[i7 | 256] = l34Var.a(i7 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.p34, com.google.android.gms.internal.ads.q34
    final void a(Appendable appendable, byte[] bArr, int i7, int i8) {
        rx3.o(0, i8, bArr.length);
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = bArr[i9] & 255;
            char[] cArr = this.f12063g;
            appendable.append(cArr[i10]);
            appendable.append(cArr[i10 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.p34, com.google.android.gms.internal.ads.q34
    final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new o34(sb.toString());
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            l34 l34Var = this.f13652d;
            bArr[i8] = (byte) (l34Var.c(charSequence.charAt(i7 + 1)) | (l34Var.c(charSequence.charAt(i7)) << 4));
            i7 += 2;
            i8++;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.p34
    final q34 m(l34 l34Var, Character ch) {
        return new m34(l34Var);
    }

    m34(String str, String str2) {
        this(new l34("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
