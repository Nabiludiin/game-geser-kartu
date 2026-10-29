package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: MyApplication */
public final class q13 {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f14210a;

    public q13() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) s2.b0.c().d(uy.r7));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f14210a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f14210a;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
