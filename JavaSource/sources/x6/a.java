package x6;

/* compiled from: MyApplication */
public abstract class a extends t1 implements m1, g6.e, g0 {

    /* renamed from: s, reason: collision with root package name */
    private final g6.i f27366s;

    public a(g6.i iVar, boolean z7, boolean z8) {
        super(z8);
        if (z7) {
            g0((m1) iVar.e(m1.f27411p));
        }
        this.f27366s = iVar.n(this);
    }

    protected void I0(Object obj) {
        D(obj);
    }

    public final void L0(i0 i0Var, Object obj, p6.p pVar) {
        i0Var.d(pVar, obj, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.t1
    public String N() {
        return k0.a(this) + " was cancelled";
    }

    @Override // x6.g0
    public g6.i a() {
        return this.f27366s;
    }

    @Override // x6.t1, x6.m1
    public boolean c() {
        return super.c();
    }

    @Override // x6.t1
    public final void f0(Throwable th) {
        f0.a(this.f27366s, th);
    }

    @Override // g6.e
    public final g6.i getContext() {
        return this.f27366s;
    }

    @Override // g6.e
    public final void h(Object obj) {
        Object l02 = l0(b0.d(obj, null, 1, null));
        if (l02 == u1.f27440b) {
            return;
        }
        I0(l02);
    }

    @Override // x6.t1
    public String n0() {
        String b8 = c0.b(this.f27366s);
        if (b8 == null) {
            return super.n0();
        }
        return '\"' + b8 + "\":" + super.n0();
    }

    @Override // x6.t1
    protected final void s0(Object obj) {
        if (!(obj instanceof x)) {
            K0(obj);
        } else {
            x xVar = (x) obj;
            J0(xVar.f27456a, xVar.a());
        }
    }

    protected void K0(Object obj) {
    }

    protected void J0(Throwable th, boolean z7) {
    }
}
