package x6;

import java.util.concurrent.CancellationException;

/* compiled from: MyApplication */
abstract /* synthetic */ class r1 {
    public static final v a(m1 m1Var) {
        return new p1(m1Var);
    }

    public static /* synthetic */ v b(m1 m1Var, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            m1Var = null;
        }
        return q1.a(m1Var);
    }

    public static final void c(g6.i iVar, CancellationException cancellationException) {
        m1 m1Var = (m1) iVar.e(m1.f27411p);
        if (m1Var != null) {
            m1Var.F(cancellationException);
        }
    }

    public static final void d(g6.i iVar) {
        m1 m1Var = (m1) iVar.e(m1.f27411p);
        if (m1Var != null) {
            q1.e(m1Var);
        }
    }

    public static final void e(m1 m1Var) {
        if (!m1Var.c()) {
            throw m1Var.k();
        }
    }
}
