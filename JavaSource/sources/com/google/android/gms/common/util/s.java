package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* compiled from: MyApplication */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f4568a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
