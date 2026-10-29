package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public abstract class pm0 {

    /* renamed from: a, reason: collision with root package name */
    private final im0 f13924a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f13925b;

    public pm0() {
        im0 im0Var = new im0();
        this.f13924a = im0Var;
        this.f13925b = new AtomicInteger(0);
        p64.r(im0Var, new nm0(this), cm0.f6506g);
    }

    public final void a(mm0 mm0Var, km0 km0Var) {
        p64.r(this.f13924a, new om0(this, mm0Var, km0Var), cm0.f6506g);
    }

    public final void b(Object obj) {
        this.f13924a.b(obj);
    }

    public final void c() {
        this.f13924a.e(new Exception());
    }

    public final void d(Throwable th, String str) {
        this.f13924a.e(th);
        if (((Boolean) s2.b0.c().d(uy.p8)).booleanValue()) {
            r2.t.l().j(th, str);
        }
    }

    public final int e() {
        return this.f13925b.get();
    }

    final /* synthetic */ AtomicInteger f() {
        return this.f13925b;
    }
}
