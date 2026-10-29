package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
abstract class h {

    /* compiled from: MyApplication */
    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f1806a;

        /* renamed from: b, reason: collision with root package name */
        private int f1807b;

        /* compiled from: MyApplication */
        /* renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        private static class C0029a extends Thread {

            /* renamed from: q, reason: collision with root package name */
            private final int f1808q;

            C0029a(Runnable runnable, String str, int i7) {
                super(runnable, str);
                this.f1808q = i7;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f1808q);
                super.run();
            }
        }

        a(String str, int i7) {
            this.f1806a = str;
            this.f1807b = i7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0029a(runnable, this.f1806a, this.f1807b);
        }
    }

    /* compiled from: MyApplication */
    private static class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private Callable f1809q;

        /* renamed from: r, reason: collision with root package name */
        private androidx.core.util.a f1810r;

        /* renamed from: s, reason: collision with root package name */
        private Handler f1811s;

        /* compiled from: MyApplication */
        class a implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f1812q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Object f1813r;

            a(androidx.core.util.a aVar, Object obj) {
                this.f1812q = aVar;
                this.f1813r = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1812q.accept(this.f1813r);
            }
        }

        b(Handler handler, Callable callable, androidx.core.util.a aVar) {
            this.f1809q = callable;
            this.f1810r = aVar;
            this.f1811s = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f1809q.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f1811s.post(new a(this.f1810r, obj));
        }
    }

    static ThreadPoolExecutor a(String str, int i7, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i8, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i7));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, androidx.core.util.a aVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, aVar));
    }

    static Object c(ExecutorService executorService, Callable callable, int i7) {
        try {
            return executorService.submit(callable).get(i7, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw e8;
        } catch (ExecutionException e9) {
            throw new RuntimeException(e9);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
