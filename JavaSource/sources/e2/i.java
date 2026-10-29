package e2;

import android.content.Context;
import f2.x;

/* compiled from: MyApplication */
public final class i implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f23219a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.a f23220b;

    /* renamed from: c, reason: collision with root package name */
    private final d6.a f23221c;

    /* renamed from: d, reason: collision with root package name */
    private final d6.a f23222d;

    public i(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4) {
        this.f23219a = aVar;
        this.f23220b = aVar2;
        this.f23221c = aVar3;
        this.f23222d = aVar4;
    }

    public static i a(d6.a aVar, d6.a aVar2, d6.a aVar3, d6.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, g2.d dVar, f2.f fVar, i2.a aVar) {
        return (x) a2.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f23219a.get(), (g2.d) this.f23220b.get(), (f2.f) this.f23221c.get(), (i2.a) this.f23222d.get());
    }
}
