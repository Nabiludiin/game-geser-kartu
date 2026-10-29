package w4;

/* compiled from: MyApplication */
final class x implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i f27145q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ y f27146r;

    x(y yVar, i iVar) {
        this.f27146r = yVar;
        this.f27145q = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        f fVar;
        f fVar2;
        obj = this.f27146r.f27148b;
        synchronized (obj) {
            try {
                y yVar = this.f27146r;
                fVar = yVar.f27149c;
                if (fVar != null) {
                    fVar2 = yVar.f27149c;
                    fVar2.d((Exception) p3.o.m(this.f27145q.j()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
