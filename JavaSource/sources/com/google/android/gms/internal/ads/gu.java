package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: MyApplication */
public final class gu {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f9144a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9145b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9146c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9147d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9148e;

    private gu(InputStream inputStream, boolean z7, boolean z8, long j7, boolean z9) {
        this.f9144a = inputStream;
        this.f9145b = z7;
        this.f9146c = z8;
        this.f9147d = j7;
        this.f9148e = z9;
    }

    public static gu a(InputStream inputStream, boolean z7, boolean z8, long j7, boolean z9) {
        return new gu(inputStream, z7, z8, j7, z9);
    }

    public final InputStream b() {
        return this.f9144a;
    }

    public final boolean c() {
        return this.f9145b;
    }

    public final boolean d() {
        return this.f9146c;
    }

    public final long e() {
        return this.f9147d;
    }

    public final boolean f() {
        return this.f9148e;
    }
}
