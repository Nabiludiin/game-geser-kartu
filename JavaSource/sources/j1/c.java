package j1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m1.p;

/* compiled from: MyApplication */
public abstract class c implements i1.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f24237a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private Object f24238b;

    /* renamed from: c, reason: collision with root package name */
    private k1.d f24239c;

    /* renamed from: d, reason: collision with root package name */
    private a f24240d;

    /* compiled from: MyApplication */
    public interface a {
        void a(List list);

        void b(List list);
    }

    c(k1.d dVar) {
        this.f24239c = dVar;
    }

    private void h(a aVar, Object obj) {
        if (this.f24237a.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.b(this.f24237a);
        } else {
            aVar.a(this.f24237a);
        }
    }

    @Override // i1.a
    public void a(Object obj) {
        this.f24238b = obj;
        h(this.f24240d, obj);
    }

    abstract boolean b(p pVar);

    abstract boolean c(Object obj);

    public boolean d(String str) {
        Object obj = this.f24238b;
        return obj != null && c(obj) && this.f24237a.contains(str);
    }

    public void e(Iterable iterable) {
        this.f24237a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (b(pVar)) {
                this.f24237a.add(pVar.f24709a);
            }
        }
        if (this.f24237a.isEmpty()) {
            this.f24239c.c(this);
        } else {
            this.f24239c.a(this);
        }
        h(this.f24240d, this.f24238b);
    }

    public void f() {
        if (this.f24237a.isEmpty()) {
            return;
        }
        this.f24237a.clear();
        this.f24239c.c(this);
    }

    public void g(a aVar) {
        if (this.f24240d != aVar) {
            this.f24240d = aVar;
            h(aVar, this.f24238b);
        }
    }
}
