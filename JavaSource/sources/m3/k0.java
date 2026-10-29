package m3;

import android.util.Log;
import java.util.Map;
import l3.a;

/* compiled from: MyApplication */
final class k0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ k3.b f24819q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ l0 f24820r;

    k0(l0 l0Var, k3.b bVar) {
        this.f24820r = l0Var;
        this.f24819q = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        l0 l0Var = this.f24820r;
        map = l0Var.f24829f.f24794z;
        bVar = l0Var.f24825b;
        h0 h0Var = (h0) map.get(bVar);
        if (h0Var == null) {
            return;
        }
        if (!this.f24819q.Q0()) {
            h0Var.F(this.f24819q, null);
            return;
        }
        this.f24820r.f24828e = true;
        fVar = this.f24820r.f24824a;
        if (fVar.t()) {
            this.f24820r.i();
            return;
        }
        try {
            l0 l0Var2 = this.f24820r;
            fVar3 = l0Var2.f24824a;
            fVar4 = l0Var2.f24824a;
            fVar3.k(null, fVar4.c());
        } catch (SecurityException e8) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
            fVar2 = this.f24820r.f24824a;
            fVar2.d("Failed to get service from broker.");
            h0Var.F(new k3.b(10), null);
        }
    }
}
