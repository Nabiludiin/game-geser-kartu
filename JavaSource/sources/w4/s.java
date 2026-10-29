package w4;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class s implements g, f, d, b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f27133a;

    /* renamed from: b, reason: collision with root package name */
    private final b f27134b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f27135c;

    public s(Executor executor, b bVar, f0 f0Var) {
        this.f27133a = executor;
        this.f27134b = bVar;
        this.f27135c = f0Var;
    }

    @Override // w4.g
    public final void a(Object obj) {
        this.f27135c.p(obj);
    }

    @Override // w4.b0
    public final void b(i iVar) {
        this.f27133a.execute(new r(this, iVar));
    }

    @Override // w4.d
    public final void c() {
        this.f27135c.q();
    }

    @Override // w4.f
    public final void d(Exception exc) {
        this.f27135c.o(exc);
    }
}
