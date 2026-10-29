package c7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
public abstract class b extends y {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3768a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f3767a;

    private final Object c(Object obj) {
        Object obj2 = f3768a.get(this);
        Object obj3 = a.f3767a;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.a(f3768a, this, obj3, obj) ? obj : f3768a.get(this);
    }

    @Override // c7.y
    public final Object a(Object obj) {
        Object obj2 = f3768a.get(this);
        if (obj2 == a.f3767a) {
            obj2 = c(e(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Object e(Object obj);
}
