package x6;

import e6.m;
import java.util.concurrent.CancellationException;

/* compiled from: MyApplication */
public abstract class r0 extends e7.h {

    /* renamed from: s, reason: collision with root package name */
    public int f27420s;

    public r0(int i7) {
        this.f27420s = i7;
    }

    public abstract void b(Object obj, Throwable th);

    public abstract g6.e c();

    public Throwable e(Object obj) {
        x xVar = obj instanceof x ? (x) obj : null;
        if (xVar != null) {
            return xVar.f27456a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            e6.a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        q6.i.b(th);
        f0.a(c().getContext(), new j0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object a8;
        Object a9;
        e7.i iVar = this.f23291r;
        try {
            g6.e c8 = c();
            q6.i.c(c8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            c7.j jVar = (c7.j) c8;
            g6.e eVar = jVar.f3786u;
            Object obj = jVar.f3788w;
            g6.i context = eVar.getContext();
            Object c9 = c7.j0.c(context, obj);
            j2 g8 = c9 != c7.j0.f3789a ? c0.g(eVar, context, c9) : null;
            try {
                g6.i context2 = eVar.getContext();
                Object j7 = j();
                Throwable e8 = e(j7);
                m1 m1Var = (e8 == null && s0.b(this.f27420s)) ? (m1) context2.e(m1.f27411p) : null;
                if (m1Var != null && !m1Var.c()) {
                    CancellationException k7 = m1Var.k();
                    b(j7, k7);
                    m.a aVar = e6.m.f23247q;
                    eVar.h(e6.m.a(e6.n.a(k7)));
                } else if (e8 != null) {
                    m.a aVar2 = e6.m.f23247q;
                    eVar.h(e6.m.a(e6.n.a(e8)));
                } else {
                    m.a aVar3 = e6.m.f23247q;
                    eVar.h(e6.m.a(g(j7)));
                }
                e6.s sVar = e6.s.f23253a;
                if (g8 == null || g8.M0()) {
                    c7.j0.a(context, c9);
                }
                try {
                    iVar.a();
                    a9 = e6.m.a(e6.s.f23253a);
                } catch (Throwable th) {
                    m.a aVar4 = e6.m.f23247q;
                    a9 = e6.m.a(e6.n.a(th));
                }
                i(null, e6.m.b(a9));
            } catch (Throwable th2) {
                if (g8 == null || g8.M0()) {
                    c7.j0.a(context, c9);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                m.a aVar5 = e6.m.f23247q;
                iVar.a();
                a8 = e6.m.a(e6.s.f23253a);
            } catch (Throwable th4) {
                m.a aVar6 = e6.m.f23247q;
                a8 = e6.m.a(e6.n.a(th4));
            }
            i(th3, e6.m.b(a8));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}
