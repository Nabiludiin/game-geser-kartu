package m3;

import android.app.Activity;

/* compiled from: MyApplication */
public final class v extends m1 {

    /* renamed from: v, reason: collision with root package name */
    private final r.b f24873v;

    /* renamed from: w, reason: collision with root package name */
    private final g f24874w;

    v(j jVar, g gVar, k3.g gVar2) {
        super(jVar, gVar2);
        this.f24873v = new r.b();
        this.f24874w = gVar;
        this.f24812q.d("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, g gVar, b bVar) {
        j c8 = i.c(activity);
        v vVar = (v) c8.a("ConnectionlessLifecycleHelper", v.class);
        if (vVar == null) {
            vVar = new v(c8, gVar, k3.g.p());
        }
        p3.o.n(bVar, "ApiKey cannot be null");
        vVar.f24873v.add(bVar);
        gVar.a(vVar);
    }

    private final void v() {
        if (this.f24873v.isEmpty()) {
            return;
        }
        this.f24874w.a(this);
    }

    @Override // m3.i
    public final void h() {
        super.h();
        v();
    }

    @Override // m3.m1, m3.i
    public final void j() {
        super.j();
        v();
    }

    @Override // m3.m1, m3.i
    public final void k() {
        super.k();
        this.f24874w.b(this);
    }

    @Override // m3.m1
    protected final void m(k3.b bVar, int i7) {
        this.f24874w.C(bVar, i7);
    }

    @Override // m3.m1
    protected final void n() {
        this.f24874w.D();
    }

    final r.b t() {
        return this.f24873v;
    }
}
