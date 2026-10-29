package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class sz3 {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String obj3 = obj.toString();
        StringBuilder sb = new StringBuilder(obj3.length() + 26);
        sb.append("null value in entry: ");
        sb.append(obj3);
        sb.append("=null");
        throw new NullPointerException(sb.toString());
    }

    static int b(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i7).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }
}
