package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: MyApplication */
final class mu5 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f12445a;

    /* renamed from: b, reason: collision with root package name */
    private final ou5 f12446b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12447c;

    public mu5(Handler handler, ou5 ou5Var) {
        this.f12445a = handler;
        this.f12446b = ou5Var;
    }

    public final void a() {
        this.f12447c = true;
    }

    final /* synthetic */ Handler b() {
        return this.f12445a;
    }

    final /* synthetic */ ou5 c() {
        return this.f12446b;
    }

    final /* synthetic */ boolean d() {
        return this.f12447c;
    }
}
