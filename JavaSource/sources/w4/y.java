package w4;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class y implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f27147a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27148b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private f f27149c;

    public y(Executor executor, f fVar) {
        this.f27147a = executor;
        this.f27149c = fVar;
    }

    @Override // w4.b0
    public final void b(i iVar) {
        if (iVar.n() || iVar.l()) {
            return;
        }
        synchronized (this.f27148b) {
            try {
                if (this.f27149c == null) {
                    return;
                }
                this.f27147a.execute(new x(this, iVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
