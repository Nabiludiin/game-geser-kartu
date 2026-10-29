package p4;

/* compiled from: MyApplication */
public final class l2 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    private q2 f25450a;

    public static void b(q2 q2Var, q2 q2Var2) {
        l2 l2Var = (l2) q2Var;
        if (l2Var.f25450a != null) {
            throw new IllegalStateException();
        }
        l2Var.f25450a = q2Var2;
    }

    @Override // p4.r2
    public final Object a() {
        q2 q2Var = this.f25450a;
        if (q2Var != null) {
            return q2Var.a();
        }
        throw new IllegalStateException();
    }
}
