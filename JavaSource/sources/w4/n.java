package w4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f27125a = new CountDownLatch(1);

    /* synthetic */ n(m mVar) {
    }

    @Override // w4.g
    public final void a(Object obj) {
        this.f27125a.countDown();
    }

    public final void b() {
        this.f27125a.await();
    }

    @Override // w4.d
    public final void c() {
        this.f27125a.countDown();
    }

    @Override // w4.f
    public final void d(Exception exc) {
        this.f27125a.countDown();
    }

    public final boolean e(long j7, TimeUnit timeUnit) {
        return this.f27125a.await(j7, timeUnit);
    }
}
