package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
final class hb {

    /* renamed from: a, reason: collision with root package name */
    public final String f9406a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9407b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9408c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f9409d;

    private hb(String str, int i7, String str2, Set set) {
        this.f9407b = i7;
        this.f9406a = str;
        this.f9408c = str2;
        this.f9409d = set;
    }

    public static hb a(String str, int i7) {
        String str2;
        String trim = str.trim();
        rx3.a(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        String str3 = hi2.f9535a;
        String[] split = trim.split("\\.", -1);
        String str4 = split[0];
        HashSet hashSet = new HashSet();
        for (int i8 = 1; i8 < split.length; i8++) {
            hashSet.add(split[i8]);
        }
        return new hb(str4, i7, str2, hashSet);
    }

    public static hb b() {
        return new hb("", 0, "", Collections.EMPTY_SET);
    }
}
