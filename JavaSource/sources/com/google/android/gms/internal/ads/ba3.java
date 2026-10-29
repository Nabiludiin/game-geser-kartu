package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ba3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5660a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5661b;

    private ba3(String str, String str2) {
        this.f5660a = str;
        this.f5661b = str2;
    }

    public static ba3 a(String str, String str2) {
        lb3.c(str, "Name is null or empty");
        lb3.c(str2, "Version is null or empty");
        return new ba3(str, str2);
    }

    public final String b() {
        return this.f5660a;
    }

    public final String c() {
        return this.f5661b;
    }
}
