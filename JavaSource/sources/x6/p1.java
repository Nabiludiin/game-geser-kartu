package x6;

/* compiled from: MyApplication */
public class p1 extends t1 implements v {

    /* renamed from: s, reason: collision with root package name */
    private final boolean f27417s;

    public p1(m1 m1Var) {
        super(true);
        g0(m1Var);
        this.f27417s = I0();
    }

    private final boolean I0() {
        t1 B;
        p a02 = a0();
        q qVar = a02 instanceof q ? (q) a02 : null;
        if (qVar != null && (B = qVar.B()) != null) {
            while (!B.X()) {
                p a03 = B.a0();
                q qVar2 = a03 instanceof q ? (q) a03 : null;
                if (qVar2 != null && (B = qVar2.B()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // x6.t1
    public boolean X() {
        return this.f27417s;
    }

    @Override // x6.t1
    public boolean Y() {
        return true;
    }
}
