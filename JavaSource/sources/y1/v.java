package y1;

/* compiled from: MyApplication */
public final class v implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f27624a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.a f27625b;

    /* renamed from: c, reason: collision with root package name */
    private final d6.a f27626c;

    /* renamed from: d, reason: collision with root package name */
    private final d6.a f27627d;

    /* renamed from: e, reason: collision with root package name */
    private final d6.a f27628e;

    public v(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4, d6.a aVar5) {
        this.f27624a = aVar;
        this.f27625b = aVar2;
        this.f27626c = aVar3;
        this.f27627d = aVar4;
        this.f27628e = aVar5;
    }

    public static v a(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4, d6.a aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(i2.a aVar, i2.a aVar2, e2.e eVar, f2.r rVar, f2.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((i2.a) this.f27624a.get(), (i2.a) this.f27625b.get(), (e2.e) this.f27626c.get(), (f2.r) this.f27627d.get(), (f2.v) this.f27628e.get());
    }
}
