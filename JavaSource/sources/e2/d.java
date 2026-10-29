package e2;

import f2.x;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class d implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f23213a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.a f23214b;

    /* renamed from: c, reason: collision with root package name */
    private final d6.a f23215c;

    /* renamed from: d, reason: collision with root package name */
    private final d6.a f23216d;

    /* renamed from: e, reason: collision with root package name */
    private final d6.a f23217e;

    public d(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4, d6.a aVar5) {
        this.f23213a = aVar;
        this.f23214b = aVar2;
        this.f23215c = aVar3;
        this.f23216d = aVar4;
        this.f23217e = aVar5;
    }

    public static d a(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4, d6.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, z1.e eVar, x xVar, g2.d dVar, h2.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f23213a.get(), (z1.e) this.f23214b.get(), (x) this.f23215c.get(), (g2.d) this.f23216d.get(), (h2.b) this.f23217e.get());
    }
}
