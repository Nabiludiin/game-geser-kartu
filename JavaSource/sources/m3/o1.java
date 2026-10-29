package m3;

import android.os.Bundle;
import l3.f;

/* compiled from: MyApplication */
public final class o1 implements f.b, f.c {

    /* renamed from: q, reason: collision with root package name */
    public final l3.a f24837q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f24838r;

    /* renamed from: s, reason: collision with root package name */
    private p1 f24839s;

    public o1(l3.a aVar, boolean z7) {
        this.f24837q = aVar;
        this.f24838r = z7;
    }

    private final p1 c() {
        p3.o.n(this.f24839s, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f24839s;
    }

    @Override // m3.e
    public final void O(int i7) {
        c().O(i7);
    }

    @Override // m3.n
    public final void a(k3.b bVar) {
        c().H2(bVar, this.f24837q, this.f24838r);
    }

    public final void b(p1 p1Var) {
        this.f24839s = p1Var;
    }

    @Override // m3.e
    public final void r0(Bundle bundle) {
        c().r0(bundle);
    }
}
