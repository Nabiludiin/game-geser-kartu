package x6;

/* compiled from: MyApplication */
public abstract class x0 extends d0 {

    /* renamed from: s, reason: collision with root package name */
    private long f27457s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27458t;

    /* renamed from: u, reason: collision with root package name */
    private f6.e f27459u;

    private final long O(boolean z7) {
        return z7 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void T(x0 x0Var, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        x0Var.S(z7);
    }

    public final void M(boolean z7) {
        long O = this.f27457s - O(z7);
        this.f27457s = O;
        if (O <= 0 && this.f27458t) {
            shutdown();
        }
    }

    public final void P(r0 r0Var) {
        f6.e eVar = this.f27459u;
        if (eVar == null) {
            eVar = new f6.e();
            this.f27459u = eVar;
        }
        eVar.addLast(r0Var);
    }

    protected long R() {
        f6.e eVar = this.f27459u;
        return (eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void S(boolean z7) {
        this.f27457s += O(z7);
        if (z7) {
            return;
        }
        this.f27458t = true;
    }

    public final boolean U() {
        return this.f27457s >= O(true);
    }

    public final boolean V() {
        f6.e eVar = this.f27459u;
        if (eVar != null) {
            return eVar.isEmpty();
        }
        return true;
    }

    public final boolean a0() {
        r0 r0Var;
        f6.e eVar = this.f27459u;
        if (eVar == null || (r0Var = (r0) eVar.p()) == null) {
            return false;
        }
        r0Var.run();
        return true;
    }

    public abstract void shutdown();
}
