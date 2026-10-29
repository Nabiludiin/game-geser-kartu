package w4;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class q implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f27128a;

    /* renamed from: b, reason: collision with root package name */
    private final b f27129b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f27130c;

    public q(Executor executor, b bVar, f0 f0Var) {
        this.f27128a = executor;
        this.f27129b = bVar;
        this.f27130c = f0Var;
    }

    @Override // w4.b0
    public final void b(i iVar) {
        this.f27128a.execute(new p(this, iVar));
    }
}
