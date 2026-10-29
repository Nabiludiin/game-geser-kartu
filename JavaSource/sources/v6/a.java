package v6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import q6.i;

/* compiled from: MyApplication */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f26916a;

    public a(b bVar) {
        i.e(bVar, "sequence");
        this.f26916a = new AtomicReference(bVar);
    }

    @Override // v6.b
    public Iterator iterator() {
        b bVar = (b) this.f26916a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
