package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: MyApplication */
public class wi extends IOException {

    /* renamed from: q, reason: collision with root package name */
    public final boolean f18255q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18256r;

    protected wi(String str, Throwable th, boolean z7, int i7) {
        super(str, th);
        this.f18255q = z7;
        this.f18256r = i7;
    }

    public static wi a(String str, Throwable th) {
        return new wi(str, th, true, 0);
    }

    public static wi b(String str, Throwable th) {
        return new wi(str, th, true, 1);
    }

    public static wi c(String str) {
        return new wi(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String concat = message != null ? message.concat(" ") : "";
        boolean z7 = this.f18255q;
        int i7 = this.f18256r;
        StringBuilder sb = new StringBuilder(concat.length() + 20 + String.valueOf(z7).length() + 11 + String.valueOf(i7).length() + 1);
        sb.append(concat);
        sb.append("{contentIsMalformed=");
        sb.append(z7);
        sb.append(", dataType=");
        sb.append(i7);
        sb.append("}");
        return sb.toString();
    }
}
