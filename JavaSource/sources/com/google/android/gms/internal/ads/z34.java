package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class z34 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f20001a;

    public z34(Pattern pattern) {
        pattern.getClass();
        this.f20001a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f20001a.matcher(str).matches();
    }
}
