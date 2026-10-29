package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24670a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f24671b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f24672c;

    /* compiled from: MyApplication */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f24673a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f24673a.getAndIncrement())));
            return thread;
        }
    }

    private static Handler d(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // m.d
    public void a(Runnable runnable) {
        this.f24671b.execute(runnable);
    }

    @Override // m.d
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // m.d
    public void c(Runnable runnable) {
        if (this.f24672c == null) {
            synchronized (this.f24670a) {
                try {
                    if (this.f24672c == null) {
                        this.f24672c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f24672c.post(runnable);
    }
}
