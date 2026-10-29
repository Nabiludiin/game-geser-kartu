package o2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class c extends Thread {

    /* renamed from: q, reason: collision with root package name */
    private final WeakReference f25058q;

    /* renamed from: r, reason: collision with root package name */
    private final long f25059r;

    /* renamed from: s, reason: collision with root package name */
    final CountDownLatch f25060s = new CountDownLatch(1);

    /* renamed from: t, reason: collision with root package name */
    boolean f25061t = false;

    public c(a aVar, long j7) {
        this.f25058q = new WeakReference(aVar);
        this.f25059r = j7;
        start();
    }

    private final void a() {
        a aVar = (a) this.f25058q.get();
        if (aVar != null) {
            aVar.e();
            this.f25061t = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f25060s.await(this.f25059r, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
