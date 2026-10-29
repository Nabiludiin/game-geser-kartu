package g2;

/* compiled from: MyApplication */
public final class n0 implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f23996a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.a f23997b;

    /* renamed from: c, reason: collision with root package name */
    private final d6.a f23998c;

    /* renamed from: d, reason: collision with root package name */
    private final d6.a f23999d;

    /* renamed from: e, reason: collision with root package name */
    private final d6.a f24000e;

    public n0(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4, d6.a aVar5) {
        this.f23996a = aVar;
        this.f23997b = aVar2;
        this.f23998c = aVar3;
        this.f23999d = aVar4;
        this.f24000e = aVar5;
    }

    public static n0 a(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4, d6.a aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(i2.a aVar, i2.a aVar2, Object obj, Object obj2, d6.a aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c((i2.a) this.f23996a.get(), (i2.a) this.f23997b.get(), this.f23998c.get(), this.f23999d.get(), this.f24000e);
    }
}
