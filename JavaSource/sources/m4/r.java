package m4;

import android.content.Context;

/* compiled from: MyApplication */
public final class r implements h3.b {

    /* renamed from: a, reason: collision with root package name */
    private final h3.b f24909a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.b f24910b;

    public r(Context context) {
        this.f24909a = new p(context, k3.h.h());
        this.f24910b = l.d(context);
    }

    public static /* synthetic */ w4.i b(r rVar, w4.i iVar) {
        if (!iVar.n() && !iVar.l()) {
            Exception j7 = iVar.j();
            if (j7 instanceof l3.b) {
                int b8 = ((l3.b) j7).b();
                if (b8 == 43001 || b8 == 43002 || b8 == 43003 || b8 == 17) {
                    return rVar.f24910b.a();
                }
                if (b8 == 43000) {
                    return w4.l.d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (b8 == 15) {
                    return w4.l.d(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return iVar;
    }

    @Override // h3.b
    public final w4.i a() {
        return this.f24909a.a().i(new w4.b() { // from class: m4.q
            @Override // w4.b
            public final Object a(w4.i iVar) {
                return r.b(r.this, iVar);
            }
        });
    }
}
