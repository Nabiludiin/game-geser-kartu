package w4;

/* compiled from: MyApplication */
final class v implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i f27140q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w f27141r;

    v(w wVar, i iVar) {
        this.f27141r = wVar;
        this.f27140q = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f27141r.f27143b;
        synchronized (obj) {
            try {
                w wVar = this.f27141r;
                eVar = wVar.f27144c;
                if (eVar != null) {
                    eVar2 = wVar.f27144c;
                    eVar2.a(this.f27140q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
