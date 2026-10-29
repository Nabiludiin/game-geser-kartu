package f2;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class w implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f23709a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.a f23710b;

    /* renamed from: c, reason: collision with root package name */
    private final d6.a f23711c;

    /* renamed from: d, reason: collision with root package name */
    private final d6.a f23712d;

    public w(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4) {
        this.f23709a = aVar;
        this.f23710b = aVar2;
        this.f23711c = aVar3;
        this.f23712d = aVar4;
    }

    public static w a(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, g2.d dVar, x xVar, h2.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f23709a.get(), (g2.d) this.f23710b.get(), (x) this.f23711c.get(), (h2.b) this.f23712d.get());
    }
}
