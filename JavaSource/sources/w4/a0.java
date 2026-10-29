package w4;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class a0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f27107a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27108b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private g f27109c;

    public a0(Executor executor, g gVar) {
        this.f27107a = executor;
        this.f27109c = gVar;
    }

    @Override // w4.b0
    public final void b(i iVar) {
        if (iVar.n()) {
            synchronized (this.f27108b) {
                try {
                    if (this.f27109c == null) {
                        return;
                    }
                    this.f27107a.execute(new z(this, iVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
