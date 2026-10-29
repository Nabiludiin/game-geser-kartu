package w4;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class w implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f27142a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27143b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private e f27144c;

    public w(Executor executor, e eVar) {
        this.f27142a = executor;
        this.f27144c = eVar;
    }

    @Override // w4.b0
    public final void b(i iVar) {
        synchronized (this.f27143b) {
            try {
                if (this.f27144c == null) {
                    return;
                }
                this.f27142a.execute(new v(this, iVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
