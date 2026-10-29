package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class fu0 implements zm {

    /* renamed from: q, reason: collision with root package name */
    private final Context f8489q;

    /* renamed from: r, reason: collision with root package name */
    private final hi3 f8490r;

    fu0(Context context, w2.a aVar) {
        this.f8489q = context;
        int intValue = ((Integer) s2.b0.c().d(uy.f17103g3)).intValue();
        int i7 = intValue != 1 ? (intValue == 2 || intValue != 3) ? 3 : 4 : 2;
        dj3 h02 = ej3.h0();
        h02.E(((Float) s2.b0.c().d(uy.f17161n3)).floatValue());
        ej3 ej3Var = (ej3) h02.A();
        fj3 h03 = gj3.h0();
        h03.E(((Boolean) s2.b0.c().d(uy.f17169o3)).booleanValue());
        h03.F(((Long) s2.b0.c().d(uy.f17185q3)).longValue());
        gj3 gj3Var = (gj3) h03.A();
        ki3 y02 = li3.y0();
        y02.M(i7);
        y02.F(aVar.f27051q);
        y02.E(((Boolean) s2.b0.c().d(uy.K2)).booleanValue());
        y02.L(((Integer) s2.b0.c().d(uy.f17076d3)).intValue() == -1);
        y02.K(((Integer) s2.b0.c().d(uy.f17094f3)).intValue());
        y02.I(((Long) s2.b0.c().d(uy.f17177p3)).longValue());
        y02.H(((Integer) s2.b0.c().d(uy.f17085e3)).intValue());
        y02.G(ej3Var);
        y02.J(gj3Var);
        hi3 a8 = hi3.a(context, cm0.f6500a, (li3) y02.A());
        this.f8490r = a8;
        a8.b();
    }

    public final String a() {
        int h8 = this.f8490r.h() - 1;
        return h8 != 1 ? h8 != 2 ? h8 != 3 ? "uns" : "3.0" : "2.0" : "1.0";
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void e(int i7, int i8, int i9) {
        s2.z.a();
        Context context = this.f8489q;
        float c8 = w2.g.c(context, i7);
        s2.z.a();
        float c9 = w2.g.c(context, i8);
        hi3 hi3Var = this.f8490r;
        long j7 = i9;
        MotionEvent obtain = MotionEvent.obtain(0L, j7, 0, c8, c9, 0);
        hi3Var.g(obtain);
        obtain.recycle();
        s2.z.a();
        float c10 = w2.g.c(context, i7);
        s2.z.a();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j7, 2, c10, w2.g.c(context, i8), 0);
        hi3Var.g(obtain2);
        obtain2.recycle();
        s2.z.a();
        float c11 = w2.g.c(context, i7);
        s2.z.a();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j7, 1, c11, w2.g.c(context, i8), 0);
        hi3Var.g(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void f(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f8490r.g(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String g(Context context, String str, View view, Activity activity) {
        return this.f8490r.e(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String h(Context context) {
        return this.f8490r.c(context);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void i(StackTraceElement[] stackTraceElementArr) {
        this.f8490r.f(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String j(Context context) {
        return this.f8490r.c(context);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String l(Context context, String str, View view) {
        return this.f8490r.e(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String m(Context context, View view, Activity activity) {
        return this.f8490r.d(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void k(View view) {
    }
}
