package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class q5 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final int f14254a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14255b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14256c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14257d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14258e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14259f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14260g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f14261h;

    public q5(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f14254a = i7;
        this.f14255b = str;
        this.f14256c = str2;
        this.f14257d = i8;
        this.f14258e = i9;
        this.f14259f = i10;
        this.f14260g = i11;
        this.f14261h = bArr;
    }

    public static q5 b(y82 y82Var) {
        int b8 = y82Var.b();
        String i7 = th.i(y82Var.k(y82Var.b(), StandardCharsets.US_ASCII));
        String k7 = y82Var.k(y82Var.b(), StandardCharsets.UTF_8);
        int b9 = y82Var.b();
        int b10 = y82Var.b();
        int b11 = y82Var.b();
        int b12 = y82Var.b();
        int b13 = y82Var.b();
        byte[] bArr = new byte[b13];
        y82Var.L(bArr, 0, b13);
        return new q5(b8, i7, k7, b9, b10, b11, b12, bArr);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void a(lb lbVar) {
        lbVar.C(this.f14261h, this.f14254a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q5.class == obj.getClass()) {
            q5 q5Var = (q5) obj;
            if (this.f14254a == q5Var.f14254a && this.f14255b.equals(q5Var.f14255b) && this.f14256c.equals(q5Var.f14256c) && this.f14257d == q5Var.f14257d && this.f14258e == q5Var.f14258e && this.f14259f == q5Var.f14259f && this.f14260g == q5Var.f14260g && Arrays.equals(this.f14261h, q5Var.f14261h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f14254a + 527) * 31) + this.f14255b.hashCode()) * 31) + this.f14256c.hashCode()) * 31) + this.f14257d) * 31) + this.f14258e) * 31) + this.f14259f) * 31) + this.f14260g) * 31) + Arrays.hashCode(this.f14261h);
    }

    public final String toString() {
        String str = this.f14255b;
        int length = String.valueOf(str).length();
        String str2 = this.f14256c;
        StringBuilder sb = new StringBuilder(length + 32 + str2.length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }
}
