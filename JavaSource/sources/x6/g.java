package x6;

import g6.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract /* synthetic */ class g {
    public static final n0 a(g0 g0Var, g6.i iVar, i0 i0Var, p6.p pVar) {
        g6.i e8 = c0.e(g0Var, iVar);
        o0 v1Var = i0Var.j() ? new v1(e8, pVar) : new o0(e8, true);
        v1Var.L0(i0Var, v1Var, pVar);
        return v1Var;
    }

    public static /* synthetic */ n0 b(g0 g0Var, g6.i iVar, i0 i0Var, p6.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            iVar = g6.j.f24049q;
        }
        if ((i7 & 2) != 0) {
            i0Var = i0.f27386q;
        }
        return f.a(g0Var, iVar, i0Var, pVar);
    }

    public static final m1 c(g0 g0Var, g6.i iVar, i0 i0Var, p6.p pVar) {
        g6.i e8 = c0.e(g0Var, iVar);
        d2 w1Var = i0Var.j() ? new w1(e8, pVar) : new d2(e8, true);
        w1Var.L0(i0Var, w1Var, pVar);
        return w1Var;
    }

    public static /* synthetic */ m1 d(g0 g0Var, g6.i iVar, i0 i0Var, p6.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            iVar = g6.j.f24049q;
        }
        if ((i7 & 2) != 0) {
            i0Var = i0.f27386q;
        }
        return f.c(g0Var, iVar, i0Var, pVar);
    }

    public static final Object e(g6.i iVar, p6.p pVar, g6.e eVar) {
        Object M0;
        g6.i context = eVar.getContext();
        g6.i d8 = c0.d(context, iVar);
        q1.d(d8);
        if (d8 == context) {
            c7.b0 b0Var = new c7.b0(d8, eVar);
            M0 = d7.b.b(b0Var, b0Var, pVar);
        } else {
            f.b bVar = g6.f.f24047n;
            if (q6.i.a(d8.e(bVar), context.e(bVar))) {
                j2 j2Var = new j2(d8, eVar);
                g6.i context2 = j2Var.getContext();
                Object c8 = c7.j0.c(context2, null);
                try {
                    Object b8 = d7.b.b(j2Var, j2Var, pVar);
                    c7.j0.a(context2, c8);
                    M0 = b8;
                } catch (Throwable th) {
                    c7.j0.a(context2, c8);
                    throw th;
                }
            } else {
                q0 q0Var = new q0(d8, eVar);
                d7.a.d(pVar, q0Var, q0Var, null, 4, null);
                M0 = q0Var.M0();
            }
        }
        if (M0 == h6.b.e()) {
            i6.h.c(eVar);
        }
        return M0;
    }
}
