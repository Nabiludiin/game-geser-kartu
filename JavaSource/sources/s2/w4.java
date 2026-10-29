package s2;

/* compiled from: MyApplication */
public final class w4 extends k0 {

    /* renamed from: q, reason: collision with root package name */
    private final k2.e f26256q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f26257r;

    public w4(k2.e eVar, Object obj) {
        this.f26256q = eVar;
        this.f26257r = obj;
    }

    @Override // s2.l0
    public final void b() {
        Object obj;
        k2.e eVar = this.f26256q;
        if (eVar == null || (obj = this.f26257r) == null) {
            return;
        }
        eVar.b(obj);
    }

    @Override // s2.l0
    public final void b1(x2 x2Var) {
        k2.e eVar = this.f26256q;
        if (eVar != null) {
            eVar.a(x2Var.N0());
        }
    }
}
