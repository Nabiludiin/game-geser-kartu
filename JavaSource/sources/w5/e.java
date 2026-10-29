package w5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class e extends g implements Iterable {

    /* renamed from: q, reason: collision with root package name */
    private final List f27175q = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof e) && ((e) obj).f27175q.equals(this.f27175q);
        }
        return true;
    }

    public int hashCode() {
        return this.f27175q.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f27175q.iterator();
    }

    public void l(g gVar) {
        if (gVar == null) {
            gVar = i.f27176q;
        }
        this.f27175q.add(gVar);
    }
}
