package p4;

/* compiled from: MyApplication */
final class l implements y {

    /* renamed from: a, reason: collision with root package name */
    private final i f25438a;

    /* renamed from: b, reason: collision with root package name */
    final q2 f25439b;

    /* renamed from: c, reason: collision with root package name */
    final q2 f25440c;

    /* renamed from: d, reason: collision with root package name */
    final q2 f25441d;

    /* renamed from: e, reason: collision with root package name */
    final q2 f25442e;

    /* renamed from: f, reason: collision with root package name */
    final q2 f25443f;

    l(i iVar, n0 n0Var) {
        this.f25438a = iVar;
        q2 b8 = m2.b(new v0(iVar.f25392c));
        this.f25439b = b8;
        n2 b9 = o2.b(n0Var);
        this.f25440c = b9;
        l2 l2Var = new l2();
        this.f25441d = l2Var;
        q2 q2Var = iVar.f25392c;
        u uVar = t.f25512a;
        w wVar = v.f25517a;
        q2 q2Var2 = iVar.f25398i;
        q2 q2Var3 = iVar.f25401l;
        q2 q2Var4 = iVar.f25393d;
        a1 a1Var = new a1(q2Var, b8, uVar, wVar, q2Var2, q2Var3, l2Var, q2Var4);
        this.f25442e = a1Var;
        t0 t0Var = new t0(b8, uVar, a1Var);
        this.f25443f = t0Var;
        l2.b(l2Var, m2.b(new f0(q2Var, iVar.f25394e, b8, q2Var4, b9, t0Var)));
    }

    @Override // p4.y
    public final e0 a() {
        return (e0) this.f25441d.a();
    }
}
