package x6;

/* compiled from: MyApplication */
public abstract class s1 extends z implements u0, h1 {

    /* renamed from: t, reason: collision with root package name */
    public t1 f27421t;

    public final t1 B() {
        t1 t1Var = this.f27421t;
        if (t1Var != null) {
            return t1Var;
        }
        q6.i.o("job");
        return null;
    }

    public final void C(t1 t1Var) {
        this.f27421t = t1Var;
    }

    @Override // x6.h1
    public boolean c() {
        return true;
    }

    @Override // x6.h1
    public y1 f() {
        return null;
    }

    @Override // x6.u0
    public void h() {
        B().w0(this);
    }

    @Override // c7.q
    public String toString() {
        return k0.a(this) + '@' + k0.b(this) + "[job@" + k0.b(B()) + ']';
    }
}
