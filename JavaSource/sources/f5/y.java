package f5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
class y implements o5.b {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f23790b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f23789a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection collection) {
        this.f23789a.addAll(collection);
    }

    static y b(Collection collection) {
        return new y((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f23789a.iterator();
            while (it.hasNext()) {
                this.f23790b.add(((o5.b) it.next()).get());
            }
            this.f23789a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(o5.b bVar) {
        try {
            if (this.f23790b == null) {
                this.f23789a.add(bVar);
            } else {
                this.f23790b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o5.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f23790b == null) {
            synchronized (this) {
                try {
                    if (this.f23790b == null) {
                        this.f23790b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f23790b);
    }
}
