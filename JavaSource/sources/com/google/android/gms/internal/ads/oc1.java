package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: MyApplication */
public final class oc1 {

    /* renamed from: a, reason: collision with root package name */
    private final zn1 f13282a;

    /* renamed from: b, reason: collision with root package name */
    private final zn1 f13283b;

    /* renamed from: c, reason: collision with root package name */
    private final nb1 f13284c;

    /* renamed from: d, reason: collision with root package name */
    private Object f13285d;

    /* renamed from: e, reason: collision with root package name */
    private Object f13286e;

    /* renamed from: f, reason: collision with root package name */
    private int f13287f;

    public oc1(Object obj, Looper looper, Looper looper2, pd1 pd1Var, nb1 nb1Var) {
        this.f13282a = pd1Var.c(looper, null);
        this.f13283b = pd1Var.c(looper2, null);
        this.f13285d = obj;
        this.f13286e = obj;
        this.f13284c = nb1Var;
    }

    private final void g(Runnable runnable) {
        zn1 zn1Var = this.f13283b;
        if (zn1Var.a().getThread().isAlive()) {
            zn1Var.j(runnable);
        }
    }

    private final void h(Object obj) {
        Object obj2 = this.f13285d;
        this.f13285d = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f13284c.a(obj2, obj);
    }

    public final void a(hx3 hx3Var, final hx3 hx3Var2) {
        rx3.h(Looper.myLooper() == this.f13283b.a());
        this.f13287f++;
        c(new Runnable() { // from class: com.google.android.gms.internal.ads.ia1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                oc1.this.d(hx3Var2);
            }
        });
        h(hx3Var.apply(this.f13285d));
    }

    public final void b(final Object obj) {
        this.f13286e = obj;
        g(new Runnable() { // from class: com.google.android.gms.internal.ads.g81
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                oc1.this.e(obj);
            }
        });
    }

    public final void c(Runnable runnable) {
        zn1 zn1Var = this.f13282a;
        if (zn1Var.a().getThread().isAlive()) {
            zn1Var.j(runnable);
        }
    }

    final /* synthetic */ void d(hx3 hx3Var) {
        final Object apply = hx3Var.apply(this.f13286e);
        this.f13286e = apply;
        g(new Runnable() { // from class: com.google.android.gms.internal.ads.h91
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                oc1.this.f(apply);
            }
        });
    }

    final /* synthetic */ void e(Object obj) {
        if (this.f13287f == 0) {
            h(obj);
        }
    }

    final /* synthetic */ void f(Object obj) {
        int i7 = this.f13287f - 1;
        this.f13287f = i7;
        if (i7 == 0) {
            h(obj);
        }
    }
}
