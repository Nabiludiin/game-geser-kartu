package f2;

import h2.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f23705a;

    /* renamed from: b, reason: collision with root package name */
    private final g2.d f23706b;

    /* renamed from: c, reason: collision with root package name */
    private final x f23707c;

    /* renamed from: d, reason: collision with root package name */
    private final h2.b f23708d;

    v(Executor executor, g2.d dVar, x xVar, h2.b bVar) {
        this.f23705a = executor;
        this.f23706b = dVar;
        this.f23707c = xVar;
        this.f23708d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f23706b.Q().iterator();
        while (it.hasNext()) {
            vVar.f23707c.a((y1.o) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f23705a.execute(new Runnable() { // from class: f2.t
            @Override // java.lang.Runnable
            public final void run() {
                r0.f23708d.a(new b.a() { // from class: f2.u
                    @Override // h2.b.a
                    public final Object a() {
                        return v.a(v.this);
                    }
                });
            }
        });
    }
}
