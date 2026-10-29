package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class mk5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12291a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12293c;

    /* renamed from: e, reason: collision with root package name */
    private ok5 f12295e;

    /* renamed from: f, reason: collision with root package name */
    private kk5 f12296f;

    /* renamed from: b, reason: collision with root package name */
    private final yi5 f12292b = yi5.f19608c;

    /* renamed from: d, reason: collision with root package name */
    private final lk5 f12294d = lk5.f11636a;

    public mk5(Context context) {
        this.f12291a = context;
    }

    public final sl5 a() {
        rx3.h(!this.f12293c);
        this.f12293c = true;
        if (this.f12295e == null) {
            this.f12295e = new ok5(new nq0[0]);
        }
        if (this.f12296f == null) {
            this.f12296f = new kk5(this.f12291a);
        }
        return new sl5(this, null);
    }

    final /* synthetic */ Context b() {
        return this.f12291a;
    }

    final /* synthetic */ yi5 c() {
        return this.f12292b;
    }

    final /* synthetic */ ok5 d() {
        return this.f12295e;
    }

    final /* synthetic */ kk5 e() {
        return this.f12296f;
    }
}
