package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Map;

/* compiled from: MyApplication */
public final class v10 extends k20 {

    /* renamed from: q, reason: collision with root package name */
    private final Drawable f17346q;

    /* renamed from: r, reason: collision with root package name */
    private final Uri f17347r;

    /* renamed from: s, reason: collision with root package name */
    private final double f17348s;

    /* renamed from: t, reason: collision with root package name */
    private final int f17349t;

    /* renamed from: u, reason: collision with root package name */
    private final int f17350u;

    /* renamed from: v, reason: collision with root package name */
    private final Map f17351v;

    public v10(Drawable drawable, Uri uri, double d8, int i7, int i8, Map map) {
        this.f17346q = drawable;
        this.f17347r = uri;
        this.f17348s = d8;
        this.f17349t = i7;
        this.f17350u = i8;
        this.f17351v = map;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final w3.a b() {
        return w3.b.C1(this.f17346q);
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final int c() {
        return this.f17349t;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final Uri d() {
        return this.f17347r;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final int e() {
        return this.f17350u;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final Map f() {
        return this.f17351v;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final double h() {
        return this.f17348s;
    }
}
