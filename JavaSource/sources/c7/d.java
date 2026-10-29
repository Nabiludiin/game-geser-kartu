package c7;

/* compiled from: MyApplication */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final f0 f3773a = new f0("CLOSED");

    public static final e b(e eVar) {
        while (true) {
            Object f8 = eVar.f();
            if (f8 == f3773a) {
                return eVar;
            }
            e eVar2 = (e) f8;
            if (eVar2 != null) {
                eVar = eVar2;
            } else if (eVar.l()) {
                return eVar;
            }
        }
    }

    public static final Object c(c0 c0Var, long j7, p6.p pVar) {
        while (true) {
            if (c0Var.f3772s >= j7 && !c0Var.j()) {
                return d0.a(c0Var);
            }
            Object f8 = c0Var.f();
            if (f8 == f3773a) {
                return d0.a(f3773a);
            }
            c0 c0Var2 = (c0) ((e) f8);
            if (c0Var2 == null) {
                c0Var2 = (c0) pVar.i(Long.valueOf(c0Var.f3772s + 1), c0Var);
                if (c0Var.n(c0Var2)) {
                    if (c0Var.j()) {
                        c0Var.m();
                    }
                }
            }
            c0Var = c0Var2;
        }
    }
}
