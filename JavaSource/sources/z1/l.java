package z1;

import android.content.Context;

/* compiled from: MyApplication */
public final class l implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f27839a;

    /* renamed from: b, reason: collision with root package name */
    private final d6.a f27840b;

    public l(d6.a aVar, d6.a aVar2) {
        this.f27839a = aVar;
        this.f27840b = aVar2;
    }

    public static l a(d6.a aVar, d6.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f27839a.get(), this.f27840b.get());
    }
}
