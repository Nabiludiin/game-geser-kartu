package w4;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class g0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ f0 f27120q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Callable f27121r;

    g0(f0 f0Var, Callable callable) {
        this.f27120q = f0Var;
        this.f27121r = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f27120q.p(this.f27121r.call());
        } catch (Exception e8) {
            this.f27120q.o(e8);
        } catch (Throwable th) {
            this.f27120q.o(new RuntimeException(th));
        }
    }
}
