package n1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public class r {

    /* renamed from: f, reason: collision with root package name */
    private static final String f24985f = e1.j.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f24986a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f24987b;

    /* renamed from: c, reason: collision with root package name */
    final Map f24988c;

    /* renamed from: d, reason: collision with root package name */
    final Map f24989d;

    /* renamed from: e, reason: collision with root package name */
    final Object f24990e;

    /* compiled from: MyApplication */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f24991a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f24991a);
            this.f24991a = this.f24991a + 1;
            return newThread;
        }
    }

    /* compiled from: MyApplication */
    public interface b {
        void a(String str);
    }

    /* compiled from: MyApplication */
    public static class c implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private final r f24993q;

        /* renamed from: r, reason: collision with root package name */
        private final String f24994r;

        c(r rVar, String str) {
            this.f24993q = rVar;
            this.f24994r = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f24993q.f24990e) {
                try {
                    if (((c) this.f24993q.f24988c.remove(this.f24994r)) != null) {
                        b bVar = (b) this.f24993q.f24989d.remove(this.f24994r);
                        if (bVar != null) {
                            bVar.a(this.f24994r);
                        }
                    } else {
                        e1.j.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f24994r), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public r() {
        a aVar = new a();
        this.f24986a = aVar;
        this.f24988c = new HashMap();
        this.f24989d = new HashMap();
        this.f24990e = new Object();
        this.f24987b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f24987b.isShutdown()) {
            return;
        }
        this.f24987b.shutdownNow();
    }

    public void b(String str, long j7, b bVar) {
        synchronized (this.f24990e) {
            e1.j.c().a(f24985f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f24988c.put(str, cVar);
            this.f24989d.put(str, bVar);
            this.f24987b.schedule(cVar, j7, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f24990e) {
            try {
                if (((c) this.f24988c.remove(str)) != null) {
                    e1.j.c().a(f24985f, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f24989d.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
