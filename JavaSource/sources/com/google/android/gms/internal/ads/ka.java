package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: MyApplication */
public abstract class ka {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f10935a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private static String f10936b = "media3.common";

    public static synchronized String a() {
        String str;
        synchronized (ka.class) {
            str = f10936b;
        }
        return str;
    }

    public static synchronized void b(String str) {
        synchronized (ka.class) {
            if (f10935a.add(str)) {
                String str2 = f10936b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                f10936b = sb.toString();
            }
        }
    }
}
