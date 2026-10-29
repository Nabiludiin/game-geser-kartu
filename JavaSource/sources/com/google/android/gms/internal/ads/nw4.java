package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class nw4 {

    /* renamed from: d, reason: collision with root package name */
    public static final nw4 f13086d = new nw4("", "", false);

    /* renamed from: a, reason: collision with root package name */
    private final String f13087a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13088b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13089c;

    static {
        new nw4("\n", "  ", true);
    }

    private nw4(String str, String str2, boolean z7) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f13087a = str;
        this.f13088b = str2;
        this.f13089c = z7;
    }

    public final String a() {
        return this.f13087a;
    }

    public final String b() {
        return this.f13088b;
    }

    public final boolean c() {
        return this.f13089c;
    }
}
