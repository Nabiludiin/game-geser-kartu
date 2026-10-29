package r3;

import android.content.Context;
import l3.a;
import l3.e;
import m3.o;
import m3.q;
import p3.s;
import p3.u;
import p3.v;
import w4.i;
import w4.j;

/* compiled from: MyApplication */
public final class d extends l3.e implements u {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f25862k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0106a f25863l;

    /* renamed from: m, reason: collision with root package name */
    private static final l3.a f25864m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f25865n = 0;

    static {
        a.g gVar = new a.g();
        f25862k = gVar;
        c cVar = new c();
        f25863l = cVar;
        f25864m = new l3.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, v vVar) {
        super(context, f25864m, vVar, e.a.f24604c);
    }

    @Override // p3.u
    public final i b(final s sVar) {
        q.a a8 = q.a();
        a8.d(n4.d.f25021a);
        a8.c(false);
        a8.b(new o() { // from class: r3.b
            @Override // m3.o
            public final void accept(Object obj, Object obj2) {
                int i7 = d.f25865n;
                ((a) ((e) obj).I()).C1(s.this);
                ((j) obj2).c(null);
            }
        });
        return d(a8.a());
    }
}
