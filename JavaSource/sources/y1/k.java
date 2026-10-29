package y1;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class k implements a2.b {

    /* compiled from: MyApplication */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f27607a = new k();
    }

    public static k a() {
        return a.f27607a;
    }

    public static Executor b() {
        return (Executor) a2.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
