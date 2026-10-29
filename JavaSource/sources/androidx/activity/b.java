package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f137a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList f138b = new CopyOnWriteArrayList();

    public b(boolean z7) {
        this.f137a = z7;
    }

    void a(a aVar) {
        this.f138b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f137a;
    }

    public final void d() {
        Iterator it = this.f138b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).cancel();
        }
    }

    void e(a aVar) {
        this.f138b.remove(aVar);
    }

    public final void f(boolean z7) {
        this.f137a = z7;
    }
}
