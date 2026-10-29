package z1;

import android.content.Context;

/* compiled from: MyApplication */
public final class j implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f27831a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.a f27832b;

    /* renamed from: c, reason: collision with root package name */
    private final d6.a f27833c;

    public j(d6.a aVar, d6.a aVar2, d6.a aVar3) {
        this.f27831a = aVar;
        this.f27832b = aVar2;
        this.f27833c = aVar3;
    }

    public static j a(d6.a aVar, d6.a aVar2, d6.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, i2.a aVar, i2.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f27831a.get(), (i2.a) this.f27832b.get(), (i2.a) this.f27833c.get());
    }
}
