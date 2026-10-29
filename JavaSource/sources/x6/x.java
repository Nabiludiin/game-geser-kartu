package x6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: MyApplication */
public class x {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27455b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f27456a;

    public x(Throwable th, boolean z7) {
        this.f27456a = th;
        this._handled$volatile = z7 ? 1 : 0;
    }

    public final boolean a() {
        return f27455b.get(this) != 0;
    }

    public final boolean c() {
        return f27455b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return k0.a(this) + '[' + this.f27456a + ']';
    }

    public /* synthetic */ x(Throwable th, boolean z7, int i7, q6.e eVar) {
        this(th, (i7 & 2) != 0 ? false : z7);
    }
}
