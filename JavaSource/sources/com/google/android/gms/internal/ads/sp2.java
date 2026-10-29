package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class sp2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15739a;

    public static String a(int i7) {
        char c8 = (char) ((i7 >> 24) & 255);
        int length = String.valueOf(c8).length();
        char c9 = (char) ((i7 >> 16) & 255);
        int length2 = String.valueOf(c9).length();
        char c10 = (char) ((i7 >> 8) & 255);
        char c11 = (char) (i7 & 255);
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(c10).length() + String.valueOf(c11).length());
        sb.append(c8);
        sb.append(c9);
        sb.append(c10);
        sb.append(c11);
        return sb.toString();
    }

    public String toString() {
        return a(this.f15739a);
    }
}
