package w4;

/* compiled from: MyApplication */
final class z implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i f27150q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ a0 f27151r;

    z(a0 a0Var, i iVar) {
        this.f27151r = a0Var;
        this.f27150q = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        g gVar;
        g gVar2;
        obj = this.f27151r.f27108b;
        synchronized (obj) {
            try {
                a0 a0Var = this.f27151r;
                gVar = a0Var.f27109c;
                if (gVar != null) {
                    gVar2 = a0Var.f27109c;
                    gVar2.a(this.f27150q.k());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
