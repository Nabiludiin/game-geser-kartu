package e7;

import c7.g0;
import c7.i0;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23294a = g0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f23295b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f23296c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f23297d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f23298e;

    /* renamed from: f, reason: collision with root package name */
    public static g f23299f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f23300g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f23301h;

    static {
        long f8;
        int e8;
        int e9;
        long f9;
        f8 = i0.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f23295b = f8;
        e8 = i0.e("kotlinx.coroutines.scheduler.core.pool.size", t6.d.a(g0.a(), 2), 1, 0, 8, null);
        f23296c = e8;
        e9 = i0.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f23297d = e9;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f9 = i0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f23298e = timeUnit.toNanos(f9);
        f23299f = e.f23284a;
        f23300g = new j(0);
        f23301h = new j(1);
    }
}
