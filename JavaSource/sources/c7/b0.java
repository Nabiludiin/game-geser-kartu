package c7;

/* compiled from: MyApplication */
public class b0 extends x6.a implements i6.e {

    /* renamed from: t, reason: collision with root package name */
    public final g6.e f3769t;

    public b0(g6.i iVar, g6.e eVar) {
        super(iVar, true, true);
        this.f3769t = eVar;
    }

    @Override // x6.t1
    protected void D(Object obj) {
        k.c(h6.b.c(this.f3769t), x6.b0.a(obj, this.f3769t), null, 2, null);
    }

    @Override // x6.a
    protected void I0(Object obj) {
        g6.e eVar = this.f3769t;
        eVar.h(x6.b0.a(obj, eVar));
    }

    @Override // i6.e
    public final i6.e d() {
        g6.e eVar = this.f3769t;
        if (eVar instanceof i6.e) {
            return (i6.e) eVar;
        }
        return null;
    }

    @Override // x6.t1
    protected final boolean i0() {
        return true;
    }
}
