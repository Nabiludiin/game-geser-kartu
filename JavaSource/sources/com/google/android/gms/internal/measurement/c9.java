package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: MyApplication */
public final class c9 {

    /* renamed from: a, reason: collision with root package name */
    final Uri f20853a;

    /* renamed from: b, reason: collision with root package name */
    final String f20854b;

    /* renamed from: c, reason: collision with root package name */
    final String f20855c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f20856d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f20857e;

    private c9(String str, Uri uri, String str2, String str3, boolean z7, boolean z8, boolean z9, boolean z10, y4.c cVar) {
        this.f20853a = uri;
        this.f20854b = "";
        this.f20855c = "";
        this.f20856d = z7;
        this.f20857e = z9;
    }

    public final c9 a() {
        String str = this.f20854b;
        if (str.isEmpty()) {
            return new c9(null, this.f20853a, str, this.f20855c, true, false, this.f20857e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final c9 b() {
        return new c9(null, this.f20853a, this.f20854b, this.f20855c, this.f20856d, false, true, false, null);
    }

    public final i9 c(String str, long j7) {
        Long valueOf = Long.valueOf(j7);
        int i7 = i9.f21033j;
        return new y8(this, str, valueOf, true);
    }

    public final i9 d(String str, boolean z7) {
        Boolean valueOf = Boolean.valueOf(z7);
        int i7 = i9.f21033j;
        return new z8(this, str, valueOf, true);
    }

    public final i9 e(String str, double d8) {
        Double valueOf = Double.valueOf(-3.0d);
        int i7 = i9.f21033j;
        return new a9(this, "measurement.test.double_flag", valueOf, true);
    }

    public final i9 f(String str, String str2) {
        int i7 = i9.f21033j;
        return new b9(this, str, str2, true);
    }

    public c9(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
