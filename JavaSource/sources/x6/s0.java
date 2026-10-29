package x6;

import e6.m;

/* compiled from: MyApplication */
public abstract class s0 {
    public static final void a(r0 r0Var, int i7) {
        g6.e c8 = r0Var.c();
        boolean z7 = i7 == 4;
        if (z7 || !(c8 instanceof c7.j) || b(i7) != b(r0Var.f27420s)) {
            d(r0Var, c8, z7);
            return;
        }
        d0 d0Var = ((c7.j) c8).f3785t;
        g6.i context = c8.getContext();
        if (d0Var.I(context)) {
            d0Var.h(context, r0Var);
        } else {
            e(r0Var);
        }
    }

    public static final boolean b(int i7) {
        return i7 == 1 || i7 == 2;
    }

    public static final boolean c(int i7) {
        return i7 == 2;
    }

    public static final void d(r0 r0Var, g6.e eVar, boolean z7) {
        Object g8;
        Object j7 = r0Var.j();
        Throwable e8 = r0Var.e(j7);
        if (e8 != null) {
            m.a aVar = e6.m.f23247q;
            g8 = e6.n.a(e8);
        } else {
            m.a aVar2 = e6.m.f23247q;
            g8 = r0Var.g(j7);
        }
        Object a8 = e6.m.a(g8);
        if (!z7) {
            eVar.h(a8);
            return;
        }
        q6.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        c7.j jVar = (c7.j) eVar;
        g6.e eVar2 = jVar.f3786u;
        Object obj = jVar.f3788w;
        g6.i context = eVar2.getContext();
        Object c8 = c7.j0.c(context, obj);
        j2 g9 = c8 != c7.j0.f3789a ? c0.g(eVar2, context, c8) : null;
        try {
            jVar.f3786u.h(a8);
            e6.s sVar = e6.s.f23253a;
            if (g9 == null || g9.M0()) {
                c7.j0.a(context, c8);
            }
        } catch (Throwable th) {
            if (g9 == null || g9.M0()) {
                c7.j0.a(context, c8);
            }
            throw th;
        }
    }

    private static final void e(r0 r0Var) {
        x0 a8 = h2.f27384a.a();
        if (a8.U()) {
            a8.P(r0Var);
            return;
        }
        a8.S(true);
        try {
            d(r0Var, r0Var.c(), true);
            do {
            } while (a8.a0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
