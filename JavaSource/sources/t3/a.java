package t3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p3.o;

/* compiled from: MyApplication */
public class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f26393a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f26394b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private final ThreadFactory f26395c = Executors.defaultThreadFactory();

    public a(String str) {
        o.n(str, "Name must not be null");
        this.f26393a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f26395c.newThread(new b(runnable, 0));
        newThread.setName(this.f26393a + "[" + this.f26394b.getAndIncrement() + "]");
        return newThread;
    }
}
