package w4;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class u implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f27137a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27138b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private d f27139c;

    public u(Executor executor, d dVar) {
        this.f27137a = executor;
        this.f27139c = dVar;
    }

    @Override // w4.b0
    public final void b(i iVar) {
        if (iVar.l()) {
            synchronized (this.f27138b) {
                try {
                    if (this.f27139c == null) {
                        return;
                    }
                    this.f27137a.execute(new t(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
