package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class k13 {

    /* renamed from: a, reason: collision with root package name */
    private final c03 f10851a;

    /* renamed from: b, reason: collision with root package name */
    private final f03 f10852b;

    /* renamed from: c, reason: collision with root package name */
    private final x73 f10853c;

    /* renamed from: d, reason: collision with root package name */
    private final o73 f10854d;

    /* renamed from: e, reason: collision with root package name */
    private final b63 f10855e;

    /* renamed from: f, reason: collision with root package name */
    private final d01 f10856f;

    public k13(x73 x73Var, o73 o73Var, c03 c03Var, f03 f03Var, d01 d01Var, b63 b63Var) {
        this.f10851a = c03Var;
        this.f10852b = f03Var;
        this.f10853c = x73Var;
        this.f10854d = o73Var;
        this.f10856f = d01Var;
        this.f10855e = b63Var;
    }

    public final void a(List list, sc1 sc1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((String) it.next(), 2, sc1Var);
        }
    }

    public final void b(List list, int i7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            p64.r((((Boolean) s2.b0.c().d(uy.cb)).booleanValue() && d01.c(str)) ? this.f10856f.b(str, s2.z.e()) : p64.a(str), new i13(this, i7), cm0.f6500a);
        }
    }

    public final void c(String str, int i7, sc1 sc1Var) {
        c03 c03Var = this.f10851a;
        if (c03Var.f6167i0) {
            this.f10854d.a(str, this.f10852b.f7926b, i7);
            return;
        }
        this.f10853c.b(str, c03Var.f6197x0, this.f10855e, sc1Var);
    }
}
