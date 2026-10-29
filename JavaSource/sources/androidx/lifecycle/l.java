package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import n.b;

/* compiled from: MyApplication */
public class l extends g {

    /* renamed from: b, reason: collision with root package name */
    private n.a f2515b;

    /* renamed from: c, reason: collision with root package name */
    private g.c f2516c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference f2517d;

    /* renamed from: e, reason: collision with root package name */
    private int f2518e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2519f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2520g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f2521h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2522i;

    /* compiled from: MyApplication */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        g.c f2523a;

        /* renamed from: b, reason: collision with root package name */
        i f2524b;

        a(j jVar, g.c cVar) {
            this.f2524b = n.f(jVar);
            this.f2523a = cVar;
        }

        void a(k kVar, g.b bVar) {
            g.c d8 = bVar.d();
            this.f2523a = l.k(this.f2523a, d8);
            this.f2524b.c(kVar, bVar);
            this.f2523a = d8;
        }
    }

    public l(k kVar) {
        this(kVar, true);
    }

    private void d(k kVar) {
        Iterator descendingIterator = this.f2515b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f2520g) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            a aVar = (a) entry.getValue();
            while (aVar.f2523a.compareTo(this.f2516c) > 0 && !this.f2520g && this.f2515b.contains((j) entry.getKey())) {
                g.b c8 = g.b.c(aVar.f2523a);
                if (c8 == null) {
                    throw new IllegalStateException("no event down from " + aVar.f2523a);
                }
                n(c8.d());
                aVar.a(kVar, c8);
                m();
            }
        }
    }

    private g.c e(j jVar) {
        Map.Entry l7 = this.f2515b.l(jVar);
        g.c cVar = null;
        g.c cVar2 = l7 != null ? ((a) l7.getValue()).f2523a : null;
        if (!this.f2521h.isEmpty()) {
            cVar = (g.c) this.f2521h.get(r0.size() - 1);
        }
        return k(k(this.f2516c, cVar2), cVar);
    }

    private void f(String str) {
        if (!this.f2522i || m.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private void g(k kVar) {
        b.d g8 = this.f2515b.g();
        while (g8.hasNext() && !this.f2520g) {
            Map.Entry entry = (Map.Entry) g8.next();
            a aVar = (a) entry.getValue();
            while (aVar.f2523a.compareTo(this.f2516c) < 0 && !this.f2520g && this.f2515b.contains((j) entry.getKey())) {
                n(aVar.f2523a);
                g.b j7 = g.b.j(aVar.f2523a);
                if (j7 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f2523a);
                }
                aVar.a(kVar, j7);
                m();
            }
        }
    }

    private boolean i() {
        if (this.f2515b.size() == 0) {
            return true;
        }
        g.c cVar = ((a) this.f2515b.c().getValue()).f2523a;
        g.c cVar2 = ((a) this.f2515b.h().getValue()).f2523a;
        return cVar == cVar2 && this.f2516c == cVar2;
    }

    static g.c k(g.c cVar, g.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(g.c cVar) {
        if (this.f2516c == cVar) {
            return;
        }
        this.f2516c = cVar;
        if (this.f2519f || this.f2518e != 0) {
            this.f2520g = true;
            return;
        }
        this.f2519f = true;
        p();
        this.f2519f = false;
    }

    private void m() {
        this.f2521h.remove(r0.size() - 1);
    }

    private void n(g.c cVar) {
        this.f2521h.add(cVar);
    }

    private void p() {
        k kVar = (k) this.f2517d.get();
        if (kVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.f2520g = false;
            if (this.f2516c.compareTo(((a) this.f2515b.c().getValue()).f2523a) < 0) {
                d(kVar);
            }
            Map.Entry h8 = this.f2515b.h();
            if (!this.f2520g && h8 != null && this.f2516c.compareTo(((a) h8.getValue()).f2523a) > 0) {
                g(kVar);
            }
        }
        this.f2520g = false;
    }

    @Override // androidx.lifecycle.g
    public void a(j jVar) {
        k kVar;
        f("addObserver");
        g.c cVar = this.f2516c;
        g.c cVar2 = g.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = g.c.INITIALIZED;
        }
        a aVar = new a(jVar, cVar2);
        if (((a) this.f2515b.j(jVar, aVar)) == null && (kVar = (k) this.f2517d.get()) != null) {
            boolean z7 = this.f2518e != 0 || this.f2519f;
            g.c e8 = e(jVar);
            this.f2518e++;
            while (aVar.f2523a.compareTo(e8) < 0 && this.f2515b.contains(jVar)) {
                n(aVar.f2523a);
                g.b j7 = g.b.j(aVar.f2523a);
                if (j7 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f2523a);
                }
                aVar.a(kVar, j7);
                m();
                e8 = e(jVar);
            }
            if (!z7) {
                p();
            }
            this.f2518e--;
        }
    }

    @Override // androidx.lifecycle.g
    public g.c b() {
        return this.f2516c;
    }

    @Override // androidx.lifecycle.g
    public void c(j jVar) {
        f("removeObserver");
        this.f2515b.k(jVar);
    }

    public void h(g.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.d());
    }

    public void j(g.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(g.c cVar) {
        f("setCurrentState");
        l(cVar);
    }

    private l(k kVar, boolean z7) {
        this.f2515b = new n.a();
        this.f2518e = 0;
        this.f2519f = false;
        this.f2520g = false;
        this.f2521h = new ArrayList();
        this.f2517d = new WeakReference(kVar);
        this.f2516c = g.c.INITIALIZED;
        this.f2522i = z7;
    }
}
