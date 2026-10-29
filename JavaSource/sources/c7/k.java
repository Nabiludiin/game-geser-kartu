package c7;

import e6.m;
import java.util.concurrent.CancellationException;
import x6.h2;
import x6.j2;
import x6.m1;
import x6.x0;

/* compiled from: MyApplication */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final f0 f3796a = new f0("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f3797b = new f0("REUSABLE_CLAIMED");

    public static final void b(g6.e eVar, Object obj, p6.l lVar) {
        if (!(eVar instanceof j)) {
            eVar.h(obj);
            return;
        }
        j jVar = (j) eVar;
        Object b8 = x6.b0.b(obj, lVar);
        if (jVar.f3785t.I(jVar.getContext())) {
            jVar.f3787v = b8;
            jVar.f27420s = 1;
            jVar.f3785t.h(jVar.getContext(), jVar);
            return;
        }
        x0 a8 = h2.f27384a.a();
        if (a8.U()) {
            jVar.f3787v = b8;
            jVar.f27420s = 1;
            a8.P(jVar);
            return;
        }
        a8.S(true);
        try {
            m1 m1Var = (m1) jVar.getContext().e(m1.f27411p);
            if (m1Var == null || m1Var.c()) {
                g6.e eVar2 = jVar.f3786u;
                Object obj2 = jVar.f3788w;
                g6.i context = eVar2.getContext();
                Object c8 = j0.c(context, obj2);
                j2 g8 = c8 != j0.f3789a ? x6.c0.g(eVar2, context, c8) : null;
                try {
                    jVar.f3786u.h(obj);
                    e6.s sVar = e6.s.f23253a;
                } finally {
                    if (g8 == null || g8.M0()) {
                        j0.a(context, c8);
                    }
                }
            } else {
                CancellationException k7 = m1Var.k();
                jVar.b(b8, k7);
                m.a aVar = e6.m.f23247q;
                jVar.h(e6.m.a(e6.n.a(k7)));
            }
            while (a8.a0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(g6.e eVar, Object obj, p6.l lVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            lVar = null;
        }
        b(eVar, obj, lVar);
    }
}
