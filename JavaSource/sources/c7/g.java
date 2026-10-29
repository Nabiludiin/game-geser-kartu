package c7;

import java.util.Collection;
import java.util.ServiceLoader;

/* compiled from: MyApplication */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection f3781a = v6.c.c(v6.c.a(ServiceLoader.load(x6.e0.class, x6.e0.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f3781a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
