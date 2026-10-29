package f1;

import androidx.lifecycle.p;
import e1.m;

/* compiled from: MyApplication */
public class c implements m {

    /* renamed from: c, reason: collision with root package name */
    private final p f23575c = new p();

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f23576d = androidx.work.impl.utils.futures.c.u();

    public c() {
        a(m.f23178b);
    }

    public void a(m.b bVar) {
        this.f23575c.h(bVar);
        if (bVar instanceof m.b.c) {
            this.f23576d.q((m.b.c) bVar);
        } else if (bVar instanceof m.b.a) {
            this.f23576d.r(((m.b.a) bVar).a());
        }
    }
}
