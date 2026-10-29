package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: MyApplication */
final class s5 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final r5 f22600q;

    /* renamed from: r, reason: collision with root package name */
    private final int f22601r;

    /* renamed from: s, reason: collision with root package name */
    private final Throwable f22602s;

    /* renamed from: t, reason: collision with root package name */
    private final byte[] f22603t;

    /* renamed from: u, reason: collision with root package name */
    private final String f22604u;

    /* renamed from: v, reason: collision with root package name */
    private final Map f22605v;

    /* synthetic */ s5(String str, r5 r5Var, int i7, Throwable th, byte[] bArr, Map map, byte[] bArr2) {
        p3.o.m(r5Var);
        this.f22600q = r5Var;
        this.f22601r = i7;
        this.f22602s = th;
        this.f22603t = bArr;
        this.f22604u = str;
        this.f22605v = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22600q.a(this.f22604u, this.f22601r, this.f22602s, this.f22603t, this.f22605v);
    }
}
