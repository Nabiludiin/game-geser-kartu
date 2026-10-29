package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: MyApplication */
public final class qn0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14512a;

    /* renamed from: b, reason: collision with root package name */
    private final bo0 f14513b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f14514c;

    /* renamed from: d, reason: collision with root package name */
    private final rx1 f14515d;

    /* renamed from: e, reason: collision with root package name */
    private pn0 f14516e;

    public qn0(Context context, ViewGroup viewGroup, mr0 mr0Var, rx1 rx1Var) {
        this.f14512a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f14514c = viewGroup;
        this.f14513b = mr0Var;
        this.f14516e = null;
        this.f14515d = rx1Var;
    }

    public final Integer a() {
        pn0 pn0Var = this.f14516e;
        if (pn0Var != null) {
            return pn0Var.x();
        }
        return null;
    }

    public final void b(int i7, int i8, int i9, int i10) {
        p3.o.f("The underlay may only be modified from the UI thread.");
        pn0 pn0Var = this.f14516e;
        if (pn0Var != null) {
            pn0Var.z(i7, i8, i9, i10);
        }
    }

    public final void c(int i7, int i8, int i9, int i10, int i11, boolean z7, ao0 ao0Var) {
        if (this.f14516e != null) {
            return;
        }
        bo0 bo0Var = this.f14513b;
        cz.a(bo0Var.m().c(), bo0Var.j(), "vpr2");
        pn0 pn0Var = new pn0(this.f14512a, bo0Var, i11, z7, bo0Var.m().c(), ao0Var, this.f14515d);
        this.f14516e = pn0Var;
        this.f14514c.addView(pn0Var, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f14516e.z(i7, i8, i9, i10);
        bo0Var.U0(false);
    }

    public final pn0 d() {
        return this.f14516e;
    }

    public final void e() {
        p3.o.f("onPause must be called from the UI thread.");
        pn0 pn0Var = this.f14516e;
        if (pn0Var != null) {
            pn0Var.D();
        }
    }

    public final void f() {
        p3.o.f("onDestroy must be called from the UI thread.");
        pn0 pn0Var = this.f14516e;
        if (pn0Var != null) {
            pn0Var.p();
            this.f14514c.removeView(this.f14516e);
            this.f14516e = null;
        }
    }

    public final void g(int i7) {
        pn0 pn0Var = this.f14516e;
        if (pn0Var != null) {
            pn0Var.y(i7);
        }
    }
}
