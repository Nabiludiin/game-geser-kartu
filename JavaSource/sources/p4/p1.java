package p4;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
final class p1 implements Executor {

    /* renamed from: r, reason: collision with root package name */
    private final ThreadPoolExecutor f25494r;

    /* renamed from: q, reason: collision with root package name */
    private final AtomicInteger f25493q = new AtomicInteger(1);

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f25495s = new WeakReference(null);

    p1(String str) {
        final String str2 = "Google consent worker";
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(str2) { // from class: p4.o1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f25486b = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return p1.b(p1.this, this.f25486b, runnable);
            }
        });
        this.f25494r = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ Thread b(p1 p1Var, String str, Runnable runnable) {
        Thread thread = new Thread(runnable, "Google consent worker #" + p1Var.f25493q.getAndIncrement());
        p1Var.f25495s = new WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f25495s.get()) {
            runnable.run();
        } else {
            this.f25494r.execute(runnable);
        }
    }
}
