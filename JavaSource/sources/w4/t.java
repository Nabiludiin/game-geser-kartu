package w4;

/* compiled from: MyApplication */
final class t implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ u f27136q;

    t(u uVar) {
        this.f27136q = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        d dVar;
        d dVar2;
        obj = this.f27136q.f27138b;
        synchronized (obj) {
            try {
                u uVar = this.f27136q;
                dVar = uVar.f27139c;
                if (dVar != null) {
                    dVar2 = uVar.f27139c;
                    dVar2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
