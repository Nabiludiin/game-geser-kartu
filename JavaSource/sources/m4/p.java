package m4;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import l3.a;
import l3.e;

/* compiled from: MyApplication */
public final class p extends l3.e implements h3.b {

    /* renamed from: m, reason: collision with root package name */
    private static final a.g f24903m;

    /* renamed from: n, reason: collision with root package name */
    private static final a.AbstractC0106a f24904n;

    /* renamed from: o, reason: collision with root package name */
    private static final l3.a f24905o;

    /* renamed from: k, reason: collision with root package name */
    private final Context f24906k;

    /* renamed from: l, reason: collision with root package name */
    private final k3.h f24907l;

    static {
        a.g gVar = new a.g();
        f24903m = gVar;
        n nVar = new n();
        f24904n = nVar;
        f24905o = new l3.a("AppSet.API", nVar, gVar);
    }

    p(Context context, k3.h hVar) {
        super(context, f24905o, a.d.f24592a, e.a.f24604c);
        this.f24906k = context;
        this.f24907l = hVar;
    }

    @Override // h3.b
    public final w4.i a() {
        return this.f24907l.j(this.f24906k, 212800000) == 0 ? e(m3.q.a().d(h3.h.f24095a).b(new m3.o() { // from class: m4.m
            @Override // m3.o
            public final void accept(Object obj, Object obj2) {
                ((g) ((d) obj).I()).r0(new h3.d(null, null), new o(p.this, (w4.j) obj2));
            }
        }).c(false).e(27601).a()) : w4.l.d(new l3.b(new Status(17)));
    }
}
