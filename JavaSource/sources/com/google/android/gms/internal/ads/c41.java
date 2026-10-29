package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class c41 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f6246d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f6247e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f6248f;

    /* renamed from: a, reason: collision with root package name */
    public final int f6249a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6250b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6251c;

    static {
        String str = hi2.f9535a;
        f6246d = Integer.toString(0, 36);
        f6247e = Integer.toString(1, 36);
        f6248f = Integer.toString(2, 36);
    }

    public c41(int i7, int i8, int i9) {
        this.f6249a = i7;
        this.f6250b = i8;
        this.f6251c = i9;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f6246d, this.f6249a);
        bundle.putInt(f6247e, this.f6250b);
        bundle.putInt(f6248f, this.f6251c);
        return bundle;
    }
}
