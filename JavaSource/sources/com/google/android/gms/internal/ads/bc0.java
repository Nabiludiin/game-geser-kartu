package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* compiled from: MyApplication */
public final class bc0 implements y2.e {

    /* renamed from: a, reason: collision with root package name */
    private final Date f5705a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5706b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f5707c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5708d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f5709e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5710f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5711g;

    public bc0(Date date, int i7, Set set, Location location, boolean z7, int i8, boolean z8, int i9, String str) {
        this.f5705a = date;
        this.f5706b = i7;
        this.f5707c = set;
        this.f5709e = location;
        this.f5708d = z7;
        this.f5710f = i8;
        this.f5711g = z8;
    }

    @Override // y2.e
    public final int d() {
        return this.f5710f;
    }

    @Override // y2.e
    public final boolean f() {
        return this.f5711g;
    }

    @Override // y2.e
    public final boolean g() {
        return this.f5708d;
    }

    @Override // y2.e
    public final Set h() {
        return this.f5707c;
    }
}
