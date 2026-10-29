package p4;

/* compiled from: MyApplication */
final class b2 extends x1 {

    /* renamed from: s, reason: collision with root package name */
    private final d2 f25301s;

    b2(d2 d2Var, int i7) {
        super(d2Var.size(), i7);
        this.f25301s = d2Var;
    }

    @Override // p4.x1
    protected final Object b(int i7) {
        return this.f25301s.get(i7);
    }
}
