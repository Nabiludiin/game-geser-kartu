package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: MyApplication */
class p34 extends q34 {

    /* renamed from: d, reason: collision with root package name */
    final l34 f13652d;

    /* renamed from: e, reason: collision with root package name */
    final Character f13653e;

    /* renamed from: f, reason: collision with root package name */
    private volatile q34 f13654f;

    p34(l34 l34Var, Character ch) {
        this.f13652d = l34Var;
        boolean z7 = true;
        if (ch != null && l34Var.e('=')) {
            z7 = false;
        }
        rx3.f(z7, "Padding character %s was already in alphabet", ch);
        this.f13653e = ch;
    }

    @Override // com.google.android.gms.internal.ads.q34
    void a(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        rx3.o(0, i8, bArr.length);
        while (i9 < i8) {
            int i10 = this.f13652d.f11390f;
            n(appendable, bArr, i9, Math.min(i10, i8 - i9));
            i9 += i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.q34
    int b(byte[] bArr, CharSequence charSequence) {
        int i7;
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
        int i8 = 0;
        int i9 = 0;
        while (i8 < e8.length()) {
            long j7 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i7 = l34Var.f11389e;
                if (i10 >= i7) {
                    break;
                }
                j7 <<= l34Var.f11388d;
                if (i8 + i10 < e8.length()) {
                    j7 |= l34Var.c(e8.charAt(i11 + i8));
                    i11++;
                }
                i10++;
            }
            int i12 = l34Var.f11390f;
            int i13 = i11 * l34Var.f11388d;
            int i14 = (i12 - 1) * 8;
            while (i14 >= (i12 * 8) - i13) {
                bArr[i9] = (byte) ((j7 >>> i14) & 255);
                i14 -= 8;
                i9++;
            }
            i8 += i7;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.q34
    final int c(int i7) {
        l34 l34Var = this.f13652d;
        return l34Var.f11389e * e44.b(i7, l34Var.f11390f, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.q34
    final int d(int i7) {
        return (int) (((this.f13652d.f11388d * i7) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.q34
    final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f13653e == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p34) {
            p34 p34Var = (p34) obj;
            if (this.f13652d.equals(p34Var.f13652d) && Objects.equals(this.f13653e, p34Var.f13653e)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q34
    public final q34 f() {
        return this.f13653e == null ? this : m(this.f13652d, null);
    }

    @Override // com.google.android.gms.internal.ads.q34
    public final q34 g() {
        q34 q34Var = this.f13654f;
        if (q34Var == null) {
            l34 l34Var = this.f13652d;
            l34 d8 = l34Var.d();
            q34Var = d8 == l34Var ? this : m(d8, this.f13653e);
            this.f13654f = q34Var;
        }
        return q34Var;
    }

    public final int hashCode() {
        Character ch = this.f13653e;
        return Objects.hashCode(ch) ^ this.f13652d.hashCode();
    }

    q34 m(l34 l34Var, Character ch) {
        return new p34(l34Var, ch);
    }

    final void n(Appendable appendable, byte[] bArr, int i7, int i8) {
        rx3.o(i7, i7 + i8, bArr.length);
        l34 l34Var = this.f13652d;
        int i9 = l34Var.f11390f;
        int i10 = 0;
        rx3.a(i8 <= i9);
        long j7 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            j7 = (j7 | (bArr[i7 + i11] & 255)) << 8;
        }
        int i12 = (i8 + 1) * 8;
        int i13 = l34Var.f11388d;
        while (i10 < i8 * 8) {
            appendable.append(l34Var.a(l34Var.f11387c & ((int) (j7 >>> ((i12 - i13) - i10)))));
            i10 += i13;
        }
        if (this.f13653e != null) {
            while (i10 < i9 * 8) {
                appendable.append('=');
                i10 += i13;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        l34 l34Var = this.f13652d;
        sb.append(l34Var);
        if (8 % l34Var.f11388d != 0) {
            Character ch = this.f13653e;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    p34(String str, String str2, Character ch) {
        this(new l34(str, str2.toCharArray()), ch);
    }
}
