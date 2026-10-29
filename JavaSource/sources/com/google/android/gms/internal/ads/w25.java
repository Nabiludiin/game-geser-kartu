package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: MyApplication */
public final class w25 {

    /* renamed from: h, reason: collision with root package name */
    public static final w25 f18003h;

    /* renamed from: a, reason: collision with root package name */
    public final int f18004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18005b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18006c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f18007d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18008e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18009f;

    /* renamed from: g, reason: collision with root package name */
    private int f18010g;

    static {
        lc4 lc4Var = new lc4();
        lc4Var.a(1);
        lc4Var.b(2);
        lc4Var.c(3);
        f18003h = lc4Var.g();
        lc4 lc4Var2 = new lc4();
        lc4Var2.a(1);
        lc4Var2.b(1);
        lc4Var2.c(2);
        lc4Var2.g();
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ w25(int i7, int i8, int i9, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.f18004a = i7;
        this.f18005b = i8;
        this.f18006c = i9;
        this.f18007d = bArr;
        this.f18008e = i10;
        this.f18009f = i11;
    }

    public static boolean a(w25 w25Var) {
        if (w25Var == null) {
            return true;
        }
        int i7 = w25Var.f18004a;
        if (i7 != -1 && i7 != 1 && i7 != 2) {
            return false;
        }
        int i8 = w25Var.f18005b;
        if (i8 != -1 && i8 != 2) {
            return false;
        }
        int i9 = w25Var.f18006c;
        if ((i9 != -1 && i9 != 3) || w25Var.f18007d != null) {
            return false;
        }
        int i10 = w25Var.f18009f;
        if (i10 != -1 && i10 != 8) {
            return false;
        }
        int i11 = w25Var.f18008e;
        return i11 == -1 || i11 == 8;
    }

    public static int b(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String h(int i7) {
        if (i7 == -1) {
            return "Unset color space";
        }
        if (i7 == 6) {
            return "BT2020";
        }
        if (i7 == 1) {
            return "BT709";
        }
        if (i7 == 2) {
            return "BT601";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 22);
        sb.append("Undefined color space ");
        sb.append(i7);
        return sb.toString();
    }

    private static String i(int i7) {
        if (i7 == -1) {
            return "Unset color transfer";
        }
        if (i7 == 10) {
            return "Gamma 2.2";
        }
        if (i7 == 1) {
            return "Linear";
        }
        if (i7 == 2) {
            return "sRGB";
        }
        if (i7 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i7 == 6) {
            return "ST2084 PQ";
        }
        if (i7 == 7) {
            return "HLG";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 25);
        sb.append("Undefined color transfer ");
        sb.append(i7);
        return sb.toString();
    }

    private static String j(int i7) {
        if (i7 == -1) {
            return "Unset color range";
        }
        if (i7 == 1) {
            return "Full range";
        }
        if (i7 == 2) {
            return "Limited range";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 22);
        sb.append("Undefined color range ");
        sb.append(i7);
        return sb.toString();
    }

    public final lc4 d() {
        return new lc4(this, null);
    }

    public final boolean e() {
        return (this.f18008e == -1 || this.f18009f == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w25.class == obj.getClass()) {
            w25 w25Var = (w25) obj;
            if (this.f18004a == w25Var.f18004a && this.f18005b == w25Var.f18005b && this.f18006c == w25Var.f18006c && Arrays.equals(this.f18007d, w25Var.f18007d) && this.f18008e == w25Var.f18008e && this.f18009f == w25Var.f18009f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.f18004a == -1 || this.f18005b == -1 || this.f18006c == -1) ? false : true;
    }

    public final String g() {
        String str;
        String str2;
        if (f()) {
            Object[] objArr = {h(this.f18004a), j(this.f18005b), i(this.f18006c)};
            String str3 = hi2.f9535a;
            str = String.format(Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (e()) {
            int i7 = this.f18008e;
            int i8 = this.f18009f;
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(i8).length());
            sb.append(i7);
            sb.append("/");
            sb.append(i8);
            str2 = sb.toString();
        } else {
            str2 = "NA/NA";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + str2.length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        return sb2.toString();
    }

    public final int hashCode() {
        int i7 = this.f18010g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = ((((((((((this.f18004a + 527) * 31) + this.f18005b) * 31) + this.f18006c) * 31) + Arrays.hashCode(this.f18007d)) * 31) + this.f18008e) * 31) + this.f18009f;
        this.f18010g = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        int i7 = this.f18008e;
        int i8 = this.f18006c;
        int i9 = this.f18005b;
        String h8 = h(this.f18004a);
        String j7 = j(i9);
        String i10 = i(i8);
        String str2 = "NA";
        if (i7 != -1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 8);
            sb.append(i7);
            sb.append("bit Luma");
            str = sb.toString();
        } else {
            str = "NA";
        }
        int i11 = this.f18009f;
        if (i11 != -1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 10);
            sb2.append(i11);
            sb2.append("bit Chroma");
            str2 = sb2.toString();
        }
        boolean z7 = this.f18007d != null;
        StringBuilder sb3 = new StringBuilder(h8.length() + 12 + j7.length() + 2 + i10.length() + 2 + String.valueOf(z7).length() + 2 + str.length() + 2 + str2.length() + 1);
        sb3.append("ColorInfo(");
        sb3.append(h8);
        sb3.append(", ");
        sb3.append(j7);
        sb3.append(", ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(z7);
        sb3.append(", ");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(str2);
        sb3.append(")");
        return sb3.toString();
    }
}
