package m3;

import android.util.Log;
import java.util.Map;
import java.util.Set;
import l3.a;
import p3.c;

/* compiled from: MyApplication */
final class l0 implements c.InterfaceC0119c, x0 {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f24824a;

    /* renamed from: b, reason: collision with root package name */
    private final b f24825b;

    /* renamed from: c, reason: collision with root package name */
    private p3.j f24826c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f24827d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24828e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f24829f;

    public l0(g gVar, a.f fVar, b bVar) {
        this.f24829f = gVar;
        this.f24824a = fVar;
        this.f24825b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        p3.j jVar;
        if (!this.f24828e || (jVar = this.f24826c) == null) {
            return;
        }
        this.f24824a.k(jVar, this.f24827d);
    }

    @Override // m3.x0
    public final void a(p3.j jVar, Set set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            d(new k3.b(4));
        } else {
            this.f24826c = jVar;
            this.f24827d = set;
            i();
        }
    }

    @Override // p3.c.InterfaceC0119c
    public final void b(k3.b bVar) {
        this.f24829f.D.post(new k0(this, bVar));
    }

    @Override // m3.x0
    public final void c(int i7) {
        Map map;
        boolean z7;
        map = this.f24829f.f24794z;
        h0 h0Var = (h0) map.get(this.f24825b);
        if (h0Var != null) {
            z7 = h0Var.f24809y;
            if (z7) {
                h0Var.G(new k3.b(17));
            } else {
                h0Var.O(i7);
            }
        }
    }

    @Override // m3.x0
    public final void d(k3.b bVar) {
        Map map;
        map = this.f24829f.f24794z;
        h0 h0Var = (h0) map.get(this.f24825b);
        if (h0Var != null) {
            h0Var.G(bVar);
        }
    }
}
