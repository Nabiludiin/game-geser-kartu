package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nk2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12767a;

    private nk2(int i7, int i8, String str) {
        this.f12767a = str;
    }

    public static nk2 a(y82 y82Var) {
        String str;
        y82Var.J(2);
        int R = y82Var.R();
        int i7 = R >> 1;
        int i8 = R & 1;
        int R2 = y82Var.R() >> 3;
        if (i7 == 4 || i7 == 5 || i7 == 7 || i7 == 8) {
            str = "dvhe";
        } else if (i7 == 9) {
            str = "dvav";
        } else {
            if (i7 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i9 = R2 | (i8 << 5);
        int length = String.valueOf(i7).length();
        int length2 = String.valueOf(i9).length();
        String str2 = i7 < 10 ? ".0" : ".";
        int length3 = str.length() + str2.length() + length;
        String str3 = i9 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(length3 + str3.length() + length2);
        sb.append(str);
        sb.append(str2);
        sb.append(i7);
        sb.append(str3);
        sb.append(i9);
        return new nk2(i7, i9, sb.toString());
    }
}
