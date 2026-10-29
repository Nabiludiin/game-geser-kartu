package u0;

import androidx.room.h;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.f;

/* compiled from: MyApplication */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f26482a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final h f26483b;

    /* renamed from: c, reason: collision with root package name */
    private volatile f f26484c;

    public d(h hVar) {
        this.f26483b = hVar;
    }

    private f c() {
        return this.f26483b.d(d());
    }

    private f e(boolean z7) {
        if (!z7) {
            return c();
        }
        if (this.f26484c == null) {
            this.f26484c = c();
        }
        return this.f26484c;
    }

    public f a() {
        b();
        return e(this.f26482a.compareAndSet(false, true));
    }

    protected void b() {
        this.f26483b.a();
    }

    protected abstract String d();

    public void f(f fVar) {
        if (fVar == this.f26484c) {
            this.f26482a.set(false);
        }
    }
}
