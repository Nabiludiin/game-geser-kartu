package b3;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final e3.a f3287a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3288b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3289c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3290d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f3291e = new AtomicBoolean(false);

    public l1(e3.a aVar, String str, long j7, int i7) {
        this.f3287a = aVar;
        this.f3288b = str;
        this.f3289c = j7;
        this.f3290d = i7;
    }

    public final e3.a a() {
        return this.f3287a;
    }

    public final String b() {
        return this.f3288b;
    }

    public final boolean c() {
        return this.f3289c <= r2.t.o().a();
    }

    public final int d() {
        return this.f3290d;
    }

    public final boolean e() {
        return this.f3291e.get();
    }

    public final void f() {
        this.f3291e.set(true);
    }
}
