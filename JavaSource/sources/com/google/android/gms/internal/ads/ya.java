package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: MyApplication */
public final class ya implements s9 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f19434a = new y82();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19435b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19436c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19437d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19438e;

    /* renamed from: f, reason: collision with root package name */
    private final float f19439f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19440g;

    public ya(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f19436c = 0;
            this.f19437d = -1;
            this.f19438e = "sans-serif";
            this.f19435b = false;
            this.f19439f = 0.85f;
            this.f19440g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f19436c = bArr[24];
        this.f19437d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f19438e = true == "Serif".equals(hi2.G(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f19440g = i7;
        boolean z7 = (bArr[0] & 32) != 0;
        this.f19435b = z7;
        if (z7) {
            this.f19439f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.95f));
        } else {
            this.f19439f = 0.85f;
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            int i12 = i11 | 33;
            int i13 = i7 & 1;
            int i14 = i7 & 2;
            boolean z7 = true;
            if (i13 == 0) {
                if (i14 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
                }
                z7 = false;
            } else if (i14 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                z7 = false;
            }
            if ((i7 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            } else {
                if (i13 != 0 || z7) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
            }
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.s9
    public final void a(byte[] bArr, int i7, int i8, r9 r9Var, th1 th1Var) {
        String k7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        y82 y82Var = this.f19434a;
        y82Var.A(bArr, i7 + i8);
        y82Var.G(i7);
        int i18 = 1;
        int i19 = 0;
        int i20 = 2;
        rx3.a(y82Var.C() >= 2);
        int S = y82Var.S();
        if (S == 0) {
            k7 = "";
        } else {
            int F = y82Var.F();
            Charset r7 = y82Var.r();
            int F2 = y82Var.F() - F;
            if (r7 == null) {
                r7 = StandardCharsets.UTF_8;
            }
            k7 = y82Var.k(S - F2, r7);
        }
        if (k7.isEmpty()) {
            th1Var.d(new k9(w04.m(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k7);
        int i21 = this.f19436c;
        b(spannableStringBuilder, i21, 0, 0, spannableStringBuilder.length(), 16711680);
        int i22 = i21;
        int i23 = this.f19437d;
        c(spannableStringBuilder, i23, -1, 0, spannableStringBuilder.length(), 16711680);
        int i24 = i23;
        String str = this.f19438e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f8 = this.f19439f;
        while (y82Var.C() >= 8) {
            int F3 = y82Var.F();
            int b8 = y82Var.b();
            int b9 = y82Var.b();
            if (b9 == 1937013100) {
                rx3.a(y82Var.C() >= i20 ? i18 : i19);
                int S2 = y82Var.S();
                int i25 = i19;
                while (i25 < S2) {
                    rx3.a(y82Var.C() >= 12 ? i18 : i19);
                    int S3 = y82Var.S();
                    int S4 = y82Var.S();
                    y82Var.J(i20);
                    int i26 = S2;
                    int R = y82Var.R();
                    y82Var.J(i18);
                    int b10 = y82Var.b();
                    int i27 = i20;
                    if (S4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i12 = i22;
                        i13 = i24;
                        StringBuilder sb = new StringBuilder(String.valueOf(S4).length() + 44 + String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(S4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        gv1.c("Tx3gParser", sb.toString());
                        S4 = spannableStringBuilder.length();
                    } else {
                        i12 = i22;
                        i13 = i24;
                    }
                    if (S3 >= S4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(S3).length() + 36 + String.valueOf(S4).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(S3);
                        sb2.append(") >= end (");
                        sb2.append(S4);
                        sb2.append(").");
                        gv1.c("Tx3gParser", sb2.toString());
                        i16 = i12;
                        i15 = i25;
                        i14 = i26;
                        i17 = i13;
                    } else {
                        i14 = i26;
                        i15 = i25;
                        int i28 = i12;
                        b(spannableStringBuilder, R, i28, S3, S4, 0);
                        i16 = i28;
                        i17 = i13;
                        c(spannableStringBuilder, b10, i17, S3, S4, 0);
                    }
                    i20 = i27;
                    S2 = i14;
                    i22 = i16;
                    i24 = i17;
                    i18 = 1;
                    i25 = i15 + 1;
                    i19 = 0;
                }
                i9 = i22;
                i10 = i24;
                i11 = i20;
            } else {
                i9 = i22;
                int i29 = i20;
                i10 = i24;
                if (b9 == 1952608120 && this.f19435b) {
                    i11 = i29;
                    rx3.a(y82Var.C() >= i11);
                    float S5 = y82Var.S();
                    int i30 = this.f19440g;
                    String str2 = hi2.f9535a;
                    f8 = Math.max(0.0f, Math.min(S5 / i30, 0.95f));
                } else {
                    i11 = i29;
                }
            }
            y82Var.G(F3 + b8);
            i22 = i9;
            i20 = i11;
            i24 = i10;
            i18 = 1;
            i19 = 0;
        }
        uv0 uv0Var = new uv0();
        uv0Var.a(spannableStringBuilder);
        uv0Var.f(f8, 0);
        uv0Var.g(0);
        th1Var.d(new k9(w04.n(uv0Var.r()), -9223372036854775807L, -9223372036854775807L));
    }
}
