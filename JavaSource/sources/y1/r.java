package y1;

/* compiled from: MyApplication */
final class r implements w1.f {

    /* renamed from: a, reason: collision with root package name */
    private final o f27614a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27615b;

    /* renamed from: c, reason: collision with root package name */
    private final w1.b f27616c;

    /* renamed from: d, reason: collision with root package name */
    private final w1.e f27617d;

    /* renamed from: e, reason: collision with root package name */
    private final s f27618e;

    r(o oVar, String str, w1.b bVar, w1.e eVar, s sVar) {
        this.f27614a = oVar;
        this.f27615b = str;
        this.f27616c = bVar;
        this.f27617d = eVar;
        this.f27618e = sVar;
    }

    @Override // w1.f
    public void a(w1.c cVar) {
        c(cVar, new w1.h() { // from class: y1.q
            @Override // w1.h
            public final void a(Exception exc) {
                r.b(exc);
            }
        });
    }

    public void c(w1.c cVar, w1.h hVar) {
        this.f27618e.a(n.a().e(this.f27614a).c(cVar).f(this.f27615b).d(this.f27617d).b(this.f27616c).a(), hVar);
    }

    public static /* synthetic */ void b(Exception exc) {
    }
}
