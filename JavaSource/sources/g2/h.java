package g2;

import android.content.Context;

/* compiled from: MyApplication */
public final class h implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final d6.a f23974a;

    public h(d6.a aVar) {
        this.f23974a = aVar;
    }

    public static h a(d6.a aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) a2.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f23974a.get());
    }
}
