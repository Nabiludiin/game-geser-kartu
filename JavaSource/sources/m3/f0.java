package m3;

import l3.a;

/* compiled from: MyApplication */
final class f0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ g0 f24783q;

    f0(g0 g0Var) {
        this.f24783q = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        h0 h0Var = this.f24783q.f24795a;
        fVar = h0Var.f24802r;
        fVar2 = h0Var.f24802r;
        fVar.d(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
