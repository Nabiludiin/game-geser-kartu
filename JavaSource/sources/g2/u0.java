package g2;

import android.content.Context;

/* compiled from: MyApplication */
public final class u0 implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f24024a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.a f24025b;

    /* renamed from: c, reason: collision with root package name */
    private final d6.a f24026c;

    public u0(d6.a aVar, d6.a aVar2, d6.a aVar3) {
        this.f24024a = aVar;
        this.f24025b = aVar2;
        this.f24026c = aVar3;
    }

    public static u0 a(d6.a aVar, d6.a aVar2, d6.a aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i7) {
        return new t0(context, str, i7);
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c((Context) this.f24024a.get(), (String) this.f24025b.get(), ((Integer) this.f24026c.get()).intValue());
    }
}
