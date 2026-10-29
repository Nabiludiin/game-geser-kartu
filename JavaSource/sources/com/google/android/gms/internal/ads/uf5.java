package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* compiled from: MyApplication */
final class uf5 {

    /* renamed from: a, reason: collision with root package name */
    private final ot f16738a;

    /* renamed from: b, reason: collision with root package name */
    private w04 f16739b = w04.m();

    /* renamed from: c, reason: collision with root package name */
    private z04 f16740c = z04.a();

    /* renamed from: d, reason: collision with root package name */
    private xp5 f16741d;

    /* renamed from: e, reason: collision with root package name */
    private xp5 f16742e;

    /* renamed from: f, reason: collision with root package name */
    private xp5 f16743f;

    public uf5(ot otVar) {
        this.f16738a = otVar;
    }

    private final void j(az azVar) {
        y04 y04Var = new y04();
        if (this.f16739b.isEmpty()) {
            k(y04Var, this.f16742e, azVar);
            if (!Objects.equals(this.f16743f, this.f16742e)) {
                k(y04Var, this.f16743f, azVar);
            }
            if (!Objects.equals(this.f16741d, this.f16742e) && !Objects.equals(this.f16741d, this.f16743f)) {
                k(y04Var, this.f16741d, azVar);
            }
        } else {
            for (int i7 = 0; i7 < this.f16739b.size(); i7++) {
                k(y04Var, (xp5) this.f16739b.get(i7), azVar);
            }
            if (!this.f16739b.contains(this.f16741d)) {
                k(y04Var, this.f16741d, azVar);
            }
        }
        this.f16740c = y04Var.c();
    }

    private final void k(y04 y04Var, xp5 xp5Var, az azVar) {
        if (xp5Var == null) {
            return;
        }
        if (azVar.e(xp5Var.f18924a) != -1) {
            y04Var.a(xp5Var, azVar);
            return;
        }
        az azVar2 = (az) this.f16740c.get(xp5Var);
        if (azVar2 != null) {
            y04Var.a(xp5Var, azVar2);
        }
    }

    private static xp5 l(mr mrVar, w04 w04Var, xp5 xp5Var, ot otVar) {
        az m7 = mrVar.m();
        int w7 = mrVar.w();
        Object f8 = m7.g() ? null : m7.f(w7);
        int i7 = -1;
        if (!mrVar.H() && !m7.g()) {
            i7 = m7.d(w7, otVar, false).f(hi2.N(mrVar.t()));
        }
        int i8 = i7;
        for (int i9 = 0; i9 < w04Var.size(); i9++) {
            xp5 xp5Var2 = (xp5) w04Var.get(i9);
            if (m(xp5Var2, f8, mrVar.H(), mrVar.E(), mrVar.x(), i8)) {
                return xp5Var2;
            }
        }
        if (w04Var.isEmpty() && xp5Var != null && m(xp5Var, f8, mrVar.H(), mrVar.E(), mrVar.x(), i8)) {
            return xp5Var;
        }
        return null;
    }

    private static boolean m(xp5 xp5Var, Object obj, boolean z7, int i7, int i8, int i9) {
        if (xp5Var.f18924a.equals(obj)) {
            return z7 ? xp5Var.f18925b == i7 && xp5Var.f18926c == i8 : xp5Var.f18925b == -1 && xp5Var.f18928e == i9;
        }
        return false;
    }

    public final xp5 a() {
        return this.f16741d;
    }

    public final xp5 b() {
        return this.f16742e;
    }

    public final xp5 c() {
        return this.f16743f;
    }

    public final xp5 d() {
        Object next;
        Object obj;
        if (this.f16739b.isEmpty()) {
            return null;
        }
        List list = this.f16739b;
        if (kc0.a(list)) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            obj = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (xp5) obj;
    }

    public final az e(xp5 xp5Var) {
        return (az) this.f16740c.get(xp5Var);
    }

    public final void f(mr mrVar) {
        this.f16741d = l(mrVar, this.f16739b, this.f16742e, this.f16738a);
    }

    public final void g(mr mrVar) {
        this.f16741d = l(mrVar, this.f16739b, this.f16742e, this.f16738a);
        j(mrVar.m());
    }

    public final void h(List list, xp5 xp5Var, mr mrVar) {
        this.f16739b = w04.u(list);
        if (!list.isEmpty()) {
            this.f16742e = (xp5) list.get(0);
            xp5Var.getClass();
            this.f16743f = xp5Var;
        }
        if (this.f16741d == null) {
            this.f16741d = l(mrVar, this.f16739b, this.f16742e, this.f16738a);
        }
        j(mrVar.m());
    }

    final /* synthetic */ w04 i() {
        return this.f16739b;
    }
}
