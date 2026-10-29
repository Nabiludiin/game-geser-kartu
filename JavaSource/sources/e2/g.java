package e2;

/* compiled from: MyApplication */
public final class g implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f23218a;

    public g(d6.a aVar) {
        this.f23218a = aVar;
    }

    public static f2.f a(i2.a aVar) {
        return (f2.f) a2.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(d6.a aVar) {
        return new g(aVar);
    }

    @Override // d6.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f2.f get() {
        return a((i2.a) this.f23218a.get());
    }
}
