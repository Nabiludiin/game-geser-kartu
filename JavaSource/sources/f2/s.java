package f2;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class s implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f23694a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.a f23695b;

    /* renamed from: c, reason: collision with root package name */
    private final d6.a f23696c;

    /* renamed from: d, reason: collision with root package name */
    private final d6.a f23697d;

    /* renamed from: e, reason: collision with root package name */
    private final d6.a f23698e;

    /* renamed from: f, reason: collision with root package name */
    private final d6.a f23699f;

    /* renamed from: g, reason: collision with root package name */
    private final d6.a f23700g;

    /* renamed from: h, reason: collision with root package name */
    private final d6.a f23701h;

    /* renamed from: i, reason: collision with root package name */
    private final d6.a f23702i;

    public s(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4, d6.a aVar5, d6.a aVar6, d6.a aVar7, d6.a aVar8, d6.a aVar9) {
        this.f23694a = aVar;
        this.f23695b = aVar2;
        this.f23696c = aVar3;
        this.f23697d = aVar4;
        this.f23698e = aVar5;
        this.f23699f = aVar6;
        this.f23700g = aVar7;
        this.f23701h = aVar8;
        this.f23702i = aVar9;
    }

    public static s a(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4, d6.a aVar5, d6.a aVar6, d6.a aVar7, d6.a aVar8, d6.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, z1.e eVar, g2.d dVar, x xVar, Executor executor, h2.b bVar, i2.a aVar, i2.a aVar2, g2.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f23694a.get(), (z1.e) this.f23695b.get(), (g2.d) this.f23696c.get(), (x) this.f23697d.get(), (Executor) this.f23698e.get(), (h2.b) this.f23699f.get(), (i2.a) this.f23700g.get(), (i2.a) this.f23701h.get(), (g2.c) this.f23702i.get());
    }
}
